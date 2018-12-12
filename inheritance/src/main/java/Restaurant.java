import java.util.*;

public class Restaurant implements ReviewInterface {

    protected String name;
    protected int stars;
    protected String pricing;
    protected LinkedList<Review> restaurantReviewList;

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
        return restaurantReviewList;
    }

    public Restaurant(String name, String pricing) {
        this.name = name;
        this.stars = 0;
        this.pricing = pricing;
        this.restaurantReviewList = new LinkedList<>();
    }

    @Override
    public String toString() {
        String reviewOutput = "";
        for (Review review : restaurantReviewList) {
            reviewOutput += review.toString() + "\n";
        }
        return "Name: " + name + " Stars: " + stars + "Pricing: " + pricing + "\n Reviews: \n" + reviewOutput;
    }

    public void addReview(Review review) {
        this.restaurantReviewList.add(review);
        review.restaurant = this;
        stars = avgStars();
    }

    protected int avgStars() {
        int totalStars = 0;
        for (Review review : restaurantReviewList) {
            totalStars += review.getStars();
        }
        return totalStars / restaurantReviewList.size();
    }

}
