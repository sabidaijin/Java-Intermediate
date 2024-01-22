public class javapro13_2 {
    public static void main(String[] args) {
    num num = new num();
    num.firstNumber = 10;
    num.secondNumber = 5;
    System.out.println(num.calculate());
}
}
class num extends NumberContents{
    public int calculate(){ 
        int result = firstNumber / secondNumber;
    
        return result;
      }
}
