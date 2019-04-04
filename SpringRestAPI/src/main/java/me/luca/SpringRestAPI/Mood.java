package me.luca.SpringRestAPI;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mood")
public class Mood {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private String header;
	private String body;
	private int numRank;
	private int id;

	public Mood() {
	}
	
	public Mood(String header, String body, int id) {
		this.setBody(body);
		this.setHeader(header);
		this.setId(id);
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHeader() {
		return this.header;
	}
	public String getBody() {
		return this.body;
	}
	public int getId() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return "Mood{" +
			"id =" + id + 
			", title= '" + header + '\'' +
			", body='" + body + '\'' +
			'}';
	}
}

