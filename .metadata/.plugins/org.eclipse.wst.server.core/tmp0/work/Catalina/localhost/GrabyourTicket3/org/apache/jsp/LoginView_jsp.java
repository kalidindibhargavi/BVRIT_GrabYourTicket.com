/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.69
 * Generated at: 2016-06-03 14:35:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;


String unm = request.getParameter("user");
String error = request.getParameter("error");
if(unm != null)
{
   out.print("Please check your UserName and Password "+ unm);
}
if(error != null)
{
   out.print("<h3><font color = green>"+ error +"</font></h3>");
}

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>Bootstrap </title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("  <link href=\"http://fonts.googleapis.com/css?family=Lato\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <link href=\"http://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js\"></script>\n");
      out.write("  <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("  <style>\n");
      out.write("  body {\n");
      out.write("  \tbackground-image: url(\"wall1.jpg\");\n");
      out.write("  \tbackground-repeat: no-repeat;\n");
      out.write("  \tbackground-size: 1200px 900px;\n");
      out.write("  \twidth: 800px;\n");
      out.write("    height: 100px;\n");
      out.write("      font: 400 15px/1.8 Lato, sans-serif;\n");
      out.write("      color: #777;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  h3, h4 {\n");
      out.write("      margin: 10px 0 30px 0;\n");
      out.write("      letter-spacing: 10px;      \n");
      out.write("      font-size: 20px;\n");
      out.write("      color: white;\n");
      out.write("  }\n");
      out.write("  .container {\n");
      out.write("      padding: 80px 120px;\n");
      out.write("  }\n");
      out.write("  .person {\n");
      out.write("      border: 10px solid transparent;\n");
      out.write("      margin-bottom: 25px;\n");
      out.write("      width: 80%;\n");
      out.write("      height: 80%;\n");
      out.write("      opacity: 0.7;\n");
      out.write("  }\n");
      out.write("  .person:hover {\n");
      out.write("      border-color: #f1f1f1;\n");
      out.write("  }\n");
      out.write("  .carousel-inner img {\n");
      out.write("      -webkit-filter: grayscale(90%);\n");
      out.write("      filter: grayscale(90%); /* make all photos black and white */ \n");
      out.write("      width: 100%; /* Set width to 100% */\n");
      out.write("      margin: auto;\n");
      out.write("  }\n");
      out.write("  .carousel-caption h3 {\n");
      out.write("      color: #fff !important;\n");
      out.write("  }\n");
      out.write("  @media (max-width: 600px) {\n");
      out.write("    .carousel-caption {\n");
      out.write("      display: none; /* Hide the carousel text when the screen is less than 600 pixels wide */\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("  .bg-1 {\n");
      out.write("      background: #2d2d30;\n");
      out.write("      color: #bdbdbd;\n");
      out.write("  }\n");
      out.write("  .bg-1 h3 {color: #fff;}\n");
      out.write("  .bg-1 p {font-style: italic;}\n");
      out.write("  .list-group-item:first-child {\n");
      out.write("      border-top-right-radius: 0;\n");
      out.write("      border-top-left-radius: 0;\n");
      out.write("  }\n");
      out.write("  .list-group-item:last-child {\n");
      out.write("      border-bottom-right-radius: 0;\n");
      out.write("      border-bottom-left-radius: 0;\n");
      out.write("  }\n");
      out.write("  .thumbnail {\n");
      out.write("      padding: 0 0 15px 0;\n");
      out.write("      border: none;\n");
      out.write("      border-radius: 0;\n");
      out.write("  }\n");
      out.write("  .thumbnail p {\n");
      out.write("      margin-top: 15px;\n");
      out.write("      color: #555;\n");
      out.write("  }\n");
      out.write("  .btn {\n");
      out.write("      padding: 10px 20px;\n");
      out.write("      background-color: #333;\n");
      out.write("      color: #f1f1f1;\n");
      out.write("      border-radius: 0;\n");
      out.write("      transition: .2s;\n");
      out.write("  }\n");
      out.write("  .btn:hover, .btn:focus {\n");
      out.write("      border: 1px solid #333;\n");
      out.write("      background-color: #fff;\n");
      out.write("      color: #000;\n");
      out.write("  }\n");
      out.write("  .modal-header, h4, .close {\n");
      out.write("      background-color: #333;\n");
      out.write("      color: #fff !important;\n");
      out.write("      text-align: center;\n");
      out.write("      font-size: 30px;\n");
      out.write("  }\n");
      out.write("  .modal-header, .modal-body {\n");
      out.write("      padding: 40px 50px;\n");
      out.write("  }\n");
      out.write("  .nav-tabs li a {\n");
      out.write("      color: #777;\n");
      out.write("  }\n");
      out.write("  #googleMap {\n");
      out.write("      width: 100%;\n");
      out.write("      height: 400px;\n");
      out.write("      -webkit-filter: grayscale(100%);\n");
      out.write("      filter: grayscale(100%);\n");
      out.write("  }  \n");
      out.write("  .navbar {\n");
      out.write("      font-family: Montserrat, sans-serif;\n");
      out.write("      margin-bottom: 0;\n");
      out.write("      background-color: #2d2d30;\n");
      out.write("      border: 0;\n");
      out.write("      font-size: 11px !important;\n");
      out.write("      letter-spacing: 4px;\n");
      out.write("      opacity: 0.9;\n");
      out.write("  }\n");
      out.write("  .navbar li a, .navbar .navbar-brand { \n");
      out.write("      color: #d5d5d5 !important;\n");
      out.write("  }\n");
      out.write("  .navbar-nav li a:hover {\n");
      out.write("      color: #fff !important;\n");
      out.write("  }\n");
      out.write("  .navbar-nav li.active a {\n");
      out.write("      color: #fff !important;\n");
      out.write("      background-color: #29292c !important;\n");
      out.write("  }\n");
      out.write("  .navbar-default .navbar-toggle {\n");
      out.write("      border-color: transparent;\n");
      out.write("  }\n");
      out.write("  .open .dropdown-toggle {\n");
      out.write("      color: #fff;\n");
      out.write("      background-color: #555 !important;\n");
      out.write("  }\n");
      out.write("  .dropdown-menu li a {\n");
      out.write("      color: #000 !important;\n");
      out.write("  }\n");
      out.write("  .dropdown-menu li a:hover {\n");
      out.write("      background-color: transparent !important;\n");
      out.write("  }\n");
      out.write("  footer {\n");
      out.write("      background-color: #2d2d30;\n");
      out.write("      color: #f5f5f5;\n");
      out.write("      padding: 32px;\n");
      out.write("  }\n");
      out.write("  footer a {\n");
      out.write("      color: #f5f5f5;\n");
      out.write("  }\n");
      out.write("  footer a:hover {\n");
      out.write("      color: #777;\n");
      out.write("      text-decoration: none;\n");
      out.write("  }  \n");
      out.write("  .form-control {\n");
      out.write("      border-radius: 0;\n");
      out.write("  }\n");
      out.write("  textarea {\n");
      out.write("      resize: none;\n");
      out.write("  }\n");
      out.write("   .modal-header, h4, .close {\n");
      out.write("      background-color: #000000;\n");
      out.write("      color:white !important;\n");
      out.write("      text-align: center;\n");
      out.write("      font-size: 30px;\n");
      out.write("  }\n");
      out.write("  .modal-footer {\n");
      out.write("      background-color: #f9f9f9;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  </style>\n");
      out.write("  </head>\n");
      out.write("<body id=\"myPage\" data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"50\">\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>                        \n");
      out.write("      </button>\n");
      out.write("      <a class=\"navbar-brand\" href=\"#myPage\">Logo</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"welcomeView.jsp\">HOME</a></li>\n");
      out.write("        <li><a href=\"moviesView.jsp\">MOVIES</a></li>\n");
      out.write("        <li><a href=\"trailersView.jsp\">TRAILER & VIDEOS</a></li>\n");
      out.write("        \n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">LANGUAGE<span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"telmoviesView.jsp\">Telugu</a></li>\n");
      out.write("            <li><a href=\"hinmoviesView.jsp\">Hindi</a></li>\n");
      out.write("            <li><a href=\"engmoviesView.jsp\">English</a></li> \n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <li>  <a href=\"#\"><span class=\"glyphicon glyphicon-map-marker\"></span></a></li>\n");
      out.write("      </ul>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write(" <div class=\"container\">\n");
      out.write("   <form class=\"form-signin\" action = \"signUp\">\n");
      out.write("<input type=\"text\" class=\"form-control\" name = \"user\" placeholder=\"User name\" required autofocus>\n");
      out.write("<br>\n");
      out.write("<input type=\"password\" class=\"form-control\" name = \"password\" placeholder=\"Password\" required>\n");
      out.write("<br>\n");
      out.write("<button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">\n");
      out.write("SignUp</button>\n");
      out.write("</form>\n");
      out.write("   <!-- <form role=\"form\">\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"text\"></label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"text\" placeholder=\"pick up ur name\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"pwd\"></label>\n");
      out.write("      <input type=\"password\" class=\"form-control\" id=\"pwd\" placeholder=\"create new password\">\n");
      out.write("    </div>\n");
      out.write("    <button type=\"submit\" class=\"btn btn-default\">Signup</button>\n");
      out.write("  </form> -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write(" <div class=\"container\">\n");
      out.write("  <div><h4>If you already picked up then go for</h4></div> \n");
      out.write("  <a href=\"loginContrller\">\n");
      out.write("          <span class=\"glyphicon glyphicon-log-in\"></span>\n");
      out.write("        </a>\n");
      out.write("   <!-- Trigger the modal with a button -->\n");
      out.write("   <button class=\"btn\" data-toggle=\"modal\" data-target=\"#myModal\">Login</button>\n");
      out.write("\n");
      out.write("  Modal\n");
      out.write("  <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("      Modal content\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\" style=\"padding:35px 50px;\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4><span class=\"glyphicon glyphicon-lock\"></span> Login</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\" style=\"padding:40px 50px;\">\n");
      out.write("        <form class=\"form-signin\" action = \"login\">\n");
      out.write("<label for = \"Friend Name\">User Name:</label><br>\n");
      out.write("<input type=\"text\" name = \"user\" class=\"form-control\" placeholder=\"User name\" required autofocus>\n");
      out.write("<br>\n");
      out.write("<label for = \"Friend Name\">Password:</label><br>\n");
      out.write("<input type=\"password\" name = \"password\" class=\"form-control\" placeholder=\"Password\" required>\n");
      out.write("<br>\n");
      out.write("<button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">\n");
      out.write("Login</button><br>\n");
      out.write("<!-- <a href = \"signup.jsp\">\n");
      out.write("<button type=\"button\" class=\"btn btn-lg btn-primary btn-block\">SignUp</button><br></a>\n");
      out.write("<a href = \"#\">\n");
      out.write("<button type=\"button\" class=\"btn btn-link\">Forgot Password?</button></a>\n");
      out.write(" --></form>\n");
      out.write("          <!-- <form role=\"form\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"usrname\"><span class=\"glyphicon glyphicon-user\"></span> Username</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"usrname\" placeholder=\"Enter email\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"psw\"><span class=\"glyphicon glyphicon-eye-open\"></span> Password</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"psw\" placeholder=\"Enter password\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"checkbox\">\n");
      out.write("              <label><input type=\"checkbox\" value=\"\" checked>Remember me</label>\n");
      out.write("            </div>\n");
      out.write("              <a href=\"welcomeView.jsp\">\n");
      out.write("          <span class=\"glyphicon glyphicon-log-in\"></span>\n");
      out.write("        </a>\n");
      out.write("         </form> -->\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div> \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("    $(\"#myBtn\").click(function(){\n");
      out.write("        $(\"#myModal\").modal();\n");
      out.write("    });\n");
      out.write("});\n");
      out.write(" </script>\n");
      out.write("  </body>\n");
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
