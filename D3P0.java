/*Given an array and k , find largest sum of subsequence of nums of length k from array

Return any such subsequence as an integer array of length k.

A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.

 
input =4
2 1 3 3 
2
output =3 3
The subsequence has the largest sum of 3 + 3 = 6.

input =4
-1 -2 3 4
3
output =-1 3 4
The subsequence has the largest sum of -1 + 3 + 4 = 6.

input =4
3 4 3 3
2
output =3 4
The subsequence has the largest sum of 3 + 4 = 7. 
Another possible subsequence is 4 3.

*/
import java.util.*;
class Test{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int l=sc.nextInt();
        subs(n,ar,l);
    }
    public static void subs(int n,int[] ar,int l){
        int sum=0;
        int pre=0;
        Arrays.sort(ar);
        for(int i=0;i<=n-l;i++){
            List<Integer> li=new ArrayList<>();
            for(int j=i;j<l+i;j++){
                li.add(ar[j]);
            }
            if(sumEl(li)>sum){
                sum=sumEl(li);
                pre=i;
            }
        }
        for(int i=pre;i<l+pre;i++){
            System.out.print(ar[i]+" ");
        }
    }
    public static int sumEl(List<Integer> li){
        int s=0;
        for(int i:li){
            s+=i;
        }
        return s;
    }
}
