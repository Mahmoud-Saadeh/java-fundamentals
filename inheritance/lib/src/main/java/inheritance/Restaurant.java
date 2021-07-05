package inheritance;

import java.util.ArrayList;
//import java.util.Random;

public class Restaurant implements AddReview,DollarSigns {
    private String name;
    private int price;
    private float stars;
    private ArrayList<Review> reviews;

    public Restaurant(String name, int price) {
        this.price = price;
        this.name = name;
        stars = 0;
        reviews = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public float getStars() {
        return stars;
    }


    public ArrayList<Review> getReviews() {
        return reviews;
    }

    @Override
    public void addReview(Review review) {
        reviews.add(review);

        int sum = 0;
        for (Review rev:reviews) {
            sum = rev.getStars() + sum;
        }
        stars = (float) sum/reviews.size();
    }
    @Override
    public String numberOfDollarSigns() {
        if (price <= 0 ){
            return "0$";
        }
        return "$".repeat(price);
    }

    @Override
    public String toString() {
        return "Restaurant " + name + ", has prices of " + price + "$, and " + stars + " stars rating";
    }
}
