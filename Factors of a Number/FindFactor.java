import java.util.Scanner;
public class FindFactor{
    public static void main (String[] args) {
        int x,i;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        if (x==0)
        {
         System.out.println("No Factors");
         return;
        }
        if(x<0)
        x=(-1)*x;
        for(i=1;i<=x/2;i++)
        if (x%i==0)
        System.out.print(i+", ");
        System.out.print(x);
    }
}