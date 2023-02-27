package TaskFifth_MVC_OOP.calculator;

import TaskFifth_MVC_OOP.calculator.*;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller implements View {

    public void start_button() {
        String[] menu = new String[]{"Запустить калькулятор для вещественных чисел", "Запустить калькулятор для комплексных чисел"};
        for (String pos : menu) {
            System.out.println(pos);
        }
        Model calc = new Model();


        Logger log = new LoggerImpl("calclog");


        int menuChoise = getOperator("Введите пункт меню(без точки) и нажмите Enter: ");
        switch (menuChoise){
            case '1':
                double valueA = getSimpleNumber("first number : ");
                double valueB = getSimpleNumber("second number : ");
                char oper = getOperator("char : ");
                String result = calc.simpleCalc(valueA,valueB,oper);
                viewResult(valueA, valueB, oper, result);
                log.saveAllLines(logResult(valueA, valueB, oper, result));
                break;
            case '2':
                Double[] valueAcomp = getComplexNumber("first comp number : ");
                Double[] valueBcomp = getComplexNumber("second comp number : ");
                char operComp = getOperator("char : ");
                String resultComp = calc.complex_operations(valueAcomp,valueBcomp,operComp);
                viewResult(compDtoString(valueAcomp),compDtoString(valueBcomp) , operComp, resultComp);
                log.saveAllLines(logResult(compDtoString(valueAcomp),compDtoString(valueBcomp), operComp, resultComp));
                break;
        }

    }

}
