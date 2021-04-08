package za.co.momentum.activeShoppe.controller;

import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.momentum.activeShoppe.model.MomentumClient;
import za.co.momentum.activeShoppe.service.MomentumClientService;
import za.co.momentum.activeShoppe.service.PurchaseService;

import java.util.logging.Logger;

@RestController
public class PurchaseController {
    private static final Logger  LOG = Logger.getLogger(PurchaseService.class.getName());
    @Autowired
    PurchaseService purchaseService;
    @Autowired
    MomentumClientService momentumClientService;

    @RequestMapping("/purchase")
    public void makeAPurchase(String client_id, String productCode)  {
        if( momentumClientService.getAClient(client_id).getClientId().equals(client_id)) {

            purchaseService.subtractProductPointsFromClientPoints(client_id, productCode);
            momentumClientService.getAClient(client_id);
        }else {
            LOG.fine("your client id is not recognized.");

        }
    }
//    @RequestMapping(method = RequestMethod.POST, value="/purchase/{client_id}")
//    public void afterAPurchase(@RequestBody MomentumClient momentumClient , @PathVariable String client_id) {
//        momentumClientService.updateClient(momentumClient,client_id);
//
//    }
}
