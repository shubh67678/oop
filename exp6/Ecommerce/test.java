// import java.lang.*;
// class MinOrderException extends Exception{

//     public MinOrderException(String str){
//         super(str);
//     }
// }

// public class Main2 {
//     //validate the price 
//     static void validatePrice(int price) throws InvalidPrice {
//         if (price < 0) {
//             throw new InvalidPrice("The price should be positive");
//         } else {
//             System.out.println("The price is valid");
//         }
//     }
// }

import java.util.*;
class ExceptionHandling{
public static void main( String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers");
int num1 = sc.nextInt();
int num2 = sc.nextInt();
try{
if (num1+num2>=99)
throw new myException();
}
catch(myException e){
System.out.println("The sum is greater than 99");
}
}
} 
class myException 
extends Exception{
myException(){
super();
}
}
Swapnali Kurhade3:49 PM
class shoping{
static void check(int order) throws MinOrderException {
if(order>=1000)
System.out.println("Free payment");
else
throw new MinOrderException(or);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter amount");
int extraPayment=0;
int total=sc.nextInt();
try{
check(total);
}
catch(Exception e){
extraPayment+=50;
}
System.out.println("Your total amount is: 
"+(total+extraPayment));
}
}
import java.util.*;
class MinOrderException extends Exception{
MinOrderException(int order){
System.out.println("Criteria 
unsatisfied");
}
}