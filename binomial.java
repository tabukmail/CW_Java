// JAVA program for the above approach
import java.util.*;
import java.math.BigInteger;


class Main
{
 
// static int binomialCoeff(int n, int r)
// {
 
//     if (r > n)
//     return 0;
//     long  m = 23; //998244353
//     long  inv[] = new long[r + 1];
//     inv[0] = 1;
//    // if(r + 1 >= 2)
//     inv[1] = 1;
 
//     // Getting the modular inversion
//     // for all the numbers
//     // from 2 to r with respect to m
//     // here m = 1000000007
//     for (int i = 2; i <= r; i++) {
//               inv[i] = m - (m / i) * inv[(int) (m % i)] % m;
          
//     }
      
//         System.out.println(Arrays.toString(inv));  


  
//     int ans = 1;
    
     
//     // for 1/(r!) part
//     for (int i = 2; i <= r; i++) {
      
//         ans = (int) (((ans % m) * (inv[i] % m)) % m);
      
      
       
//     }
     
//   //int box = 0;
//     // for (n)*(n-1)*(n-2)*...*(n-r+1) part
//     for (int i = n; i >= (n - r + 1); i--) {

//         System.out.println("----- " + (ans % m) + "  " + (i % m));
//         ans = (int) (((ans % m) * (i % m)) % m);

      

      
//        System.out.println("----- " + ans);
//      // box = box + ans;
      
//     }
     
//        return ans;
  
// }
 
// /* Driver code*/=====////////////////////
 public static void main(String[] args)
 {
  long startTime = System.nanoTime();
///////////////// ==================////////////////////
  
    int n = 20, r = 7;
    
    // System.out.print("Value of C(" +  n + ", " +  r+ ") is " + binomialCoeff(n, r) +"\n");

  //if (r > n)
    
    long  m = 23; //998244353
    long  inv[] = new long[r + 1];
    inv[0] = 1;
   // if(r + 1 >= 2)
    inv[1] = 1;

  for (int i = 2; i <= r; i++) {
    inv[i] = m - (m / i) * inv[(int) (m % i)] % m;

  }

  System.out.println(Arrays.toString(inv));  


  

  
   ///////////////// ==================////////////////////
    long endTime = System.nanoTime();
    long timeElapsed = endTime - startTime;
    System.out.println("Execution time in miliseconds: " + timeElapsed / 1000000);
    ///////////////// ==================////////////////////
}
}


