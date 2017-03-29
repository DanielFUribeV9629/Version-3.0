package Servlet;

import ejercito.Ejercito;
import ejercito.ElfoFabrica;
import ejercito.EnanoFabrica;
import ejercito.HechizeroFabrica;
import ejercito.HombreFabrica;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MiliciaServlet", urlPatterns = {"/MiliciaServlet"})
public class MiliciaServlet extends HttpServlet {

    
    int copias;
    String personaje;
    int x=50;
    int i = 1;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        copias = Integer.parseInt(request.getParameter("prototipo"));
        try (PrintWriter out = response.getWriter()) {           
           
            String nombre = request.getParameter("gender");
           
            switch (nombre) {
                
                case "hombre":
                    Ejercito h = new HombreFabrica();  
//                    h.darArma().Arma();
//                    h.darArmadura().Armadura();
//                    h.darCuerpo().Cuerpo();
//                    h.darEscudo().Escudo();            
                    personaje = h.darArma().Arma() + "," + h.darArmadura().Armadura()+ "," + 
                                h.darCuerpo().Cuerpo() + "," + h.darEscudo().Escudo() + "," + copias;
                    request.getSession().setAttribute("personaje", personaje); 
                    request.getSession().setAttribute("xxx", x); 
                    request.getSession().setAttribute("clones", copias);       
               /*     if (copias>=2) {
                        for ( i =2; i <=copias; i++) {
                            h.clonar();                          
                        }                           
                    }*/                   
                    response.sendRedirect("lienzo.jsp?personaje=" + personaje);
                    break;
                case "elfo":
                    Ejercito e = new ElfoFabrica();
                 /* request.getSession().setAttribute("cuerpo", e.darArma().Arma());
                    request.getSession().setAttribute("cuerpo1", e.darArmadura().Armadura());
                    request.getSession().setAttribute("cuerpo2", e.darCuerpo().Cuerpo());
                    request.getSession().setAttribute("cuerpo3", e.darEscudo().Escudo());*/
                    personaje = e.darArma().Arma() + "," + e.darArmadura().Armadura()+ "," + 
                                e.darCuerpo().Cuerpo() + "," + e.darEscudo().Escudo() + "," + copias;
                    request.getSession().setAttribute("personaje", personaje); 
                    request.getSession().setAttribute("xxx", x); 
                    request.getSession().setAttribute("clones", copias);       
               /*     if (copias>=2) {
                        for ( i =2; i <=copias; i++) {
                            h.clonar();                          
                        }                           
                    }*/    
                    response.sendRedirect("lienzo.jsp?cuerpo=" + personaje);
                     
                    break;
                case "enano":
                    Ejercito en = new EnanoFabrica();
                  /*request.getSession().setAttribute("cuerpo", en.darArma().Arma());
                    request.getSession().setAttribute("cuerpo1", en.darArmadura().Armadura());
                    request.getSession().setAttribute("cuerpo2", en.darCuerpo().Cuerpo());
                    request.getSession().setAttribute("cuerpo3", en.darEscudo().Escudo());*/
                    personaje = en.darArma().Arma() + "," + en.darArmadura().Armadura()+ "," + 
                                en.darCuerpo().Cuerpo() + "," + en.darEscudo().Escudo() + "," + copias;
                    request.getSession().setAttribute("personaje", personaje); 
                    request.getSession().setAttribute("xxx", x); 
                    request.getSession().setAttribute("clones", copias);       
               /*     if (copias>=2) {
                        for ( i =2; i <=copias; i++) {
                            h.clonar();                          
                        }                           
                    }*/    
                    response.sendRedirect("lienzo.jsp?cuerpo=" + personaje);
                     
                    break;
                case "hechizero":
                    Ejercito he = new HechizeroFabrica();
               /*   request.getSession().setAttribute("cuerpo", he.darArma().Arma());
                    request.getSession().setAttribute("cuerpo1", he.darArmadura().Armadura());
                    request.getSession().setAttribute("cuerpo2", he.darCuerpo().Cuerpo());
                    request.getSession().setAttribute("cuerpo3", he.darEscudo().Escudo());*/
                    personaje = he.darArma().Arma() + "," + he.darArmadura().Armadura()+ "," + 
                                he.darCuerpo().Cuerpo() + "," + he.darEscudo().Escudo() + "," + copias;
                    request.getSession().setAttribute("personaje", personaje); 
                    request.getSession().setAttribute("xxx", x); 
                    request.getSession().setAttribute("clones", copias);       
               /*     if (copias>=2) {
                        for ( i =2; i <=copias; i++) {
                            h.clonar();                          
                        }                           
                    }*/    
                    response.sendRedirect("lienzo.jsp?cuerpo=" + personaje);                
                    break;
            }
        }      
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
