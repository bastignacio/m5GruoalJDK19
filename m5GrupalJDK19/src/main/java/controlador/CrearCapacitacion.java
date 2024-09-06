package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.ImplementacionInterfaz;
import model.DAO.Interfaz;

import modelo.Capacitacion;

@WebServlet("/CrearCapacitacion")
public class CrearCapacitacion extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private Interfaz interfaz = new ImplementacionInterfaz();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("capacitaciones", interfaz.obtenerCapacitaciones());
        request.getRequestDispatcher("/views/crearCapacitacion.jsp").forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	String nombreCapacitacion = request.getParameter("nombreCapacitacion");
        String descripcionCapacitacion = request.getParameter("descripcionCapacitacion");
        
        //System.out.println("Nombre: " + nombreCapacitacion + ", Descripción: " + descripcionCapacitacion);
        
        Capacitacion newCapacitacion = new Capacitacion(1000, nombreCapacitacion, descripcionCapacitacion);
        interfaz.almacenarCapacitacion(newCapacitacion);
        
        request.setAttribute("capacitaciones", interfaz.obtenerCapacitaciones());
        request.getRequestDispatcher("/views/crearCapacitacion.jsp").forward(request, response);
        
        
        
        
        
    }
}
