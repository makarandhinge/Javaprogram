/*public class Buy_Sell {

    public static void main(String[] args) {

        int[] prices = { 7, 1, 5, 3, 6, 4 };

        int buyprice = prices[0];
        int i = 0;
        int buyindexno = 0;

        while (i < prices.length) {
            if (prices[i] < buyprice) {
                buyprice = prices[i];
                buyindexno = i;

            }
            i++;
        }
        int j = buyindexno + 1;
        int sellprice = buyprice;
        int sellindexno = 0;
        if (buyindexno < prices.length - 1) {
            while (j < prices.length) {
                if (prices[j] > sellprice) {
                    sellprice = prices[j];
                    sellindexno = j;

                }
                j++;
            }
        } else {
            System.out.println(0);
        }
        System.out.println(sellprice - buyprice);

    }
}
*/
public class MaxProfit {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // Update the minimum price if a lower price is encountered
            minPrice = Math.min(minPrice, prices[i]);

            // Update the maximum profit if a better selling opportunity is found
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices1 = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices1)); // Output: 5

        int[] prices2 = { 7, 6, 4, 3, 1 };
        System.out.println(maxProfit(prices2)); // Output: 0
    }
}
