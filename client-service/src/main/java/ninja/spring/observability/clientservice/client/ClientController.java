package ninja.spring.observability.clientservice.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class ClientController {

    private final ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping("/")
    private ResponseEntity<List<Client>> getClients() {
        return ResponseEntity.ok(clientRepository.findAll());
    }
}
