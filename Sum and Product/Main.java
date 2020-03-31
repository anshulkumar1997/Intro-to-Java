import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y,s,p,d,r;
        x=sc.nextInt();
        if (x<=0)
        {System.out.println("Invalid Input");
        return;}
        y=sc.nextInt();
        if (y<=0)
        {System.out.println("Invalid Input");
        return;}
        s=x+y;
        p=x*y;
        r=0;
        while(p>0){
            d=p%10;
            r=r*10+d;
            p=p/10;
        }
        if (s==r)
        System.out.println("You are Lucky! Here is your Gift.");
        else
        System.out.println("Better Luck Next Time");
        
    }
}