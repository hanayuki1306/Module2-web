package controller;

import model.Customer;
import model.ListCustomers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowInfoServlet", urlPatterns = "/infoCustomer")
public class ShowInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers= ListCustomers.getList();
        request.setAttribute("customer",customers);
        RequestDispatcher rd= request.getRequestDispatcher("/index.jsp");
        rd.forward(request,response);
    }
}
