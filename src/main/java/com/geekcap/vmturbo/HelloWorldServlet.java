package com.geekcap.vmturbo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.io.Serializable;

public class HelloWorldServlet extends HttpServlet implements Serializable
{
@Override
  public void service( HttpServletRequest req, HttpServletResponse res ) throws IOException {
    PrintWriter out = res.getWriter();
    out.println( "Hello, World!" );
    out.close();
  }
}
