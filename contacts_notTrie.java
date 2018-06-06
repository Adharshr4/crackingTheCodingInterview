/*We're going to make our own Contacts application! The application must perform two types of operations:

add name, where name is a string denoting a contact name. This must store name as a new contact in the application.
find partial, where partial is a string denoting a partial name to search the application for. It must count the number of contacts 
starting with partial and print the count on a new line.
Given n sequential add and find operations, perform each operation in order.

Input Format

The first line contains a single integer,n , denoting the number of operations to perform. 
Each line i of the nsubsequent lines contains an operation in one of the two forms defined above.

put Format

For each find partial operation, print the number of contact names starting with partial on a new line.

ExampleInputOutput:

4
add hack
add hackerrank
find hac
find hak

Output:
2
0         */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count=0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List<String> list = new ArrayList<>();
        for (int nItr = 0; nItr < n; nItr++) {
            String[] opContact = scanner.nextLine().split(" ");

            String op = opContact[0];

            String contact = opContact[1];
            
            if(op.equals("add")){
                list.add(contact);
            }
            else if(op.equals("find")){
                
                for(String str : list){
                    if(str.length() < contact.length()){
                        count=0;
                    }
                    else if(str.substring(0,contact.length()).equals(contact)){
                        count++;
                    }
                }
                System.out.println(count);
                count=0;
            }
        }        
    }
}
