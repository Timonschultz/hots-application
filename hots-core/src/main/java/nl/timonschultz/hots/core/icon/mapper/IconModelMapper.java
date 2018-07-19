package nl.timonschultz.hots.core.icon.mapper;

import nl.timonschultz.hots.core.icon.model.IconModel;
import nl.timonschultz.hots.persistence.icon.IconEntity;
import org.springframework.stereotype.Component;

@Component
public class IconModelMapper {

    public IconEntity toEntity(IconModel iconModel) {
        return IconEntity.builder().icon(iconModel.getIcon()).build();
    }

}