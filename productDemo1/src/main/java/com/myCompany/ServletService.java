package com.myCompany;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ServletService extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Product1> listProduct = null;

	@Override
	public void init() throws ServletException {
		listProduct = new ArrayList<Product1>();
		super.init();
	}

	protected void doGet1(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		processRequest(request, response);
	}

	protected void doPost1(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		listProduct.add(new Product1(UUID.randomUUID().toString(), "Women's Cricket", "2020", "Spring"));
		listProduct.add(new Product1(UUID.randomUUID().toString(), "Base Ball", "2021", "Winter"));
		listProduct.add(new Product1(UUID.randomUUID().toString(), "Swimming", "2020", "Autumn"));
		listProduct.add(new Product1(UUID.randomUUID().toString(), "Beach Volley", "2020", "Summer"));
		listProduct.add(new Product1(UUID.randomUUID().toString(), "Rugby", "2020", "Summer"));
		out.println("<html><head><title>list league</title></head><body>");
		out.println("<table border='1'><tr><td>League ID</td><td>League Name</td><td>League Season</td><td>League Year</td></tr>");
		
		listProduct.forEach(league->{
			out.println("<tr><td>"+league.getProductId()+"</td><td>"+league.getProductName()
			+"</td><td>"+league.getProductSeason()+"</td><td>"+league.getProductYear()+"</td></tr>");
		});
		
		out.println("</table><body></html>");
		
		
	}


       
    
    public ServletService() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet1(request, response);
	}

}
