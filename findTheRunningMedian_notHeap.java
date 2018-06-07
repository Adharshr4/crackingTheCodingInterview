/*To find the median after adding one one element ..give n and n integers tht form the array
Sample Input:

6
12
4
5
3
8
7

Sample Output

12.0
8.0
5.0
4.5
5.0
6.0

Explanation:

list = {12}  median = 12.0
list = {12,4} median = 8.0
list = {12,4,5} median = 5.0
.
.
.
     */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Hello{
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*TreeSet<Integer> ts = new TreeSet<Integer>();
        int n = sc.nextInt();
        int i,j;
        int[] arr = new int[1000];
        for(i=0;i<n;i++){
            ts.add(sc.nextInt());
        }
        Iterator<Integer> itr = ts.iterator();  
        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/
        List<Integer> list = new ArrayList<Integer>();
        int n = sc.nextInt();
        int i,j;
        double d = 0,sum=0;
        int[] arr = new int[1000];
        for(i=0;i<n;i++){
            list.add(sc.nextInt());
            Collections.sort(list);
            if(list.size()%2 == 0){
                sum = sum + list.get(list.size()/2) + list.get((list.size()/2)-1) ;
                d = sum / 2;
                sum = 0;
            }
            else{
                sum = sum + list.get(list.size()/2);
                d = sum;
                sum = 0;
            }
            System.out.println(d);
        }
    }
}
