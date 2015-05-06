package com.sds.icto.form.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FormServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String job = request.getParameter("job");
		String gender = request.getParameter("gender");
		String desc = request.getParameter("desc");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<h1>회원가입 완료</h1>");
		out.println("<br>");
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<td colspan='2' align='center'>가입 정보</td>");
		out.println("</tr>");
		out.println("<tr><td>이름</td><td>"+name+"</td></tr>");
		out.println("<tr><td>아이디</td><td>"+id+"</td></tr>");
		out.println("<tr><td>직업</td><td>"+job+"</td></tr>");
		out.println("<tr><td>성별</td><td>"+gender+"</td></tr>");
		out.println("<tr><td>자기소개</td><td>"+desc+"</td></tr>");
		out.println("</table>");
		out.println("<br>");
		out.println("<a href='form_test.jsp'>회원가입하기</a> &nbsp;");
		out.println("<a href='login_form.jsp'>로그인하기</a>");
		out.close();
	}

}
