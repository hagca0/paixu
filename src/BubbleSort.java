import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr=new int[]{2,3,2,5,8,10,7,9,7};
		//冒泡排序
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]){
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
