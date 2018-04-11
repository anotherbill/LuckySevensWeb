<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <title>Lucky Sevens</title>
    </head>
    <body>
        <h1>Lucky Sevens!  Good Luck!</h1>
        
        
        <h2>How much Money do you wish to lose today?  ;)</h2>
        
        <form action='LuckySevensServlet' method="post">
            Answer: <input type="text" name="answer"/> ${errorMessage}<br>
            
            <br>
            <input type="submit" value="Submit"/>
            
        </form>
        
    </body>
</html>
