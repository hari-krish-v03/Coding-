import java.util.Scanner;
class ReverseNum{
    public static void main(String[] args) {
        //get input from user
        System.out.print("Enter Input: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //loop and get revsrse of a number
        int reverse = 0;
        while(num>0){
            //get last digit and add it to the start
            int digit = num%10;
            reverse = reverse*10 + digit;
            //reduce number after adding digits to the start
            num/=10;

        }
        System.out.println("Reverse of the given number is " +reverse);
    }
}