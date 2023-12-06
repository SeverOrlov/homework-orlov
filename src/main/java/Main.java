
import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;
import static model.constants.Colour.RED_COLOR;
import static model.constants.Colour.GREEN_COLOR;


        public class Main {
            public static void main(String[] args) {
                Food meat = new Meat(5, 100.0);
                Food redApples = new Apple(10, 50.0, RED_COLOR);
                Food greenApples = new Apple(8, 60.0, GREEN_COLOR);

                Food[] foods = {meat, redApples, greenApples};

                ShoppingCart shoppingCart = new ShoppingCart(foods);
                System.out.println("Сумма товаров без скидки: "+ shoppingCart.getTotalWithoutDiscount() + " руб.");
                System.out.println("Сумма товаров со скидкой: " + shoppingCart.getTotalWithDiscount() + " руб.");
                System.out.println("Сумма вегетарианских товаров без скидки: "+ shoppingCart.getTotalVegetariansWithoutDiscount() + " руб.");
            }


        }