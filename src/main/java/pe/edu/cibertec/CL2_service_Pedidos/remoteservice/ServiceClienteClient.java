package pe.edu.cibertec.CL2_service_Pedidos.remoteservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="CL2-service-Clientes")
public interface ServiceClienteClient {

    @GetMapping("/prueba-cliente")
   String obtenerClientes();

}
