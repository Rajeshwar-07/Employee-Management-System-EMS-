package com.hrms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {

		@Id
		Long id;
		
		String name;
		
		
		@OneToOne
		Address address;
		
		String email;
		
		Long contact;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Long getContact() {
			return contact;
		}

		public void setContact(Long contact) {
			this.contact = contact;
		}

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Employee(Long id, String name, Address address, String email, Long contact) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.email = email;
			this.contact = contact;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", contact="
					+ contact + "]";
		}
		
		
		
}
