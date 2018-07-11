package nl.timonschultz.hots.core.dataimport;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nl.timonschultz.hots.core.model.HeroInputModel;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

@Slf4j
@Service
@AllArgsConstructor
public class Reader {

    public void readStream() {

        try (InputStream is = new URL("http://hotsapi.net/api/v1/heroes").openStream()) {

            JsonReader reader = new JsonReader(new InputStreamReader(is, "UTF-8"));
            Gson gson = new GsonBuilder().create();

            reader.beginArray();
            while (reader.hasNext()) {
                HeroInputModel hero = gson.fromJson(reader, HeroInputModel.class);
                System.out.println(hero.getName());
            }

            reader.close();

        } catch (MalformedURLException e) {
            log.error(e.getMessage());
        } catch (IOException e) {
            log.error(e.getMessage());
        }

    }
}
