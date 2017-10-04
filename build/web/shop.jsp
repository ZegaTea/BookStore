<%@page import="java.util.List"%>
<%@page import="Model.dao.BookDao, Model.entities.*" %>

<jsp:include page="header.jsp"></jsp:include>
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
<div class="product-big-title-area">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="product-bit-title text-center">
                    <h2>Shop</h2>
                </div>
            </div>
        </div>
    </div>
</div>


<div class="single-product-area">
    <div class="zigzag-bottom"></div>
    <div class="container">
        <div class="row">

            <%                BookDao bookDao = new BookDao();
                List<Book> list = bookDao.getListAllBook();
                for (Book item : list) {
                    String href = "CartServlet?id=" + item.getIdBook();
                    out.println("<div class='col-md-3 col-sm-6'><div class='single-shop-product'><div class='product-upper'>");
                    out.println("<img src='" + item.getImageLink() + "'/></div>");
                    out.println("<h2><a href='#'>" + item.getTitle() + "</a></h2>");
                    out.println("<div class='product-carousel-price'><ins>$" + item.getPrice() + "</ins></div>");
                    out.println("<div class='product-option-shop'> "
                            + "<a class='add_to_cart_button' href='" + href + "'>Add to cart</a>"
                            + "</div></div></div>");
                }
            %>
        </div>
        <div class="row">
            <div class="col-md-12">
                <div class="product-pagination text-center">
                    <nav>
                        <ul class="pagination">
                            <li>
                                <a href="#" aria-label="Previous">
                                    <span aria-hidden="true">&laquo;</span>
                                </a>
                            </li>
                            <li><a href="#">1</a></li>
                            <li><a href="#">2</a></li>
                            <li><a href="#">3</a></li>
                            <li><a href="#">4</a></li>
                            <li><a href="#">5</a></li>
                            <li>
                                <a href="#" aria-label="Next">
                                    <span aria-hidden="true">&raquo;</span>
                                </a>
                            </li>
                        </ul>
                    </nav>                        
                </div>
            </div>
        </div>
    </div>
</div>
<script>

</script>
<jsp:include page="footer.jsp"></jsp:include> 