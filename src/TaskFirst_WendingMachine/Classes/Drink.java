package TaskFirst_WendingMachine.Classes;

public class Drink extends Product {
    public Drink(String name, Double price) {
        super(name, price);
    }

    private Double parameter = 0.0;

    public Drink(Integer token, String name, Double price,String parameterName ,Double parameter ) {
        super(token, name, price);
        this.parameter = parameter;
        this.parameterName = parameterName;
    }

    private String parameterName;

    public Drink(String name, Double price, String parameterName, Double parameter) {
        super(name, price);
        this.parameterName = parameterName;
        this.parameter = parameter;
    }

    public Double getParameter() {
        return parameter;
    }

    public String getParameterName() {
        return parameterName;
    }

    @Override
    public String toString(){
        return String.format("%s %s = %2.1f  " , super.toString(),parameterName ,  parameter);
    }


}

