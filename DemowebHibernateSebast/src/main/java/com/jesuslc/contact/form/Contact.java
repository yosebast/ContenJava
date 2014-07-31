package com.jesuslc.contact.form;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="contacts")
public class Contact implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	    @Column(name="id")
	    @GeneratedValue
	    private Integer id;   
	
		@Column(name="firstname")
	    private String firstname;
	 
	    @Column(name="lastname")
	    private String lastname;  
	     
	    @Column(name="telephone")
	    private String telephone;
	    
	    @Column(name="email")
	    private String email;
	     
	    @Column(name="created")
	    private Timestamp created;
	     
	    public String getEmail() {
	        return email;
	    }
	    public String getTelephone() {
	        return telephone;
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    public void setTelephone(String telephone) {
	        this.telephone = telephone;
	    }
	    public String getFirstname() {
	        return firstname;
	    }
	    public String getLastname() {
	        return lastname;
	    }
	    public void setFirstname(String firstname) {
	        this.firstname = firstname;
	    }
	    public void setLastname(String lastname) {
	        this.lastname = lastname;
	    }
	    public Integer getId() {
	        return id;
	    }
	    public void setId(Integer id) {
	        this.id = id;
	    }
	    
	    public Timestamp getCreated() {
			return created;
		}
		public void setCreated(Timestamp created) {
			this.created = created;
		}

}
