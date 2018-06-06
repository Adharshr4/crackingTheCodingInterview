/* To check 
Sample Input:
3
{[()]}
{[(])}
{{[[(())]]}}

Output:
YES
NO
YES   */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Hello{
    public static int check(char c,char d){
        if(c == '(' && d == ')'){
            return 1;
        }
        else if(c == '{' && d == '}'){
            return 1;
        }
        else if(c == '[' && d == ']'){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        int ans = 0,flag=0;
        for (int tItr = 0; tItr < t; tItr++) {
            flag=0;
            ans=0;
            Stack<Character> stack = new Stack<Character>();
            String expression = scanner.nextLine();
            for(int i=0;i<expression.length();i++){
                if(expression.charAt(i) == '(' || expression.charAt(i) == '{' || expression.charAt(i) == '['){
                    stack.push(expression.charAt(i));
                }
                if(expression.charAt(i) == ')' || expression.charAt(i) == '}' || expression.charAt(i) == ']'){
                    if(stack.empty()){
                        ans = 0;
                        flag=1;
                        break;
                    }
                    
                    else if(check(stack.pop() , expression.charAt(i)) == 0){
                        ans = 0;
                        flag=1;
                        break;
                    }
                }
                if(flag==1){
                    break;
                }
            }
            if(stack.empty() && flag == 0){
                ans = 1;
            }
            else{
                ans = 0;
            }
            if(ans == 1){
                System.out.println("YES"+" ");
            }
            else{
                System.out.println("NO"+" ");
            }
            while(stack.empty() == false){
                stack.pop();   //if there contains some brackets in the stack..to remove those
            }
        }
    }
}
