import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {

    @Test
    void testAddReview() {
        Restaurant restaurant = new Restaurant("Skyline Chili", "$");
        assertEquals( "should equal 1 restaurant added", 1, Restaurant(restaurant));
    }

    @Test
    void testAvgStars() {
    }
}