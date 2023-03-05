import java.util.*;



public class Exercise{
    public static void main(String[] args){
        //Menu Driven Program
      Scanner sc = new Scanner(System.in);
      System.out.println("1.Factorial");
      System.out.println("2.Prime number");
      System.out.println("3.Even or odd");
      System.out.println("4.Exit");
      System.out.println("Enter your choice:");
      int choice = sc.nextInt();
      switch(choice){
        case 1: 
                int fact = 1;
                System.out.println("Enter a number:");
                int n = sc.nextInt();
                for(int i=0;i<=n;i++){
                fact = fact*i;
                }
                System.out.println("factorial of a number:"+fact);
                break;
        case 2:
                int count = 0;
                System.out.println("Enter a number:");
                int x = sc.nextInt();
                for(int j=1;j<=x;j++){
                    if(x%j==0){
                        count++;
                    }
                } 
                if(count==2){
                    System.out.println("Given number is Prime");
                }else{
                    System.out.println("Given number is not a prime number");
                }
                break;
        case 3: 
                System.out.println("Enter number:");
                int y = sc.nextInt();
                if(y%2 == 0){
                    System.out.println("The Entered by you Even");
                }else{
                    System.out.println("Odd number");
                }
                break;
       default:
                System.out.println("You enter an Invalid number!!!!!!!");
             
    }
    }
}