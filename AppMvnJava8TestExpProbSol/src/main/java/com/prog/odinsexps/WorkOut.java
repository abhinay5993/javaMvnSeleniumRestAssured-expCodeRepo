package com.prog.odinsexps;

public class WorkOut {

	private String type;
	private String equipment;
	private String reason;
	private int weights;
	private int repetitions;
	
	public WorkOut(String type, String equipment, String reason, int weights, int repetitions) {
		super();
		this.type = type;
		this.equipment = equipment;
		this.reason = reason;
		this.weights = weights;
		this.repetitions = repetitions;
	}

	public String getType() {
		return type;
	}

	public String getEquipment() {
		return equipment;
	}

	public String getReason() {
		return reason;
	}

	public int getWeights() {
		return weights;
	}

	public int getRepetitions() {
		return repetitions;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public void setWeights(int weights) {
		this.weights = weights;
	}

	public void setRepetitions(int repetitions) {
		this.repetitions = repetitions;
	}

	@Override
	public String toString() {
		return "WorkOut [type=" + type + ", equipment=" + equipment + ", reason=" + reason + ", weights=" + weights
				+ ", repetitions=" + repetitions + "]";
	}

}