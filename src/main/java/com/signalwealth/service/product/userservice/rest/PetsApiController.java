package com.signalwealth.service.product.userservice.rest;

import com.signalwealth.user.service.userservice.Pet;
import com.signalwealth.user.service.userservice.PetsApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class PetsApiController implements PetsApi {

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @Override
    public ResponseEntity<Void> createPets() {
        return null;
    }

    @Override
    public ResponseEntity<List<Pet>> listPets(@Valid Integer limit) {
        Pet cid = new Pet();
        cid.setId(1L);
        cid.setName("Cid");
        cid.setTag("cat");

        Pet claude = new Pet();
        claude.setId(2L);
        claude.setName("Claude");
        claude.setTag("cat");

        List<Pet> pets = new ArrayList<>();
        pets.add(cid);
        pets.add(claude);

        return ResponseEntity.ok(pets);
    }

    @Override
    public ResponseEntity<List<Pet>> showPetById(String petId) {
        return null;
    }

    @RequestMapping(
            value = "/hello",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public String helloWorld() {
        return "{'message': 'Hello World'}";
    }

    @GetMapping("/jpa-test")
    public String jpaTest() {
        return "{'message': 'worked'}";
    }
}
