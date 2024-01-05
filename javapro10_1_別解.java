import java.util.*;


public class javapro10_1_別解 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Integer> randomList = new ArrayList<>();
        
        int input;
        int value=1000;
        int result=0;
        int left=0;
        int right=value-1;
        // 標準入力で探したい値を決定する
        // input =sc.nextInt();
        
        // 乱数を生成
        for(int i=0;i<value;i++){
            randomList.add(rand.nextInt(Integer.MAX_VALUE));}
        
        System.out.println(randomList.get(0));
        input =sc.nextInt();
        sc.close();
        // ソート
        Collections.sort(randomList);
        
        
        result=search(left,right,input,randomList);
        if (result<0){
            System.out.println("ないです");
        }else{
            System.out.println("ありました");
        }
    }


    public static int search(int left, int right,int input,ArrayList<Integer> randomList){

    
            int mid;
            // 半分の半分の真ん中を求めるには1/4を足すか引くかすると得られる。って考えれるし
            // それと同時に頭とお尻を足したものを半分にしたとも考えられる。
            // (prepre+pre/2)-pre
            mid=Math.round((left+right)/2);
                
            // 終了条件
            if (input==randomList.get(mid)){
                return 1;
            }
            else if (left>=right){
                return -1;
            }//ここまで終了条件ここから継続パターン
            else if (input<randomList.get(mid)){
                right=mid-1;
                
                return search(left,right,input,randomList);
                
            }
            else if (input>randomList.get(mid)){
                
                left=mid+1;
                // ここでのsearchは最終的に1になるか−1になる。
                return search(left,right,input,randomList);}
            
            return -1;
    }
}

