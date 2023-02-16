package TaskFirst_WendingMachine.Classes;

public class Edible extends Product {
    public Edible(String name, Double price) {
        super(name, price);
    }

    private Boolean isJunkFood =false ;

    private Integer shelfLife;
    private Integer shelfLifeExpectancy;

    public Boolean getJunkFood() {
        return isJunkFood;
    }

    public Integer getShelfLife() {
        return shelfLife;
    }

    public Integer getShelfLifeExpectancy() {
        return shelfLifeExpectancy;
    }

    public Edible(Integer token, String name, Double price, Integer shelfLife, Integer shelfLifeExpectancy) {
        super(token, name, price);
        this.shelfLife = shelfLife;
        this.shelfLifeExpectancy = shelfLifeExpectancy;
    }

    public Edible(Integer token, String name, Double price, Boolean isJunkFood) {
        super(token, name, price);
        this.isJunkFood = isJunkFood;
    }

    public Edible(String name, Double price, Integer shelfLife, Integer shelfLifeExpectancy) {
        super(name, price);
        this.shelfLife = shelfLife;
        this.shelfLifeExpectancy = shelfLifeExpectancy;
    }

    public Edible(String name, Double price, Boolean isJunkFood) {
        super(name, price);
        this.isJunkFood = isJunkFood;
    }

    @Override
    public String toString(){
        if (isJunkFood){
            return String.format("%s is Junk Food " , super.toString());
        }
        return String.format("%s Days before expire = %d  " , super.toString(),shelfLifeExpectancy - shelfLife);
    }

}
