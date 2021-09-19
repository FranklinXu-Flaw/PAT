package Pat;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Pat1004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.nextLine();
        String[] allInfo = new String[num];
        int[] scores = new int[num];
        for (int i = 0; i<num;i++){
            String name = input.next();
            String course = input.next();
            int score = input.nextInt();
            input.nextLine();
            allInfo[i] = name+" "+ course;
            scores[i] = score;
        }
        if (num>1) {
            for (int i = 0; i < num-1; i++) {
                for (int j = i+1; j < num; j++) {
                    if (scores[i] < scores[j]) {
                        int temp = scores[i];
                        scores[i] = scores[j];
                        scores[j] = temp;
                        String tempInfo = "";
                        tempInfo = allInfo[i];
                        allInfo[i] = allInfo[j];
                        allInfo[j] = tempInfo;
                    }
                }
            }
            /*
            for (int i =0; i<num;i++){
                System.out.println(scores[i]);
                System.out.println(allInfo[i]);
            }*/
            System.out.println(allInfo[0]);
            System.out.println(allInfo[num-1]);
        }
        else if (num == 0){
        }
        else {
            System.out.println(allInfo[num-1]);
            System.out.println(allInfo[num-1]);
        }
    }
}
