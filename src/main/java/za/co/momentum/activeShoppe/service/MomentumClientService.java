package za.co.momentum.activeShoppe.service;

import org.springframework.stereotype.Service;
import za.co.momentum.activeShoppe.model.MomentumClient;

import java.util.Arrays;
import java.util.List;

@Service
public class MomentumClientService {

    MomentumClient  result;
   private List<MomentumClient> momentumClients =
         Arrays.asList(
            new MomentumClient("john","01",500 ),
            new MomentumClient("peter","02",600 ),
            new MomentumClient("zared","03",700 ),
            new MomentumClient("jennefer","04",800 )

        );


   public List<MomentumClient> getAllClients() {
       return momentumClients;
   }
   public MomentumClient getAClient(String id) {


   MomentumClient  result = momentumClients.stream().filter(k -> k.getClientId().equals(id)).findFirst().get();
       return result;
   }

//    public void updateClient(MomentumClient momentumClients, String client_id) {
//
//        for(int i= 0; i < momentumClients)
//    }


//    public void getClientsPoints(String id) {
//       momentumClients.stream().filter(p -> p.getPoints().equals(momentumClients.get(0).getPoints()));
//
//
//    }
}
