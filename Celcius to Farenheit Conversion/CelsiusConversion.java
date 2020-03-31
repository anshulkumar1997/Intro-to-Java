import java.util.Scanner;
public class CelsiusConversion{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        
        float c,f;
        c=sc.nextInt();
        f=(9*c/5)+32;
        System.out.println(f);
        
    }
}