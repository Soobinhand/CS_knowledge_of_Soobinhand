package Algorithm.Sort;

import java.util.ArrayList;
import java.util.Collections;

public class Insertion_Sort {
    public ArrayList<Integer> list(ArrayList<Integer> dataList){
        for(int i=0;i<dataList.size()-1;i++){
            for(int j=i+1;j>0;j--){
                if(dataList.get(j) < dataList.get(j-1)){
                    Collections.swap(dataList,j,j-1);
                }else{
                    break;
                }
            }
        }
        return dataList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> tlist = new ArrayList<>();
        for(int i=0;i<100;i++){
            tlist.add((int)(Math.random()*100));
        }
        Insertion_Sort sort = new Insertion_Sort();
        sort.list(tlist);
        System.out.println(sort.list(tlist));
    }
}
