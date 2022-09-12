package com.libms.bean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="usersBooks_details")
@DynamicUpdate
public class BookDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="book_id")
	private int bookId;
	
	@Column(name="book_Name")
	private String bookName;
	
	@Column(name="book_AuthorName")
	private String authName;
	
	@Column(name="book_Price")
	private double priceValue;

	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public String getAuthName() {
		return authName;
	}

	public double getPriceValue() {
		return priceValue;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}

	public void setPriceValue(double priceValue) {
		this.priceValue = priceValue;
	}
	

}
