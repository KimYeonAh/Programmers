def solution(n):
    answer = 0
    num = n

    for i in range(2, n) :
        if (num-1)%i == 0:
            answer = i
            break
    
    return answer
