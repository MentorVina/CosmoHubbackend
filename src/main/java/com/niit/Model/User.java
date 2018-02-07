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
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		private String email;
		private String fname;
		private String lname;
		private String dob;
		private String contact;
		private String Addr;
		private String pass;
		private String role;
	    private boolean enabled;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public String getAddr() {
			return Addr;
		}
		public void setAddr(String addr) {
			Addr = addr;
		}
		public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public boolean isEnabled() {
			return enabled;
		}
		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		 
		
		 
		

}
