def solution(s):
    
    minAndMaxList = list(map(int, s.split(' ')))
    answer = str(min(minAndMaxList)) +' '+ str(max(minAndMaxList))
    
    return answer
