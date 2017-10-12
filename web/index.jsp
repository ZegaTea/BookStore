
<%@page import="java.util.List"%>
<%@page import="Model.dao.BookDao, Model.entities.*" %>
<jsp:include page="header.jsp"></jsp:include>

<%
    BookDao bookDao = new BookDao();
    List<Book> list = bookDao.getListAllBook();
%>
<%
    if (session.getAttribute(Common.Constant.CHECKOUT_SESSION) != null) {
        String check = session.getAttribute(Common.Constant.CHECKOUT_SESSION).toString();
        if (check.equals("true")) {
%>
<script>
    alert("Thanh toán thành công! Ti?p t?c mua hàng")
</script>
<%
            session.setAttribute(Common.Constant.CHECKOUT_SESSION, "false");
        }
    }

%>
<%
    if (session.getAttribute(Common.Constant.CHECK_SESSION) != null) {
        String check = session.getAttribute(Common.Constant.CHECK_SESSION).toString();
        if (check.equals("true")) {
%>
<script>
    alert("Thêm gi? hàng thành công")
</script>
<%
    session.setAttribute(Common.Constant.CHECK_SESSION, "false");
        }
    }

%>
<div class="slider-area">
    <div class="zigzag-bottom"></div>
    <div id="slide-list" class="carousel carousel-fade slide" data-ride="carousel">

        <div class="slide-bulletz">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <ol class="carousel-indicators slide-indicators">
                            <li data-target="#slide-list" data-slide-to="0" class="active"></li>
                            <li data-target="#slide-list" data-slide-to="1"></li>
                            <li data-target="#slide-list" data-slide-to="2"></li>
                        </ol>                            
                    </div>
                </div>
            </div>
        </div>

        <div class="carousel-inner" role="listbox">
            <div class="item active">
                <div class="single-slide">
                    <div class="slide-bg slide-one"></div>
                    <div class="slide-text-wrapper">
                        <div class="slide-text">
                            <div class="container">
                                <div class="row">
                                    <div class="col-md-6 col-md-offset-6">
                                        <div class="slide-content">
                                            <h2>We are awesome</h2>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequuntur, dolorem, excepturi. Dolore aliquam quibusdam ut quae iure vero exercitationem ratione!</p>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Modi ab molestiae minus reiciendis! Pariatur ab rerum, sapiente ex nostrum laudantium.</p>
                                            <a href="" class="readmore">Learn more</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="item">
                <div class="single-slide">
                    <div class="slide-bg slide-two"></div>
                    <div class="slide-text-wrapper">
                        <div class="slide-text">
                            <div class="container">
                                <div class="row">
                                    <div class="col-md-6 col-md-offset-6">
                                        <div class="slide-content">
                                            <h2>We are great</h2>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Saepe aspernatur, dolorum harum molestias tempora deserunt voluptas possimus quos eveniet, vitae voluptatem accusantium atque deleniti inventore. Enim quam placeat expedita! Quibusdam!</p>
                                            <a href="" class="readmore">Learn more</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="item">
                <div class="single-slide">
                    <div class="slide-bg slide-three"></div>
                    <div class="slide-text-wrapper">
                        <div class="slide-text">
                            <div class="container">
                                <div class="row">
                                    <div class="col-md-6 col-md-offset-6">
                                        <div class="slide-content">
                                            <h2>We are superb</h2>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolores, eius?</p>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Deleniti voluptates necessitatibus dicta recusandae quae amet nobis sapiente explicabo voluptatibus rerum nihil quas saepe, tempore error odio quam obcaecati suscipit sequi.</p>
                                            <a href="" class="readmore">Learn more</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>        
</div> <!-- End slider area -->

<div class="promo-area">
    <div class="zigzag-bottom"></div>
    <div class="container">
        <div class="row">
            <div class="col-md-3 col-sm-6">
                <div class="single-promo">
                    <i class="fa fa-refresh"></i>
                    <p>30 Days return</p>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="single-promo">
                    <i class="fa fa-truck"></i>
                    <p>Free shipping</p>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="single-promo">
                    <i class="fa fa-lock"></i>
                    <p>Secure payments</p>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="single-promo">
                    <i class="fa fa-gift"></i>
                    <p>New products</p>
                </div>
            </div>
        </div>
    </div>
</div> <!-- End promo area -->

<div class="maincontent-area">
    <div class="zigzag-bottom"></div>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="latest-product">
                    <h2 class="section-title">Latest Products</h2>
                    <div class="product-carousel">

                        <%                            for (Book item : list) {
                                String href = "CartServlet?id=" + item.getIdBook();
                                out.println("<div class='single-product'> <div class='product-f-image'>");
                                out.println("<img src='" + item.getImageLink() + "'/>");
                                out.println("<div class='product-hover'>"
                                        + " <a href='" + href + "' class='add-to-cart-link'><i class='fa fa-shopping-cart'></i> Add to cart</a>"
                                        + " <a href='DetailServlet?id=" + item.getIdBook() + "' class='view-details-link'><i class='fa fa-link'></i> See details</a>"
                                        + " </div>  </div>");
                                out.println("<h2><a href='DetailServlet?id=" + item.getIdBook() + "'>" + item.getTitle() + "</a></h2>");
                                out.println("<div class='product-carousel-price'>"
                                        + "<ins>$" + item.getPrice() + "</ins>"
                                        + "</div> </div>");
                            }
                        %>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div> <!-- End main content area -->

<div class="brands-area">
    <div class="zigzag-bottom"></div>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="brand-wrapper">
                    <h2 class="section-title">Brands</h2>
                    <div class="brand-list">

                        <img src="Image/Brand/services_logo__1.jpg" alt=""/>
                        <img src="Image/Brand/services_logo__2.jpg" alt=""/>
                        <img src="Image/Brand/services_logo__3.jpg" alt=""/>
                        <img src="Image/Brand/services_logo__4.jpg" alt=""/>

                    </div>
                </div>
            </div>
        </div>
    </div>
</div> <!-- End brands area -->

<jsp:include page="footer.jsp"></jsp:include> 
