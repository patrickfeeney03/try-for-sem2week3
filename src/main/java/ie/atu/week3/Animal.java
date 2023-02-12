package ie.atu.week3;

import java.text.NumberFormat;

public class Animal {
    private String type;
    private String breed;
    private Integer age;
    protected static int count = 0;

    public Animal() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /* No price for animals I guess
    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

     */

    @Override
    public String toString() {
        return type;
    }

    public static int getCount() {
        return count;
    }
}
