public class CoinMarketCap {
    private final String apiKey;


    public CoinMarketCap(String apiKey) {
        this.apiKey = apiKey;
    }
    public String getApiKey() {
        return apiKey;
    }

    public Double getPricePerUnit(String ticker, String currency) {
        return 123.3333;
    }






}
