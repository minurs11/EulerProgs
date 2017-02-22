package net.projecteuler;

import java.util.Scanner;

public class MultiplesOf3and5 {

	public static void main(String[] args) {
		int input, sum = 0;
		Scanner sc =new Scanner(System.in);
		try{
			System.out.println("Please enter a number between 1 - 1000: ");
		
		input = sc.nextInt();
		if(input>0 && input<=1000){
			System.out.println("Number that is divisible by 3 or 5 are: ");
			for(int i=1; i<input; i++){
				if((i % 3 == 0) || (i % 5 == 0)){
				System.out.println(i);
				sum = sum + i;
			}
			}
			System.out.println("Sum of multiples of 3 or 5 in "+input+" is: "+sum);
		}else{
			System.out.println("Error!! Number must be between 1 - 1000");
		}
	}finally{
		sc.close();
		
	}

}}
