/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.69
 * Generated at: 2016-06-05 03:16:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AllMoviesView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("  <div class=\"text-center\">\n");
      out.write("   \n");
      out.write("  </div>\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("          <div class=\"item active\">\n");
      out.write("        <img src=\"c1.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Sultan</h5>\n");
      out.write("          <a href = \"theatersView.jsp\">\n");
      out.write("              <button type=\"submit\" class=\"btn btn-block\">Book Now</button>\n");
      out.write("              </a>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </div>      \n");
      out.write("    </div>     \n");
      out.write("    <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("          <div class=\"panel-body\">\n");
      out.write("          <div class=\"item active\">\n");
      out.write("        <img src=\"c7.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("           <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button>\n");
      out.write("        </div>\n");
      out.write("      </div>      \n");
      out.write("    </div>       \n");
      out.write("    <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"c8.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write(" <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"c4.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write(" <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"c5.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write(" <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"c6.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write(" <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"c2.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write(" <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"c3.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write(" <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"c9.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write(" <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"c10.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write(" <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"c11.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write(" <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"c12.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("  <div class=\"text-center\">\n");
      out.write("   \n");
      out.write("  </div>\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("          <div class=\"item active\">\n");
      out.write("        <img src=\"a1.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>X-MenApocoly</h5>\n");
      out.write("          <a href = \"theatersView.jsp\">\n");
      out.write("              <button type=\"submit\" class=\"btn btn-block\">Book\n");
      out.write("                <span class=\"glyphicon glyphicon-ok\"></span>\n");
      out.write("              </button></a>\n");
      out.write("          <!-- <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button> -->\n");
      out.write("        </div>\n");
      out.write("      </div>      \n");
      out.write("    </div>     \n");
      out.write("    <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("          <div class=\"panel-body\">\n");
      out.write("          <div class=\"item active\">\n");
      out.write("        <img src=\"a2.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("           <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button>\n");
      out.write("        </div>\n");
      out.write("      </div>      \n");
      out.write("    </div>       \n");
      out.write("    <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"a3.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write(" <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"a4.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write(" <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"a5.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write(" <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"a6.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write(" <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"a7.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write(" <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"a8.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write(" <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"a9.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write(" <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"a10.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write(" <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"a11.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write(" <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"a12.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <a href = \"theatersView.jsp\"><button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div></a>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("  <div class=\"text-center\">\n");
      out.write("   \n");
      out.write("  </div>\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("<!--         <div class=\"panel-heading\">\n");
      out.write("\n");
      out.write("        </div> -->\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("          <div class=\"item active\">\n");
      out.write("        <img src=\"b1.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>X-MenApocoly</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button>\n");
      out.write("        </div>\n");
      out.write("      </div>      \n");
      out.write("    </div>     \n");
      out.write("    <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("          <div class=\"panel-body\">\n");
      out.write("          <div class=\"item active\">\n");
      out.write("        <img src=\"b2.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("           <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button>\n");
      out.write("        </div>\n");
      out.write("      </div>      \n");
      out.write("    </div>       \n");
      out.write("    <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"b3.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"b4.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"b5.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("<div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"b6.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("<div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"b7.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("<div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"b8.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("<div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"b9.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("<div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"b10.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("<div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"b11.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("<div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         <div class=\"item active\">\n");
      out.write("        <img src=\"b12.jpg\" alt=\"Image\" class = \"Img-responsive\" width = \"250px\"  height = \"300px\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h5>Movie Name</h5>\n");
      out.write("          <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">BOOK NOW</button></div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "themeView.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
