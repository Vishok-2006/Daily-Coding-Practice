// ===========================
// PLACEMENT CODING MOCK TEST
// (Level: Based on Your Sample)
// Time: 90 Minutes
// Language: Java
// ===========================

import java.util.*;
public class Practice{

public static void main(String[] args){


    Scanner sc =new Scanner(System.in);

// -----------------------------
// SECTION 1 — STRING QUESTIONS
// -----------------------------

// Q1) Armstrong Number (Sample Type)

// You are given an integer N. A number is called an Armstrong number if the sum
// of each digit raised to the power of total digits equals the original number.

// Task:
// Return "Armstrong" if true, otherwise return "Not Armstrong".

// Input:
// 153

// Output:
// Armstrong

// Example:
// 153
// 1³ + 5³ + 3³ = 153


// ===========================

// Solution

// ===========================







// int n=sc.nextInt();
// int t=0;
// int l=String.valueOf(n).length();
// int n1=n;

// while(n>0){
//     int r=n%10;
//       t+=Math.pow(r, l);
//       n=n/10;
// }

// if(t==n1) System.out.println("arm");

// else  System.out.println("not");







// ----------------------------------

// Q2) Uppercase-Lowercase Transition Count (Sample Type)

// You are given a string S containing uppercase and lowercase letters.

// A transition occurs whenever:
// - lowercase → uppercase
// OR
// - uppercase → lowercase

// Task:
// Return the total number of transitions.

// Input:
// aBcDeF

// Output:
// 5

// Explanation:
// a→B
// B→c
// c→D
// D→e
// e→F





// ===========================

// Solution

// ===========================




// String s=sc.nextLine();
// int n=s.length();
// int t=0;
// for(int i=0;i<n-1;i++){
//     if(Character.isLowerCase(s.charAt(i)) && Character.isUpperCase(s.charAt(i+1)) ){
//         t+=1;
//     }
//     if(Character.isUpperCase(s.charAt(i)) && Character.isLowerCase(s.charAt(i+1))){
//         t+=1;
//     }
// }
// System.out.println(t);






// ----------------------------------

// Q3) Good Segments Count (Sample Question)

// You are given a string S consisting of uppercase and lowercase letters.

// A segment is called GOOD if:
// 1. All characters are same case
// 2. Length > 1

// Return total number of good substrings.

// Input:
// aaBBcDDD

// Output:
// 7

// Explanation:
// aa → 1
// BB → 1
// DDD → 3
// DD → 2

// Total = 7




// ===========================

// Solution

// ===========================




// String s=sc.nextLine();
// int n=s.length();
// int c=0;
// for(int i=0;i<n-1;i++){
//     if(s.charAt(i)==s.charAt(i+1)) c++;
// }


// System.out.println(c);






// ----------------------------------

// Q4) Reverse Small Sentence (Sample Style)

// You are given a paragraph.

// Rules:
// 1. Remove extra spaces.
// 2. Capitalize first word.
// 3. If sentence contains less than 5 words,
//    reverse all words.

// Input:
// hello world. java is fun.

// Output:
// World hello Fun is java



// ===========================

// Solution

// ===========================


// String s=sc.nextLine();
// int n=s.length();
// String [] str=s.split(".");

// String [] w= new String[str.length];
// for(int i=0;i<str.length;i++){
 
// }












// ----------------------------------

// Q5) Longest Even Vowel Word (Sample Type)

// You are given sentence S.

// Return:
// - longest even-length word
// - word must start with vowel
// (case insensitive)

// If multiple exist:
// return first occurring word

// If none:
// return "00"

// Input:
// An elephant eats ice

// Output:
// elephant



// ===========================

// Solution

// ===========================






// ----------------------------------

// Q6) Camel Case Change Count (NEW)

// You are given string S.

// Count how many times uppercase letters appear
// after lowercase letters.

// Input:
// helloWorldJavaCode

// Output:
// 3

// Explanation:
// W, J, C




// ===========================

// Solution

// ===========================
















// ----------------------------------

// Q7) Alphabet Mirror String (NEW)

// Given a string S of lowercase letters.

// Replace each character with opposite alphabet.

// a -> z
// b -> y
// c -> x

// Input:
// abc

// Output:
// zyx

// Input:
// hello

// Output:
// svool



// ===========================

// Solution

// ===========================


// String s=sc.nextLine();
// char [] arr=s.toCharArray();
// for(int i=0;i<arr.length;i++){
//     arr[i]=(char)('z'-(arr[i]-'a'));
// }

// System.out.print(arr);








// ----------------------------------

// Q8) Remove Consecutive Duplicate Characters

// Input:
// aaabbccccdaa

// Output:
// abcda

// Explanation:
// Repeated adjacent characters removed.



// ===========================

// Solution

// ===========================


// String s=sc.nextLine();
// int n=s.length();
// // StringBuilder sb=new StringBuilder();
// // for (int i=1;i<n-1;i++){
// //     if(s.charAt(i)==s.charAt(i+1)){
// //         sb.append(s.charAt(i+1));
// //         continue;
// //     }
// //     else{
// //         sb.append(s.charAt(i));
// //     }

// // }
// // System.out.println(sb.toString());
// Set<Character> sb=new LinkedHashSet<>();
// for(char a:s.toCharArray()){
//     sb.add(a);
// }
// System.out.println(sb.toString());









// ----------------------------------

// Q9) Character Frequency (Important)

// Input:
// programming

// Output:
// p=1
// r=2
// o=1
// g=2
// a=1
// m=2
// i=1
// n=1




// ===========================

// Solution

// ===========================



// String s=sc.nextLine();
// Map<Character,Integer> sb=new LinkedHashMap<>();
// for(int i=0;i<s.length();i++){
//     sb.put(s.charAt(i),sb.getOrDefault(s.charAt(i),0)+1);
// }

// System.out.print(sb.toString());







// ----------------------------------
// SECTION 2 — ARRAYS QUESTIONS
// ----------------------------------

// Q10) Second Largest Number (Must Know)

// Input:
// [10,20,5,50,40]

// Output:
// 40


// ===========================

// Solution

// ===========================


// int n=sc.nextInt();
// int [] arr= new int[n];
// for(int i=0;i<n;i++){
//     arr[i]=sc.nextInt();
// }
// int [] s= new int[n];
// Arrays.sort(arr);
// System.out.println(arr[n-2]);














// ----------------------------------

// Q11) Find Missing Number

// Array contains numbers from 1 to N
// with one missing number.

// Input:
// [1,2,3,5]

// Output:
// 4



// ===========================

// Solution

// ===========================



// int n=sc.nextInt();
// int arr[]=new int[n];
// for(int i=0;i<n;i++){
//     arr[i]=sc.nextInt();
// }
// int c=0;
// for(int i=0;i<n;i++){
//     if(arr[i]==i+1){
//         continue;
//     }
//     else {
//         c=i+1;
//         break;
//     }
// }
// System.out.println(c);








// ----------------------------------

// Q12) Maximum Money Thief (Sample Type)

// You are given:

// security[] array
// money[] array

// A thief can rob only houses whose
// security level < average security.

// Task:
// Return maximum money thief can steal.

// Input:
// security=[1,4,2,8]
// money=[100,500,200,700]

// Output:
// 200




// ===========================

// Solution

// ===========================


// int n=sc.nextInt();
// int[] s=new int[n];
// int m[]=new int[n];
// for(int i=0;i<n;i++){
//     s[i]=sc.nextInt();
// }
// for(int i=0;i<n;i++){
//     m[i]=sc.nextInt();
// }
// int avg=0;
// int amt=0;
// for(int i=0;i<n;i++){
//     avg+=s[i];
// }
// avg=avg/n;
// for(int i=0;i<n;i++){
//     if(s[i]<avg){
//       amt+=m[i];
//     }
// }
// System.out.println(amt);
// System.out.println(avg);







// ----------------------------------

// Q13) Nearest Perfect Square Cost (Sample Type)

// Given array A.

// Replace each element with nearest square.

// Cost =
// absolute difference

// Return total cost.

// Input:
// [12,10,25]

// Output:
// 3

// Explanation:
// 12 -> 9 cost 3
// 10 -> 9 cost 1
// 25 -> 25 cost 0

// Total = 4



// ===========================

// Solution

// ===========================

















// ----------------------------------

// Q14) Unique Weight Operations (Sample Style)

// Weight initially = 0

// Allowed operations:
// +3
// *2

// Exactly Y operations

// Return number of unique weights.

// Input:
// 2

// Output:
// 4



// ===========================

// Solution

// ===========================


// int n=sc.nextInt();
// Set<Integer> s=new LinkedHashSet<>();
// s.add(0);
// for(int i=0;i<n;i++){
//     Set<Integer> t=new LinkedHashSet<>();
// for(int j:s){
    
//     t.add(j+3);
//     t.add(j*2);
   
// }
//  s=t;
// }
// System.out.println(s.size());













// ----------------------------------

// Q15) Move Zeros to End

// Input:
// [1,0,4,0,5]

// Output:
// [1,4,5,0,0]



// ===========================

// Solution

// ===========================

// int n=sc.nextInt();
// int [] arr=new int[n];
// for(int i=0;i<n;i++){
//     arr[i]=sc.nextInt();
// }
// StringBuilder num=new StringBuilder();
// StringBuilder z =new StringBuilder();
// for (int i=0;i<n;i++){
//   if(arr[i]==0){
//     z.append(arr[i]);
//   }
//   else{
//      num.append(arr[i]);
//   }
// }

// num.append(z);
// System.out.println(num.toString());






// ----------------------------------

// Q16) Rotate Array Right by K

// Input:
// arr=[1,2,3,4,5]
// k=2

// Output:
// [4,5,1,2,3]

// ===========================

// Solution

// ===========================


// int n=sc.nextInt();
// int [] arr=new int[n];
// for(int i=0;i<n;i++){
//     arr[i]=sc.nextInt();
// }
// int k=sc.nextInt();
// int [] t=new int[n];
// for(int i=0;i<n;i++){
//     t[i]=arr[(i+k)%n];
// }
// for(int i :t){
// System.out.print(i);
// }








// ----------------------------------

// Q17) Find Duplicate Number

// Input:
// [1,2,3,4,2]

// Output:
// 2



// ===========================

// Solution

// ===========================












// ----------------------------------

// Q18) ASCII Digit Match (Sample Type)

// You are given:
// String S (uppercase only)
// Integer array A

// For every character:
// Find ASCII value.

// If any digit in ASCII exists in A,
// count character.

// Input:
// A=[5,6]
// S="ABC"

// ASCII:
// A=65
// B=66
// C=67

// Output:
// 2

// ===========================

// Solution

// ===========================












// ----------------------------------
// SECTION 3 — MIXED LOGIC QUESTIONS
// ----------------------------------

// Q19) Palindrome Half Conversion (Sample Style)

// String length is even.

// Split into two equal halves.

// Each half should become palindrome.

// In one operation:
// replace one character.

// Return minimum operations.

// Input:
// abcdxy

// Output:
// 2


// ===========================

// Solution

// ===========================











// ----------------------------------

// Q20) Electricity Percentage (Sample Type)

// Devices:
// AC TV Fridge WashingMachine Fan

// Find:
// 1. percentage contribution
// 2. least contributor

// Input:
// AC=[10,20]
// TV=[10,10]
// Fridge=[20,20]
// WM=[5,5]
// Fan=[2,2]

// Output:
// AC=27.03
// TV=18.91
// Fridge=37.84
// WM=9.46
// Fan=6.76
// Least=Fan



// ===========================

// Solution

// ===========================














// ----------------------------------

// Q21) Count Vowels and Consonants

// Input:
// programming

// Output:
// Vowels=3
// Consonants=8


// ===========================

// Solution

// ===========================














// ----------------------------------

// Q22) Strong Number

// A number is strong if:
// sum of factorial of digits
// equals original number

// Input:
// 145

// Output:
// Strong Number


// ===========================

// Solution

// ===========================













// ----------------------------------

// Q23) Prime Number

// Input:
// 17

// Output:
// Prime


// ===========================

// Solution

// ===========================










// ----------------------------------

// Q24) Fibonacci Series

// Input:
// 7

// Output:
// 0 1 1 2 3 5 8



// ===========================

// Solution

// ===========================









// ----------------------------------

// Q25) Matrix Diagonal Sum

// Input:
// 1 2 3
// 4 5 6
// 7 8 9

// Output:
// 15


// ===========================

// Solution

// ===========================



















// ===========================
// MOST IMPORTANT TOPICS
// ===========================

// Strings:
// length()
// charAt()
// substring()
// split()
// replace()
// contains()
// equals()
// equalsIgnoreCase()
// toCharArray()
// StringBuilder

// Arrays:
// sort()
// copyOf()
// binarySearch()
// toString()

// Logic:
// Palindrome
// Armstrong
// Strong Number
// Prime
// Pattern
// Frequency Count
// Sliding Logic
// ASCII
// Case Conversion
// Transitions
// 2 Pointer
// Nested Loop
// Array Rotation
// StringBuilder

// ===========================
// END OF MOCK TEST
// ===========================




sc.close();


}
}