package com.example.vaadin_jpa.DOMAIN;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ������ database table.
 * 
 */
@Entity
public class ������ implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private boolean del;

	private String �����;

    public ������() {
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

	public String get�����() {
		return this.�����;
	}

	public void set�����(String �����) {
		this.����� = �����;
	}
//	@Override
//	public String toString(){
//		return this.�����;
//	}
}