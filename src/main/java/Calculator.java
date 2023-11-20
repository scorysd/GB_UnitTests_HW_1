public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int i, int i1) {
        return i * i1;
    }

    public double divide(double i, double n) {
        if (n == 0) {
            throw new IllegalArgumentException("Деление на 0");
        }
        return i / n;
    }

    public double calculateDiscount(int price, double discount){
        if (discount <= 0){
            throw new ArithmeticException("Скидка меньше 0!");
        }
        return price - ((price * discount) / 100);
    }

// Допустим, у вас есть и другие методы калькулятора
}

