public class javapro13_1 {
    public static void main(String[] args) {
        culclate cul = new culclate();
        int[] intArgs = {0,1,2,3,4,5,6,7,8,9};
        String[] stringArgs ={"0","1","2","3","4","5","6","7","8","9"} ;
        // for(int i = 0; i < args.length; i++){
        //     stringArgs[i] = intArgs[i];
        // }
        System.out.println(cul.cul(intArgs));
        System.out.println(cul.cul(stringArgs));
}
    
}
class culclate{
    int cul(int[] args){
        int sum = 0;
        for(int i = 0; i < args.length; i++){
            sum+=args[i];
        }
        return sum;
    }
    int cul(String[] args){
        int sum=0;
        for(int i = 0; i < args.length; i++){
            try{
                sum += Integer.parseInt(args[i]);
            }catch(NumberFormatException e){
                System.out.println("引数が数字ではないので計算できません");
                System.exit(0);
            }
        }
        return sum;
    }
}