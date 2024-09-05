
<%@ page import="java.util.List"%>
<%@ page import="modelo.Capacitacion"%>


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
</head>

<body>
    <div class="container my-5">
        <h1 class="display-4">Capacitaciones Creadas</h1>

        <!-- Verificamos si la lista de capacitaciones existe -->
        <%
            List<Capacitacion> listaCapacitaciones = (List<Capacitacion>) request.getAttribute("capacitaciones");
            if (listaCapacitaciones != null && !listaCapacitaciones.isEmpty()) {
        %>

        <table class="table table-striped">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Detalle</th>
                </tr>
            </thead>
            <tbody>
                <%
                for (Capacitacion c : listaCapacitaciones) {
                %>
                <tr>
                    <td><%=c.getIdCapacitacion()%></td>
                    <td><%=c.getNombreCapacitacion()%></td>
                    <td><%=c.getDetalleCapacitacion()%></td>
                </tr>
                <% } %>
            </tbody>
        </table>

        <% } else { %>
            <p>No hay capacitaciones registradas.</p>
        <% } %>

        <a href="CrearCapacitacion" class="btn btn-primary mt-3">Crear otra capacitación</a>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
