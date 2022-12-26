package Input;
import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
       // System.out.println("Enter your name: ");
        String fname = s.next(); 
        String lname = s.next();  
       // System.out.println("Enter your id: ");
        int id = s.nextInt(); 
       // System.out.println("Enter your favourate subject: ");
        String subject = s.next();
       // System.out.println(name +" "+id +" " +subject);
        System.out.println("Your fname: "+fname); 
        System.out.println("Your last name: "+lname);
        System.out.println("Your id: "+id); 
        System.out.println("Your favourate: "+subject); 


    }
}
