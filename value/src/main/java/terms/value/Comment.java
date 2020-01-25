package terms.value;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
public class Comment
{
@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="firstName")
	private String firstName;
	@Column(name="UID")
	private String UID;
	@Column(name="Written")
	private String written;
	@Column(name="date1")
	private LocalDate date1;
	private Post post;
	public Comment(String firstName, String uID, String written, LocalDate date1) {
		super();
		this.firstName = firstName;
		UID = uID;
		this.written = written;
		this.date1 = date1;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getWritten() {
		return written;
	}
	public void setWritten(String written) {
		this.written = written;
	}
	public LocalDate getDate1() {
		return date1;
	}
	public void setDate1(LocalDate date1) 
	{
		this.date1 = date1;
	}
	}