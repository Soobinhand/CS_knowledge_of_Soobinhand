package algo4;

import java.util.Arrays;

public class Selection_Sort {
    public static int[] selection_sort(int[] a){
        selection_sort(a,a.length);
        return a;
    }

    public static void selection_sort(int[] a, int size){
        for(int i=0;i<size-1;i++){
            int min = i;

            for(int j=i+1;j<size;j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }
            swap(a,min,i);
        }
    }
    public static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }



    public static void main(String[] args){
        int[] q = {3,4,1,5,2};//여기다가 선택 정렬하고 싶은거 써넣자.
        System.out.println(Arrays.toString(selection_sort(q)));
    }
}
