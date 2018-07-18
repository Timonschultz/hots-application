package nl.timonschultz.hots.core.map.mapper;

import nl.timonschultz.hots.core.map.model.MapInputModel;
import nl.timonschultz.hots.persistence.map.MapEntity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface MapInputModelMapper {

    MapInputModel mapToInputModel(final MapEntity n);

    MapEntity mapToEntiy(final MapInputModel n);

}
