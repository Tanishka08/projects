package com.mySpringPlatform.projectOnHibernate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="album")
public class Album 
{
@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="uID")
		private String uID;
		
		@Column(name="image")
		private String image;

		@OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="my_image_id")
		private MyImage myImage;
		
		public Album()
		{
			
		}

		public Album(String uID,String image)
		{
			this.uID =uID;
			this.image = image;
			
		}

		public int getId() {
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

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

	

		public MyImage getMyImage() {
			return myImage;
		}

		public void setMyImage(MyImage myImage) {
			this.myImage = myImage;
		}

		@Override
		public String toString() {
			return "Album [id=" + id + ", uID=" + uID + ", image=" + image + ", myImage=" + myImage + "]";
		}
		
		
}



