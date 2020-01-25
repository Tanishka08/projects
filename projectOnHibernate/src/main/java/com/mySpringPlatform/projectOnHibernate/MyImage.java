package com.mySpringPlatform.projectOnHibernate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="my_image")
public class MyImage 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

@Column(name="uID")
private String uID;
/*@OneToOne(mappedBy = "myImage",cascade = CascadeType.ALL)*/
private Album Album;

public MyImage(String uID, com.mySpringPlatform.projectOnHibernate.Album album) {
	super();
	this.uID = uID;
	Album = album;
}
public int getId()
{
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getuID() {
	return uID;
}
public void setuID(String uID) {
	this.uID = uID;
}
public Album getAlbum() {
	return Album;
}
public void setAlbum(Album album) {
	Album = album;
}
@Override
public String toString() {
	return "MyImage [id=" + id + ", uID=" + uID + ", Album=" + Album + "]";
}
 

 }