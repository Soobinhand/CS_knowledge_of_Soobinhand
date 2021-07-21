package DataStructure;

import java.util.Arrays;

public class Insertion_Sort {
    public static int[] insertion_sort(int[] a){
        insertion_sort(a,a.length);
        return a;
    }

    private static void insertion_sort(int[] a,int size){
        for(int i=1;i<size;i++){
            int target = a[i];
            int j = i-1;//target 이전 원소임
            while(j>=0&&target<a[j]){//target 이전 원소까지
                a[j+1] = a[j];//이전 원소를 한 칸씩 뒤로 옮김.
                j--;
            }

            a[j+1] = target;
        }
    }
    public static void main(String[] args){
        int[] q = {6,7,5,3,0};
        System.out.println(Arrays.toString(insertion_sort(q)));
    }
}
