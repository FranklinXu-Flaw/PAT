package Pat;

import java.util.Scanner;

public class Pat1006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.nextLine();
        int hundred = 0;
        int ten = 0;
        int one = 0;
        hundred = num/100;
        ten = (num/10) - (10*hundred);
        one = num%10;
        //one = 1;
        String output = "";
        for(int i=0;i<hundred;i++){
            output+="B";
        }
        for(int i=0;i<ten;i++){
            output+="S";
        }

        for (int i = 1;i<= one; i++){
            output+= i+"";
        }

        //output+= one +"";
        //output+= num+"";
        System.out.println(output);
    }
}
