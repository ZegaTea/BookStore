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

      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"slider-area\">\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\n");
      out.write("        <div id=\"slide-list\" class=\"carousel carousel-fade slide\" data-ride=\"carousel\">\n");
      out.write("\n");
      out.write("            <div class=\"slide-bulletz\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <ol class=\"carousel-indicators slide-indicators\">\n");
      out.write("                                <li data-target=\"#slide-list\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                                <li data-target=\"#slide-list\" data-slide-to=\"1\"></li>\n");
      out.write("                                <li data-target=\"#slide-list\" data-slide-to=\"2\"></li>\n");
      out.write("                            </ol>                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                <div class=\"item active\">\n");
      out.write("                    <div class=\"single-slide\">\n");
      out.write("                        <div class=\"slide-bg slide-one\"></div>\n");
      out.write("                        <div class=\"slide-text-wrapper\">\n");
      out.write("                            <div class=\"slide-text\">\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-6 col-md-offset-6\">\n");
      out.write("                                            <div class=\"slide-content\">\n");
      out.write("                                                <h2>We are awesome</h2>\n");
      out.write("                                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequuntur, dolorem, excepturi. Dolore aliquam quibusdam ut quae iure vero exercitationem ratione!</p>\n");
      out.write("                                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Modi ab molestiae minus reiciendis! Pariatur ab rerum, sapiente ex nostrum laudantium.</p>\n");
      out.write("                                                <a href=\"\" class=\"readmore\">Learn more</a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"single-slide\">\n");
      out.write("                        <div class=\"slide-bg slide-two\"></div>\n");
      out.write("                        <div class=\"slide-text-wrapper\">\n");
      out.write("                            <div class=\"slide-text\">\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-6 col-md-offset-6\">\n");
      out.write("                                            <div class=\"slide-content\">\n");
      out.write("                                                <h2>We are great</h2>\n");
      out.write("                                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Saepe aspernatur, dolorum harum molestias tempora deserunt voluptas possimus quos eveniet, vitae voluptatem accusantium atque deleniti inventore. Enim quam placeat expedita! Quibusdam!</p>\n");
      out.write("                                                <a href=\"\" class=\"readmore\">Learn more</a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"single-slide\">\n");
      out.write("                        <div class=\"slide-bg slide-three\"></div>\n");
      out.write("                        <div class=\"slide-text-wrapper\">\n");
      out.write("                            <div class=\"slide-text\">\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-6 col-md-offset-6\">\n");
      out.write("                                            <div class=\"slide-content\">\n");
      out.write("                                                <h2>We are superb</h2>\n");
      out.write("                                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolores, eius?</p>\n");
      out.write("                                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Deleniti voluptates necessitatibus dicta recusandae quae amet nobis sapiente explicabo voluptatibus rerum nihil quas saepe, tempore error odio quam obcaecati suscipit sequi.</p>\n");
      out.write("                                                <a href=\"\" class=\"readmore\">Learn more</a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>        \n");
      out.write("    </div> <!-- End slider area -->\n");
      out.write("\n");
      out.write("    <div class=\"promo-area\">\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"single-promo\">\n");
      out.write("                        <i class=\"fa fa-refresh\"></i>\n");
      out.write("                        <p>30 Days return</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"single-promo\">\n");
      out.write("                        <i class=\"fa fa-truck\"></i>\n");
      out.write("                        <p>Free shipping</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"single-promo\">\n");
      out.write("                        <i class=\"fa fa-lock\"></i>\n");
      out.write("                        <p>Secure payments</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"single-promo\">\n");
      out.write("                        <i class=\"fa fa-gift\"></i>\n");
      out.write("                        <p>New products</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div> <!-- End promo area -->\n");
      out.write("\n");
      out.write("    <div class=\"maincontent-area\">\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"latest-product\">\n");
      out.write("                        <h2 class=\"section-title\">Latest Products</h2>\n");
      out.write("                        <div class=\"product-carousel\">\n");
      out.write("                        ");

                            BookDao bookDao = new BookDao();
                            List<Book> list = bookDao.getListAllBook();
                            for (Book item : list) {
                                out.println("<div class=\"single-product\">\n <div class=\"product-f-image\">");
                                out.println("<img src=\"" + item.getImageLink() + "\" />");
                                out.println("<div class=\"product-hover\"> "
                                        + "<a href=\"#\" class=\"add-to-cart-link\"><i class=\"fa fa-shopping-cart\"></i> Add to cart</a>"
                                        + "<a href=\"single-product.jsp\" class=\"view-details-link\"><i class=\"fa fa-link\"></i> See details</a> </div> </div>");
                                out.println("<h2><a href=\"single-product.jsp\">" + item.getTitle() + "</a></h2>");
                                out.println("<div class=\"product-carousel-price\">");
                                out.println("<ins>" + item.getPrice() + "</ins></div></div>");
                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div> <!-- End main content area -->\n");
      out.write("\n");
      out.write("<div class=\"brands-area\">\n");
      out.write("    <div class=\"zigzag-bottom\"></div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <div class=\"brand-wrapper\">\n");
      out.write("                    <h2 class=\"section-title\">Brands</h2>\n");
      out.write("                    <div class=\"brand-list\">\n");
      out.write("\n");
      out.write("                        <img src=\"Image/Brand/services_logo__1.jpg\" alt=\"\"/>\n");
      out.write("                        <img src=\"Image/Brand/services_logo__2.jpg\" alt=\"\"/>\n");
      out.write("                        <img src=\"Image/Brand/services_logo__3.jpg\" alt=\"\"/>\n");
      out.write("                        <img src=\"Image/Brand/services_logo__4.jpg\" alt=\"\"/>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div> <!-- End brands area -->\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write(' ');
      out.write('\n');
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
