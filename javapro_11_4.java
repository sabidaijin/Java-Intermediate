import java.util.*;


public class javapro_11_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  
        int b = sc.nextInt();
        NumberContents cul = new NumberContents();
        cul.firstNumber = a;
        cul.secondNumber = b;
        System.out.println(cul.calculate());
        sc.close();
    }

class number extends NumberContents{
    public void print(){
        System.out.println("Hello World");
}

class cul extends NumberContents{
        
}
}
}
