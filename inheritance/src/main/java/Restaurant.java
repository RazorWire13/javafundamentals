import java.util.*;

public class Restaurant {

    private String name;
    private int stars;
    private String pricing;
    private LinkedList<Review> reviewList;

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }

    public String getPricing() {
        return pricing;
    }

    public LinkedList<Review> getReviews() {
        return reviewList;
    }

    public Restaurant(String name, String price) {
        this.name = name;
        this.stars = 0;
        this.pricing = pricing;
        this.reviewList = new LinkedList<>();
    }

    @Override
    public String toString() {
        String reviewOutput = "";
        for (Review review : reviewList) {
            reviewOutput += review.toString() + "\n";
        }
        return "Name: " + name + " Stars: " + stars + "Pricing: " + pricing + "\n Reviews: \n" + reviewOutput;
    }

    public void addReview(Review review) {
        this.reviewList.add(review);
        stars = avgStars();
    }

    protected int avgStars() {
        int totalStars = 0;
        for (Review review : reviewList) {
            totalStars += review.getStars();
        }
        return totalStars / reviewList.size();
    }

}
