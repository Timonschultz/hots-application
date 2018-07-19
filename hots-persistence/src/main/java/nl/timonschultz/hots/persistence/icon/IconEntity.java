package nl.timonschultz.hots.persistence.icon;

import lombok.*;
import nl.timonschultz.hots.persistence.common.HasId;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity(name = "ICONS")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class IconEntity extends HasId<Long> {

    @ElementCollection
    @MapKeyColumn(name = "measure")
    @Column(name = "url")
    @CollectionTable(name = "icon_url", joinColumns = @JoinColumn(name = "id"))
    Map<String, String> icon = new HashMap<>();

}
