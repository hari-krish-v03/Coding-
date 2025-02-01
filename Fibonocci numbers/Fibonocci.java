import java.util.Scanner;
class Fibonocci{
    public static void main(String[] args) {
        //get input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input: ");
        int input  = sc.nextInt();
        //initialize 2 nos
        int a = 0;
        int b = 1;
        int temp;

        for(int i=2;i<=input;i++){
           temp = b;
            b= a+b;
            a=temp;
        }
        System.out.println(b);
    }
}