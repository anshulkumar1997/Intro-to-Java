import java.util.Scanner;
public class Placement{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int c,e,m;
        System.out.println("Enter the no of students placed in CSE:");
        c=sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        e=sc.nextInt();
        System.out.println("Enter the no of students placed in MECH");
        m=sc.nextInt();
        if (c==e && c==m)
        {System.out.println("None of the department has got the highest placement");
            return;}
        else if(c<0 || e<0 || m<0)
        {System.out.println("Input is Invalid");
         return;}
         System.out.println("Highest placement");
         if(c>=e && c>=m)
         System.out.println("CSE");
         if(e>=c && e>=m)
         System.out.println("ECE");
         if (m>=c && m>=e)
         System.out.println("MECH");
         
         
         
    }
}