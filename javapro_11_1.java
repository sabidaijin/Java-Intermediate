import java.util.*;

public class javapro_11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        friends[] friendsList = new friends[1]; // 友達の情報を1つ収容するため要素数を1に変更
        friendsList[0] = new friends();
        String name = sc.nextLine();
        friendsList[0].name = name;
        String mailadress = sc.nextLine();
        friendsList[0].mailadress = mailadress;

        // 友達の名前を入力し、それに対応するメールアドレスを表示する処理
        String friendNameToFind = sc.nextLine();
        for (friends friend : friendsList) {
            if (friend.name.equals(friendNameToFind)) {
                System.out.println("メールアドレス:" + friend.getMailadress());
            }
        }

        sc.close();
    }

    public static class friends {
        String name;
        String mailadress;

        public String getName() {
            return name;
        }

        public String getMailadress() {
            return mailadress;
        }
    }
}
