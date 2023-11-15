/*
A core i7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and
1 piece mouse, what will be my total cost after giving 15% discount? [Extract the digits from the
paragraph and calculate the price]
*/

public class PriceExtractor {
    public static void main(String[] args) {
        String paragraph = "A core i7 laptop price is 85000 tk and a gaming mouse price is 2500 tk";
        String[] words = paragraph.split("\\s+");
        int laptopPrice = 0;
        int mousePrice = 0;
        for (String word : words) {
            if (word.matches("\\d+")) {
                int number = Integer.parseInt(word);
                if (laptopPrice == 0) {
                    laptopPrice = number;
                } else if (mousePrice == 0){
                    mousePrice = number;
                }
            }
        }
        double totalCost = laptopPrice + mousePrice;
        double discount = (15.0 / 100.0);
        totalCost =  totalCost - (totalCost * discount);
        System.out.println("My total cost after giving 15% discount is " + totalCost + " tk");
    }
}