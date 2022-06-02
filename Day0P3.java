/*Given a number in binary format return the number of substrings in binary format with all characters 1's 

input =0110111
output =9

there are 9 substring in total with only 1's characters.
1-> 5 times
11-> 3 times
111 -> 1 time
5 + 3+ 1=9

input =101
output=2
there are 2 substrings 1 is shown 2 times 

input =111111
output =21
each substring contains only 1's characters*/
import java.util.*;
class Prog3{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.print(similar(str));
    }
    public static int similar(String str){
        int sum=0;
        int count=0;
        int i;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                count++;
            }
            else{
                count=0;
                
            }
            sum+=count;
            sum=sum%1000000007;
        }
        
        return sum%1000000007;
    }
}

