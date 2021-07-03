package algo4.practice1_1;

public class _22 {
    public static int rank(int key, int[] a){
        return rank(key,a,0,a.length-1);
    }

    public static int rank(int key, int[] a, int lo, int hi){
        System.out.println("lo: "+lo+" "+"hi: "+hi); // 이걸 써서 호출될 때마다 lo 와 hi 의 값을 알 수 있다.
        if(lo > hi) return -1;
        int mid = lo + (hi-lo)/2;
        if(key < a[mid]) return rank(key,a,lo,mid-1);
        else if (key >a[mid]) return rank(key,a,mid+1,hi);
        else return mid;

    }
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(rank(2,a));
    }
}

//이진탐색 재귀 알고리즘임.
//key 숫자가 어딨는지 알 수 있는 알고리즘.
