package com.collect.manytomanymappings;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="PersistQuestTbl")
public class PersistQuest {
	
	@Id
	@GenericGenerator(name="xyz",strategy="increment")
	@GeneratedValue(generator="xyz")
	int id;
	
	String qname;
	
	@ManyToMany(targetEntity=PersistAnswers.class,cascade = {CascadeType.ALL})
	@JoinTable(name="QuestAnsJoined", joinColumns =  {@JoinColumn(name="qid")},
	inverseJoinColumns = {@JoinColumn(name="aid")})	
	List<PersistAnswers> answer;

	public int getId() {
		return id;
	}

	public String getQname() {
		return qname;
	}

	public List<PersistAnswers> getAnswer() {
		return answer;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public void setAnswer(List<PersistAnswers> answer) {
		this.answer = answer;
	}
	
	
}