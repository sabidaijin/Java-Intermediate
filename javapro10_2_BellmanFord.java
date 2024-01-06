
public class javapro10_2_BellmanFord{
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

	node=search(node, edge);
	System.out.println("最短経路のコストは"+node[7]+"です。");
	for(int z=0; z<8; z++){
		System.out.println(node[z]);
	}
}



public static int []search(int pre[], int edge[][]){
	// preは前回のnode
	int []newnode=pre;
	for(int current=0; current<pre.length; current++){
		for(int next=0; next<pre.length; next++){
			if(edge[current][next]!=0){
				if(pre[current]+edge[current][next]<pre[next]){
					newnode[next] = edge[current][next]+pre[current];
					}
				}
			}
		}
	// 上記処理だとベルマン一周しかできないので、二週目以降をすることを考えて以下の処理を足した
	boolean a = true;
	// pre(今回のノード)とnew(更新されたノード)の値が一つでも違ったらもう一度再起
	// 一致していたら変化無しということで確定としてreturn
	for(int z=0; z<8; z++){
		if(pre[z]!=newnode[z]){
			a = false;
		}
	}
	if(a){
		return newnode;
	}
	else{
		return search(newnode, edge);
	}
	}
}