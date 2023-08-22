 // Find nPr -->
 import java.util.*;
 public class main{
  public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int r = scn.nextInt();
        int nfact = 1;
        for(int i = 1; i <= n; i++){
            nfact = nfact*i;
        }
        int nmrfact = 1;
        for(int i = 1; i <= n-r; i++){
            nmrfact = nmrfact*i;
        }
        
        int npr = nfact/nmrfact;
        System.out.println(n+"p"+r+">"+npr);
    }
 }

 // using function 

 import java.util.*;
public class main {
    
    public static int fact(int x){
        int rv = 1;
        for(int i  =1; i<= x; i++){
            rv = rv*i;
    }
        return rv;
 }
    
  public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int r = scn.nextInt();
        int nfact = fact(n);
      
        int nmrfact = fact(n-r);
        
        int npr = nfact/nmrfact;
        System.out.println(n+"p"+r+">"+npr);
    }
}	