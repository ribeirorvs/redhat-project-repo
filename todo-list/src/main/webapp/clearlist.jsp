<%@ include file="components/head.jsp" %>
<%@ include file="components/header.jsp" %>
<jsp:include page="components/navBar.jsp">
	<jsp:param value="index.jsp" name="toDo"/>
	<jsp:param value="index.jsp" name="addTaskLink"/>
	<jsp:param value="checktask.jsp" name="checkTaskLink"/>
	<jsp:param value="listtasks.jsp" name="listTaskLink"/>
	<jsp:param value="#" name="clearListLink"/>
	<jsp:param value="removetask.jsp" name="removeTaskLink"/>
</jsp:include>
			<section class="row">
				<header class="col-sm-12">
					<h1>Clear Task List</h1>
				</header>
				<article class="col-sm-6">
					<div class="btn-group">
						<form action="ClearList.do" method="post">
							<input type="hidden" name="operation" value="clearList">
							<input type="submit" class="btn btn-primary" value="Clear">
						</form>
					</div>
				</article>
			</section>
<%@ include file="components/footer.jsp" %>