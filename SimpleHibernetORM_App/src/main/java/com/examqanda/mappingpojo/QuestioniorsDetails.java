package com.examqanda.mappingpojo;
import java.util.List;

public class QuestioniorsDetails {
	
	private int id;
	private String questDesc;
	private List<String> listOfAns;
	
	public int getId() {
		return id;
	}
	
	public String getQuestDesc() {
		return questDesc;
	}
	
	public List<String> getListOfAns() {
		return listOfAns;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setQuestDesc(String questDesc) {
		this.questDesc = questDesc;
	}
	
	public void setListOfAns(List<String> listOfAns) {
		this.listOfAns = listOfAns;
	}
	
}