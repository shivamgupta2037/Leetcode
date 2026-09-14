class Solution {
    public int maxProfit(int[] prices) {
        int maxProf = 0;
        int i=0;
        int j = 1;

        while(j<prices.length){   //why j ? because it is a last element that about to come at last
            if(prices[j] > prices[i]){
                int profit = prices[j] - prices[i];
                maxProf = Math.max(maxProf,profit);
            }else{
                i=j;
            }
            j++;
            
        }
        return maxProf;
    }
}