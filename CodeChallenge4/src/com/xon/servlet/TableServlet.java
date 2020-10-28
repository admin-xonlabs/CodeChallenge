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
      int r = Integer.parseInt(req.getParameter("rows"));
      int c = Integer.parseInt(req.getParameter("cols"));
      String[][] a = new String[r+1][c+1];
      String u = "";
      
      for(int i = 1; i < r+1; i++)
      {
    	  for(int j = 1; j < c+1; j++)
    	  {
    		  String str = "Row " + i + ", Col " +j;
    		  a[i][j] = str;
    	  }
      }
      pw.print("<table style='border:2px solid black'>");
      
      for(int i = 1; i < r+1; i++)
      {
    	  u = get_color(u);
    	  pw.print("<tr style='background-color:" + u + "'>");
    	  for(int j = 1; j < c+1; j++)
    	  {
    		  pw.print("<td style='border:1px solid black'>" + a[i][j] +"</td>");
    	  }
    	  pw.print("</tr>");
      }
      pw.print("</table>");
      pw.close();
   }
   public static String get_color(String c)
   {
	   if(c == "silver")
	   {
		   return "yellow";
	   }
	   else
	   {
		   return "silver";
	   }
   }

}
