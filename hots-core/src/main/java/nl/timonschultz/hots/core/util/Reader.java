package nl.timonschultz.hots.core.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nl.timonschultz.hots.core.map.service.MapService;
import nl.timonschultz.hots.core.map.model.MapInputModel;
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

    private MapService mapService;

    public void readStream(String url) {

        try (InputStream is = new URL(url).openStream()) {

            JsonReader reader = new JsonReader(new InputStreamReader(is, "UTF-8"));
            Gson gson = new GsonBuilder().create();

            reader.beginArray();
            while (reader.hasNext()) {
                MapInputModel map = gson.fromJson(reader, MapInputModel.class);

                mapService.add(map);
            }

            reader.close();

        } catch (MalformedURLException e) {
            log.error(e.getMessage());
        } catch (IOException e) {
            log.error(e.getMessage());
        }

    }
}
