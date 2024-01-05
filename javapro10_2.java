
public class javapro10_2{
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
/*for(int z=0; z<8; z++){
System.out.println(node[z]);*/
}



public static int []search(int pre[], int edge[][]){
int []newnode=pre;
for(int i=0; i<pre.length; i++){
	for(int j=i+1; j<pre.length; j++){
	if(edge[i][j]!=0){
	if(pre[i]+edge[i][j]<pre[j]){
	newnode[j] = edge[i][j]+newnode[i];
	}
	}
	}
	}
	boolean a = true;
	for(int z=0; z<8; z++){
	if(pre[z]!=newnode[z]){
	a = false;
	}
	
	}
	if(a){
	return newnode;
	}else{
	return search(newnode, edge);
	}
	}
}