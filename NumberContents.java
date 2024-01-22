// NumberContents クラス
// 2 つの int 型のフィールドと、その 2 つの数のかけ算をして結果を返すメソッドを持つ
// ExtendedNumberContents と NumberContentsAddition の 2 つのクラスの親クラス

public class NumberContents {
    // firstNumber: 1 つ目の数
    // secondNumber: 2 つ目の数
    int firstNumber, secondNumber;

    // 2 つのフィールドの数をかけ算するメソッド
    // 引数なし, 戻り値がかけ算の結果
    public int calculate() {
        int result = firstNumber * secondNumber;

        return result;
    }
}