public class CheckingAccount extends BankAccount{
    double fee;
    CheckingAccount(String number, Long balance, double fee){
    super(number, balance);
    }
}
