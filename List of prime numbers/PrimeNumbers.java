import java.util.Scanner;
public class PrimeNumbers{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y,i,d,c;
        x=sc.nextInt();
        y=sc.nextInt();
        if(x<=0 || y<=0 || x>=y)
        {
            System.out.println("Provide valid input");
            return;
        }
        if(x==1)
        x++;
        for(i=x;i<=y;i++)
        {   d=i/2;
            c=1;
        while(d>1){
            if (i%d==0)
            {c++; break;}
            d--;
        }
        if(c!=2)
        System.out.print(i+" ");
        
    }}
}