import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int p1,p2,x,y,c,d,r;
        x=sc.nextInt();
        y=sc.nextInt();
        p1=x*y;
        c=0;
        d=0;
        r=x%10;
        x=x/10;
        c=r*10+x;
        r=y%10;
        y=y/10;
        d=r*10+y;
        p2=c*d;
        if (p1==p2)
        System.out.println("Yes");
        else
        System.out.println("No");
        
    }
}