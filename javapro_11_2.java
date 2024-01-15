import java.util.Scanner;

public class javapro_11_2 {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        message.geet(sc.nextLine());
        sc.close();
    
    }



public class greeting {
    // Your code here
    static String friendname="amiti";

    public static void greet(String myfriend) {
        System.out.println("こんにちは" + myfriend + "さん");
        System.out.println("こんにちは" + friendname + "さん");
        

    }

}
public class message {
    // Your code here
    public static void geet(String myfriend) {
        greeting.greet(myfriend);

    }
}
}