// Segregation logic to Sort an array of 0's, 1's and 2's 
// Asked In: AmazonMicrosoftAdobeWalmartLabs
// Array consist of only 0's, 1's and 2's. Write an algorithm to sort  this array in O(n) time complexity and O(1) Space complexity with only one traversal Asked in : : Amazon, Microsoft, Adobe, WalmartLabs

// Example:

// Input : [0 1 2 0 1 2]
// Modify array so that it becomes : [0 0 1 1 2 2]
// Hint1 : You are not suppose to use any extra space
// Hint2 : You need change the same array with single traversal with O(n) time complexity
// Problem level: Easy
import java.util.Arrays;

public class Main {
//sort a array containing 0, 1 and 2
//three-way Partitioning
  public static void Sort012(int[] array, int end) {
     //Practise Yourself : Write your code Here
     int zeroIndex = 0, currentIndex = 0, twoIndex = array.length -1,temp;
     while(currentIndex <= twoIndex){
         if(array[currentIndex] == 1){
             currentIndex++;
         } else if(array[currentIndex] == 2){
             array[currentIndex] = array[twoIndex];
             array[twoIndex] = 2;
             twoIndex--;
         } else if(array[currentIndex] == 0){
             array[currentIndex] = array[zeroIndex];
             array[zeroIndex] = 0;
             zeroIndex++;
         }
     }
  }

  public static void main(String[] args) {
    int[] array = { 2, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

    Sort012(array, array.length - 1);
    System.out.println(Arrays.toString(array));
  }
}


/* Try more Inputs
case 1: 
actual = Sort012([0, 1, 2, 0, 1, 2],5)
expected = [0, 0, 1, 1, 2, 2]

case2: 
 actual = Sort012([0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1],11)
 expected = [0,0,0,0,0,1,1,1,1,1,2,2]
 
case3: 
actual = Sort012([2,0,1}],3)
expected = [0,1,2]
*/
