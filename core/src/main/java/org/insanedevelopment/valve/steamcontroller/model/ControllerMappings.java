package org.insanedevelopment.valve.steamcontroller.model;

import java.util.List;


public class ControllerMappings {

	private static final String VDF_ID = "controller_mappings";
	
	private Integer version;
	private String title;
	private String description;
	private String creator; // long numeric steamId64, starts with: 7656119
	
	private List<ControllerGroups> groups;
	
	private List<ControllerPreset> preset; // if no preset exists the root will contain all attributes of preset.. WTF ?!?!?
	
	
}
