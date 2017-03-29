<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <canvas id="myCanvas" width="2000" height="2000"></canvas>
        
    <script>
        
        var canvas = document.getElementById('myCanvas');
        var context = canvas.getContext('2d');
        var cuerpo = new Image();
        var cuerpo1 = new Image();
        var cuerpo2 = new Image();
        var cuerpo3 = new Image();
        
        
        <%-- 
        aca lo intento con variables locales jsp pero no dibuja nada
        --%>
        var xxx = (String)session.getAttribute("xxx");
        var coordenadaX = Integer.parseInt(xxx);
        
        cuerpo.onload = function() {            
            context.drawImage(cuerpo ,  xxx  ,  50,200,200);        
        };
        
        <%-- 
        aca lo intento con variables java pero no dibuja solo esta imagen, las demas si
        --%>
        <%--
        <% String xxx = (String)session.getAttribute("xxx"); %> 
        <% int cooedenadaX; %>
        <% cooedenadaX = Integer.parseInt(xxx); %>           
        <% System.out.println(msg); %> 

        cuerpo.onload = function() {            
            context.drawImage(cuerpo ,  cooedenadaX  ,  50,200,200);        
        };  
        --%>
    
        
        
      
        cuerpo1.onload = function (){
          context.drawImage(cuerpo1, 50, 250,200,350);
        };
     
      cuerpo2.onload = function() {
          context.drawImage(cuerpo2, 50, 450,200,350);        
      };
      
      cuerpo3.onload = function() {
          context.drawImage(cuerpo3, 50, 650,300,350);        
      };
      
      cuerpo.src  = "<%= request.getSession().getAttribute("cuerpo")  %>";
      cuerpo1.src = "<%= request.getSession().getAttribute("cuerpo1") %>";
      cuerpo2.src = "<%= request.getSession().getAttribute("cuerpo2") %>";
      cuerpo3.src = "<%= request.getSession().getAttribute("cuerpo3") %>";
    </script>

    </body>
</html>
