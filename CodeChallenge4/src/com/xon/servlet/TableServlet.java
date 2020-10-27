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
      pw.close();
   }

}
