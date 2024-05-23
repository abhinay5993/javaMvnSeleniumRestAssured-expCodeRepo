package com.udemy.dsapart1.hashmaps;
import java.util.HashMap;
import java.util.Objects;

public class CustomHashMapEntity {
	
	private int capacityValue;
	private float loadFactor;
	private long thresholdValue;
	private HashMap mapData;

	public CustomHashMapEntity() {
	this.capacityValue = 16;
	this.loadFactor = 0.75f;
	this.mapData=new HashMap<>(capacityValue,loadFactor);
	this.thresholdValue=(long)(capacityValue*loadFactor);
	}
	
	public CustomHashMapEntity(int capacityValue,float loadFactor) {
	this.capacityValue = capacityValue;
	this.loadFactor = loadFactor*1.0f;
	this.mapData=new HashMap<>(capacityValue,loadFactor);
	this.thresholdValue=(long)(capacityValue*loadFactor);
	}

	/**
	 * @return the capacityValue
	 */
	public int getCapacityValue() {
	long actLoadFactValue = (long) (capacityValue * loadFactor);
	System.out.println("\nCurrent Load Factor Computed Bucket Size : " + actLoadFactValue);
	if (this.capacityValue >= actLoadFactValue) {
		return capacityValue * 2;
	}
	return capacityValue;
	}

	/**
	 * @return the loadFactor
	 */
	public float getLoadFactor() {
		return loadFactor;
	}

	/**
	 * @return the thresholdValue
	 */
	public long getThresholdValue() {
		return thresholdValue;
	}

	/**
	 * @param capacityValue the capacityValue to set
	 */
	public void setCapacityValue(int capacityValue) {
		this.capacityValue = capacityValue;
	}

	/**
	 * @param loadFactor the loadFactor to set
	 */
	public void setLoadFactor(float loadFactor) {
		this.loadFactor = loadFactor;
	}

	/**
	 * @return the mapData
	 */
	public HashMap getMapData() {
		return mapData;
	}

	
	/**
	 * @param mapData the mapData to set
	 */
	public void setMapData(HashMap mapData) {
		this.mapData.putAll(mapData);
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(capacityValue, loadFactor, mapData, thresholdValue);
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CustomHashMapEntity)) {
			return false;
		}
		CustomHashMapEntity other = (CustomHashMapEntity) obj;
		return capacityValue == other.capacityValue
				&& Float.floatToIntBits(loadFactor) == Float.floatToIntBits(other.loadFactor)
				&& Objects.equals(mapData, other.mapData) && thresholdValue == other.thresholdValue;
	}

	
	@Override
	public String toString() {
		return "CustomHashMapEntity [capacityValue=" + capacityValue + ", loadFactor=" + loadFactor
				+ ", thresholdValue=" + thresholdValue + ", mapData=" + mapData + "]";
	}


}