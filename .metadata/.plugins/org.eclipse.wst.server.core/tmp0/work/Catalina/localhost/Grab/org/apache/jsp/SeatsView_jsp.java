/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.69
 * Generated at: 2016-06-05 07:38:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SeatsView_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head runat=\"server\">\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"canonical\" href=\"http://techbrij.com/780/seat-reservation-with-jquery\">\n");
      out.write(" <script src=\"http://code.jquery.com/jquery-1.4.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("  <link href=\"http://fonts.googleapis.com/css?family=Lato\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <link href=\"http://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js\"></script>\n");
      out.write("  <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write(" \n");
      out.write("   <style type=\"text/css\"> \n");
      out.write("   body {\n");
      out.write("      font: 400 15px/1.8 Lato, sans-serif;\n");
      out.write("      background-color: black;\n");
      out.write("      color: #777;\n");
      out.write("  }\n");
      out.write("  h3, h4 {\n");
      out.write("      margin: 10px 0 30px 0;\n");
      out.write("      letter-spacing: 10px;      \n");
      out.write("      font-size: 20px;\n");
      out.write("      color: #111;\n");
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
      out.write("      filter: grayscale(80%); /* make all photos black and white */ \n");
      out.write("      width: 100%; /* Set width to 100% */\n");
      out.write("      margin: auto;\n");
      out.write("  }\n");
      out.write("  .carousel-caption h3 {\n");
      out.write("      color: #fff !important;\n");
      out.write("  }\n");
      out.write("  @media (max-width: 500px) {\n");
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
      out.write("/*   #googleMap {\n");
      out.write("      width: 100%;\n");
      out.write("      height: 400px;\n");
      out.write("      -webkit-filter: grayscale(100%);\n");
      out.write("      filter: grayscale(100%);\n");
      out.write("  }  \n");
      out.write(" */  .navbar {\n");
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
      out.write("  /* #holder{\t\n");
      out.write("height:200px;\t \n");
      out.write("width:550px;\n");
      out.write("background-color:#F5F5F5;\n");
      out.write("border:1px solid #A4A4A4;\n");
      out.write("margin-left:10px;\t\n");
      out.write("} */\n");
      out.write("#place {\n");
      out.write("position:relative;\n");
      out.write("margin:20px;\n");
      out.write("}\n");
      out.write("     #place a{\n");
      out.write("font-size:0.6em;\n");
      out.write("}\n");
      out.write("     #place li\n");
      out.write("     {\n");
      out.write("         list-style: none outside none;\n");
      out.write("         position: absolute;   \n");
      out.write("     }    \n");
      out.write("     #place li:hover\n");
      out.write("     {\n");
      out.write("        background-color:grey;      \n");
      out.write("     } \n");
      out.write("#place .seat{\n");
      out.write("background:url(\"http://www.pacsindia.co.in/images/available_seat_img.gif\") no-repeat scroll 0 0 transparent;\n");
      out.write("height:40px;\n");
      out.write("width:50px;\n");
      out.write("display:block;\t \n");
      out.write("}\n");
      out.write("      #place .selectedSeat\n");
      out.write("      { \n");
      out.write("background-image:url(\"http://www.pacsindia.co.in/images/booked_seat_img.gif\");      \t \n");
      out.write("      }\n");
      out.write("  #place .selectingSeat\n");
      out.write("      { \n");
      out.write("background-image:url(\"http://www.pacsindia.co.in/images/selected_seat_img.gif\");      \t \n");
      out.write("      }\n");
      out.write(" #place .row-3, #place .row-4{\n");
      out.write("margin-top:10px;\n");
      out.write(" }\n");
      out.write("#seatDescription{\n");
      out.write("}\n");
      out.write(" #seatDescription li{\n");
      out.write(" verticle-align:bottom;\t \n");
      out.write(" list-style: none outside none;\n");
      out.write(" padding-left:55px;\n");
      out.write(" height:85px;\n");
      out.write(" float:bottom;\n");
      out.write(" }\n");
      out.write(" </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write(" <body id=\"myPage\" data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"50\">\n");
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("<!-- Google Analytics for WordPress | http://yoast.com/wordpress/google-analytics/ -->\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("window.google_analytics_uacct = \"UA-12650627-1\";\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\">//<![CDATA[\n");
      out.write("// Google Analytics for WordPress by Yoast v4.0.10 | http://yoast.com/wordpress/google-analytics/\n");
      out.write("var _gaq = _gaq || [];\n");
      out.write("_gaq.push(['_setAccount','UA-12650627-1']);\n");
      out.write("_gaq.push(['_setDomainName','.techbrij.com'],['_setAllowHash',false],['_trackPageview']);\n");
      out.write("(function() {\n");
      out.write("var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\n");
      out.write("ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\n");
      out.write("var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\n");
      out.write("})();\n");
      out.write("//]]></script>\n");
      out.write("<!-- End of Google Analytics code -->\n");
      out.write("\n");
      out.write("    <form id=\"form1\" runat=\"server\">\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("src=\"http://pagead2.googlesyndication.com/pagead/show_ads.js\">\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<div style=\"width: 100%;\"><a style=\"font-size: 18px; font-weight: bold; margin: 20px; min-width: 300px; padding: 10px; text-align: middle; width: 320px;\" target=\"_blank\" href=\"paymentView.jsp\"></a></div>\n");
      out.write("      <h2 style=\"font-size:1.2em;\">\n");
      out.write("       <div id=\"holder\"> \n");
      out.write("<ul  id=\"place\">\n");
      out.write("        </ul>    \n");
      out.write("</div>\n");
      out.write(" <div style=\"width:600px;text-align:middle;margin:100px; alt:center\"> \n");
      out.write(" <ul id=\"seatDescription\">\n");
      out.write("<li style=\"background:url('http://www.pacsindia.co.in/images/available_seat_im.gif') no-repeat scroll 0 0 transparent;\"></li>\n");
      out.write("<li style=\"background:url('http://www.pacsindia.co.in/images/booked_seat_im.gif') no-repeat scroll 0 0 transparent;\"></li>\n");
      out.write("<li style=\"background:url('http://www.pacsindia.co.in/images/selected_seat_im.gif') no-repeat scroll 0 0 transparent;\"></li>\n");
      out.write("</ul></div>\n");
      out.write(" <div style=\"width:1200px;text-align:middle;margin:100px\">\t\n");
      out.write("<input type=\"button\" id=\"btnShowNew\" value=\"Show Selected Seats\" /><input type=\"button\" id=\"btnShow\" value=\"Show All\" />\n");
      out.write("<a href = \"LoginView.jsp\"><input type=\"button\" value=\"Submit\"></div></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(function () {\n");
      out.write("            var settings = {\n");
      out.write("                rows: 10,\n");
      out.write("                cols: 20,\n");
      out.write("                rowCssPrefix: 'row-',\n");
      out.write("                colCssPrefix: 'col-',\n");
      out.write("                seatWidth: 40,\n");
      out.write("                seatHeight: 35,\n");
      out.write("                seatCss: 'seat',\n");
      out.write("                selectedSeatCss: 'selectedSeat',\n");
      out.write("selectingSeatCss: 'selectingSeat'\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            var init = function (reservedSeat) {\n");
      out.write("                var str = [], seatNo, className;\n");
      out.write("                for (i = 0; i < settings.rows; i++) {\n");
      out.write("                    for (j = 0; j < settings.cols; j++) {\n");
      out.write("                        seatNo = (i + j * settings.rows + 1);\n");
      out.write("                        className = settings.seatCss + ' ' + settings.rowCssPrefix + i.toString() + ' ' + settings.colCssPrefix + j.toString();\n");
      out.write("                        if ($.isArray(reservedSeat) && $.inArray(seatNo, reservedSeat) != -1) {\n");
      out.write("                            className += ' ' + settings.selectedSeatCss;\n");
      out.write("                        }\n");
      out.write("                        str.push('<li class=\"' + className + '\"' +\n");
      out.write("                                  'style=\"top:' + (i * settings.seatHeight).toString() + 'px;left:' + (j * settings.seatWidth).toString() + 'px\">' +\n");
      out.write("                                  '<a title=\"' + seatNo + '\">' + seatNo + '</a>' +\n");
      out.write("                                  '</li>');\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                $('#place').html(str.join(''));\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            //case I: Show from starting\n");
      out.write("            //init();\n");
      out.write("\n");
      out.write("            //Case II: If already booked\n");
      out.write("            var bookedSeats = [5, 10, 25];\n");
      out.write("            init(bookedSeats);\n");
      out.write("\n");
      out.write("\n");
      out.write("            $('.' + settings.seatCss).click(function () {\n");
      out.write("if ($(this).hasClass(settings.selectedSeatCss)){\n");
      out.write("alert('This seat is already reserved');\n");
      out.write("}\n");
      out.write("else{\n");
      out.write("                $(this).toggleClass(settings.selectingSeatCss);\n");
      out.write("}\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $('#btnShow').click(function () {\n");
      out.write("                var str = [];\n");
      out.write("                $.each($('#place li.' + settings.selectedSeatCss + ' a, #place li.'+ settings.selectingSeatCss + ' a'), function (index, value) {\n");
      out.write("                    str.push($(this).attr('title'));\n");
      out.write("                });\n");
      out.write("                alert(str.join(','));\n");
      out.write("            })\n");
      out.write("\n");
      out.write("            $('#btnShowNew').click(function () {\n");
      out.write("                var str = [], item;\n");
      out.write("                $.each($('#place li.' + settings.selectingSeatCss + ' a'), function (index, value) {\n");
      out.write("                    item = $(this).attr('title');                   \n");
      out.write("                    str.push(item);                   \n");
      out.write("                });\n");
      out.write("                alert(str.join(','));\n");
      out.write("            })\n");
      out.write("        });\n");
      out.write("    \n");
      out.write("    </script>\n");
      out.write(" <footer class=\"text-center\">\n");
      out.write("  <a class=\"up-arrow\" href=\"#myPage\" data-toggle=\"tooltip\" title=\"TO TOP\">\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-up\"></span>\n");
      out.write("  </a><br>\n");
      out.write("  <p><a href=\"http://www.w3schools.com\" data-toggle=\"tooltip\" title=\"Visit w3schools\">www.GrabYourTicket.com</a></p> \n");
      out.write("</footer>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "themeView.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
