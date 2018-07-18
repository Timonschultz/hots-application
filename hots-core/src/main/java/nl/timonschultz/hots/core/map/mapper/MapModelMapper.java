package nl.timonschultz.hots.core.map.mapper;

import nl.timonschultz.hots.core.map.model.MapInputModel;
import nl.timonschultz.hots.persistence.map.MapEntity;
import org.springframework.stereotype.Component;

@Component
public class MapModelMapper {

    public MapEntity toMapEntity (MapInputModel model) {
        return MapEntity.builder().name(model.getName()).translations(model.getTranslations()).build();
    }

}
