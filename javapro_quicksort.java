

public class javapro_quicksort {
public static void sort(int[] number, int first, int last) {
    int i, j, temp, x = number[first];
    i = first;
    j = last;
    while (true) {
        
         
        while (number[i] < x) {
            i = i + 1;
           
        }
        while (x < number[j]) {
            j = j - 1;
            
        }
        if (i >= j) {
            break;
        }
        
        // Swap elements at positions i and j
        temp = number[j];
        number[j] = number[i];
        number[i] = temp;
        i = i + 1;
        j = j - 1;
    }
    System.out.print(i);
    System.out.print(j);
    for (int num : number) {
        System.out.print(num + " ");
        
    }
    System.out.print('\n');
    
    // // ここでグループごとに処理を呼び出している(と同時に終了時の条件も作っている)



    // 前半部分があったら呼び出し
    if (first < i - 1) {
        sort(number, first, i - 1);
    }
    // jが一つしか動かなかった時=基準値が集団で一番大きく[1,2,3],[8]のようなグループができる時を除いて
    // 後半部分があったら呼び出し
    if (j + 1 < last) {
        sort(number, j + 1, last);
    }
    
}
public static void main(String[] args) {
    int[]number={3,2,35,6,71,313,21,13,1,-1};
    sort(number,0,number.length-1);
    for (int num : number) {
        System.out.print(num + " ");
        
    }
    System.out.print('\n');
}
}

