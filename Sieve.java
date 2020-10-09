import java.lang.Math;
import java.util.Scanner;


/**
 *
 * Author: Max Abramsky
 * NetId: maa180013
 * 
 */
public class Sieve {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum value: ");
        int n = sc.nextInt();
        SoE(n);
    }
    
    private static void SoE (int n) {
        int sq;
        int[] prArr = new int[n+1];
        for(int i=2; i<=n; i++)
            prArr[i] = i;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(i!=0){
                sq = i*i;
                while(sq <= n){
                    prArr[sq] = 0;
                    sq += i;
                }
            }
        }
        System.out.print("Primes up to " + n + ": ");
        for(int i=0; i<prArr.length; i++){
            if(prArr[i]!=0){
                System.out.print(prArr[i] + " ");
            }
        }
    }
}
