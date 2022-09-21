def solution(s):
    answer = ''
    jadenCaseList = s.split(' ')
    
    for i in jadenCaseList :
        i = i.lower()
        
        if any(num.isdigit() for num in i) or i == '' :
            answer += i + ' '
            continue
            
        i = i[0].upper() + i[1:]
        answer += i + ' '
        
    return answer[:-1]
