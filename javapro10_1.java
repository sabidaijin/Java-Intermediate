import java.util.*;


public class javapro10_1 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Integer> randomList = new ArrayList<>();
        
        int input;
        int value=1000;
        int result=0;
        int pre;
        // 標準入力で探したい値を決定する
        // input =sc.nextInt();
        
        // 乱数を生成
        for(int i=0;i<1000;i++){
            randomList.add(rand.nextInt(Integer.MAX_VALUE));}
        
        System.out.println(randomList.get(0));
        input =sc.nextInt();
        sc.close();
        // ソート
        Collections.sort(randomList);
        
        pre=value/2;
        result=search(pre,value,input,randomList);
        if (result<0){
            System.out.println("ないです");
        }else{
            System.out.println("ありました");
        }
    }


    public static int search(int pre, int prepre,int input,ArrayList<Integer> randomList){

    
            int sa;
            // 半分の半分の真ん中を求めるには1/4を足すか引くかすると得られる。って考えれるし
            // それと同時に頭とお尻を足したものを半分にしたとも考えられる。
            // (prepre+pre/2)-pre
            sa=Math.round(Math.abs(prepre-pre)/2);
                
            // 終了条件
            if (input==randomList.get(pre)){
                return 1;}
            else if (pre==prepre){
                return -1;
            }
            else if (input<randomList.get(pre)){
                
                prepre=pre;
                
                
                pre=pre-(sa);
                return search(pre,prepre,input,randomList);
                
            }
            else if (input>randomList.get(pre)){
                
                prepre=pre;
                
                pre=pre+sa;
                // ここでのsearchは最終的に1になるか−1になる。
                return search(pre,prepre,input,randomList);}
            
            return -1;
    }
}

