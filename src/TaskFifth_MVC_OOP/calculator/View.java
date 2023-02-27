package TaskFifth_MVC_OOP.calculator;

import javax.lang.model.element.VariableElement;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface View {
    default double getSimpleNumber(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextDouble();
    }

    default char getOperator(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.next().charAt(0);
    }

    default Double[] getComplexNumber(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        String c = in.nextLine();

        Pattern p = Pattern.compile("-?\\d+");
        Matcher m = p.matcher(c);
        String real = "0";
        String imag = "0";
        if (m.find()) {
            real = m.group(0);
            if (m.find()) {
                imag = m.group(0);
            }
        }

        return new Double[]{Double.parseDouble(real), Double.parseDouble(imag)};

    }

    default void vievData(String data){
        System.out.println( "Результат " + data);
    }

    default void viewResult(Object a, Object b , Object c , Object d){
        System.out.println(""+ a + " " + c + " " + b + " = " + d);
    }

    default StringBuilder compDtoString(Double[] comp){
        StringBuilder result = new StringBuilder();
        for (Double part : comp){
            result.append(part+" ");
        }
        result.append("i");
        return result;
    }
    default String logResult(Object a, Object b , Object c , Object d){
        return (""+ a + " " + c + " " + b + " = " + d);
    }


}
