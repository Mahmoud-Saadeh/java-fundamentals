package inheritance;

public class Review {
    private String author;
    private String body;
    private int stars;
    private  Restaurant restaurant;

    public Review(String author, String body, int stars,Restaurant restaurant) {
        if (stars >= 0 && stars <= 5){
            this.author = author;
            this.body = body;
            this.stars = stars;
            this.restaurant = restaurant;
        }
    }

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    public int getStars() {
        return stars;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public String plural(){
        if (stars == 1){
            return "";
        }else {
            return "s";
        }
    }

    @Override
    public String toString() {
        return author + ": \n" + " ===> " + body +" I rate this restaurant with " + stars + " star"+ plural();
    }
}
