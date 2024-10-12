package pe.edu.cibertec.CL2_service_Pedidos.remoteservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "CL2-service-Inventario")
public interface ServiceInventarioClient {

    @GetMapping("/prueba-juego")
    String obtenerJuegos();
}
