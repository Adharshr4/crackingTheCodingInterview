/* A left rotation operation on an array shifts each of the array's elements 1 unit to the left. For example, if 2
left rotations are performed on array [1,2,3,4,5], then the array would become [3,4,5,1,2].

Given an array a of n integers and a number,d , perform d left rotations on the array. 
Return the updated array to be printed as a single line of space-separated integers.

Input Format:

The first line contains two space-separated integers n and d, the size of a and the number of left rotations you must perform. 
The second line contains n space-separated integers a[i].

Output:

Print a single line of n space-separated integers denoting the final state of the array after performing d left rotations.

Sample Input

5 4
1 2 3 4 5
Sample Output

5 1 2 3 4            */


#include<stdio.h>
#include <stdlib.h>

int main()
{
    long int length,j,pos,temp,temp1;
    int c,nooftimes;
    scanf("%d\n%d\n",&c,&nooftimes);
    int arr[c];
    for(int i=0;i<c;i++){
        scanf("%d ",&arr[i]);
    }
    pos=nooftimes%c;
    for(j=pos;j<c;j++)
    {
        printf("%d ",arr[j]);
    }
    for(j=0;j<pos;j++)
    {
        printf("%d ",arr[j]);
    }
}
