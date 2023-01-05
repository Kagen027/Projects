<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Purchase Confirmation</title>
        <link rel="stylesheet" href="/CSS/purchase.css">
    </head>

    <body class="flex-col">
        <main class="flex-col">
            <div class="empty-top">Empty Space Top</div>
            <div class="flex-row center space2">
                <div class="intro">Thank You</div>
                <div class="name">${loggedInUser.getUsername()}</div>
                <div class="intro">For Purchasing At</div>
                <div>
                    <div class="intro">Turn</div>
                    <div id ="N">N</div>
                    <div class="intro">Burn</div>  
                </div>  
            </div>   
            <div class="center flex-col space1">
                <div class="intro">Your Vehicles has been removed from the listing and one of our</div>
                <div class="intro">Agents will contact you shortly to finalize your sale!</div>
            </div>    
            <div class="center flex-col space1">
                    <div class="intro">Return To Home Page</div>
            </div>
                <div class="center"><button onclick="window.location.href='/'" class="button-66 center">Return Home</button></div>
            
        </main>
    </body>

</html>