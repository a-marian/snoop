
<!doctype html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
  <meta charset="utf-8">
  <title>Spring MVC Application</title>

  <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <!-- Latest compiled and minified CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

  <!-- Optional theme -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

  <!-- Latest compiled and minified JavaScript -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>

<body>

<div class="container">
  <div class="row">
    <div class="span8 offset2">
      <h1>Work Spaces</h1>
      <form:form method="post" action="add" commandName="workSpace" class="form-horizontal">
      <div class="control-group">
        <form:label cssClass="control-label" path="nombre">Nombre</form:label>
        <div class="controls">
          <form:input path="nombre"/>
        </div>
      </div>
      <div class="control-group">
        <form:label cssClass="control-label" path="limiteFiguras">Limite de Figuras:</form:label>
        <div class="controls">
          <form:input path="limiteFiguras"/>
        </div>
      </div>

      <div class="control-group">
        <div class="controls">
          <input type="submit" value="Create WorkSpace" class="btn"/>
          </form:form>
        </div>
      </div>

      <c:if test="${!empty workSpaces}">
        <h3>WorkSpaces</h3>
        <table class="table table-bordered table-striped">
          <thead>
          <tr>
            <th>Nombre</th>
            <th>Limite de Figuras</th>
            <th>Figuras</th>
            <th>&nbsp;</th>
          </tr>
          </thead>
          <tbody>
          <c:forEach items="${workSpaces}" var="ws">
            <tr>
              <td>${ws.nombre}</td>
              <td>${ws.limiteFiguras}</td>
              <td><a href="hello.jsp">Figuras</a></td>
              <td>
                <form action="delete/${workSpace.id}" method="post"><input type="submit" class="btn btn-danger btn-mini" value="Delete"/></form>
              </td>

            </tr>
          </c:forEach>
          </tbody>
        </table>
      </c:if>
    </div>
  </div>
</div>

</body>
</html>
