public class AccessModifiers{
    public static void main(String args[]){
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Ram";
       // myAcc.password = "abcd@123";                  //can't be change bcoz private access in BankAccount 
       System.out.println(myAcc.username);
       //but here we can set bcoz its public access
       myAcc.setPassword("xyz@789");
       //System.out.println(myAcc.setPassword);        //can't be print also bcoz private
    }
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}