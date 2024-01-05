// // このプログラムでは最短経路探索についてその中から最短経路を求める。/**
// // 適当なグラフを想定し、経路を調べる
// // 問題設定
// // 地図上には、A, B, C, D, E, F の6つの地点があります。
// // これらの地点は以下のように道路でつながれています（各道路の数字は距離を表します）：
// // A - B: 4 km
// // A - D: 2 km
// // B - C: 5 km
// // D - E: 10 km
// // C - E: 2 km
// // C - F: 3 km
// // E - F: 3 km

// // A -4- B -5- C
// // |     |     /|
// // 2     5    2 |
// // |     |   /  3
// // D -10- E -3- F



public class javapro9_1_revised_bruteforceroad {
    public static void main(String[] args) {
        
        // int node[] = new int[6];
        /*node[0]="A";
        node[1]="B";
        node[2]="C";
        node[3]="D";
        node[4]="E";
        node[5]="F";*/

        int edge[][]=new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
              edge[i][j] = 0;
            }
          }
        edge[0][1]=4;// A - B: 4 km
        edge[1][0]=4;
        edge[0][3]=2;// A - D: 2 km
        edge[3][0]=2;
        edge[1][2]=5;// B - C: 5 km
        edge[2][1]=2;
        edge[1][4]=5;// B - E: 5 km
        edge[4][1]=5;
        edge[3][4]=10;// D - E: 10 km
        edge[4][3]=10;
        edge[2][4]=2;// C - E: 2 km
        edge[4][2]=2;
        edge[2][5]=3;// C - F: 3 km
        edge[5][2]=3;
        edge[4][5]=3;// E - F: 3 km
        edge[5][4]=3;
        
    
        search(edge, 0,0,"A");
    }


        
        public static void search(int[][]edge,int cost,int current,String path){
        // 求められているもの：最短距離
        // 入力：エッジ。出力：そこから考えられる全ての距離
            for(int next=1;next<6;next++){
                // ゴール条件
                if(current==5){ 
                    System.out.println("最短経路: " + path + " ゴールに到達 コスト: " + cost + " km");
                    return;}    
                if(edge[current][next]!=0&&!path.contains(String.valueOf((char) ('A' + next)))){
                    // 出力を作るための処理
                    int newcost =cost+edge[current][next];
                    int newcurrent=next;
                    String newpath = path + " -> " + (char) ('A' + next);
                    search(edge, newcost, newcurrent,newpath);
                    // ここnewにしないと値を更新した状態で再起してしまうのでだめ
                        
                      
                }
               
            }
        }
}         