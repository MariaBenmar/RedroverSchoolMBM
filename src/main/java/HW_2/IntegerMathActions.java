package HW_2;

public class IntegerMathActions {
    public static void main(String[] args) {
        int a = 100;
        int b = 7;
        // вывести результаты следующих операций с этими переменными:
        // сложение, умножение, вычитание, деление и остаток от деления.
        // Также сделать проверку на четность этих переменных и вывести результат.

        int sum = a + b;
        int multiply = a * b ;
        int diff = a - b;
        int division = a / b;
        int remOfDivision = a % b;
        int evenNumberA = a % 2;
        int evenNumberB = b % 2;

        System.out.println("Sum = " + sum);
        System.out.println("Multiply = " + multiply);
        System.out.println("Diff = " + diff);
        System.out.println("Division = " + division);
        System.out.println("Remain Of Division = " + remOfDivision);
        System.out.println("The number " + a + " even-numbered - "+ (evenNumberA == 0));
        System.out.println("The number " + b + " even-numbered - "+ (evenNumberB == 0));

    }
}
