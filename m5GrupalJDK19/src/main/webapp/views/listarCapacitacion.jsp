<%@page import="model.Capacitacion" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Contacto - Prevención Segura</title>

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">


</head>

<body>
	<!-- Navbar -->
	
	<%@ include file='navbar.jsp' %>

	<!-- Main content -->
	
	<div class="container my-5">
        <h1 class="display-4">Capacitación Creada</h1>
        
        <%
            Capacitacion nuevaCapacitacion = (Capacitacion) request.getAttribute("nuevaCapacitacion");
            if (nuevaCapacitacion != null) {
        %>
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title"><%= nuevaCapacitacion.getNombreCapacitacion() %></h5>
                    <p class="card-text"><strong>Fecha:</strong> <%= nuevaCapacitacion.getFechaCapacitacion() %></p>
                    <p class="card-text"><strong>Duración:</strong> <%= nuevaCapacitacion.getDuracionCapacitacion() %> horas</p>
                    <p class="card-text"><strong>Descripción:</strong> <%= nuevaCapacitacion.getDescripcionCapacitacion() %></p>
                </div>
            </div>
        <%
            } else {
        %>
            <div class="alert alert-danger" role="alert">
                No se pudo encontrar la capacitación.
            </div>
        <%
            }
        %>
        <a href="CrearCapacitacion" class="btn btn-primary mt-3">Crear otra capacitación</a>
    </div>
		
	<!-- Footer -->
	<%@ include file='footer.jsp'%>

	<!-- Bootstrap JS -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
	
</body>
</html>