package inheritance;

import java.util.ArrayList;

public class Theater implements AddReview{
    private ArrayList<String> Movies;
    private ArrayList<Review> reviews;
    private String name;

    public Theater( String name) {
        this.name = name;
        Movies = new ArrayList<>();
        reviews = new ArrayList<>();
    }

    public void setMovies(String movies) {
        Movies.add(movies);
    }

    /**
     * Removes a movie from the list of movies playing at theater.
     */
    public boolean removeMovie(String movie) {
        for (int i = 0; i<Movies.size();i++){
            if (Movies.get(i).equals(movie)){
                Movies.remove(i);
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        String allMovies = "";

//        for (String movie : Movies) {
//            allMovies = allMovies + movie;
//        }
        String commaseparatedlist = Movies.toString();

        commaseparatedlist = commaseparatedlist.replace("[", "")
                .replace("]", "");

        return name + " theater is playing "+ commaseparatedlist + " movies for now.";
    }

    @Override
    public void addReview(Review review) {
        reviews.add(review);
    }
}
