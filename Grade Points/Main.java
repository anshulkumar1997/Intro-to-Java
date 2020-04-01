import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        float m;
        System.out.println("Enter the grade point:");
        m=sc.nextFloat();
        if(m==5)
        System.out.println("Grade: O");
        else if(m>=4.5 && m<5.0)
        System.out.println("Grade: A");
        else if (m>=4.0 && m<4.5)
        System.out.println("Grade: B");
        else if (m>=3.0 && m<4.0)
        System.out.println("Grade: C");
        else if (m>=2.0 && m<3.0)
        System.out.println("Grade: D");
        else if(m>=1.0 && m<2.0)
        System.out.println("Grade: E");
        else if (m>=0.0 && m<1.0)
        System.out.println("Grade: F");
    }
}