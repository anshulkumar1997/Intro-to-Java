import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int p,l,i,x;
        i=100000;
        System.out.println("Enter the profit percentage");
        p=sc.nextInt();
        System.out.println("Enter the amount lost in Rs.");
        l=sc.nextInt();
        x=i+p*1000;
        x=x-l;
        l=(i-x)/1000;
        if(l==0)
        {
            System.out.println("After two years he gets no loss or no gain");
            return;
        }
        else if (l>0){ 
        System.out.println("After two years he gets a loss of "+l+"%");
        return;}
        else 
        System.out.println("After two years he gets a profit of "+(-1)*l+"%");
    }
}