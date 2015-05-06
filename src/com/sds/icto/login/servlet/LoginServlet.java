package com.sds.icto.login.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doPost(request, response);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		if(id.equals(pw)) {
			out.println("<h1>"+id+"님 로그인 되었습니다.</h1>");
		}else{
			out.println("<h1>아이디와 비밀번호를 확인해주세요.</h1>");
			out.println("<a href='login_form.jsp'>로그인하기</a>");
		}
		out.close();
	}

}
