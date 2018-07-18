package nl.timonschultz.hots.core.abilities.mapper;

import nl.timonschultz.hots.core.abilities.model.AbilityInputModel;
import nl.timonschultz.hots.persistence.abilities.AbilityEntity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface AbilityInputModelMapper {

    AbilityInputModel mapToInputModel(final AbilityEntity n);

    AbilityEntity mapToEntiy(final AbilityInputModel n);

}
