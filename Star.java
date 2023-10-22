import java.util.Scanner;
public class dumm {
    public static void main(String[] args) {
      System.out.println("enter the number of start you want to print");
      Scanner a = new Scanner(System.in);
      int b = a.nextInt();
      for(int i=0; i<=b; i++){
       for(int j=0; j<i; j++){
        System.out.print("*");
       }
     System.out.println(" ");
     }
    }
}
