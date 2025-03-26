import java.util.ArrayList;

public class Portfolio {
    private ArrayList<CryptoAsset> assets = new ArrayList<>();

    public void addAsset(CryptoAsset asset) {
        assets.add(asset);
    }

    public void showPortfolio() {
        System.out.println("Your Portfolio:");
        for (CryptoAsset asset : assets) {
            System.out.println(asset);
        }
    }
}
