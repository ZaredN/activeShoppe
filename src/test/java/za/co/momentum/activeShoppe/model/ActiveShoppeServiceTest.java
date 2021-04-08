package za.co.momentum.activeShoppe.model;

import org.junit.Test;
import za.co.momentum.activeShoppe.service.ActiveShoppeService;
import za.co.momentum.activeShoppe.service.MomentumClientService;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class ActiveShoppeServiceTest {


    private MomentumClient activeShoppeClient;
    private MomentumProduct momentumProduct;
    private ActiveShoppeService activeShoppeService;



//    @Test
//    public void requestToPurchaseFromActiveShop() throws Exception {
//
//
//      String client_id = "002";
//      //  List<MomentumClient> results = activeShoppeService.displayClientsProfileAfterSale(String client_id);
//     //   List<MomentumProduct> results = activeShoppeService.displayClientsProfileBeforeSale();
//        assertThat(results.size(), is(1));
//        assertThat(results, containsInAnyOrder("Health"));
//    }

}
