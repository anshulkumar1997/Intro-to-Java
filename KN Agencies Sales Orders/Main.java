import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        int n,p=1;
        System.out.println("Enter 'E' for Electric Kettle and 'I' for Induction Stove( No other character will be accepted)");
        s=sc.nextLine();
        System.out.println("Enter the number of units ordered");
        n=sc.nextInt();
        if(s.equals("E"))
        {if (n>=1 && n<=10)
        p=950;
        else if(n>=11 && n<=20)
        p=900;
        else if(n>=21)
        p=850;}
        else
        {
            if(n>=1 && n<=15)
            p=1100;
            else if(n>=16 && n<=25)
            p=1000;
            else if(n>=26)
            p=975;
        }
        p=p*n;
        System.out.println("Total amount to be paid is Rs."+p);
        
    }
}
