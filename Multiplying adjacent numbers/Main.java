import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        long x,y,z,sum;
        sum=0;
        System.out.println("Enter the first number:");
        x=sc.nextInt();
        if(x<=0)
        {System.out.println("Invalid Input");
        return;}
        else
        {System.out.println("Enter the second number:");
        y=sc.nextInt();
        if(y<=0 || x>=y)
        {System.out.println("Invalid Input");return;}
        else
        {System.out.println("Enter the number of terms:");
        z=sc.nextInt();
        if (z<=0)
        {System.out.println("Invalid Input");return;}
        else
        {{System.out.printf(x+","+y);
        for(int i=0;i<z;i++)
        {sum=x*y;
        System.out.printf(","+sum);
        x=y;
        y=sum;}}}}}
        
    }
}