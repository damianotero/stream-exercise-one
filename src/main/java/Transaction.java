public class Transaction {

    private String name;
    private int amount;
    private String country;

    public Transaction(String name, String country, int amount) {
        this.name = name;
        this.amount = amount;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
