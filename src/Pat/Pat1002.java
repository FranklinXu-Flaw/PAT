package Pat;

import java.util.Scanner;

public class Pat1002 {
    public static void main(String[] args) {
        String numIn;
        int addUp = 0;
        Scanner input = new Scanner(System.in);
        numIn = input.nextLine();
        char[] num = numIn.toCharArray();
        for (int i =0; i< num.length; i++){
            addUp += num[i] - '0';
        }
        //System.out.println(addUp);
        char[] addCopy = (addUp +"").toCharArray();
        String output = "";
        for (int i=0; i< addCopy.length; i++){
            output+=(exchange(addCopy[i]));
            if ((i+1) != addCopy.length){
                output+=" ";
            }
        }
        System.out.println(output);
    }
    private static String exchange(char num){
        switch (num) {
            case '1':
                return ("yi");
            case '2':
                return ("er");
            case '3':
                return ("san");
            case '4':
                return ("si");
            case '5':
                return ("wu");
            case '6':
                return ("liu");
            case '7':
                return ("qi");
            case '8':
                return ("ba");
            case '9':
                return ("jiu");
            case '0':
                return ("ling");
            default:
                return null;
        }
    }
}
