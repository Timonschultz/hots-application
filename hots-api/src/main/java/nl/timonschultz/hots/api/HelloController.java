package nl.timonschultz.hots.api;

import lombok.AllArgsConstructor;
import nl.timonschultz.hots.core.dataimport.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class HelloController {

    private Reader reader;

    @RequestMapping("/heroes")
    public String index() {
        reader.readStream();
        return "Greetings from HOTS APP!";
    }
}