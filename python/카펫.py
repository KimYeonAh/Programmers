def solution(brown, yellow):
    answer = []
    divisorsList = []

    for i in range(1, int(yellow**(1/2)) + 1):
        if (yellow % i == 0):
            divisorsList.append(i)
            
            if ( (i**2) != yellow) : 
                divisorsList.append(yellow // i)

    divisorsList.sort(reverse=True)
    
    for i in divisorsList :
        if ((i + 2) * 2 ) + ((yellow // i) * 2 ) == brown :
            answer.append(i + 2)
            answer.append((yellow // i) + 2)
        
        if len(answer) == 2 :
            break
    
    return answer

#     24, 24

#     1 2 3 4 6 8 12 24
    
#     6 + 2 = 8, x 2 = 16 
#     4 x 2 = 8 
#     16 + 8 = 24
