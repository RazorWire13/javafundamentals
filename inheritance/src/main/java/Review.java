import java.util.*;

public class Review {

    protected String body;
    protected int stars;
    protected String author;
    protected Restaurant restaurant;
    protected Shop shop;
    protected Theater theater;
    protected String movie;

    public String getBody() {
        return body;
    }
    public int getStars() {
        return stars;
    }
    public String getAuthor() { return author; }
    public Restaurant getRestaurant() { return restaurant; }
    public Shop getShop() { return shop; }
    public Theater getTheater() { return theater; }
    public String getMovie() { return movie; }

    public Review(String body, int stars, String author) {
        this.body = body;
        this.stars = stars;
        this.author = author;
        this.restaurant = null;
        this.shop = null;
        this.theater = null;
        this.movie = null;
    }

    @Override
    public String toString() {
        return "Body: " + body + "Stars: " + stars + "Author: " + author;
    }


}
