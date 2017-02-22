package net.projecteuler;

public class EvenFibonacciSum {
		public static void main(String[] args) {
			int n1 = 0, n2 = 1, n3 = 0, sum = 0;
//			System.out.print(n1+" "+n2);
			System.out.print("Fibonacci nos that are even: ");
			for(int i = 2; i<5000; i++){
				n3 = n1 + n2;
				if(n3>4000000) break;
				if(n3 % 2 == 0){
					System.out.print(n3+" ");
					sum = sum + n3;
				}
				n1 = n2;
				n2 = n3;
			}
			System.out.println();
			System.out.println("Sum of all the even nos: "+sum);
		}
}
