package Utilities;

// In the full product, there would be a lot of purposes for which I would use a class that represents a person. Also, this would be very useful to
// populate from a separate data source for testing of different data.
public class TestUser {

    String country;
    String firstName;
    String lastName;
    String streetAddress;
    String city;
    String state;
    String zipCode;
    String phone;
    String email;
    String creditCardNumber;
    int creditCardExpirationMonth;
    int creditCardExpirationYear;
    String creditCardCvc;

    // In a full program, these values would most likely come from an external source such as
    // a database or file that would sometimes create many test users.
    // Here, I will hard code them for the purposes of the assignment.
    public TestUser()
    {
        country = "US";
        firstName = "josh";
        lastName = "mcdonald";
        streetAddress = "123 place";
        city = "kirkland";
        state = "WA";
        zipCode = "98033";
        phone = "3213214321";
        email = "something@somewhere.com";
        creditCardNumber = "4111111111111111";
        creditCardExpirationMonth = 3;
        creditCardExpirationYear = 2019;
        creditCardCvc = "123";
    }

    public String getCountry() {
        return country;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public int getCreditCardExpirationMonth() {
        return creditCardExpirationMonth;
    }

    public int getCreditCardExpirationYear() {
        return creditCardExpirationYear;
    }

    public String getCreditCardCvc() {
        return creditCardCvc;
    }

}
