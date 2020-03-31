import java.util.Scanner;
public class Season{
    public static void main (String[] args) {
        /* code */
        Scanner sc=new Scanner(System.in);
        int m;
        System.out.println("Enter the month:");
        m=sc.nextInt();
        if(m<=0 || m>12)
        System.out.println("Invalid month");
        else if(m==12||m==1||m==2)
        System.out.println("Season:Winter");
        else if(m>2 && m<6)
        System.out.println("Season:Spring");
        else if(m>5 && m<9)
        System.out.println("Season:Summer");
        else 
        System.out.println("Season:Autumn");
    }
}