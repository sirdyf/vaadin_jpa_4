package com.example.vaadin_jpa.DOMAIN;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the дтп database table.
 * 
 */
@Entity
public class Дтп implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private boolean del;

	private String автор;

	private Time время;

    //@Temporal( TemporalType.DATE)
	private java.sql.Date дата;

	private boolean двойной;

	private String комментарий;

	private String место;

	private String номерСертификата;

	private String путьФото;

//	@ManyToOne(mappedBy = "id", fetch = FetchType.LAZY);
//	private set<Районы> район_id;
//	private int район_id;
	
	@ManyToOne//(cascade=CascadeType.PERSIST)
	@JoinColumn(name="район_id")//, referencedColumnName="id")	
    private Районы r;



	public Районы getR() {
		return r;
	}

	public void setR(Районы r) {
		this.r = r;
	}

	private String сомнительность;

	@ManyToOne
	@JoinColumn(name="сотрудники_id")	
//	private int сотрудники_id;
	private Сотрудники s;

	public Сотрудники getS() {
		return s;
	}

	public void setS(Сотрудники s) {
		this.s = s;
	}

	private String холостой;
	
//	@ManyToOne
//	private Районы район;

    public Дтп() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getDel() {
		return this.del;
	}

	public void setDel(boolean del) {
		this.del = del;
	}

	public String getАвтор() {
		return this.автор;
	}

	public void setАвтор(String автор) {
		this.автор = автор;
	}

	public Time getВремя() {
		return this.время;
	}

	public void setВремя(Time время) {
		this.время = время;
	}

	public Date getДата() {
		return this.дата;
	}

	public void setДата(java.sql.Date дата) {
		this.дата = дата;
	}

	public boolean getДвойной() {
		return this.двойной;
	}

	public void setДвойной(boolean двойной) {
		this.двойной = двойной;
	}

	public String getКомментарий() {
		return this.комментарий;
	}

	public void setКомментарий(String комментарий) {
		this.комментарий = комментарий;
	}

	public String getМесто() {
		return this.место;
	}

	public void setМесто(String место) {
		this.место = место;
	}

	public String getНомерСертификата() {
		return this.номерСертификата;
	}

	public void setНомерСертификата(String номерСертификата) {
		this.номерСертификата = номерСертификата;
	}

	public String getПутьФото() {
		return this.путьФото;
	}

	public void setПутьФото(String путьФото) {
		this.путьФото = путьФото;
	}

//	public int getРайон_id() {
//		return this.район_id;
//	}
//
//	public void setРайон_id(int район_id) {
//		this.район_id = район_id;
//	}

	public String getСомнительность() {
		return this.сомнительность;
	}

	public void setСомнительность(String сомнительность) {
		this.сомнительность = сомнительность;
	}

//	public int getСотрудники_id() {
//		return this.сотрудники_id;
//	}
//
//	public void setСотрудники_id(int сотрудники_id) {
//		this.сотрудники_id = сотрудники_id;
//	}

	public String getХолостой() {
		return this.холостой;
	}

	public void setХолостой(String холостой) {
		this.холостой = холостой;
	}

}