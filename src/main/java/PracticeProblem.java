public class PracticeProblem {

	public static void main(String args[]) {

	}
	// recursion sucks to explain 

	public static int sumOfDigits(int x){
		x = Math.abs(x);

		//base case
		if(x < 10){
			return x;
		}
		
		//return the sum of the last digit, and the sumOfDigits of the 10th place onward
		//this means you sum up the digits backwards, cool.
		return(sumOfDigits(x/10) + x%10);
	}

	public static int factorial(int num){

		//base case
		if(num == 0){
			return 1;
		} else if (num < 0){
			return 0;
		}

		//return (n-1)! * n
		return factorial(num-1)*num;
	}


	

}
