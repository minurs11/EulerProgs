package net.projecteuler;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		long n = 600851475143L;
		int i = 2, count = 0;
		System.out.println("All the Prime Numbers of "+n+" are: ");
		while(n>1){
			if(n % i == 0){
				n = n/i;
				count = i;
				System.out.println(i);
			}else i++;
		}
		System.out.println("Largest prime number is: "+count);

	}

}
