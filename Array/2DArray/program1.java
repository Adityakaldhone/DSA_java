class TWODArray {

	public static void main(String[]args){
		int row = 3;
		int col = 3;
		int arr[][] = new int[][]{{1,2,3},{4,5},{6,7,8,9}};

		for(int i=0;i<row;i++){
		
			for(int j=0;j<col;j++){
			
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
