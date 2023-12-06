package model;
import static model.constants.Discount.DISCOUNTS_ALL;
public abstract class Food implements Discountable{
    protected Integer amount;
    protected Double price;
    protected Boolean isVegetarian;

    protected Food(Integer amount, Double price, Boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }
    @Override
    public Double getDiscount() {
        return DISCOUNTS_ALL;
    }
    public Integer getAmount() {
        return amount;
    }

    public Double getPrice() {
        return price;
    }

    public Boolean getVegetarian() {
        return isVegetarian;
    }

}
