package org.insanedevelopment.valve.steamcontroller.model;

public enum GroupMode {

	FOUR_BUTTONS("four_buttons"),
	DPAD("dpad");

	private final String displayName;

	private GroupMode(String displayName) {
		this.displayName = displayName;
	}
	
	public String getDisplayName() {
		return displayName;
	}

}
