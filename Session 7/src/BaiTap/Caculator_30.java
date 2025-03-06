package BaiTap;

public class Caculator_30 {
    private double firstNumber;
    private double secondNumber;
    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public void setFirstNumber(double a){
        this.firstNumber = a;
    }
    public void setSecondNumber(double b){
        this.secondNumber = b;
    }

    public double getAdditionResult(){
        double i = 0;
        i = firstNumber + secondNumber;
        return i;
    }
    public double getSubtractionResult(){
        return(firstNumber-secondNumber);
    }
    public double getMultiplicationResult(){
        return(firstNumber*secondNumber);
    }
    public double getDivisionResult(){

        if(secondNumber==0){
            return 0;
        }
        return firstNumber/secondNumber;
    }
}
