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
      int m=Integer.parseInt(req.getParameter("row"));
      int n=Integer.parseInt(req.getParameter("column"));
      String [][] a=new String[m+1][n+1];
      String b="#F6F6F6";
      if(m>0 && n>0) {
    	for(int i=1;i<m+1;i++) {
    		for(int j=1;j<n+1;j++) {
    			String str="Row:"+i+",Coln:"+j;
    			a[i][j]=str;
    		}
    	}
    	pw.print("<table style='border:2px solid black'>");
    	for(int i=1;i<m+1;i++) {
    		if(b=="#F6F6F6") {
    			b="#ded9d9";
    		}
    		else {
    			b="#F6F6F6";
    		}
    		pw.print("<tr style='background-color:"+b+"'>");
    		for(int j=1;j<n+1;j++) {
    			pw.print("<td style='border:2px solid black'>"+a[i][j]+"</td>");
    		}
    		pw.print("</tr>");
    	}
    	pw.print("</table>");
      }
      else {
    	pw.print("Enter a valid row and column value");
      }
      pw.close();
   }
}   