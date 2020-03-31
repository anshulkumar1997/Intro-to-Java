import java.util.Scanner;
public class LuckyNum{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,n,sum=0,c=0,i=0,b;
        System.out.println("Enter the car no:");
        x=sc.nextInt();
        if(x<1000 || x>9999)
        {System.out.println(x+" is not a valid car number");
        return;}
        n=x;
        while(x>0)
        {
         n=x%10;
         sum+=n;
         x=x/10;
        }
        if (sum%3==0 || sum%5==0 || sum%7==0)
        System.out.println("Lucky Number");
        else
        System.out.println("Sorry its not my lucky number");
        
    }
}