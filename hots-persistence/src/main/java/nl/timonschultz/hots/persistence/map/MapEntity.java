package nl.timonschultz.hots.persistence.map;

import lombok.*;
import nl.timonschultz.hots.persistence.common.HasId;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.List;

@Entity(name = "MAPS")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class MapEntity extends HasId<Long> {

    private String name;

    @ElementCollection
    private List<String> translations;

}
