import java.util.*;
class Ebox  {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		String a[]=new String[N];
		String s;
		int i,j,k,c=0;
		int L[]=new int[K];
		for(i=0;i<N;i++)
		{
		    a[i]=sc.next();
		}
		for(i=0;i<N;i++) {
		for(j=0;j<K;j++) {
		 L[j]=sc.nextInt();
                              String ab[]=new String[L[j]];
                              for(k=0;k<L[j];k++) {
		    ab[k]=sc.next();
		    if(ab[k]==a[i]){
		        c++;
		    }
		}
		}
		    if(c==0)
		    System.out.print("No ");
		    else
		    System.out.print("Yes ");
}
		
	}
}