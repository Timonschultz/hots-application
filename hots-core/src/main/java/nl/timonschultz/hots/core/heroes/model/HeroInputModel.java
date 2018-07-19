package nl.timonschultz.hots.core.heroes.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import nl.timonschultz.hots.core.abilities.model.AbilityInputModel;
import nl.timonschultz.hots.core.icon.model.IconModel;
import nl.timonschultz.hots.core.talent.model.TalentInputModel;

import java.util.List;

@Getter
@AllArgsConstructor
public class HeroInputModel {

    private String name;
    private String shortName;
    private String attributeId;
    private List<String> translations;
    private IconModel iconModel;
    private String role;
    private String type;
    private String releaseDate;
    private List<AbilityInputModel> abilities;
    private List<TalentInputModel> talents;

}
