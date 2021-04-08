package za.co.momentum.activeShoppe.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class PurchaseServiceTest {

    private  MomentumClientService momentumClientService;
    private MomentumProductsService momentumProductsService;

    @Test
    public void saleOfProductPurchase(String a, String b) {
    int  clientsPoints =  momentumClientService.getAClient(a).getPoints();
    int  productPointsCost =  momentumProductsService.getAProduct(b).getProductCost();
      int result =  clientsPoints - productPointsCost;
    }

}
