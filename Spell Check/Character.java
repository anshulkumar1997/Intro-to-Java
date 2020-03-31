import java.util.Scanner;
public class Character{
    public static void main (String[] args) {
        /* code */
        String a,b,c,d,e,f,g,h;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first letter:");
        a=sc.next();
        System.out.println("Enter the second letter:");
        b=sc.next();
        System.out.println("Enter the third letter:");
        c=sc.next();
        System.out.println("Enter the fourth letter:");
        d=sc.next();
        System.out.println("Enter the fifth letter:");
        e=sc.next();
        System.out.println("Enter the sixth letter:");
        f=sc.next();
        System.out.println("Enter the seventh letter:");
        g=sc.next();
        h=a+b+c+d+e+f+g;
        if(h.equals("RAINBOW"))
        System.out.println(h);
        else
        System.out.println("The spelling is wrong");
    }
}