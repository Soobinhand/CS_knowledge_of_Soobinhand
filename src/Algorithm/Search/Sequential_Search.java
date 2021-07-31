package Algorithm.Search;

import java.util.ArrayList;

public class Sequential_Search {
    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<>();

        for(int i=0;i<100;i++){
            testData.add((int)(Math.random()*100));
        }
        Sequential_Search sequential_search = new Sequential_Search();
        System.out.println(sequential_search.searchFunc(testData,19));
    }

    public int searchFunc(ArrayList<Integer> dataList, Integer searchItem){
        for(int i=0;i<dataList.size();i++){
            if(dataList.get(i).equals(searchItem)){
                return i;
            }
        }
        return -1;
    }
}
