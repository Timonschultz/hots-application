package nl.timonschultz.hots.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.List;

@Getter
@AllArgsConstructor
public class HeroInputModel {
	
	private String name;
	private String shortName;
	private String attributeId;
	private List<String> translations;
	private IconUrl iconUrl;
	private String role;
	private String type;
	private String releaseDate;
	private List<AbilityInputModel> abilities;
	private List<TalentInputModel> talents;

}
