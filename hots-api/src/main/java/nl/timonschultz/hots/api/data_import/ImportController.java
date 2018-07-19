package nl.timonschultz.hots.api.data_import;

import lombok.AllArgsConstructor;
import nl.timonschultz.hots.core.util.Reader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class ImportController {

    private static final String API_V1_HEROES = "http://hotsapi.net/api/v1/heroes";
    private static final String API_V1_MAPS = "http://hotsapi.net/api/v1/maps";

    private Reader reader;

//    @RequestMapping("/heroes")
//    public String index() {
//        reader.readStream(API_V1_HEROES);
//        return "Greetings from HOTS APP!";
//    }

    @RequestMapping("/maps")
    public String abilityStreamImport() {
        reader.readStream(API_V1_MAPS);
        return "Greetings from HOTS APP!";
    }
}