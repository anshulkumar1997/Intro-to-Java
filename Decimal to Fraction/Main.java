import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        double n;
        n=sc.nextDouble();
        int in=-1,i,den=1,d;
        String s=String.valueOf(n);
        d=s.length()-1-s.indexOf('.');
        in=s.indexOf(".");
        if(n%1==0){
            System.out.println("Input a decimal number");
            return;
        }
        for(i=0;i<d;i++){
            n=n*10;
            den=den*10;
        }
        int num=(int)Math.round(n);
        int gd=getgcd(num,den);
        s=""+num/gd+"/"+den/gd;
        System.out.println("Fraction: "+s);
    }
    public static int getgcd(int num,int den){
        if(den==0)
        return num;
        return getgcd(den,num%den);
    }
}