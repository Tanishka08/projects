package terms.value;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
@Entity
@Table(name="post")
public class Post
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
private int id;
@Column(name="date")
private LocalDate date;
@Column(name="url")
private String url;
@OneToMany(mappedBy="post",cascade= {CascadeType.PERSIST, CascadeType.MERGE,
		 CascadeType.DETACH, CascadeType.REFRESH})
@JoinColumn(name="comment_id")
private Comment comment;
public Post(LocalDate date, String url) {
	super();
	this.date = date;
	this.url = url;

}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public void setComment(Comment comment2) {
}
}