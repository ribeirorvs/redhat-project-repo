<%@ include file="components/head.jsp" %>
<%@ include file="components/header.jsp" %>
<jsp:include page="components/navBar.jsp">
	<jsp:param value="index.jsp" name="toDo"/>
	<jsp:param value="index.jsp" name="addTaskLink"/>
	<jsp:param value="#" name="checkTaskLink"/>
	<jsp:param value="listtasks.jsp" name="listTaskLink"/>
</jsp:include>
			<section class="row">
				<header class="col-sm-12">
					<h1>Check a Task</h1>
				</header>
				<article class="col-sm-6">
					<form action="CheckTask.do" method="post">
						<input type="hidden" name="operation" value="checkTask">
						<fieldset class="form-group">
							<legend>Task:</legend>
							<label for="id">Task id: </label>
							<input type="number" min="0" name="task-id" id="id">
							<input type="submit" class="btn btn-primary" value="Submit">
						</fieldset>
					</form>
				</article>
			</section>
<%@ include file="components/footer.jsp" %>
