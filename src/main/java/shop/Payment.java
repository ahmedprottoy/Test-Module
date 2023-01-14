package shop;

public class Payment {
    public int TotalPrice;


    public Payment() {
        TotalPrice = 0;
    }

    public int MakePayment(int totalPrice){
        System.out.println("Total cost: " + totalPrice);
        System.out.println("Payment completed");
        return totalPrice;
    }
}
