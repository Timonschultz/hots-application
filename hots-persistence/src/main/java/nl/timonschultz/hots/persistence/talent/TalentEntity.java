package nl.timonschultz.hots.persistence.talent;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.timonschultz.hots.persistence.common.HasId;
import nl.timonschultz.hots.persistence.icon.IconEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity(name = "TALENTS")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TalentEntity extends HasId<Long> {

    private String name;
    private String title;
    private String description;
    private String icon;

    @OneToOne
    private IconEntity iconUrl;
    private String ability;
    private int sort;
    private int cooldown;
    private int manaCost;
    private int level;

}
