package TaskFifth_MVC_OOP.calculator;

import java.text.DecimalFormat;
import java.math.*;

public class Model implements ModelInterface {

    @Override
    public String simpleCalc(double a, double b,char operation){
        double result = 0;
        switch (operation) {
            case '+':
                result = (a + b) ;
                break;
            case '*':
                result = (a * b);
                break;
            case '-':
                result = (a - b);
                break;
            case '/':
                result = (a / b);
                break;
        }
        return String.valueOf(result);
    }

    public String complex_operations(Double[] num1,Double[] num2,char oper) {
        String result = null;
    switch (oper){
            case '+':
                if ((num1[1] + num2[1]) >= 0 ){
                    result = String.valueOf(num1[0] + num2[0]) + "+" + String.valueOf((num1[1] + num2[1])) + "i";
                    break;
                }
                else{
                    result = String.valueOf((num1[0] + num2[0])) + String.valueOf((num1[1] + num2[1])) + "i";
                    break;
                }
            case '-':
                if ((num1[1] + num2[1]) >= 0) {
                    result = String.valueOf((num1[0] - num2[0])) + "+" + String.valueOf((num1[1] - num2[1])) + "i";
                    break;
                }
                else {
                    result = String.valueOf((num1[0] - num2[0])) + String.valueOf((num1[1] - num2[1])) + "i";
                    break;
                }
            case '*':
                if ((num1[0] * num2[1] + num1[1] * num2[0]) >= 0) {
                    result = String.valueOf((num1[0] * num2[0] - num1[1] * num2[1])) + "+" + String.valueOf((num1[0] * num2[1] + num1[1] * num2[0])) + "i";
                    break;
                }
                else {
                    result = String.valueOf((num1[0] * num2[0] - num1[1] * num2[1])) + String.valueOf((num1[0] * num2[1] + num1[1] * num2[0])) + "i";
                    break;
                }
            case '/':
                if (((num1[1] * num2[0] - num1[0] * num2[1]) / (Math.pow(num2[0],2.0)  +Math.pow(num2[1],2.0) )) >= 0){
                result = String.valueOf(((num1[0] * num2[0] + num1[1] * num2[1])) / (Math.pow(num2[0],2.0)  +Math.pow(num2[1],2.0)))
                + "+" + String.valueOf((
                        (num1[1] * num2[0] - num1[0] * num2[1]) / (Math.pow(num2[0],2.0)  +Math.pow(num2[1],2.0))))+"i";
                }
                else {
                    result = String.valueOf(((num1[0] * num2[0] + num1[1] * num2[1]) / (Math.pow(num2[0],2.0)  +Math.pow(num2[1],2.0) ))
                    + String.valueOf((
                            (num1[1] * num2[0] - num1[0] * num2[1]) / (Math.pow(num2[0],2.0)  +Math.pow(num2[1],2.0) ))))+"i";
                }

        }
    return result;
    }
}
