// Digit rearrangement method to find next greater number with same set of digits
// Asked In: Morgan StanleyMakemytripAmazon
// Write an algorithm to find out next greater number to given number with the same set of digits Asked in : Morgan Stanley, Makemytrip, Amazon

// Example:

// Input 1:
// A = [1, 2, 3]
// Output 1:
// [1, 3, 2]
// Input 2:
// A = [3, 2, 1]
// Output 2:
// [1, 2, 3]
// Hint 1 : Start comparing from right most Integer value with left one
// Hint2 : You need to find immediate higher Number from given number

// Problem level: Medium

import java.util.Arrays; 
  
public class Main  
{ 
    // Given number as int array, this function finds the greatest number and give the number as integer
    static void findNextNumber(char array[], int n)  
    { 
        int i = 0;
         for(i = n-1; i>0;i--){
             if(array[i-1]< array[i]){
                 break;
             }
         }
         int element =array[i-1];
         int minNum = i;
         for(int j= i+1;j<n;j++){
             if(array[j] > element && array[j] < array[minNum]){
                 minNum = j;
             }
         }
         swap(array,i-1,minNum);
         Arrays.sort(array,i,n);
         return;
    } 
    
    private static void swap(char[] array,int index1,int index2){
        char temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return;
    }
  
    public static void main(String[] args)  
    { 
        char array[] = { '5','3','4','9','7','6' }; 
        int n = array.length; 
        findNextNumber(array, n); 
        for(int i = 0; i<n;i++){
             System.out.print(array[i]);
         }
    } 
} 

/* Try more Inputs
case 1: 
actual = findNextNumber([1,2,3,4],4)
expected = 1243

case2: 
 actual = findNextNumber([5,3,4,9,7,6],6)
 expected = 536479
 
case3: 
actual = findNextNumber([6,9,3,8,6,5,2],7)
expected = 6952368
*/
