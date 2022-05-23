def solution(progresses, speeds):
    answer = []
    num = 0
    day = 0
    tmp = 0
    
    for i in range(len(progresses)) :
        if ( 100 - progresses[0] ) % speeds[0] != 0 :
            tmp = ( 100 - progresses[0] ) // speeds[0] + 1
        else :
            tmp = ( 100 - progresses[0] ) // speeds[0]

        if day == 0 :
            day = tmp
        
        if tmp <= day :
            num += 1            
        else : 
            answer.append(num)
            num = 1
            day = tmp
        
        progresses.pop(0)
        speeds.pop(0)

        if len(progresses)==0 :
            answer.append(num)
            
    return answer
