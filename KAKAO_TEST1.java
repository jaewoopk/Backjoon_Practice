import java.util.*;

public class KAKAO_TEST1 {
    public static void main(String[] args) {
        //String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        //int[] choices = {5,3,2,7,5};
        String[] survey = {"TR", "RT", "TR"};
        int[] choices = {7,1,3};

        System.out.println(solution(survey,choices));
    }

    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] instruction = new int[8];

        for (int i = 0; i < choices.length; i++) {
            if ((survey[i].equals("AN") && choices[i] <= 4) || (survey[i].equals("NA") && choices[i] >= 4)) {
                instruction[7] += checking(choices[i]);
            }
            else if ((survey[i].equals("AN") && choices[i] >= 4) || (survey[i].equals("NA") && choices[i] <= 4)) {
                instruction[6] += checking(choices[i]);
            }
            else if ((survey[i].equals("JM") && choices[i] <= 4) || (survey[i].equals("MJ") && choices[i] >= 4)) {
                instruction[5] += checking(choices[i]);
            }
            else if ((survey[i].equals("JM") && choices[i] >= 4) || (survey[i].equals("MJ") && choices[i] <= 4)) {
                instruction[4] += checking(choices[i]);
            }
            else if ((survey[i].equals("CF") && choices[i] <= 4) || (survey[i].equals("FC") && choices[i] >= 4)) {
                instruction[3] += checking(choices[i]);
            }
            else if ((survey[i].equals("CF") && choices[i] >= 4) || (survey[i].equals("FC") && choices[i] <= 4)) {
                instruction[2] += checking(choices[i]);
            }
            else if ((survey[i].equals("RT") && choices[i] <= 4) || (survey[i].equals("TR") && choices[i] >= 4)) {
                instruction[1] += checking(choices[i]);
            }
            else if ((survey[i].equals("RT") && choices[i] >= 4) || (survey[i].equals("TR") && choices[i] <= 4)) {
                instruction[0] += checking(choices[i]);
            }
        }
        answer += instruction[0] <= instruction[1] ? "R" : "T" ;
        answer += instruction[2] <= instruction[3] ? "C" : "F" ;
        answer += instruction[4] <= instruction[5] ? "J" : "M" ;
        answer += instruction[6] <= instruction[7] ? "A" : "N" ;
        
        return answer;
    }

    public static int checking(int i_value) {
        if (i_value == 4) return (0);
        else if (i_value > 4) return (i_value - 4);
        else return (4 - i_value);
    }
}
