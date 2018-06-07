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
    
    private static PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
    private static PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),i,j;
        int[] arr = new int[n];
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        getMedian(arr);
        
    }
    
    public static void getMedian(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            addNumber(arr[i]);
            System.out.println(getMedian());
        }

    }
    
    public static void addNumber(int n){
        
        if (maxHeap.isEmpty()){
            maxHeap.add(n);
        }
        else if(maxHeap.size() == minHeap.size()) {
            if(n < minHeap.peek()) {
                maxHeap.add(n);
            } 
            else{
                minHeap.add(n);
                maxHeap.add(minHeap.remove());
            }
        } 
        else if(maxHeap.size() > minHeap.size()) {
            if(n > maxHeap.peek()) {
                minHeap.add(n);
            }
            else{
                maxHeap.add(n);
                minHeap.add(maxHeap.remove());
            }
        }
        
    }
    
    private static double getMedian(){
        if(maxHeap.isEmpty()) {
            return 0;
        }
        else if(maxHeap.size() == minHeap.size()){
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        } 
        else{ 
            return maxHeap.peek();
        }
    }
    
}
     
