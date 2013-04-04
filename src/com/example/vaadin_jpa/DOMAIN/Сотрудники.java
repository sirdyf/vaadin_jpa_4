package com.example.vaadin_jpa.DOMAIN;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the сотрудники database table.
 * 
 */
@Entity
public class Сотрудники implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private boolean del;

	private String должность;

	private String фио;

    public Сотрудники() {
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

	public String getДолжность() {
		return this.должность;
	}

	public void setДолжность(String должность) {
		this.должность = должность;
	}

	public String getФио() {
		return this.фио;
	}

	public void setФио(String фио) {
		this.фио = фио;
	}

}