// print the reverse of a number by recursion without defined a helper function
// import java.util.*;
// public class Recursive {
//     public static int reversenumber(int num, int rev) {
//         if (num == 0) {
//             return rev;
//         }
//         rev = rev * 10 + num % 10;
//         return reversenumber(num / 10, rev);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         int reversed = reversenumber(num, 0);
//         System.out.println("Reversed number: " + reversed);
//     }
// }

// sum of digit
// public class Recursive{
//     static int sumofdigits(int n)
//     {
//         if(n==0)
//             return 0;
//         return n%10 + sumofdigits(n/10);
//     }
//     public static void main(String[] args){
//         int n=12345;
//         System.out.println(sumofdigits(n));
//     }
// }

// count of numbers
// public class Recursive{
//     static int countdigit(int n)
//     {
//         if(n==0)
//             return 0;
//         return 1 + countdigit(n/10);
//     }
//     public static void main(String[] args){
//         int n=12345;
//         System.out.println(countdigit(n));
//     }
// }
 
//gcd = greatest common devices

// public class Recursion{
//     static int gcd(int a,int b)
//     {
//         if(b ==0) return a;
//         return gcd(b,a%b);
//     }
// public static void main(String[] args){
//     int a=12 , b=18;
//     System.out.println(gcd(a,b));
// }
// }

// count zero


// import java.util.Scanner;

// public class recursion {
//     static int count0(int a){
//         if(a==0) return 0;
//         int count = (a%10 == 0)? 1 :0 ;
//         return count + count0(a/10);
//     }
//     public static void main(String[] args) {
//         int a = 1020304050;
//         System.out.println(count0(a));
//     }
// }

public class recursion{
    static int sumofdigitsarray(int[] arr, int i)
    {
      if(i == arr.length) return 0;
      return arr[i] +sumofdigitsarray(arr, i+1);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int i = 0;
     System.out.println(sumofdigitsarray(arr, i));
    }
}
