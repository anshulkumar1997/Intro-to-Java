import java.util.Scanner;
public class LeapYear{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        boolean l=false;
        System.out.println("Enter the Year");
        x=sc.nextInt();
        if(x<1000 || x>9999){
            System.out.println("Invalid Year");
            return;
        }
        if (x%4==0)
        {   l=true;
            if(x%100!=0 || x%400==0)
               l=true;
            else
            l=false;
            
        }
        
        if (l)
        System.out.println("Leap Year");
        else
        System.out.println("Not a Leap Year");
        
    }
}