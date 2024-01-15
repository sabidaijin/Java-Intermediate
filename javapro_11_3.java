import java.util.*;

public class javapro_11_3 {
    public static void main(String[] args) {
        MoneyM moneyM = new MoneyM();
        Scanner sc = new Scanner(System.in);

        System.out.print("収入を入力してください: ");
        moneyM.sumincome = sc.nextInt();

       
        System.out.println("支出を10回入力してください:");
        for (int i = 0; i < 10; i++) {
            moneyM.sumoutcome[i] = sc.nextInt();
        }
       
        sc.close();
        double result = moneyM.ratio(); // メソッドの戻り値を受け取る
        System.out.println("収支比率: " + result);
    }}


class MoneyM {
    int sumincome;
    int[] sumoutcome=new int[10];

    public double ratio() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += sumoutcome[i];
        }
        return (double) sumincome / sum;
    }
}

