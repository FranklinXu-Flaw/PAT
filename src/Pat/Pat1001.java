package Pat;

import java.util.Scanner;

public class Pat1001 {
    public static void main(String[] args) {
        int num = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        input.nextLine();
        while(num!=1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = 3 * (num) + 1;
                num = num / 2;
            }
            count ++;
        }
        System.out.println(count);
    }
}
