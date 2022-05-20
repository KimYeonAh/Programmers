def solution(record):
    answer = []
    
    info = [[] for _ in range(len(record))]
    id_dic = {}
    
    for i in range(len(record)) :
        info[i].append(record[i].split(' '))
        
        if len(info[i][0]) == 3 :
            id_dic[info[i][0][1]] = info[i][0][2]
    
    for i in range(len(record)) :
        if info[i][0][0] == "Enter" : 
            answer.append(id_dic[info[i][0][1]] + "님이 들어왔습니다.")

        elif info[i][0][0] == "Leave" :
            answer.append(id_dic[info[i][0][1]] + "님이 나갔습니다.")
        
    return answer
