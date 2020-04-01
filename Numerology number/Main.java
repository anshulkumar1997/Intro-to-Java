import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,c=0,ce=0,co=0,t;
        System.out.println("Enter the number");
        n=sc.nextInt();
        t=n;
        while(t>0){
            c++;
            t=t/10;
        }
        int a[];
        a=new int[c+1];
        int sum=0,w=c-1,r;
        while(n>0){
            r=n%10;
            sum=sum+r;
            a[w]=r;
            w--;
            if(r%2==0)
            ce++;
            else
            co++;
            n=n/10;
        }
        n=0;
        t=sum;
        if(sum<10)
        n=sum;
        
        while(sum>0){
            n=n+sum%10;
            sum=sum/10;
            if(sum==0 && n>=10){
                sum=n;
                n=0;
            }
        }
        System.out.print("The Numbers are :");
        for(int i=0;i<c;i++)
        System.out.print(" "+a[i]);
        System.out.println("");
        System.out.println("Sum of digits : "+t);
        System.out.println("Numerology number: "+n);
        System.out.println("Number of odd numbers: "+co);
        System.out.println("Number of even numbers: "+ce);
        
    }
}