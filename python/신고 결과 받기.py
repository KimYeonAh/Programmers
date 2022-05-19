def solution(id_list, report, k):
    answer = [0 for _ in range(len(id_list))]
    same = [[] for _ in range(len(id_list))]
    report_num = [0 for _ in range(len(id_list))]
    
    for i in report :
        report_list = i.split()
        
        if report_list[1] not in same[id_list.index(report_list[0])]:
            same[id_list.index(report_list[0])].append(report_list[1])
            report_num[id_list.index(report_list[1])] += 1
            
    for i in range(len(report_num)) :
        if report_num[i] >= k :
            
            for j in range(len(report_num)) :
                if id_list[i] in same[j] :
                    answer[j] += 1

    return answer
