public class Java_20260821_COR_Purchase {

    private int number;
    private double amount;
    private String purpose;

    public Java_20260821_COR_Purchase(
            int number,
            double amount,
            String purpose) {

        this.number = number;
        this.amount = amount;
        this.purpose = purpose;
    }

    public int getNumber() {
        return number;
    }

    public double getAmount() {
        return amount;
    }

    public String getPurpose() {
        return purpose;
    }
}

