package com.example.vaadin_jpa.DOMAIN;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the ��� database table.
 * 
 */
@Entity
public class ��� implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private boolean del;

	private String �����;

	private Time �����;

    //@Temporal( TemporalType.DATE)
	private java.sql.Date ����;

	private boolean �������;

	private String �����������;

	private String �����;

	private String ����������������;

	private String ��������;

//	@ManyToOne(mappedBy = "id", fetch = FetchType.LAZY);
//	private set<������> �����_id;
//	private int �����_id;
	
	@ManyToOne//(cascade=CascadeType.PERSIST)
	@JoinColumn(name="�����_id")//, referencedColumnName="id")	
    private ������ r;



	public ������ getR() {
		return r;
	}

	public void setR(������ r) {
		this.r = r;
	}

	private String ��������������;

	@ManyToOne
	@JoinColumn(name="����������_id")	
//	private int ����������_id;
	private ���������� s;

	public ���������� getS() {
		return s;
	}

	public void setS(���������� s) {
		this.s = s;
	}

	private String ��������;
	
//	@ManyToOne
//	private ������ �����;

    public ���() {
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

	public Time get�����() {
		return this.�����;
	}

	public void set�����(Time �����) {
		this.����� = �����;
	}

	public Date get����() {
		return this.����;
	}

	public void set����(java.sql.Date ����) {
		this.���� = ����;
	}

	public boolean get�������() {
		return this.�������;
	}

	public void set�������(boolean �������) {
		this.������� = �������;
	}

	public String get�����������() {
		return this.�����������;
	}

	public void set�����������(String �����������) {
		this.����������� = �����������;
	}

	public String get�����() {
		return this.�����;
	}

	public void set�����(String �����) {
		this.����� = �����;
	}

	public String get����������������() {
		return this.����������������;
	}

	public void set����������������(String ����������������) {
		this.���������������� = ����������������;
	}

	public String get��������() {
		return this.��������;
	}

	public void set��������(String ��������) {
		this.�������� = ��������;
	}

//	public int get�����_id() {
//		return this.�����_id;
//	}
//
//	public void set�����_id(int �����_id) {
//		this.�����_id = �����_id;
//	}

	public String get��������������() {
		return this.��������������;
	}

	public void set��������������(String ��������������) {
		this.�������������� = ��������������;
	}

//	public int get����������_id() {
//		return this.����������_id;
//	}
//
//	public void set����������_id(int ����������_id) {
//		this.����������_id = ����������_id;
//	}

	public String get��������() {
		return this.��������;
	}

	public void set��������(String ��������) {
		this.�������� = ��������;
	}

}