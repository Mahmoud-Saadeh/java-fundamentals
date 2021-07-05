package inheritance;

import java.util.ArrayList;

public class Shop implements AddReview, DollarSigns {
    private String name;
    private String description;
    private int numberOfDollarSigns;
    private ArrayList<Review> reviews;

    public Shop(String name, String description, int numberOfDollarSigns) {
        this.name = name;
        this.description = description;
        this.numberOfDollarSigns = numberOfDollarSigns;
        reviews = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberOfDollarSigns() {
        return numberOfDollarSigns;
    }
    public ArrayList<Review> getReviews() {
        return reviews;
    }

    @Override
    public void addReview(Review review) {
        reviews.add(review);
    }

    @Override
    public String toString() {
        return "Shop " + name + ": "+ description + " with number of Dollar signs of " + numberOfDollarSigns();
    }

    @Override
    public String numberOfDollarSigns() {
        if (numberOfDollarSigns <= 0 ){
            return "0$";
        }
        return "$".repeat(numberOfDollarSigns);
    }
}
