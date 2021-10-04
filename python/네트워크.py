def dfs(graph, start, visited) :
    if start not in visited :
        visited.append(start)
        
        for i in graph[start] :
            if i not in visited :
                dfs(graph, i, visited)
            
def solution(n, computers):
    answer = 0
    visited = []
    graph = [[] for _ in range(n)]
    
    for i in range(len(computers)) :
        for j in range(len(computers)) :
            if i != j :
                if computers[i][j] == 1 :
                    if j not in graph[i] :
                        graph[i].append(j)
    
    for i in range(n) :
        if i not in visited :
            dfs(graph, i, visited)
            answer += 1
            
    return answer
