package Algorithm.Sort;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        int min, tmp;
        for(int i=0;i<arr.length;i++){
            min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
