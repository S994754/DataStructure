package problems;

import java.util.Scanner;

//https://www.codechef.com/submit/ACTEMP
public class AirConditionerTemperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(c < b && c > a) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
