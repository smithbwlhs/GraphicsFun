class Bill
{
    private double costOfMeal;
    private int totalCustomers;

    // Constructor
    public Bill(double totalBill, int numCustomers)
    {
        costOfMeal = totalBill;
        totalCustomers = numCustomers;
    }

    // Add a tip based on the number of guests
    //if the total number of customers is over 8, 25% extra
    //if the total number of customers is over 4 but less than 8, 20% extra
    //less than 4, nothing happens
    public void addTip()
    {

    }


    public String toString()
    {
        // Round the bill to two decimal places
        double roundedBill = Math.round(costOfMeal * 100.0) / 100.0;

        return "Bill for " + totalCustomers + " comes to $" + roundedBill;
    }


}
