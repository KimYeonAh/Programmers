def solution(prices):
    answer = []
    
    for i in range(len(prices)) :
        num = 0
        for j in range(i+1, len(prices)) :
            if prices[j] < prices[i] :
                num += 1
                break
            num += 1
        answer.append(num)
        
    return answer
