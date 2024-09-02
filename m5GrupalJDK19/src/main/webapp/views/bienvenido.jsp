<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
<title>Bienvenido</title>
<style>
/* Estilos básicos */
body {
	font-family: Arial, sans-serif;
	background-color: #e2e2e2;
	text-align: center;
	padding-top: 100px;
}

.welcome-container {
	background-color: #fff;
	display: inline-block;
	padding: 40px;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.welcome-container h1 {
	color: #333;
}
</style>
</head>
<body>
	<div class="welcome-container">
		<%
		String username = "";
		javax.servlet.http.Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (javax.servlet.http.Cookie cookie : cookies) {
				if ("username".equals(cookie.getName())) {
			username = cookie.getValue();
			break;
				}
			}
		}
		%>
		<h1>
			¡Bienvenido,
			<%=username%>!
		</h1>
		<p>Has iniciado sesión exitosamente.</p>
		<a href="${pageContext.request.contextPath}/Logout"
			class="btn btn-danger mt-4">Cerrar sesión</a>
	</div>
</body>
</html>
