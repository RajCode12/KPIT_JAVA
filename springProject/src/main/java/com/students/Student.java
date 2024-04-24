package com.students;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//POJO
	@Component
	@Scope("prototype")
	@Entity
	@Table(name="StudentTable")
public class Student {
		@Id
		@Column(name="Id")
		private int id;
		
		@Column(name="Name")
		private String name;
		
		@Column(name="Marks")
		private float marks;
		
		@Column(name="Address") // don't match column name with data type
		private String address;
		
		public Student() {
			super();
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getMarks() {
			return marks;
		}

		public void setMarks(float marks) {
			this.marks = marks;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		
	}