
abstract public class User{
    protected String ID;
    protected String address;
    public void login(String ID){
        // ログイン処理

        System.out.println(ID+"でログインしました");
    }
    public String getID(){
        return ID;
    }
    public void setID(String ID){
        this.ID=ID;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }

}