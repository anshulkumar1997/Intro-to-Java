import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        int i,d,c,c1=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int x=sc.nextInt();
        System.out.println("Enter the last number");
        int y=sc.nextInt();
        if (x==1)
        x++;
        for(i=x;i<=y;i++){
            d=i/2;
            c=1;
            while(d>1){
                if (i%d==0)
                {
                    c++; break;
                }
                d--;
            }
            if (i==y){
            if (c!=2){
                d=i%10;
                if (d==1)
                System.out.print(","+i);
                return;
            }}
            else if (c!=2){
            d=i%10;
            if (d==1){ 
                c1++;
                if(c1==2)
                {System.out.print(i);continue;}
            System.out.print(","+i);}}
        }
        for (i=y; ;i++){
            d=i%10;
            if (d!=1)
            continue;
            else{
            d=i/2;    
            c=1;
            while(d>1){
                if (i%d==0)
                {c++; break;}
                d--;
            }
            if(c!=2)
            {System.out.print(","+i);
            return;}
        }
    }}
}