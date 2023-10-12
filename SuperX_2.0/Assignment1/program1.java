//Factorial of even numbers in a given number
//input: 256946
//output: 2,720,24,720
import java.util.*;
class FactorialDemo {

	void fun(int num){
	
		ArrayList<Integer> al = new ArrayList<>();
		while(num!=0){
		
			int fact = 1;

			int rem = num%10;

			if(rem%2==0){
			
				for(int i=1;i<=rem;i++){
				
					fact = fact*i;
				}
				al.add(fact);

			}
			num = num/10;
		}
		 
		for (int i = al.size() - 1; i >= 0; i--) {
  
			System.out.println(al.get(i));
		}
	}
	public static void main(String[]args){
	
		FactorialDemo obj = new FactorialDemo();
		int num = 256946;
		obj.fun(num);
	}
}
