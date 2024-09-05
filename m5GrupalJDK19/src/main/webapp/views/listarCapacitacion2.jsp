<%@page import="modelo.Capacitacion" %>
<%@page import="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Capacitaciones - Prevención Segura</title>

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">

</head>

<body>
	<!-- Navbar -->
	<%@ include file='navbar.jsp' %>

	<!-- Main content -->

<div class="container my-5">
    <h1 class="display-4">Capacitaciones Creadas</h1>
    
    <%
        List<Capacitacion> listaCapacitaciones = (List<Capacitacion>) request.getAttribute("capacitaciones");
        if (listaCapacitaciones != null && !listaCapacitaciones.isEmpty()) {
            for (Capacitacion capacitacion : listaCapacitaciones) {
    %>
        <div class="card my-3">
            <div class="card-body">
                <h5 class="card-title">
                    <%= capacitacion.getIdCapacitacion() %> - <%= capacitacion.getNombreCapacitacion() %>
                </h5>
                <p class="card-text">
                    <strong>Descripción:</strong> <%= capacitacion.getDetalleCapacitacion() %>
                </p>
            </div>
        </div>
    <%
            }
        } else {
    %>
        <div class="alert alert-danger" role="alert">
            No se encontraron capacitaciones.
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
