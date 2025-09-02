package murach.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import murach.model.UserForm;

public class FormServlet extends HttpServlet  {

    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html; charset=UTF-8");

        String url = "/index.html";

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }
        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/index.html";    // the "join" page
        }
        else if (action.equals("add")) {                
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String gender      = request.getParameter("gender");
            String dateOfBirth = request.getParameter("dateOfBirth"); // yyyy-MM-dd
            String heardFrom   = request.getParameter("heardFrom");
            boolean wantsUpdates = request.getParameter("wantsUpdates") != null;
            boolean emailOK      = request.getParameter("emailOK") != null;
            String comments    = request.getParameter("comments");
            String contactVia  = request.getParameter("contactVia");

            // store data in User object and save User object in db
            UserForm user = new UserForm(firstName, lastName, email, gender, dateOfBirth, heardFrom, wantsUpdates, emailOK, comments, contactVia);
            
            // set User object in request object and set URL
            request.setAttribute("user", user);
            url = "/thanks.jsp";   // the "thanks" page
        }
        
        // forward request and response objects to specified URL
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }    
    @Override
    protected void doGet(HttpServletRequest request, 
                         HttpServletResponse response) 
                         throws ServletException, IOException {
        doPost(request, response);
    }    
}