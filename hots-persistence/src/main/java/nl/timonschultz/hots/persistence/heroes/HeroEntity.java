package nl.timonschultz.hots.persistence.heroes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.timonschultz.hots.persistence.abilities.AbilityEntity;
import nl.timonschultz.hots.persistence.common.HasId;
import nl.timonschultz.hots.persistence.icon.IconEntity;
import nl.timonschultz.hots.persistence.talent.TalentEntity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "HEROES")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class HeroEntity extends HasId<Long> {

    private String name;
    private String shortName;
    private String attributeId;

    @ElementCollection
    private List<String> translations;

    @OneToOne
    private IconEntity iconUrl;

    private String role;
    private String type;
    private String releaseDate;

    @OneToMany(mappedBy = "id", cascade={CascadeType.PERSIST})
    private List<AbilityEntity> abilities;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private List<TalentEntity> talents;

}
