package service;
import model.Food;
public class ShoppingCart {
    private Food[] foods;
    public ShoppingCart(Food[] foods){
      this.foods = foods;
    }
    public Double getTotalWithoutDiscount() {
        double totalPrice = 0;
        for (Food food : foods) {
            totalPrice += food.getPrice() * food.getAmount();
        }
        return totalPrice;
    }
    public Double getTotalWithDiscount() {
        double totalPrice = 0;
        for (Food food : foods) {
            totalPrice += (food.getPrice() - discountSum(food)) * food.getAmount();
        }
        return totalPrice;
    }
    public Double getTotalVegetariansWithoutDiscount() {
        double totalPrice = 0;
        for (Food food : foods) {
            if (food.getVegetarian()) {
                totalPrice += food.getPrice() * food.getAmount();
            }
        }
        return totalPrice;
    }
    private double discountSum(Food food) {
        return food.getPrice() * food.getDiscount() / 100;
    }
}
