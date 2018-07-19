package nl.timonschultz.hots.core.talent.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import nl.timonschultz.hots.core.icon.model.IconModel;

@Getter
@AllArgsConstructor
public class TalentInputModel {
	
	private String name;
	private String title;
	private String description;
	private String icon;
	private IconModel iconModel;
	private String ability;
	private int sort;
	private int cooldown;
	private int manaCost;
	private int level;
}
