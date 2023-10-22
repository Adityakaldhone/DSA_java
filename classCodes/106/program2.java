/*
 *Optimized approach:
 given an character aray return the count of pair(i.j) such that
 a)i<j
 b)a[i] = 'a';
   a[j] = 'g'

   a[a,b,e,g,a,g]
 */
class CountPair {

	static int fun(char[] arr){
	
		int count = 0;
		int pair = 0;

		for(int i=0;i<arr.length;i++){
		
			if(arr[i]=='a'){
			
				count++;
			}
			else if(arr[i]=='g'){
			
				pair = pair+count;
			}
		}
		return pair;
	}
	public static void main(String[]args){
	
		char arr[] = new char[]{'a','b','e','g','a','g'};

		System.out.println(fun(arr));
	}
}
