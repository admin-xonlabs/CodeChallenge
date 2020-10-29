package com.xon.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TableServlet extends HttpServlet
{

   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
   {            
      resp.setContentType("text/html");
      PrintWriter pw = resp.getWriter();
      pw.print("DYNAMIC TABLE MUST BE GENERATED HERE");
PrintWriter pw = resp.getWriter();
      String r=req.getParameter("r");
		int row=Integer.valueOf(r);
		String c=req.getParameter("c");
		int col=Integer.valueOf(c);
		pw.print("<style> table#t tr:nth-child(odd) { background-color: lightgray; } </style>");
		pw.print("<style> table#t tr:nth-child(even) { background-color: yellow; } </style>");
		pw.print("<table id='t' border='1px'>");
		for(int i=1;i<=row;i++)
		{
			pw.print("<tr>");
			for(int j=1; j<=col;j++)
			{
				pw.print("<td>Row "+i+", Col "+j+"</td>");
			}
		    pw.print("</tr>");
		}
	  pw.print("</table>");
      pw.close();
   }

}
