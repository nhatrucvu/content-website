package com.website.controller.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.website.controller.BaseServlet;
import com.website.service.UserServices;


@WebServlet("/edit_user")
public class EditUserServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
   
    public EditUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserServices userServices = new UserServices(entityManager, request, response);
		userServices.editUser();
	}
}
