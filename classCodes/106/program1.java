/*
 given an character aray return the count of pair(i.j) such that
 a)i<j
 b)a[i] = 'a';
   a[j] = 'g'

   a[a,b,e,g,a,g]
 */ 
class CountPair{

	static int pair(char arr[]){
		int count = 0;
	
		for(int i=0;i<arr.length;i++){
		
			if(arr[i]=='a'){
			
				for(int j=i+1;j<arr.length;j++){
				
					if(arr[j]=='g'){
					
						count++;
					}
				}
			}
		}
		return count;
	}
	public static  void main(String[]args) {
		
	   char arr[] = new char[]{'a','b','e','g','a','g'};

	   System.out.println(pair(arr));
	}
}
