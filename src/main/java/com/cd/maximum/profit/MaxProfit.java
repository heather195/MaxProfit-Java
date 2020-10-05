package com.cd.maximum.profit;

public class MaxProfit {

    public Integer find(Integer[] input){
        int buyPrice, sellPrice, tempProfit;
        int maxProfit = -1;
        int buyIndex = 0;

        for(int i = 0; i < input.length-1; i++){
            buyPrice = input[buyIndex];
            sellPrice = input[i+1];
            if(buyPrice > sellPrice){
                buyIndex = i+1;
            } else {
                tempProfit = sellPrice - buyPrice;
                if(tempProfit > maxProfit){
                    maxProfit = tempProfit;
                }
            }
        }
        return maxProfit;
    }
}
