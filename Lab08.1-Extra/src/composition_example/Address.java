package composition_example;

public class Address {
    private String city;
    private String country;

    public String getAddressInfo(){
        return city + country;
    }
}
