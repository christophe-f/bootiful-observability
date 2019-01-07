package ninja.spring.observability.clientservice.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
class InitCLR implements CommandLineRunner {

    private final ClientRepository clientRepository;

    public InitCLR(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void run(String... args) {
        Stream.of(
                new Client("Christophe"),
                new Client("Luke"),
                new Client("Brian"),
                new Client("Lee")
        ).forEach(clientRepository::save);
    }
}
