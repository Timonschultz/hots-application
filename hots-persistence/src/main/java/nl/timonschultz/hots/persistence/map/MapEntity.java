package nl.timonschultz.hots.persistence.map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.timonschultz.hots.persistence.common.HasId;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.List;

@Entity(name = "MAPS")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MapEntity extends HasId<Long> {

    private String name;

    @ElementCollection
    private List<String> translations;

}
