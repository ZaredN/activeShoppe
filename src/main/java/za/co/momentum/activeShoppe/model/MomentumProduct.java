package za.co.momentum.activeShoppe.model;

import java.util.ArrayList;
import java.util.List;

public class MomentumProduct {
    private String productName;
    private String productCode;
    private int productCost;


    public MomentumProduct() {

    }
    public MomentumProduct(String productName, String productCode, int productCost) {

        this.productName = productName;
        this.productCode = productCode;
        this.productCost = productCost;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setProductCost(int productCost) {
        this.productCost = productCost;
    }



    public String getProductName() {
        return productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public int getProductCost() {
        return productCost;
    }



}
