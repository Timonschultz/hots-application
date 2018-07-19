package nl.timonschultz.hots.core.heroes.mapper;

import lombok.RequiredArgsConstructor;
import nl.timonschultz.hots.core.abilities.mapper.AbilityModelMapper;
import nl.timonschultz.hots.core.heroes.model.HeroInputModel;
import nl.timonschultz.hots.core.icon.mapper.IconModelMapper;
import nl.timonschultz.hots.core.talent.mapper.TalentModelMapper;
import nl.timonschultz.hots.persistence.heroes.HeroEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HeroModelMapper {

    private final IconModelMapper iconModelMapper;
    private final AbilityModelMapper abilityModelMapper;
    private final TalentModelMapper talentModelMapper;

    public HeroEntity toEntity(HeroInputModel heroInputModel) {
        return HeroEntity.builder().name(heroInputModel.getName())
                .shortName(heroInputModel.getShortName())
                .attributeId(heroInputModel.getAttributeId())
                .translations(heroInputModel.getTranslations())
                .icon(iconModelMapper.toEntity(heroInputModel.getIconModel()))
                .role(heroInputModel.getRole())
                .type(heroInputModel.getType())
                .releaseDate(heroInputModel.getReleaseDate())
                .abilities(abilityModelMapper.toEntityList(heroInputModel.getAbilities()))
                .talents(talentModelMapper.toEntityList(heroInputModel.getTalents()))
                .build();
    }

}
