import java.util.Scanner;
public class SnacksDetails{
    public static void main (String[] args) {
        /* code */
        int pizza,puff,cool,sum;
        sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of pizzas bought:");
        pizza=sc.nextInt();
        System.out.println("Enter the no of puffs bought:");
        puff=sc.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        cool=sc.nextInt();
        System.out.println("Bill Details");
        System.out.println("No of pizzas:"+pizza);
        System.out.println("No of puffs:"+puff);
        System.out.println("No of cooldrinks:"+cool);
        sum=100*pizza+20*puff+10*cool;
        System.out.println("Total price="+sum);
        System.out.println("ENJOY THE SHOW!!!");
        
    }
}