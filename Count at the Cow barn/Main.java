import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n,c,me,d;
        m=sc.nextInt();
        n=sc.nextInt();
        d=n-2*m;
        c=d/2;
        if(c<0){
            System.out.println("Invalid Input");
            return;
        }
        me=m-c;
        if(me<0){
            System.out.println("Invalid Input");
            return;
        }
        d=c+me;
        if(d==m)
        {System.out.println("Number of Cows: "+c);
        System.out.println("Number of Men: "+me);}
        
    }
}