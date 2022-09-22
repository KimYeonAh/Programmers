def solution(s):
    if s[0] == ')' or s.strip()[-1] == '(' :
        return False
    
    start = 0; finish = 0
    
    for i in s :
        if start >= finish :
            if i == '(' :
                start += 1
            elif i == ')' :
                finish += 1
    
    if start == finish :
        return True
    
    return False
