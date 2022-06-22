/*
In a garden, there is a row of plants. The gardener need to water them regularly.
In the row of plants, some are empty places some are plants. you need to setup 
the watering kits to water the row of plants at the empty places. A watering kit
can supply water to its adjacent plants, i.e., if the watering kit is at 
i-th position it can water the plants ar 'i+1'-th and 'i-1'-th  positions.

You are given a string 'plants', consists of two characters only [P,E], where P 
indiactes plant and E indicates empty place.

Your task is to return the minimum number of watering kits needed so that 
for every plant, the gardener can supply the water to all the plants in that 
row OR -1 if it is impossible.


Input Format:
-------------
A string, consists of only two characters P and E

Output Format:
--------------
Print an integer result, the minimum num of watering kits.


Sample Input-1:
---------------
PEEEPEP

Sample Output-1:
----------------
2

Explanation: 
------------
You can setup watering kits at index-1, index-5, so all the 3 plants gets water.


Sample Input-2:
---------------
PEPEEPP

Sample Output-2:
----------------
-1

Explanation: 
------------
No empty place after the last plant in the row, so retrun -1.

*/
import java.util.*;
class Test{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.print(water(str));
    }
    public static int water(String str){
        int kit=0;
        boolean[] vis=new boolean[str.length()];
        str=str.replaceAll("PEP","0");
        if(str.charAt(0)=='P' && str.charAt(1)=='E'){
            vis[0]=true;
            kit++;
        }
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)=='P' && !vis[i]){
                if(str.charAt(i-1)=='E'){
                    vis[i]=true;
                    kit++;
                }
                else if(i<str.length()-1 && str.charAt(i+1)=='E'){
                    vis[i]=true;
                    kit++;
                }
                else{
                    return -1;
                }
            }
        }
        for(char i:str.toCharArray()){
            if(i=='0')
                kit++;
        }
        return kit;
    }
}
