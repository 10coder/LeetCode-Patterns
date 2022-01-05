public class BestTimeBuySellStock {

    //while traversing
    //find the min value and max of difference between next elements
     public static int maxProfit(int[] prices) {
         int min=Integer.MAX_VALUE,maxPrice=0;
         for(int i=0;i<prices.length;i++) {
             min=Math.min(min,prices[i]);
             maxPrice=Math.max(maxPrice,prices[i]-min);
         }
         return maxPrice;
     }
// }

//There is one more approach

// As we need to find max difference

// let say our given array is
// a0, a1, a2, a3, a4, a5, a6

// we take a differences array
// 0    1      2      3      4      5      6
// 0, a1-a0, a2-a1, a3-a2, a4-a3, a5-a4, a6-a5

// if we find max sub array in the differences array we are going to find the max difference
// suppose a5 is highest value and a2 is the least value

// then max value = a5 - a2
// this is obtained on sub array sum from index 3 to index 5
//     (a5 - a4) + (a4 - a3) + (a3 - a2)

//     Hence finding max sub array from the differences array gives max profit to buy and sell stock

// max sub array could be found through Kadane's Algorithm

    public static int maxProfitWithDifferences(int[] prices) {
        int i=1, sum=0, max=0;
        while(i<prices.length) {
            sum+=prices[i]-prices[i-1];
            max=Math.max(sum,max);
            if(sum<0) {
                sum=0;
            }
            i++;
        }
        return max;
    }

    public static void main(String[] args) {
         int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println("Expected 5 : Output withNormal Approach:" + maxProfit(prices) + " Output with differences approach: "+ maxProfitWithDifferences(prices));
    }

}


