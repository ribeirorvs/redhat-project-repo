<%@ include file="components/head.jsp" %>
<%@ include file="components/header.jsp" %>
<jsp:include page="components/navBar.jsp">
	<jsp:param value="#" name="toDo"/>
	<jsp:param value="#" name="addTaskLink"/>
	<jsp:param value="checktask.jsp" name="checkTaskLink"/>
	<jsp:param value="listtask.jsp" name="listTaskLink"/>
</jsp:include>
			<section class="row">
				<header class="col-sm-12">
					<h1>Add a new Task</h1>
				</header>
				<article class="col-sm-6">
					<form action="AddTask.do" method="post">
						<input type="hidden" name="operation" value="addTask"/>
						<fieldset class="form-group">
							<legend>Task:</legend>
							<label for="title">Title: </label>
							<input type="text" class="form-control" placeholder="Task Title" name="task-title" id="title">
							<br>
							<label for="desc">Description:</label>
							<br>
							<textarea rows="5" placeholder="Task description" class="form-control" name="task-desc" id="desc"></textarea>
						</fieldset>
						<fieldset class="form-inline">
							<legend>From:</legend>
							<label for="starDay">Date: </label> 
							<input type="date" name="task-startDay" id="startDay">
							<br>
							<label for="startTime">Time: </label>
							<input type="time" name="task-startTime" id="startTime">
						</fieldset>
						<fieldset class="form-inline">
							<legend>To:</legend>
							<label for="lastDay">Date: </label>
							<input type="date" name="task-lastDay" id="lastDay">
							<br>
							<label for="lastTime">Time: </label>
							<input type="time" name="task-finalTime" id="lastTime">
						</fieldset>
						<input type="submit" class="btn btn-primary" value="Submit">
					</form>
				</article>
			</section>
<%@ include file="components/footer.jsp" %>
