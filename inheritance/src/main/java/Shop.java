import java.util.*;

public class Shop implements ReviewInterface {
    protected String name;
    protected String description;
    protected String pricing;
    protected int stars;
    protected LinkedList<Review> shopReviewList;

    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getPricing() { return pricing; }
    public int getStars() { return stars; }
    public LinkedList<Review> getShopReviewList() { return shopReviewList; }

    public Shop(String name, String description, String pricing) {
        this.name = name;
        this.description = description;
        this.stars = 0;
        this.pricing = pricing;
        this.shopReviewList = new LinkedList<>();
    }

    @Override
    public String toString() {
        String reviewOutput = "";
        for (Review review : shopReviewList) {
            reviewOutput += review.toString() + "\n";
        }
        return "Name: " + name + " Description: " + description + " Stars: " + stars + " Pricing: " + pricing + "\n Reviews: \n" + reviewOutput;
    }

    public void addReview(Review review) {
        this.shopReviewList.add(review);
        review.shop = this;
        stars = avgStars();
    }

    protected int avgStars() {
        int totalStars = 0;
        for (Review review : shopReviewList) {
            totalStars += review.getStars();
        }
        return totalStars / shopReviewList.size();
    }

}
