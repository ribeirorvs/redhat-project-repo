<%@ page import="java.util.*" %>
<%@ include file="components/head.jsp" %>
<%@ include file="components/header.jsp" %>
<jsp:include page="components/navBar.jsp">
	<jsp:param value="index.jsp" name="toDo"/>
	<jsp:param value="index.jsp" name="addTaskLink"/>
	<jsp:param value="checktask.jsp" name="checkTaskLink"/>
	<jsp:param value="listtasks.jsp" name="listTaskLink"/>
</jsp:include>
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
