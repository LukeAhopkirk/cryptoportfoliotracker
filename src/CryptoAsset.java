public class CryptoAsset {
    private final String name;
    private double quantity;
    private double pricePerUnit;
    private CoinMarketCap coinMarketCap;
    private String currency;

    public CryptoAsset(String name, double quantity, double pricePerUnit, CoinMarketCap cmc, String currency) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.coinMarketCap = cmc;
        this.currency = currency;
    }

    public double getTotalValue() {
        return quantity * coinMarketCap.getPricePerUnit(name, currency);
    }

    @Override
    public String toString() {
        return name + ": " + quantity + " units, Total Value: $" + getTotalValue();
    }
}
