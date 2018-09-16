package ls.hibernate.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Table(name="student")
@Entity
public class Student {
		@Id
		@Column(name="id")
		private int id;
		@Column(name="sid")
		private int sid;
		@Column(name="firstname")
		private String firstname;
		@Column(name="lastname")
		private String lastname;
		@Column(name="gender")
		private String gender;
		@Column(name="phone")
		private String phone;
		@Column(name="email")
		private String email;
		@Column(name="dateofbirth")
		private Date dateOfBirth;
		
		public Student () {
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getSid() {
			return sid;
		}

		public void setSid(int sid) {
			this.sid = sid;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Date getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", sid=" + sid + ", firstname=" + firstname + ", lastname=" + lastname
					+ ", gender=" + gender + ", phone=" + phone + ", email=" + email + ", dateOfBirth=" + dateOfBirth
					+ "]";
		}
		
		
		
}


