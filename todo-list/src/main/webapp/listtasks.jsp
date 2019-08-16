<%@ include file="components/head.jsp" %>
<%@ include file="components/header.jsp" %>
<jsp:include page="components/navBar.jsp">
	<jsp:param value="index.jsp" name="toDo"/>
	<jsp:param value="index.jsp" name="addTaskLink"/>
	<jsp:param value="checktask.jsp" name="checkTaskLink"/>
	<jsp:param value="#" name="listTaskLink"/>
	<jsp:param value="clearlist.jsp" name="clearListLink"/>
	<jsp:param value="removetask.jsp" name="removeTaskLink"/>
</jsp:include>
			<section class="row">
				<header class="col-sm-12">
					<h1>Tasks</h1>
				</header>
				<article class="col-sm-6">
					<div class="btn-group">
						<form action="ListTasks.do" method="post">
							<input type="hidden" name="operation" value="listTasks">
							<input type="submit" class="btn btn-primary" value="All">
						</form>
					</div>
				</article>
			</section>
<%@ include file="components/footer.jsp" %>