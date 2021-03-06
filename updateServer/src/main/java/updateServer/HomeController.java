package updateServer;
import java.util.List;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerService service;
    public HomeController() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	doProcess(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}


protected void doProcess(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException
{
	
	service=new CustomerServiceImpl();
	List<Customer> customers=null;
		customers = service.getAllCustomer();
		request.setAttribute("customers", customers);
		RequestDispatcher view = request.getRequestDispatcher("list-customers.jsp");
		view.forward(request, response);
	
	}
}

