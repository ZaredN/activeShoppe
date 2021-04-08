package za.co.momentum.activeShoppe.service;

import org.springframework.stereotype.Service;
import za.co.momentum.activeShoppe.model.MomentumProduct;

import java.util.Arrays;
import java.util.List;

@Service
public class MomentumProductsService {
    List<MomentumProduct> getAllProducts =
       Arrays.asList(
            new MomentumProduct("Health Care","001" ,30),
            new MomentumProduct("Car and Home Insurance","002", 50),
            new MomentumProduct("Life Insurance","003", 100 ),
            new MomentumProduct("Investment and Savings","004", 70 )

        );
    public List<MomentumProduct> getAllProducts() {
        return getAllProducts;
    }
    public MomentumProduct getAProduct(String code){
      return  getAllProducts.stream().filter(p -> p.getProductCode().equals(code)).findFirst().get();

    }
}
