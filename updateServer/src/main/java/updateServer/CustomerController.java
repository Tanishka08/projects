package updateServer;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerController extends HttpServlet {
private static final long serialVersionUID = 1L;
private CustomerService service;
private CustomerDtoImpl impl;
public CustomerController()
{
        super();
      
    }
@Override
public void init() throws ServletException {

	super.init();
	service = new CustomerServiceImpl();
	impl = new CustomerMapper();
}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doProcess(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doProcess(request, response);
		}
protected void doProcess(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
String fName = request.getParameter("fName");
			String lName = request.getParameter("lName");
			String email = request.getParameter("email");
			CustomerDto cDto = new CustomerDto(UUID.randomUUID().toString(), fName, lName, email);
			Customer customer = service.createCustomer(impl.customerDtoToCustomer(cDto));
			if (customer != null) {
							
				RequestDispatcher view = request.getRequestDispatcher("homecontroller.do");
				view.forward(request, response);
			} else {
				RequestDispatcher view = request.getRequestDispatcher("error.html");
				view.forward(request, response);
			}
		}
}
