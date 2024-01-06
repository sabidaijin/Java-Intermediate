
public class javapro10_2_bellmanfordrevised{
public static void main(String[] args){

	int node[] = new int[8];
	/*node[0]="Start";
	node[1]="A";
	node[2]="B";
	node[3]="C";
	node[4]="D";
	node[5]="E";
	node[6]="F";
	node[7]="Goal";*/

	int edge[][] = new int[8][8];
	edge[0][1]=3;
	edge[1][0]=3;
	edge[0][2]=2;
	edge[2][0]=2;
	edge[0][3]=5;
	edge[3][0]=5;
	edge[1][5]=2;
	edge[5][1]=2;
	edge[2][3]=4;
	edge[3][2]=4;
	edge[3][4]=3;
	edge[4][3]=3;
	edge[4][6]=4;
	edge[6][4]=4;
	edge[5][6]=3;
	edge[4][5]=3;
	edge[4][7]=3;
	edge[7][4]=3;
	edge[6][7]=2;
	edge[7][6]=2;

	node[0]=0;
	node[1]=999;
	node[2]=999;
	node[3]=999;
	node[4]=999;
	node[5]=999;
	node[6]=999;
	node[7]=999;

    int [][]check=new int [8][8];
	node=search(check,node, edge);
	System.out.println("最短経路のコストは"+node[7]+"です。");
	for(int z=0; z<8; z++){
		System.out.println(node[z]);
	}
}



public static int []search(int check[][], int node[],int edge[][]){
	// 再帰＝やり残しがあるかというフラグ
    boolean flag=false;

    // checkはそのルートを使ったかどうか、1の時は使ってない、0の時は使ったという目印
	for(int i=0;i<8;i++){
        for(int j=0;j<8;j++){
            check[i][j]=1;
        }
    }
    // ここで実際にベルマンフォードを行う
	for(int current=0; current<node.length; current++){
		for(int next=0; next<node.length; next++){
            // もしもエッジが存在してかつ、そのエッジが使われておらず、かつ、もともと設定されたノードのサイズ＞新しいエッジを通ってきたノードのサイズだったら
			if(edge[current][next]!=0 && check[current][next]!=0){
                // ベルマンフォード法に基づいて、ノードの値を入れ替える
				if(node[current]+edge[current][next]<node[next]){
					node[next] = edge[current][next]+node[current];
                    check[current][next]=0;
                    // ノードサイズの更新があったためフラグを立てる
                    flag=true;
					}
				}
			}
		}
	// 上記処理だとベルマン一周しかできないので、二週目以降をすることを考えて以下の処理を足した
        if(flag){
            return search(check,node,edge);
        }else{
            return node;
    
    }
    }
}
