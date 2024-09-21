public class salesTax {
    public static void main(String[] args){

        double itemPrice = 5.00;
        double salesTax = 1.05;
        double totalPrice = 0.00;

        totalPrice = salesTax * itemPrice;
        salesTax = totalPrice - itemPrice;
        System.out.println ("The sales tax is " + salesTax);
        System.out.println ("The total price is " + totalPrice);
    }
}
