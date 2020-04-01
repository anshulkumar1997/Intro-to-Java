import java.util.Scanner;
public class BikeRace{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,t,p1,p2,c;
        System.out.println("Enter the distance travelled");
        x=sc.nextInt();
        if (x<0){
            System.out.println("Invalid Input");
            return;
        }
        if (x==0){
            System.out.println("Your bonus points is 0");
            return;
        } 
        c=1;
        t=0;
        p1=1;
        p2=1;
        while(x!=0){
            t=x%10;
            c++;
            if (c%2==0)
            p1=p1*t;
            else
            p2=p2*t;
            x=x/10;
        }
        if(p1>p2)
        System.out.println("Your bonus points is "+p1);
        else if (p2>p1)
        System.out.println("Your bonus points is "+p2);
        else if(p1==p2)
        System.out.println("Your bonus points is "+(2*p1));
    }
}