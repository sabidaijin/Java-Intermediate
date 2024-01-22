import java.util.*;

public class javapro_11_3 {
    public static void main(String[] args) {
        MoneyM moneyM = new MoneyM();
        Scanner sc = new Scanner(System.in);

        System.out.print("収入を入力してください: ");
        moneyM.sumincome = sc.nextInt();
        
        System.out.println("支出を入力してください:");
        while (true) {
            moneyM.sumoutcome.add(sc.nextInt());
            System.out.println("終了しますか？ (Yes/No)");
            
            if (sc.nextLine().equalsIgnoreCase("Yes")) {
                break;
            }
        }
       
        sc.close();
        double result = moneyM.ratio(); // メソッドの戻り値を受け取る
        System.out.println("収支比率: " + result);
    }
}

class MoneyM {
    int sumincome;
    ArrayList<Integer> sumoutcome = new ArrayList<>();

    public double ratio() {
        int sum = 0;
        for (int i = 0; i < sumoutcome.size(); i++) {
            sum += sumoutcome.get(i);
        }
        return (double) sumincome / sum;
    }
}
