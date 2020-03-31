import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String c;
        double d;
        int x;
        System.out.println("Enter the currency code");
        c=sc.nextLine();
        switch(c){
        
            case "HKD" :{System.out.println("Enter the amount");
            x=sc.nextInt();
            d=x*8.86;
            System.out.println("Hong Kong dollar "+x+" equals to "+(String.format("%.2f",d))+" Indian Rupee");
                break;}
            
            case "CAD":{System.out.println("Enter the amount");
            x=sc.nextInt();
                d=x*52.08;
                System.out.println("Canada dollar "+x+" equals to "+(String.format("%.2f",d))+" Indian Rupee");
                break;
            }
            case "SGD":{System.out.println("Enter the amount");
            x=sc.nextInt();
                d=x*51.29;
                System.out.println("Singapore dollar "+x+" equals to "+(String.format("%.2f",d))+" Indian Rupee");
                break;
            }
            case "USD":{System.out.println("Enter the amount");
            x=sc.nextInt();
                d=x*69.55;
                System.out.println("USA dollar "+x+" equals to "+(String.format("%.2f",d))+" Indian Rupee");
                break;
            }
        
        default:System.out.println("Currency code not found");}
    }
}