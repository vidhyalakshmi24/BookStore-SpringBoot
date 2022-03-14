package com.example.book.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="bookdetails")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer bookid;
	 private String bookname;
		private String authorname;
		private Double amount;
		public Integer getBookid() {
			return bookid;
		}
		public void setBookid(Integer bookid) {
			this.bookid = bookid;
		}
		public String getBookname() {
			return bookname;
		}
		public void setBookname(String bookname) {
			this.bookname = bookname;
		}
		public String getAuthorname() {
			return authorname;
		}
		public void setAuthorname(String authorname) {
			this.authorname = authorname;
		}
		public Double getAmount() {
			return amount;
		}
		public void setAmount(Double amount) {
			this.amount = amount;
		}
	

}
