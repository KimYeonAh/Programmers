def solution(n):
    answer = 0
    tmp = 0
    
    for i in range(1, n+1) :
        tmp = i
        for j in range(i+1, n+1) :
            if tmp >= n :
                break
            
            tmp += j
            
        if tmp == n :
            answer += 1
            
    return answer
