/*Ravi is playing with string, return the number of similar substrings of s.

similar substring means if all the characters of the substrings are the same

example:
input = bccdddbb
Explanation: The similar substrings are listed as below:
"b"   appears 3 times.
"bb"  appears 1 time.
"c"   appears 2 times.
"cc"  appears 1 time.
"d"   appears 3 times.
"dd"  appears 2 times.
"ddd" appears 1 time.
3 + 1 + 2 + 1 + 3 + 2 + 1 = 13.

output =13

input =ab
output =2
similar substrings are a and b


input =sssss
output =15

Note: answer may be too large, return it modulo 10^9+7
*/
import java.util.*;
class Prog2{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.print(similar(str));
    }
    public static int similar(String str){
        int sum=0;
        int start=0;
        int i;
        for(i=0;i<str.length()-1;i++){
            if(str.charAt(i)!=str.charAt(i+1)){
                int l=i-start+1;
                sum+=l*(l+1)/2;
                start=i+1;
            }
        }
        if(start<str.length()){
        int l=i-start+1;
        sum+=l*(l+1)/2;
        }
        return sum;
    }
}
