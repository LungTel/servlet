package yoteihyo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class PresentVo {

	/*
	 * id
	 */
	Integer id = null;

	/*
	 * CxgÌidNo
	 */
	Integer idNo = null;

	/*
	 * o^Ò¼
	*/
	String name1 = "";

	/*
	 * oÈúXg
	*/
	List<String> PresentDay = new ArrayList<String>();

	/*
	 * oÈÌÂÛ
	*/
	List<String> PresentProAndCon = new ArrayList<String>();

	/*
	 * o^Nú
	*/
	Timestamp date = new Timestamp(System.currentTimeMillis());

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdNo() {
		return idNo;
	}

	public void setIdNo(Integer idNo) {
		this.idNo = idNo;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public List<String> getPresentDay() {
		return PresentDay;
	}

	public void setPresentDay(List<String> presentDay) {
		PresentDay = presentDay;
	}

	public List<String> getPresentProAndCon() {
		return PresentProAndCon;
	}

	public void setPresentProAndCon(List<String> presentProAndCon) {
		PresentProAndCon = presentProAndCon;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

}
