package pe.edu.cibertec.CL2_service_Pedidos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Cl2ServicePedidosApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cl2ServicePedidosApplication.class, args);
	}

}
