import java.util.*;

class Solution {

        static int rotateArray(int arr[], int B) {

                for(int i=0; i<B; i++) {

                        for(int j=0; j<arr.length-1; j++) {

                                int temp = arr[j];
                                arr[j] = arr[j+1];
                                arr[j+1] = temp;
                        }
                }

                return arr;
        }
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter array size : ");
                int N = sc.nextInt();

                int arr[] = new int[N];

                System.out.println("Enter array elements : ");
                for(int i=0; i<arr.length; i++) {

                        arr[i] = sc.nextInt();
                }

                System.out.println("Enter how many elements rotating : ");
                int B = sc.nextInt();

                int[] rotateArr = rotateArray(arr,B);

                //System.out.print("[ ");
                for(int i=0; i<arr.length-1; i++) {
				
                        //System.out.print(rotateArr[i]+", ");
                }
               // System.out.println("]");
        }
}
