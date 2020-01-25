package terms.value;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.time.LocalDate;
public class App 
{
    public static void main( String[] args )
    {
		try {
			
			SessionFactory factory=new Configuration()
					.configure().addAnnotatedClass(Post.class)
					.addAnnotatedClass(Comment.class).buildSessionFactory();
			Session session=factory.openSession();
			Post post=new Post(LocalDate.now(),"http.Doe");
			post.setComment(new Comment("Priya","100","Beautiful Picture!",LocalDate.now()));
			session.getTransaction().begin();
			session.save(post);
			session.getTransaction().commit();
			} 
		catch (Exception e) 
		{
e.printStackTrace();
}
}
}


