package com.niit.Model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity

public class User implements Serializable {
	 /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE)
		private int id;
		private String email;
		private String fname;
		private String lname;
		private String dob;
		private String contact;
		private String addr;
		private String pass;
		private String role;
	    private boolean enabled;
		public int getId() {
			return id;
		}
		public String getEmail() {
			return email;
		}
		public String getFname() {
			return fname;
		}
		public String getLname() {
			return lname;
		}
		public String getDob() {
			return dob;
		}
		public String getContact() {
			return contact;
		}
		public String getAddr() {
			return addr;
		}
		
		public String getPass() {
			return pass;
		}
		public String getRole() {
			return role;
		}
		public boolean isEnabled() {
			return enabled;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public void setAddr(String addr) {
			this.addr = addr;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}
	 
		

}
