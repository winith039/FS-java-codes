
/*Somu a third class student is working on a Maths Assignment on Time, given by 
his teacher.

He will be given the Begin Time and End Time. 

He is supposed to find the Number of Quarter Times in the given time period.
A Quarter time is considered as below

HH:00 to HH:15
HH:15 to HH:30
HH:30 to HH:45
HH:45 to HH:00

where HH represents an integer number from 00 to 23.

calculate the number of Quarter Times during the given time session

A 24-hour clock is used, so the earliest time in the day is 00:00 and the latest is 23:59.

if the start time is 04:20 and end time is 04:48. 

It implies you only one quarter from 04:30 to 04:45. 
You did not have the full quarter from 04:15 to 04:30 because you started the Second Quarter 
at 4:20 and you did not count the next quarter 04:45 to 05:00 because your end time is 04:48.  

If finishTime is earlier than startTime, then you have to calculate 
from startTime to the midnight and from midnight to finishTime

input = 12:01
12:44
output=1

Explanation: 
------------
You have only quarter from 12:15 to 12:30


input = 20:00 
06:00

output = 40

Explanation:
------------
You have 16 quarters from 20:00 to 00:00 and 24 quarters from 00:00 to 06:00.*/
import java.util.*;
class Prog1{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        String t1=sc.nextLine();
        String t2=sc.nextLine();
        System.out.print(quarter(t1,t2));
        
    }   
    public static int quarter(String t1,String t2){
        String[] s=t1.split(":");
        String[] e=t2.split(":");
        int[] st=new int[]{Integer.parseInt(s[0]),Integer.parseInt(s[1])};
        int[] en=new int[]{Integer.parseInt(e[0]),Integer.parseInt(e[1])};
        int q=0;
        if(st[0]>en[0] || st[1]>en[1] && st[0]==en[0]){
            q+=4*(23-st[0]+en[0]);
            if(st[1]>0)
            q+=(60-st[1])/15;
            q+=(en[1])/15;
        }
        else if(st[0]<en[0]){
            if(st[1]>0)
            q+=(60-st[1])/15;
            q+=(en[1])/15;
            q+=4*(en[0]-st[0]-1);
            if(st[1]==0)
            q+=4;
        }
        else{
            q+=en[1]/15;
            if(st[1]%15!=0)
            q--;
        }
        return q;
    }
}
