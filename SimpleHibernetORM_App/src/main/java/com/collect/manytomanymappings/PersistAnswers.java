package com.collect.manytomanymappings;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="PersistAnsTbl")
public class PersistAnswers {
	
	@Id
	@GenericGenerator(name="xyz",strategy="increment")
	@GeneratedValue(generator="xyz")
	int id;
	
	String answer;
	
	String pname;
	
	@ManyToMany(mappedBy = "answer")
	List<PersistQuest> question; 
	
	public List<PersistQuest> getQuestion() {
		return question;
	}
	public void setQuestion(List<PersistQuest> question) {
		this.question = question;
	}
	
	public int getId() {
		return id;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public String getPname() {
		return pname;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	

}