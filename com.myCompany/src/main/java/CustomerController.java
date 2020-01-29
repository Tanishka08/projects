

import java.io.IOException;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myCompany.Customer;
import com.myCompany.CustomerDto;
import com.myCompany.CustomerDtoImpl;
import com.myCompany.CustomerMapper;
import com.myCompany.CustomerService;
import com.myCompany.CustomerServiceImpl;


public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerService service;
	private CustomerDtoImpl impl;

	@Override
	public void init() throws ServletException {

		super.init();
		service = new CustomerServiceImpl();
		impl = new CustomerMapper();
	}
    public CustomerController() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		String fName = request.getParameter("fName");
		String lName = request.getParameter("lName");
		String email = request.getParameter("email");
		//CustomerDto cDto = new CustomerDto(fName, lName, email);
		///* Customer customer = */service.createCustomer(impl.customerDtoToCustomer(cDto));
		service.createCustomer(new Customer(fName, lName, email));
		service.getAllCustomer();
		//if (customer != null) {
			Customer c=(Customer)request.getAttribute("customers");
			RequestDispatcher view = request.getRequestDispatcher("CustomerList.jsp");
			view.forward(request, response);
		//} 
			/*
			 * else { RequestDispatcher view = request.getRequestDispatcher("error.html");
			 * view.forward(request, response); }
			 */
	}
}

