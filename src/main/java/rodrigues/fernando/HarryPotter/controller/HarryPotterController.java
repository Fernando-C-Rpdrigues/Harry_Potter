package rodrigues.fernando.HarryPotter.controller;

import net.minidev.json.JSONObject;
import netscape.javascript.JSObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;

@RestController
public class HarryPotterController {

    @GetMapping("/v2/sorting-Hat")
    public ResponseEntity<Object> sortingHatV2(){

        ArrayList<String> houses = new ArrayList<String>();
        houses.add("Sonserina");
        houses.add("Corvinal");
        houses.add("Grifinória");
        houses.add("lufa-luffa");

        Random number = new Random();
        int generateNumber = number.nextInt(4);

        JSONObject entity = new JSONObject();
        entity.put("houses", houses.get(generateNumber));

         return new ResponseEntity<Object>(entity, HttpStatus.ACCEPTED);
    }
}
