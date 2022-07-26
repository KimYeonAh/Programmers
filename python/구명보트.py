def solution(people, limit):
    answer = 0
    people.sort(reverse = True)
    tmp = len(people)-1
    
    for i in range(len(people)) :
        if i >= tmp + 1 :
            break
        
        if people[i] + people[tmp] <= limit :
            tmp -= 1
        
        answer += 1
        
    return answer
