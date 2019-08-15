<%@ page import="java.util.*" %>
<%@ include file="components/head.jsp" %>
<%@ include file="components/header.jsp" %>
<%@ include file="components/navBar.jsp" %>
			<section class="row">
				<header class="col-sm-12">
					<h1>Result Page</h1>
				</header>
				<article class="col-sm-6">
					<div class="btn-group">
						<%
							String styles = (String) request.getAttribute("styles");
							out.print("<br>Try: " + styles);
						%>
					</div>
				</article>
			</section>
<%@ include file="components/footer.jsp" %>
