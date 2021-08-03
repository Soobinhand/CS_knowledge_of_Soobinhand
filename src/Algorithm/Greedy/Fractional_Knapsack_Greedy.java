package Algorithm.Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Fractional_Knapsack_Greedy {
    public void knapsack(Integer[][] object, double capacity){
        double totalValue = 0.0;
        double fraction = 0.0;

        Arrays.sort(object, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return (o2[1]/o2[0]) - (o1[1]/o1[0]);
            }
        });
        for(int i=0;i<object.length;i++){
            if((capacity - (double)object[i][0])>0){
                capacity -= (double)object[i][0];
                totalValue += (double)object[i][1];
                System.out.println("무게"+object[i][0]+"가치"+object[i][1]);
            }else {
                fraction = capacity / (double)object[i][0];
                totalValue += (double)object[i][1] * fraction;
                System.out.println("무게"+object[i][0]+"가치"+object[i][1]+"비율"+fraction);
                break;
            }
        }
        System.out.println("총 담을 수 있는 가치"+totalValue);
    }

    public static void main(String[] args) {
        Fractional_Knapsack_Greedy fractional_knapsack_greedy = new Fractional_Knapsack_Greedy();
        Integer[][] object = {
                {10,10},
                {15,12},
                {20,10},
                {25,8},
                {30,5}
        };
        fractional_knapsack_greedy.knapsack(object,30.0);

    }
}
