package com.mySpringPlatform.projectOnHibernate;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
public class InstructorDetail1 
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
private int id;
@Column(name="youtube_channel")
private String youtubeChannel;
@Column(name="hobby")
private String hobby;
@OneToOne(mappedBy="instructorDetail", 
cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
							CascadeType.REFRESH})
private Instructor instructor;public InstructorDetail1(String youtubeChannel, String hobby)
{
this.youtubeChannel = youtubeChannel;
this.hobby = hobby;
}
}



