import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] human1 = {1, 2, 3, 4 ,5};
        int[] human2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] human3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] list = new int[3];

        int maxNum = 0;

        ArrayList<Integer> arr = new ArrayList<>();

        list[0] = dontLikeMath(human1, answers);
        list[1] = dontLikeMath(human2, answers);
        list[2] = dontLikeMath(human3, answers);

        maxNum = listMax(list);

        for(int i = 0; i < list.length; i++){
            if(maxNum == list[i]){
                arr.add(i+1);
            } 
        }

        answer = new int[arr.size()];

        for(int i=0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }

        return answer;
    }

    public int dontLikeMath(int[] human, int[] answers){
        int count = 0;
        int tmp = 0;
        int tmp2 = 0;

        while (tmp < answers.length){

            if(answers[tmp]==human[tmp2]){
                count++;
            }
            tmp++;
            tmp2++;

            if(tmp2==human.length){
                tmp2 = 0;
            }
        }

        return count;
    }

    public int listMax(int[] list){
        int maxNum = 0;

        for(int i = 0; i < list.length; i++){
            if(maxNum < list[i]){
                maxNum = list[i];
            } 
        }

        return maxNum;
    }
}
