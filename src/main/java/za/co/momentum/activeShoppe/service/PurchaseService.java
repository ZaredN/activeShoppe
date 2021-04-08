package za.co.momentum.activeShoppe.service;

import org.springframework.stereotype.Service;

@Service
public class PurchaseService {

 private MomentumClientService momentumClientService;
 private MomentumProductsService momentumProductsService;

    public void subtractProductPointsFromClientPoints(String client_id, String productCode) {//client id,

        int sale = 0;
    int client =   momentumClientService.getAClient(client_id).getPoints();
    int product = momentumProductsService.getAProduct(productCode).getProductCost();
        sale = client - product;
     momentumClientService.getAClient(client_id).setPoints(sale);

    }
}
