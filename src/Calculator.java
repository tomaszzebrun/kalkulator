public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Dodawanie 3+8: " + calculator.add(3, 8));
        System.out.println("Odejmowanie 45-23: " + calculator.subtract(45, 23));
    }

    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
