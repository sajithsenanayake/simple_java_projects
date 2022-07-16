
package com.mycompany.atmmachine;
import java.util.*;

public class Atmmachine {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balance=0;
        int inpt ;
   do{
       System.out.println("1=Diposit \t2=withdraw\n3=check balance\t4=end process");
       System.out.print("Enter choice ");
       inpt=sc.nextInt();
        if(inpt==1){
            System.out.print("Enter value ");
            balance=sc.nextInt()+balance; 
            System.out.println("your balance is :"+ balance);
         }
        else if(inpt==2){
            System.out.print("Enter value");
            int withdraw=sc.nextInt();
            if(withdraw>balance){
                System.out.println("sorry!you dont have sufficient balance to wothdraw");
                }
            else{
                balance-=withdraw;
                System.out.println(balance);
                }
            }
       else if (inpt==3){ 
        
            
            System.out.println("your balance is :"+ balance);
           }
       else if (inpt>4 || inpt<0){
           System.out.println("invalid choice");
            }
   }while(inpt!=4);
   
      
   System.out.println("you are done!");
    }
    
}
