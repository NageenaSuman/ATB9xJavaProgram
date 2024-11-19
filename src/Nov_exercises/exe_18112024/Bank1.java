package Nov_exercises.exe_18112024;


public class Bank1 {
    private String currency;
    private Integer amount;

    public Bank1(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }


    public Integer add(Bank1 bankName) {
        if (!bankName.currency.equalsIgnoreCase("INR")) {
            try {
                throw new Exception("Currency Mismatch, Can't Proceed!");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return bankName.amount + this.amount;
    }}



