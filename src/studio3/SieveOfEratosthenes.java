import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("which number should we go up to?");
        int n = scan.nextInt();
        boolean[] primes = new boolean[n];
        for (int i = 1; i < n; i++) {
            if (i==1){
                    primes[i]=true;
            } else{
                for (int k = 2; k < i+1; k++) {
                    if ((i+1)%k==0){
                        primes[i]=false;
                        break;
                    } else {
                        primes[i]=true;
                    }
                }
            }
            if (primes[i]== true){
                System.out.println(i+1);
            }
           
        }
     
    }
}





