def solution(survey, choices):
    
    typeDic = {'R' : 0, 'T' : 0,
               'C' : 0, 'F' : 0,
               'J' : 0, 'M' : 0,
               'A' : 0, 'N' : 0 }

    for i in range(len(choices)) :
        
        tmpScore = scoreCount(survey, choices[i])        
        tmpStr = survey[i]
        
        if choices[i] <= 3 : 
            typeDic[tmpStr[:1]] += tmpScore
        else :
            typeDic[tmpStr[1:]] += tmpScore

    answer = MBTI(typeDic)
    
    return answer

def scoreCount(survey, score) :
    if score == 4 :
        return 0
    
    tmpScore = 0
    
    if score == 1 or score == 7 :
        tmpScore = 3
    elif score == 2 or score == 6 :
        tmpScore = 2
    elif score == 3 or score == 5 :
        tmpScore = 1
    
    return tmpScore

def MBTI(typeDic) :
    
    typeListKey = list(typeDic.keys())
    typeListValues = list(typeDic.values())
    result = ''
    
    for i in range(0, 8, 2) :
        
        if typeListValues[i] == typeListValues[i+1] :
            result += min(typeListKey[i], typeListKey[i+1])
        elif typeListValues[i] > typeListValues[i+1] :
            result += typeListKey[i]
        elif typeListValues[i] < typeListValues[i+1] :
            result += typeListKey[i+1]
            
    return result
