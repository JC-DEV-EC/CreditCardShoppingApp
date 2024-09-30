package services;

import models.Purchase;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PurchaseService {
    private List<Purchase> purchases;

    public PurchaseService() {
        purchases = new ArrayList<>();
    }

    public void addPurchase(Purchase purchase) {
        purchases.add(purchase);
    }

    public List<Purchase> getSortedPurchases() {
        purchases.sort(Comparator.comparingDouble(Purchase::getAmount));
        return purchases;
    }
}
