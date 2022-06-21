/*In this game, the player needs to find out the most frequently picked card number, 
from a deal of cards . If there is more than one such card number, display the smallest of 
them.
Example

Lets say there are five cards dealth, with numbers 0 0 1 1 2
The cards with the numbers 0 and 1 appeared the most number of times
The smallest number among them is 0

Input format 
The first line contains the number of cards in the deal.
The second line lists down the card numberrs, each separated by a single space.

Output format 
The smallest of the most frequently dealt card numbers.

Sample input
6
1 4 4 4 53
Sample output
4
*/
import java.util.*;
class Prog3{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        System.out.print(card(n,ar));
    }
    public static int card(int n,int[] ar){
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i:ar){
            hs.put(i,hs.getOrDefault(i,0)+1);
        }
        Map.Entry<Integer,Integer> max=null;
        for(Map.Entry<Integer,Integer> c:hs.entrySet()){
            if(max==null || c.getValue().compareTo(max.getValue())>0){
                max=c;
            }
        }
        return max.getKey();
    }
}
