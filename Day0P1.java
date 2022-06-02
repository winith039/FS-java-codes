/*Aarush , a Second Class Kid went to Summer Carnival and choose to buy soft juices.
At the Juice point there are n soft juices, each with a price.
Aarush has few money, He is interested in buying all the juices. 
Help Aarush, how many juices can he buy with all the money he has.

you will be given an array of prices, where prices[i] is the cost of 
one juice. 

He can buy the juice in any order.

Example 1:
Input = 1 3 2 4 1
7
output = 4

Explanation: 
The boy can buy juice at indices 0 1 2 4 
for a total price of 1 + 3 + 2 + 1 = 7.

Example 2:
Input  = 10 6 8 7 7 8
5
Output = 0
Explanation: The boy cannot afford any of the soft juice.

Example 3:
Input = 1 6 3 1 2 5
20
Output = 6
Explanation: He can buy all the soft juices for a total price of 1 + 6 + 3 + 1 + 2 + 5 = 18.

Constraints:
prices.length == n
1 <= n <= 10^5
1 <= prices[i] <= 10^5
1 <= price <= 10^8
*/


import java.util.*;
class Prog1{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        int p=sc.nextInt();
        Collections.sort(l);
        System.out.println(juice(l,p));
    }
    public static int juice(List<Integer> l,int p){
        int sum=0;
        if(l.get(0)>p){
           return 0; 
        }
        int i=0;
        for(i=0;i<l.size();i++){
            sum+=l.get(i);
            if(sum>p){
               return i; 
            }
            else if(sum==p){
                return i+1; 
            }
        }
        return i;
        
    }
}
