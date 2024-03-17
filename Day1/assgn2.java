package Day1;
import java.util.Scanner;

public class assgn2 {
    public static int numDigits(int num){
        int c=0;
        // System.out.print(c);
        while(num>0){
            num=num/10;
            c+=1;

        }
        return c;
    }
    public static String evaluate(int num, int digits) {
        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    
        if (digits == 1) {
            return units[num];
        } else if (digits == 2) {
            if (num < 20) {
                return teens[num - 10];
            } else {
                return tens[num / 10] + ((num % 10 != 0) ? " " + units[num % 10] : "");
            }
        } else if (digits == 3) {
            return units[num / 100] + " hundred" + ((num % 100 != 0) ? " " + evaluate(num % 100, 2) : "");
        } else if (digits <= 5) {
            return evaluate(num / 1000, numDigits(num/1000)) + " thousand" + ((num % 1000 != 0) ? " " + evaluate(num % 1000, numDigits(num % 1000)) : "");
        } else if (digits <= 7) {
            return evaluate(num / 100000, numDigits(num/100000)) + " lakh" + ((num % 100000 != 0) ? " " + evaluate(num % 100000, numDigits(num % 100000)) : "");
        } else {
            return evaluate(num / 10000000, numDigits(num/10000000)) + " crore" + ((num % 10000000 != 0) ? " " + evaluate(num % 10000000, numDigits(num%10000000)) : "");
        }
    }
    
      
    public static String inWords(int num) {
         if(isValid(num)){
            int digits = numDigits(num);
            // System.out.print(digits);
            String s = evaluate(num,digits);
            return s;
         }
        return "Invalid number.";
        }
        private static boolean isValid(int num) {
            return (num>=1 && num <=999999999);
        }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = scanner.nextInt();

        System.out.print(inWords(num));
        scanner.close();


    }
}
