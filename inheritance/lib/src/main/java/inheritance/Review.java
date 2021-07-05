package inheritance;

public class Review {
    private String author;
    private String body;
    private int stars;
    private  Restaurant restaurant;
    private  Shop shop;
    private  Theater theater;
    private String movie;

    public Review(String author, String body, int stars,Restaurant restaurant) {
        if (stars >= 0 && stars <= 5){
            this.author = author;
            this.body = body;
            this.stars = stars;
            this.restaurant = restaurant;
        }
    }
    public Review(String name, String description, int stars,Shop shop) {
        if (stars >= 0 && stars <= 5){
            this.author = name;
            this.body = description;
            this.stars = stars;
            this.shop = shop;
        }
    }
    public Review(String name,String movie, String description, int stars,Theater theater) {
        if (stars >= 0 && stars <= 5){
            this.author = name;
            this.body = description;
            this.stars = stars;
            this.theater = theater;
            this.movie = movie;
        }
    }
    public Review(String name, String description, int stars,Theater theater) {
        if (stars >= 0 && stars <= 5){
            this.author = name;
            this.body = description;
            this.stars = stars;
            this.theater = theater;
        }
    }
    public String getMovie() {
        return movie;
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

    public Shop getShop() {
        return shop;
    }

    public Theater getTheater() {
        return theater;
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
        return author + ": \n" + " ===> " + body +" I rate it " + stars + " star"+ plural();
    }
}
