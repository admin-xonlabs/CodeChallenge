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
      int row = Integer.parseInt(req.getParameter("row"));
      int col = Integer.parseInt(req.getParameter("col"));
      try
      {
    	  if(row>0 && col>0) 
          {
        	  String[][] x = new String[row+1][col+1];
              String y = "";
              for(int i = 1; i < row+1; i++)
              {
            	  for(int j = 1; j < col+1; j++)
            	  {
            		  String str = "Row " + i + ", Col " +j;
            		  x[i][j] = str;
            	  }
              }
              pw.print("<table style='border:2px solid black'>");
              for(int i = 1; i < row+1; i++)
              {
            	  if(i%2==0)
            	  {
            		  y="yellow";
            	  }
            	  else
            	  {
            		  y="silver";
            	  }
            	  pw.print("<tr style='background-color:" + y + "'>");
            	  for(int j = 1; j < col+1; j++)
            	  {
            		  pw.print("<td style='border:1px solid black'>" + x[i][j] +"</td>");
            	  }
            	  pw.print("</tr>");
              }
              pw.print("</table>");
          }
          else if(row<=0 || col<=0) 
          {
              pw.print("Size of table is Inavlid !! Row value = "+row+" Column value = "+col);  
          }
    	  
      }
      catch(Exception e)
      {
    	  pw.print("Something went wrong!! ");
      }
      pw.close();
   }
}
