

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myCompany.Customer;
import com.myCompany.CustomerService;
import com.myCompany.CustomerServiceImpl;


public class AnotherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    private CustomerService service;
    
	@Override
	public void init() throws ServletException
	{
	
		super.init();
		service=new CustomerServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
			List<Customer> customers = service.getAllCustomer();
			request.setAttribute("customers", customers);
			RequestDispatcher view = request.getRequestDispatcher("CustomerList.jsp");
			
			view.forward(request, response);
		
		}
	}

