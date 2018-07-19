package nl.timonschultz.hots.persistence.abilities;

import lombok.*;
import nl.timonschultz.hots.persistence.common.HasId;

import javax.persistence.Entity;

@Entity(name = "ABILITIES")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class AbilityEntity extends HasId<Long> {

    private String owner;
    private String name;
    private String title;
    private String description;
    private String icon;
    private String hotkey;
    private int cooldown;
    private int manaCost;
    private Boolean trait;

}
