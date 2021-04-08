package za.co.momentum.activeShoppe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.momentum.activeShoppe.model.MomentumClient;
import za.co.momentum.activeShoppe.service.MomentumClientService;

import java.util.List;

@RestController
public class ClientController {

        @Autowired
        private MomentumClientService momentumClientService;
    @RequestMapping("/clients")
    public List<MomentumClient> getAllClients(){
        return momentumClientService.getAllClients();
    }

    @RequestMapping("/clients/{id}")
    public MomentumClient getAClient(@PathVariable String id) {
    return momentumClientService.getAClient(id);

    }

}
