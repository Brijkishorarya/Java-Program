package Input;
import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        int sum = 0; 
        int percentage; 
        Scanner s = new Scanner(System.in); 
        int a = s.nextInt(); 
        int b = s.nextInt(); 
        int c = s.nextInt(); 
        sum = sum+a+b+c; 
        System.out.println("Total marks: "+sum);
        percentage = sum/3; 
        System.out.println("Percentage marks:" +percentage +"%");
    }
}
