package com.rookie.prop;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PropServlet
 */
@WebServlet("/PropServlet")
public class PropServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PropServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		 //1,读取属性文件,door->属性文件的名字
	      ResourceBundle read =
	         ResourceBundle.getBundle("door");
	     
	      //2,读取数据,根据key获取值
	      String door = read.getString("doorname");
	      String tel = read.getString("tel");
	     
	     
	      //3,打印数据System.out.println("111");
	      System.out.println(door);
	      request.setAttribute("tel", tel);
	      request.setAttribute("doorname",door);
	      //页面跳转eltest.jsp
	      request.getRequestDispatcher("/eltest.jsp")
	            .forward(request, response);
	   
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
