public class Expense<C, A>{

    private C country;
    private A amount;

    public Expense(C country, A amount) {
        this.country = country;
        this.amount = amount;
    }

    public C getCountry() {
        return country;
    }

    public void setCountry(C country) {
        this.country = country;
    }

    public A getAmount() {
        return amount;
    }

    public void setAmount(A amount) {
        this.amount = amount;
    }
}
