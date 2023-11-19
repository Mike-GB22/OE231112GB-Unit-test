//2023/11/19

public class MainHW {
    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
    public boolean evenOddNumber(int n){
        if(n % 2 == 0) return true;
        return false;
    }

    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%
    public boolean numberInInterval(int n){
        if(n <= 25) return false;
        if(n >= 100) return false;
        return true;
    }

    public static void main(String[] args) {
        //System.out.println(new MainHW().evenOddNumber(1));
        //System.out.println(new MainHW().evenOddNumber(2));
    }

}
