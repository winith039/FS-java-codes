/*CAROM-CHALLENGE

Two players A and B play a 3-level game. The scores of A and B at each level are stored in 
arrays P and Q respectively. At each level, the winner gets one point and the loser gets 
zero points. If Its a tie then no one will get a point. Find the total points scored by the 
players by comparing the scores at each level. 

Example

lets says score of A and B are P[N]=[1,2,3] and Q[N]=[3,2,1]
Now compare the scores at each level and calculate the points score by A & B. 
Print the total points scored i.e = Y=[1,1].

input format 
The first line contains A's score in each level separated by a single space.
The second line contains B's score in each level separated by a single space.

Output format
Total points socred by both the players, each separated by a single space

Sample input
5 6 7
3 6 10
Sample output
1 1*/
import java.util.*;
class Prog2{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        String f=sc.nextLine();
        String s=sc.nextLine();
        String[] p1=f.split(" ");
        String[] p2=s.split(" ");
        scores(p1,p2);
    }
    public static void scores(String[] p1,String[] p2){
        int[] sco=new int[2];
        for(int i=0;i<p1.length;i++){
            if(Integer.parseInt(p1[i])>Integer.parseInt(p2[i])){
                sco[0]++;
            }
            else if(Integer.parseInt(p1[i])<Integer.parseInt(p2[i])){
                sco[1]++;
            }
        }
        for(int i:sco){
            System.out.print(i+" ");
        }
    }
}

