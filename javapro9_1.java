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

import java.util.Random;

public class javapro9_1 {
    public static void main(String[] args) {
        
        // int node[] = new int[8];
        /*node[0]="Start";
        node[1]="A";
        node[2]="B";
        node[3]="C";
        node[4]="D";
        node[5]="E";
        node[6]="F";*/

        int edge[][]=new int[6][6];
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
        
        

        // 求められているもの：最短距離
        // 入力：エッジ。出力：そこから考えられる全ての距離
        int current=0;
        int next;
        int cost=0;
        int[] result=new int[100];
        
        // 終了条件
        for(int k=0;k<1000;k++){
            Random r=new Random();
            for(int i=0;i<15;i++){
                next=r.nextInt(1,6);
                if(edge[current][next]!=0){
                    // 出力を作るための処理
                    cost =cost+edge[current][next];
                    edge[current][next]=0;
                    edge[next][current]=0;
                    current=next;
                    // ゴール条件
                    if(current==5){ 
                        System.out.println("終了");
                        System.out.println(cost);
                        result[k]=cost;
                        cost=0;
                        current=0;

                    }else if(i==14){
                        cost=0;
                        current=0;
                    }
                }
            }
        }
}}          
