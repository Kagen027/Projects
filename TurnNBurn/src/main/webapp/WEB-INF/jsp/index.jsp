<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>TurnNBurn</title>
        <link rel="stylesheet" href="/CSS/index.css">
    </head>
    
    <body class="flex-col">
        <c:choose>
            <c:when test="${loggedInUser != null && loggedInUser.getIsAdmin() == true}">   
                <nav>
                    <div class="third-width">
                        <a href="" class="navsplash1">Turn</a><a href="" class="navsplash2">N</a><a href="" class="navsplash3">Burn</a>   
                    </div>
                    <div class="third-width justify-center">
                        <a href="/reports" class="navbar-link">Reports</a>
                        <a href="/addVehicle" class="navbar-link">Add Vehicle</a>
                    </div>
                    <div class="third-width justify-right">
                        <div class="admin-icon">A</div>
                        <div class="admin-icon2">d</div>
                        <div class="admin-icon3">m</div>
                        <div class="admin-icon4">i</div>
                        <div class="admin-icon5">n</div>
                        <a href="/profile" class="user-icon">${loggedInUser.getUsername().toUpperCase().charAt(0)}</a>
                    </div>
                </nav> 
            </c:when> 
            <c:when test="${loggedInUser != null}">   
                <nav>
                    <div class="third-width">
                        <a href="" class="navsplash1">Turn</a><a href="" class="navsplash2">N</a><a href="" class="navsplash3">Burn</a>   
                    </div>
                    <div class="third-width">
                    </div>
                    <div class="third-width justify-right">
                        <a href="/profile" class="user-icon">${loggedInUser.getUsername().toUpperCase().charAt(0)}</a>
                    </div>
                </nav> 
            </c:when>  
            <c:otherwise> 
                <nav>
                    <div class="third-width">
                        <a href="" class="navsplash1">Turn</a><a href="" class="navsplash2">N</a><a href="" class="navsplash3">Burn</a>
                    </div>
                    <div class="third-width">
                    </div>
                    <div class="third-width justify-right">
                        <a href="/signUp" class="navbar-link">Sign Up</a>
                        <a href="/signIn" class="navbar-link">Sign In</a>
                    </div>
                </nav>
            </c:otherwise>  
        </c:choose>
        <main class="flex-row justify-center">
            <div class="flex-row">
                <div class="flex-col">
                    <div id="welcome">
                        <div class="neon">Number 1 Dealer For Custom Classics</div>
                    </div>    
                    <div class="hieght-fiddy justify-center space2">
                        <button onclick="window.location.href='/usedListing'" class="button-66">View Our Used Vehicle Invetory</button>
                    </div>
                    <div class="hieght-fiddy justify-center space2">
                        <button onclick="window.location.href='/newListing'" class="button-66">View Our New Vehicle Invetory</button>
                    </div>
                </div>
            </div>    
        </main>  
    </body>
    
</html>