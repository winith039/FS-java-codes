/*To strike Ukarine,Russia has created two missiles with X and Y powers. 
Ukraine decided to develop a single missile to defend itself against Russia
missiles. Ukraines  missile can counter these two missiles only if its power is 
divisible by both X and Y. What is the smallest possible power Ukranie's 
missile should have ?

Input format
The first line will have an integer input X = power of first missile
The second line will have an integer input Y = power of second missile

Output format
An integer value of Ukranies missile power

input= 45
35
output = 315*/
import java.util.*;
class Prog1{
    public static void main(String[] a){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    if(x<y){
        System.out.print((x*y)/gcd(x,y));
    }
    else{
        System.out.print((x*y)/gcd(y,x));
    }
    }
    public static int gcd(int x,int y){
        if(x==0){
            return y;
        }
        else{
            return gcd(y%x,x);
        }
    }
    
}
