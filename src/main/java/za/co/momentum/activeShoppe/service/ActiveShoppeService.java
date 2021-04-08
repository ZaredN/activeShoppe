package za.co.momentum.activeShoppe.service;


import org.springframework.beans.factory.annotation.Autowired;
import za.co.momentum.activeShoppe.model.MomentumClient;
import za.co.momentum.activeShoppe.model.MomentumProduct;
import za.co.momentum.activeShoppe.service.MomentumClientService;
import za.co.momentum.activeShoppe.service.MomentumProductsService;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ActiveShoppeService implements Serializable {

    @Autowired
    private MomentumProductsService momentumProductsService;
    @Autowired
    private MomentumClientService momentumClientService;


    public MomentumClient displayClientsProfileAfterSale(String client_id) {
     return   momentumClientService.getAClient(client_id);

    }
}
