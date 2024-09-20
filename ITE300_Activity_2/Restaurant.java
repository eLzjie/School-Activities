package Activity;

/**
 *
 * @author Eliah
 */
public class Restaurant {
    private String name;
    private String address;
    private String cuisineType;
    private String phoneNumber;
    private String email;

    public Restaurant(String name, String address, String cuisineType, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.cuisineType = cuisineType;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
