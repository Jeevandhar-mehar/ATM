
import java.util.*;

public class Atm {
    public static void main(Str[] args) {
        Scanner sc=new Scanner(System.in);
        int bl=15300;
        int a;
        System.out.println("**Insert your card**");
        System.out.println("Fast Cash");
        System.out.println("Deposit");
        System.out.println("Balance inquary");
        System.out.println("Change Pin");
        System.out.print("\n\nEnter your choise :  "); 
        int ch=sc.nextInt();
        switch (ch){
            case 1:
            System.out.print("Enter Amount ");
            a=sc.nextInt();

            System.out.print("Enter your pin ");
            int p=sc.nextInt();
            if(p==1234){
                System.out.println("*********************Please collect your case******************\n");
            }
            else {
                System.out.println("------------Invailed pin------------\n");
            }
            System.out.println("!!!!!!!!!!!!!!!!!!!!!! Thnk You !!!!!!!!!!!!!!!!!!!!");

            break;
            case 2:
            System.out.println("please put the amount in machine ");
            System.out.print("Enter your pin ");
            int pa=sc.nextInt();
            if(pa==1234){
                System.out.println("Your case safly deposit to your account");
            }
            else {
                System.out.println("Invailed pin");
            }

            System.out.println("!!!!!!!!!!!!!!!!!!!!!!! Thnk You !!!!!!!!!!!!!!!!!!!!!!!!");
            break;
            case 3:
            System.out.println("Clear balence"+bl);
            
            break;
            
            case 4:
            System.out.println("Enter your ragister mobile number");
            int mo=sc.nextInt();
            if(mo==123456){
                System.out.print("Enter the OTP");
                int otp=sc.nextInt();
            

                if(otp==0000){
                System.out.print("Enter your new pin ");
                }
                else {
                    System.out.println("Invailed OTP ");
                }


            }
            else{
                System.out.print("Invailed mobile number ");
            }
            break;
            default:
            throw new AssertionError();
            
        }
        System.out.println("Do you want recipt ");
        System.out.println("YES");
        System.out.println("NO");
        int c=sc.nextInt();
        int wh;
        switch (c) {
        
            case 1:
              System.out.println("Clear balance "+bl);
              System.out.println("Thank you \n Visit again");
                
                break;
            default:
                System.out.println("Thankyou");
        }
       


    }
}