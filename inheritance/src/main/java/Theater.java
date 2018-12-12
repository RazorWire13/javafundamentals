import java.util.*;

public class Theater implements ReviewInterface {

    protected String name;
    protected int stars;
    protected LinkedList<String> movieList;
    protected LinkedList<Review> theaterReviewList;

    public String getName() { return name; }
    public LinkedList<String> getMovieList() { return movieList; }

    public Theater(String name) {
        this.name = name;
        this.stars = 0;
        this.movieList = new LinkedList<>();
        this.theaterReviewList = new LinkedList<>();

    }

    @Override
    public String toString() {
        String reviewOutput = "";
        String movieOutput = "";
        for (String movie : movieList) {
            movieOutput += movie.toString() + " || ";
        }
        for (Review review : theaterReviewList) {
            reviewOutput += review.toString() + "\n";
        }
        return "Theater: " + name + "\n Movies: \n" + movieOutput + "\n Reviews: \n" + reviewOutput;
    }

    public void addMovie(String movie) {
        this.movieList.add(movie);
    }

    public void removeMovie(String movie) {
        this.movieList.remove(movie);
//        if (!movieList.contains(movie)) {
//            return false;
//        }
    }

    public void addReview(Review review) {
        this.theaterReviewList.add(review);
        review.theater = this;
        stars = avgStars();
    }

    protected int avgStars() {
        int totalStars = 0;
        for (Review review : theaterReviewList) {
            totalStars += review.getStars();
        }
        return totalStars / theaterReviewList.size();
    }

}
