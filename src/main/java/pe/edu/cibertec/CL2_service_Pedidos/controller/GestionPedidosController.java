package pe.edu.cibertec.CL2_service_Pedidos.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.CL2_service_Pedidos.remoteservice.ServiceClienteClient;
import pe.edu.cibertec.CL2_service_Pedidos.remoteservice.ServiceInventarioClient;


@RequiredArgsConstructor
@RestController
public class GestionPedidosController {

    private final ServiceInventarioClient serviceInventarioClient;
    private final ServiceClienteClient serviceClienteClient;

    @GetMapping("/crear-pedido")
    public String crearpedido(@RequestParam String pedido){
        return "Pedido  " + pedido + "  añadido con exito";
    }

    @GetMapping("/listar-Idpedido")
    public String listarPedidos(){
        return "Lista de Pedidos: " +
                " Pedido 0001, " +
                " Pedido 0002, " +
                " Pedido 0003";
    }

    @GetMapping("/prueba-pedido")
    public String obtenerPedidos(){
        return "Respuesta del Servicio de Pedidos";
    }

    @GetMapping("/pedido-cliente")
    public  String obtenerPedidoCliente(){
        return serviceClienteClient.obtenerClientes();
    }

    @GetMapping("/pedido-juego")
    public  String obtenerPedidoJuegos(){
        return  serviceInventarioClient.obtenerJuegos();
    }

}
