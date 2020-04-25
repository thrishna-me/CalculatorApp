package com.company.calculatorapp;

import com.company.*;


import java.util.concurrent.Callable;

public class Main<calculators> {

    public static void main(String[] args) {

//        MathEquation testEquation = new MathEquation();
//        testEquation.execute();
//        System.out.print("test = ");
//        System.out.println(testEquation.getResult());

       // useCalculateHelper();

        String[] statements = {"add 25.0 92.0", "power 5.0 2.0"};

        DynamicHelper helper = new DynamicHelper(new MathProcessing[] {
                new Adder(),
                new PowerOF()
        });
        for(String statement: statements) {
                String output = helper.process(statement);
                System.out.println(output);
        }


        //MathEquation[] equations = new MathEquation[4];
//        equations[0] = new MathEquation('d', 100.0d, 50.0d);
//        equations[1] = new MathEquation('a', 25.0d, 92.0d);
//        equations[2] = new MathEquation('s', 225.0d, 17.0d);
//        equations[3] = new MathEquation('m', 11.0d, 3.0d);
//
//        for (MathEquation equation : equations) {
//            equation.execute();
//            System.out.print("result =  ");
//            System.out.println(equation.getResult());
//        }

//        System.out.println();
//        System.out.println("Using Overloads");
//        System.out.println();
//
//        double leftDouble = 9.0d;
//        double rightDouble = 4.0d;
//        int leftInt = 9;
//        int rightInt = 4;

//        MathEquation equationOverload = new MathEquation('d');
//
//        equationOverload.execute(leftDouble, rightDouble);
//        System.out.print("results = ");
//        System.out.println(equationOverload.getResult());
//
//        equationOverload.execute(leftInt, rightInt);
//        System.out.print("results = ");
//        System.out.println(equationOverload.getResult());
//
//        equationOverload.execute((double) leftInt, rightInt);
//        System.out.print("results = ");
//        System.out.println(equationOverload.getResult());
//
//        System.out.println();
//        System.out.println("Using Inheritance");
//        System.out.println();

//    public static MathEquation create(double leftVal, double rightVal ,char opCode) {
//        MathEquation equation = new MathEquation();
//        equation.setLeftVal(leftVal);
//        equation.setRightVal(rightVal);
//        equation.setOpCode(opCode);
//
//        return equation;
//    }

//        CalculateBase[] calculators = {
//                new Adder(25.0d, 92.0d),
//                new Divider(100.0d, 50.0d),
//                new Multiplier(11.0d, 3.0d),
//                new Subtracter(225.0d, 17.0d)
//
//        };
//
//        for(CalculateBase calculator : calculators) {
//            calculator.calculate();
//            System.out.print("Result = ");
//            System.out.println(calculator.getResult());
//        }
    }

//    private static void useCalculateHelper() {
//        String[] statements = {
//                "add 1.0",
//                "add xx 25.0",
//                "addX 0.0 0.0",
//                "add 25.0 92.0",
//                "divide 100.0 50.0",
//                "multiply 11.0 3.0",
//                "subtract 225.0 17.0"
//        };
//
//        CalculateHelper helper = new CalculateHelper();
//        for (String statement : statements) {
//            try {
//                helper.process(statement);
//                System.out.println(helper);
//            } catch (InvalidStatementException e) {
//                System.out.println(e.getMessage());
//                if (e.getCause() != null)
//                    System.out.println(" Original exception: " + e.getCause().getMessage());
//            }
//        }
//    }


}
