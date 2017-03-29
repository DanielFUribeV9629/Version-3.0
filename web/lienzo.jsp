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
            var arma = new Image();
            var armadura = new Image();
            var cuerpo = new Image();
            var escudo = new Image();
            var x = 50;


            <%
                String personaje = (String) session.getAttribute("personaje");
                System.out.println("Se creo el personaje " + personaje);
                String[] personajesArray = personaje.split(",");
            %>


            <%
                int clones = Integer.parseInt(personajesArray[4]);
                
                // for(int i = 1; i <=     clones ; i++) { 
            %>

            arma.src = '<%= personajesArray[0]%>';
            arma.onload = function () {
            <%  int corX = 50;
                for (int i = 1; i <= clones; i++) {%>
                context.drawImage(arma,<%= corX%>, 50, 200, 200);
            <%corX = corX + 100;
                }%>
            };



            armadura.src = '<%= personajesArray[1]%>';
            armadura.onload = function () {
            <%  int corX1 = 50;
                for (int i = 1; i <= clones; i++) {%>
                context.drawImage(armadura,<%= corX1%>, 250, 200, 200);
            <%corX1 = corX1 + 100;
                }%>
            };


            cuerpo.src = '<%= personajesArray[2]%>';
            cuerpo.onload = function () {
            <%  int corX2 = 50;
                for (int i = 1; i <= clones; i++) {%>
                context.drawImage(cuerpo,<%= corX2%>, 450, 200, 200);
            <%corX2 = corX2 + 100;
                }%>
            };


            escudo.src = '<%= personajesArray[3]%>';
            escudo.onload = function () {
            <%  int corX3 = 50;
                for (int i = 1; i <= clones; i++) {%>
                context.drawImage(escudo,<%= corX3%>, 650, 200, 200);
            <%corX3 = corX3 + 100;
                } %>
            };

            <%     // corX = corX+100;
                //System.out.println("se van a crear el clon N " + (i ) + ",  en la posicion: "+ corX); } %>



        </script>

    </body>
</html>
