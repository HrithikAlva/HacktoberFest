import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;
public class rsa {
	static int prime(int p){
   	 for(int i=2;i<=p/2;i++){
   		 if(p%i==0)
   			 return false;
   	 }
   	 return true;
    }
    static boolean gcd(int a,int b){
   	int x=(a<b)?e:p;
   	 for(int i=2;i<=x;i++){
   		 if(((a%i)==0)&&((b%i)==0)){
   			 return i;
   		 }
	 }
    return true;
   }
public static void main(String[] args) {
	Random r=new Random();
	    int p,q,n,phi,e,d=0;
		do{
			p=rand.nextInt(100)+2;
		}
		while(prime(p))==true){
			Sytem.out.println("P="+p);
		do{
			q=rand.nextInt(100)+2;
		}
		while(prime(q))==true)&&(p!=q));
		Sytem.out.println("Q="q);
		n=p*q;
		System.out.println("n:"+n);
		phi=(p-1)*(q-1);
		System.out.println("Phi="phi);
		for(e=2;e<phi;e++){
			if(gcd(e,phi)==true){
				break;
			}
		}
			System.out.println("PUBLIC KEY:"+e);
		for(d=1;d<phi;d++){
			if(((e*d)%phi)==1){
				break;
			}
		}
		System.out.println("PUBLIC KEY:"+d);
		int ip;
		do{
			ip=rand.nextInt(100);
		}
		while(ip==0 && ip<n);
	System.out.println("INPUT VALUE IS "+ip);
	lon ct=(long)(Math.pow(ip,e))%n);
	System.out.println("CIPHER TEXT IS "+ct);
	BigInteger c=BigInteger.valueOf(ct);
	BigInteger N=BigInteger.valueOf(n);
	BigInteger plain=c.pow(d).mod(N);
	System.out.println("PLAIN TEXT IS "+plain);
		}
}
