package net.projecteuler;

public class productMakePalindrome {

	public static void main(String[] args) {
		int product, reverse = 0, rev, temp, countI = 100, countJ = 100;
		for(int i=100; i<999; i++){
			for(int j=100; j<999; j++){
				product = i*j;
				temp = product;
				rev = reverse(temp);
				
				if(product == rev){
					if((i>countI) && (j>countJ)){
						countI = i;
						countJ = j;
					System.out.println(product);
					}
				}
			  }
			}
			
		}
		

	
	public static int reverse(int x) {
	    int rev = 0;
	    while(x != 0){
	        rev = rev*10 + x%10;
	        x = x/10;
	    }
	 
	    return rev;
	}

}
