package Algorithm.Greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class Coin_Greedy {
    public void coin(Integer price, ArrayList<Integer> coinList){
        Integer total = 0;
        Integer coinNum = 0;
        ArrayList<Integer> details = new ArrayList<>();

        for(int i=0;i<coinList.size();i++){
            coinNum = price / coinList.get(i);
            total += coinNum;
            price -= coinNum * coinList.get(i);
            details.add(coinNum);
            System.out.println(coinList.get(i)+"원"+coinNum+"개");
        }
        System.out.println("총 동전 개수"+total);
    }

    public static void main(String[] args) {
        Coin_Greedy coin_greedy = new Coin_Greedy();
        ArrayList<Integer> coinList = new ArrayList<>(Arrays.asList(500,100,50,1));
        coin_greedy.coin(4720,coinList);
    }
}
