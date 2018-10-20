<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/19/2018
  Time: 12:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Currency Converter</title>
  </head>
  <body>
<form method ="post" action ="/ApplicationCurrency">
    <table>
 <tr>
    <td>
     <label>Rate:</label>
    </td>
      <td>
        <input type = text placeholder="rate" name = "rate" value="2200"/>
   </td>
</tr>
       <tr>
           <td>
           <label>USD:</label>
           </td>
            <td>
                <input type = "text" placeholder="USD"name = "usd" value="0"/>
            </td>
       </tr>
        <tr>
            <td>

            </td>
           <td>
               <button type ="submit">Converter</button>
           </td>

        </tr>

    </table>

</form>
  </body>
</html>
