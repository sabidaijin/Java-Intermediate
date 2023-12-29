import java.util.Scanner;


public class javapro7_1{
public static int cul(int m,int n){
    
    if (n>0){
        
    
        
        return m*cul(m,n-1);

    }else{
        return 1;}    
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 標準入力で受け取り
    int m= sc.nextInt();
    int n= sc.nextInt();
    sc.close();

    System.out.println(cul(m,n));


}

}
