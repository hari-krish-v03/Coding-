
import java.util.Scanner;
class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1){
            System.out.println("Neither prime nor composite");
        }
        else{
            int flag = 0;
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    System.out.println("not a prime num");
                    flag = 1;
                    break;
                }
                
            }
            if(flag==0){
                System.out.println("Prime number");
            }

        }

    }
}