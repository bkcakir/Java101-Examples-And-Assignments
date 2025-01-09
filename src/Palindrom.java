import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        System.out.println(isPalindrom(number));
    }

    static  boolean isPalindrom(int number) {

        int Temp = number,ReversedNumber=0,LastNumber;
        while(Temp!=0) {
            LastNumber = Temp%10;
            ReversedNumber = (ReversedNumber*10)+LastNumber;
            Temp /=10;
        }
        if(ReversedNumber==number)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
