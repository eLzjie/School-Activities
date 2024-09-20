package Activity;

/**
 *
 * @author Eliah
 */
public class Product {
    private String name;
    private double price;
    private int rates; 
    private double totalRating; 
    private double averageRating; 

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.rates = 0;
        this.totalRating = 0.0;
        this.averageRating = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRates() {
        return rates;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void addRating(double rating) {
        if (rating < 0.0 || rating > 5.0) {
            System.out.println("Rating must be between 0.0 and 5.0");
            return;
        }
        totalRating += rating;
        rates++;
        averageRating = totalRating / rates;
    }
}
