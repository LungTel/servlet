package yoteihyo;

import java.sql.Timestamp;

public class YoteihyoVo {

	Integer id = null;

	String name1 = "";

	String textarea1 = "";

	String textarea2 = "";

	Timestamp date = new Timestamp(System.currentTimeMillis());

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getTextarea1() {
		return textarea1;
	}

	public void setTextarea1(String textarea1) {
		this.textarea1 = textarea1;
	}

	public String getTextarea2() {
		return textarea2;
	}

	public void setTextarea2(String textarea2) {
		this.textarea2 = textarea2;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

}
