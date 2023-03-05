import java.util.*;
public class Loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int z = sc.nextInt();
    
    int x=0;
       for(int i=1; i<=z;i++){
       if(z%i==0){
        x++;
       }
       }
       if(x==2){
        System.out.println("Given number is prime number");
       }else 
       System.out.println("Not Prime!");
      
    }

}