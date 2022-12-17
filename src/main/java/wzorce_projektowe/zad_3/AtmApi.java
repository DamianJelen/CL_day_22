package wzorce_projektowe.zad_3;

public class AtmApi {
    private BankAccount bankAccount;
    private Transfer transfer;
    private PhoneCard phoneCard;
    private Loan loan;

    public AtmApi() {
        this.bankAccount = new BankAccount();
        this.transfer = new Transfer();
        this.phoneCard = new PhoneCard();
        this.loan = new Loan();
    }

    public void deposit() {
        System.out.println(this.bankAccount.deposit());
    }

    public void payOut() {
        System.out.println(this.bankAccount.payOut());
    }

    public void transferMoney() {
        System.out.println(this.transfer.transferMoney());
    }

    public void recharge() {
        System.out.println(this.phoneCard.recharge());
    }

    public void getLoan() {
        System.out.println(this.loan.getLoan());
    }
}