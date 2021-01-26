public class Calculator {

    private int total;

    public Calculator(int total){
        this.total = total;
    }

    public int Add(int number1, int number2){
        return(number1 + number2);
    }

    public int Subtract(int number1, int number2){
        return(number1-number2);
    }

    public int Multiply(int number1, int number2){
        return(number1*number2);
    }

    public double Divide(double number1, double number2){
        return(number1/number2);
    }

}
