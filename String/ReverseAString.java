package Easy;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        stringReverse(str);
    }
    private static void stringReverse(String str) {
        if(str.length()<=0){
            return;
        }
        System.out.print(str.substring(str.length()-1));
        stringReverse(str.substring(0, str.length()-1));
    }
}
