package Algorithm.Search;


import java.util.ArrayList;
import java.util.Collections;

public class Binary_Search {
    public boolean searchFunc(ArrayList<Integer> dataList, Integer searchItem){
        if(dataList.size() == 1 && searchItem== dataList.get(0)){
            return true;
        }
        if(dataList.size()==1&&searchItem!=dataList.get(0)){
            return false;
        }
        if(dataList.size()==0){
            return false;
        }

        int mid = dataList.size()/2;

        if(searchItem == dataList.get(mid)){
            return true;
        }else {
            if(searchItem < dataList.get(mid)){
                return this.searchFunc(new ArrayList<>(dataList.subList(0,mid)),searchItem);
            }else{
                return this.searchFunc(new ArrayList<>(dataList.subList(mid,dataList.size())),searchItem);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Binary_Search binary_search = new Binary_Search();
        for(int i=0;i<100;i++){
            list.add((int)(Math.random()*100));
        }
        Collections.sort(list);
        System.out.println(binary_search.searchFunc(list,19));
    }
}
