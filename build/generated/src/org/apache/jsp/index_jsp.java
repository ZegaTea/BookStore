package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Model.dao.BookDao;
import Model.entities.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");

    BookDao bookDao = new BookDao();
    List<Book> list = bookDao.getListAllBook();

      out.write('\r');
      out.write('\n');

    if (session.getAttribute(Common.Constant.CHECKOUT_SESSION) != null) {
        String check = session.getAttribute(Common.Constant.CHECKOUT_SESSION).toString();
        if (check.equals("true")) {

      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    alert(\"Thanh toán thành công! Ti?p t?c mua hàng\")\r\n");
      out.write("</script>\r\n");

    session.setAttribute(Common.Constant.CHECKOUT_SESSION, "false");
        }
    }


      out.write("\r\n");
      out.write("<div class=\"slider-area\">\r\n");
      out.write("    <div class=\"zigzag-bottom\"></div>\r\n");
      out.write("    <div id=\"slide-list\" class=\"carousel carousel-fade slide\" data-ride=\"carousel\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"slide-bulletz\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                        <ol class=\"carousel-indicators slide-indicators\">\r\n");
      out.write("                            <li data-target=\"#slide-list\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                            <li data-target=\"#slide-list\" data-slide-to=\"1\"></li>\r\n");
      out.write("                            <li data-target=\"#slide-list\" data-slide-to=\"2\"></li>\r\n");
      out.write("                        </ol>                            \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("            <div class=\"item active\">\r\n");
      out.write("                <div class=\"single-slide\">\r\n");
      out.write("                    <div class=\"slide-bg slide-one\"></div>\r\n");
      out.write("                    <div class=\"slide-text-wrapper\">\r\n");
      out.write("                        <div class=\"slide-text\">\r\n");
      out.write("                            <div class=\"container\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-md-6 col-md-offset-6\">\r\n");
      out.write("                                        <div class=\"slide-content\">\r\n");
      out.write("                                            <h2>We are awesome</h2>\r\n");
      out.write("                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequuntur, dolorem, excepturi. Dolore aliquam quibusdam ut quae iure vero exercitationem ratione!</p>\r\n");
      out.write("                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Modi ab molestiae minus reiciendis! Pariatur ab rerum, sapiente ex nostrum laudantium.</p>\r\n");
      out.write("                                            <a href=\"\" class=\"readmore\">Learn more</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <div class=\"single-slide\">\r\n");
      out.write("                    <div class=\"slide-bg slide-two\"></div>\r\n");
      out.write("                    <div class=\"slide-text-wrapper\">\r\n");
      out.write("                        <div class=\"slide-text\">\r\n");
      out.write("                            <div class=\"container\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-md-6 col-md-offset-6\">\r\n");
      out.write("                                        <div class=\"slide-content\">\r\n");
      out.write("                                            <h2>We are great</h2>\r\n");
      out.write("                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Saepe aspernatur, dolorum harum molestias tempora deserunt voluptas possimus quos eveniet, vitae voluptatem accusantium atque deleniti inventore. Enim quam placeat expedita! Quibusdam!</p>\r\n");
      out.write("                                            <a href=\"\" class=\"readmore\">Learn more</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <div class=\"single-slide\">\r\n");
      out.write("                    <div class=\"slide-bg slide-three\"></div>\r\n");
      out.write("                    <div class=\"slide-text-wrapper\">\r\n");
      out.write("                        <div class=\"slide-text\">\r\n");
      out.write("                            <div class=\"container\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-md-6 col-md-offset-6\">\r\n");
      out.write("                                        <div class=\"slide-content\">\r\n");
      out.write("                                            <h2>We are superb</h2>\r\n");
      out.write("                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolores, eius?</p>\r\n");
      out.write("                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Deleniti voluptates necessitatibus dicta recusandae quae amet nobis sapiente explicabo voluptatibus rerum nihil quas saepe, tempore error odio quam obcaecati suscipit sequi.</p>\r\n");
      out.write("                                            <a href=\"\" class=\"readmore\">Learn more</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>        \r\n");
      out.write("</div> <!-- End slider area -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"promo-area\">\r\n");
      out.write("    <div class=\"zigzag-bottom\"></div>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                <div class=\"single-promo\">\r\n");
      out.write("                    <i class=\"fa fa-refresh\"></i>\r\n");
      out.write("                    <p>30 Days return</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                <div class=\"single-promo\">\r\n");
      out.write("                    <i class=\"fa fa-truck\"></i>\r\n");
      out.write("                    <p>Free shipping</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                <div class=\"single-promo\">\r\n");
      out.write("                    <i class=\"fa fa-lock\"></i>\r\n");
      out.write("                    <p>Secure payments</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                <div class=\"single-promo\">\r\n");
      out.write("                    <i class=\"fa fa-gift\"></i>\r\n");
      out.write("                    <p>New products</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div> <!-- End promo area -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"maincontent-area\">\r\n");
      out.write("    <div class=\"zigzag-bottom\"></div>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12\">\r\n");
      out.write("                <div class=\"latest-product\">\r\n");
      out.write("                    <h2 class=\"section-title\">Latest Products</h2>\r\n");
      out.write("                    <div class=\"product-carousel\">\r\n");
      out.write("\r\n");
      out.write("                        ");

                            for (Book item : list) {
                                out.println("<div class='single-product'> <div class='product-f-image'>");
                                out.println("<img src='" + item.getImageLink() + "'/>");
                                out.println("<div class='product-hover'>"
                                        + " <a href='#' class='add-to-cart-link'><i class='fa fa-shopping-cart'></i> Add to cart</a>"
                                        + " <a href='DetailServlet?id=" + item.getIdBook() + "' class='view-details-link'><i class='fa fa-link'></i> See details</a>"
                                        + " </div>  </div>");
                                out.println("<h2><a href='DetailServlet?id=" + item.getIdBook() + "'>" + item.getTitle() + "</a></h2>");
                                out.println("<div class='product-carousel-price'>"
                                        + "<ins>$"+item.getPrice()+"</ins>"
                                        + "</div> </div>");
                            }
                        
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div> <!-- End main content area -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"brands-area\">\r\n");
      out.write("    <div class=\"zigzag-bottom\"></div>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12\">\r\n");
      out.write("                <div class=\"brand-wrapper\">\r\n");
      out.write("                    <h2 class=\"section-title\">Brands</h2>\r\n");
      out.write("                    <div class=\"brand-list\">\r\n");
      out.write("\r\n");
      out.write("                        <img src=\"Image/Brand/services_logo__1.jpg\" alt=\"\"/>\r\n");
      out.write("                        <img src=\"Image/Brand/services_logo__2.jpg\" alt=\"\"/>\r\n");
      out.write("                        <img src=\"Image/Brand/services_logo__3.jpg\" alt=\"\"/>\r\n");
      out.write("                        <img src=\"Image/Brand/services_logo__4.jpg\" alt=\"\"/>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div> <!-- End brands area -->\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write(" \r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
