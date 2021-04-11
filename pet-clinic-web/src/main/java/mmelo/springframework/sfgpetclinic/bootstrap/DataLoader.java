package mmelo.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import mmelo.springframework.sfgpetclinic.model.Owner;
import mmelo.springframework.sfgpetclinic.model.Vet;
import mmelo.springframework.sfgpetclinic.services.OwnerService;
import mmelo.springframework.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Magnaldo");
        owner1.setLastName("Melo");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Marcia");
        owner2.setLastName("Melo");

        ownerService.save(owner2);

        System.out.println("Loader Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Pedro");
        vet1.setLastName("Henrique");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Lucas");
        vet2.setLastName("Gabriel");

        vetService.save(vet2);

        System.out.println("Loader Vetrs...");
    }

}
