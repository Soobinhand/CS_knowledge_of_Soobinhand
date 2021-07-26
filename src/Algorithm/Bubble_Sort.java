package Algorithm;


import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
       int[] arr = {4,9,2,1,5,4};
        int tmp = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j-1] > arr[j]){
                    tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
