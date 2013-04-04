package com.example.vaadin_jpa.DOMAIN;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the נאימםû database table.
 * 
 */
@Entity
public class ׀אימםû implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private boolean del;

	private String נאימם;

    public ׀אימםû() {
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

	public String get׀אימם() {
		return this.נאימם;
	}

	public void set׀אימם(String נאימם) {
		this.נאימם = נאימם;
	}
//	@Override
//	public String toString(){
//		return this.נאימם;
//	}
}