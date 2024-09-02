package login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Login() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/views/login.jsp").forward(request,response);
        // Verifica si ya existe una cookie de sesión
        Cookie[] cookies = request.getCookies();
        String username = null;

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("username")) {
                    username = cookie.getValue();
                    break;
                }
            }
        }

        if (username != null) {
            // Pasa el nombre de usuario a la página bienvenido.jsp
            request.setAttribute("username", username);
            getServletContext().getRequestDispatcher("/views/bienvenido.jsp").forward(request, response);
        } else {
            // Si no hay cookie, redirige al login
            response.sendRedirect(request.getContextPath() + "/views/login.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtiene los datos del formulario
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Simulación de validación de usuario y contraseña
        if ("1234".equals(password)) {
            // Crea una cookie con el nombre de usuario
            Cookie userCookie = new Cookie("username", username);
            userCookie.setMaxAge(60 * 60 * 24); // Configura la cookie para que expire en 1 día
            response.addCookie(userCookie);

            // Pasa el nombre de usuario a la página de bienvenida
            request.setAttribute("username", username);
            // Redirige a la página bienvenido.jsp
            response.sendRedirect(request.getContextPath() + "/views/bienvenido.jsp");
        } else {
            // Si el login falla, redirige de nuevo al login con un mensaje de error
            request.setAttribute("errorMessage", "Nombre de usuario o contraseña incorrectos");
            getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
        }
    }

}
