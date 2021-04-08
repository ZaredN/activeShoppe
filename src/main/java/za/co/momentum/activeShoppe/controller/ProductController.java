package za.co.momentum.activeShoppe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.momentum.activeShoppe.model.MomentumProduct;
import za.co.momentum.activeShoppe.service.MomentumProductsService;

import java.util.List;

@RestController
public class ProductController {

     @Autowired
     private  MomentumProductsService momentumProductsService;

    @RequestMapping("/products")
    public List<MomentumProduct> getAllProducts(){
        return momentumProductsService.getAllProducts();
    }

    @RequestMapping("/products/{productCode}")
    public MomentumProduct getAProduct(@PathVariable String productCode){
    return momentumProductsService.getAProduct(productCode);
    }
}
