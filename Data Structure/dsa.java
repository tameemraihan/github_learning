import java.util.Scanner;

public class dsa{

    public void printArray(int[] arr){
        //This method is for printing the array in the console.
        int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        }
    
    public void arrayCreate(){
        Scanner Scanner = new Scanner (System.in);
        System.out.print("Enter the size of your desired Array: ");
        int n = Scanner.nextInt();
        int [] myArray = new int[n];
        printArray(myArray);
    }
    public static void main(String[] args) {
        
        System.out.println("Welcome agin to Data Structures and Algorithms with GitHub");
        System.out.println("Here on I will try to implement array in Java");
        dsa obj = new dsa();
        obj.arrayCreate();
    }
}
