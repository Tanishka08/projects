package com.mySpringPlatform.projectOnHibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="instructor1")
public class Instructor1
{
	
		@Id
				@GeneratedValue(strategy=GenerationType.IDENTITY)
				@Column(name="id")
				private int id;
				
				@Column(name="first_name")
				private String firstName;
				
				@Column(name="last_name")
				private String lastName;

				@Column(name="email")
				private String email;
				
				@OneToMany(mappedBy="instructor",
						   cascade= {CascadeType.PERSIST, CascadeType.MERGE,
									 CascadeType.DETACH, CascadeType.REFRESH})
				@JoinColumn(name="instructor_detail_id")
				private InstructorDetail instructorDetail;
				private List<Course> courses;

				public Instructor1(String firstName, String lastName, String email)
				{
					this.firstName = firstName;
					this.lastName = lastName;
					this.email = email;
				}

				
				

			public void add(Course tempCourse)
{
				
				if (courses == null) {
					courses = new ArrayList<>();
				}
				
				courses.add(tempCourse);
				
				tempCourse.setInstructor1(this);
			}
			
		}
