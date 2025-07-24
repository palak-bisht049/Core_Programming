public class ProfitLoss {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;

        int profit = sellingPrice - costPrice;
        double profitPercent = (profit * 100.0) / costPrice;

        System.out.println(
            "Cost Price is INR " + costPrice + "\n" +
            "Selling Price is INR " + sellingPrice + "\n" +
            "Profit is INR " + profit + "\n" +
            "Profit Percentage is " + profitPercent + "%"
        );
    }
}





//OUTPUT->

// Cost Price is INR 129
// Selling Price is INR 191
// Profit is INR 62
// Profit Percentage is 48.06201550387597%