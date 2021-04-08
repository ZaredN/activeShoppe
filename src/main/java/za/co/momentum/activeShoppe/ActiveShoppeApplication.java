package za.co.momentum.activeShoppe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import za.co.momentum.activeShoppe.controller.ClientController;
import za.co.momentum.activeShoppe.controller.ProductController;
import za.co.momentum.activeShoppe.controller.WelcomeController;

@SpringBootApplication
public class ActiveShoppeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActiveShoppeApplication.class, args);

        WelcomeController welcomeController = new WelcomeController();
        ProductController productController = new ProductController();
        ClientController clientController = new ClientController();



	}

}

