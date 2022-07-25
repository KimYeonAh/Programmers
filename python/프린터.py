def solution(priorities, location):
    answer = 0
    num = 0
    maxNum = max(priorities)
    
    while len(priorities) != 0 :
        num = priorities.pop(0)

        if num < maxNum :
            if location == 0 :
                location = len(priorities)+1
            priorities.append(num)
        elif num == maxNum :
            answer += 1
            if location == 0 :
                break
            maxNum = max(priorities)
            
        location -= 1

    return answer
