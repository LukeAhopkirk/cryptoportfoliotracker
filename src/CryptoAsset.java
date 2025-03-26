public class CryptoAsset {
    private String name;
    private double quantity;
    private double pricePerUnit;

    public CryptoAsset(String name, double quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public double getTotalValue() {
        return quantity * pricePerUnit;
    }

    @Override
    public String toString() {
        return name + ": " + quantity + " units, Total Value: $" + getTotalValue();
    }
}
