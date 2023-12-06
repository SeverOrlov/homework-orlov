package model;
import java.util.Objects;
import static model.constants.Colour.RED_COLOR;
import static model.constants.Discount.DISCOUNTS_ALL;
import static model.constants.Discount.DISCOUNT_RED_APPLE;
public class Apple extends Food{
    private String colour;
    public Apple(Integer amount, Double price, String colour){
        super(amount,price,true);
        this.colour = colour;
    }
    @Override
    public Double getDiscount(){
        if (colour.equals(RED_COLOR)){
            return DISCOUNT_RED_APPLE;
        } else {return DISCOUNTS_ALL;}
    }

}
