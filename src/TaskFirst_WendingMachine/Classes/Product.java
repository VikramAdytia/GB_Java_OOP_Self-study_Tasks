package TaskFirst_WendingMachine.Classes;

public class Product {

    public Integer getToken() {
        return token;
    }

    private Integer token;

    private String name;

    private Double price;

    public Product(Integer token, String name, Double price) {
        this.token = token;
        this.name = name;
        this.price = price;
    }

    public Product(String name, Double price) {

        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString(){

        return String.format("name = %s ; price = %2.2f ; " , name, price);
    }

}
