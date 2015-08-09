package exercise;

public class QuickSort {
	// 쳲���������
	public static long fib2(long n) {
		long f0=0;
		long f1=1;
		long f2 = 1;
		
		if(n==0) {
			return f0;
		} 
		else if(n==1) {
			return f1;
		}
		else if(n==2) {
			return f2;
		}
		
		for(int i=3;i<=n;i++) {
			f0=f1;
			f1=f2;
			f2=f0+f1;
		}
			
		return f2;
	}
}
