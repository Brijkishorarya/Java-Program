package Input;
import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        int d, e; 
        Scanner s = new Scanner(System.in); 
        int a = s.nextInt(); 
        for(int i=0; i<a; i++)
        {
            int b = s.nextInt(); 
            int c = s.nextInt(); 
            System.out.println(b+c);
        }
    }
}
