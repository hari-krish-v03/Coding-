import java.util.Scanner;
//this program performs linear search operation
class LinearSearch{
    public static void main(String[] args) {
        //intitialize scanner class to get inputs
        Scanner sc = new Scanner(System.in);
        //Get length of the array from the user
        System.out.println("Enter Length of the Array");
        int length = sc.nextInt();
        //Declare array and get inputs from the user
        int [] arr = new int[length];
        System.out.println("Enter Elements of the array");
        for(int i=0;i<length;i++){
            arr[i] = sc.nextInt();
        }
        //get target element from the user
        System.out.println("Enter target element");
        int target = sc.nextInt();
        //Loop through the array and search for the target element
        boolean flag = false;
        int i=0;
        for(;i<length;i++){
            if(arr[i] == target){
                flag = true;
                break;
            }
        }
        //print the index of the target element
        if(flag){
            System.out.println("Target found at index: "+ i);
        }
        else{
            System.out.println("Target not found");
        }

        
    }
}