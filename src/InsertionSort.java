import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr=new int[]{5,3,2,5,8,10,7,9,7};
		//插入排序
		for (int i = 1; i < arr.length; i++) {
			int index=i-1;
			while( index>=0 && arr[index]>arr[i]){
				arr[index+1]=arr[index];
				index--;
			}
			arr[index+1]=arr[i];
		}
		System.out.println(Arrays.toString(arr));
	}
}
