package mmelo.springframework.sfgpetclinic.services;

import mmelo.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
