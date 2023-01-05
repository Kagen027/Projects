<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>New Vehicle Listing</title>
        <link rel="stylesheet" href="/CSS/newListing.css">
    </head>
    
    <body class="flex-col">
        <c:choose>
            <c:when test="${loggedInUser != null && loggedInUser.getIsAdmin() == true}">   
                <nav>
                    <div class="third-width">
                        <a href="" class="navsplash">Turn</a><a href="" class="navsplashN">N</a><a href="" class="navsplash2">Burn</a>   
                    </div>
                    <div id="tops" class="third-width justify-center">
                        <a href="/reports" class="links-top">Reports</a>
                        <a href="/addVehicle" class="links-top">Add Vehicle</a>
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
                        <a href="/" class="navsplash">Turn</a><a href="/" class="navsplashN">N</a><a href="/" class="navsplash2">Burn</a>  
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
                        <a href="/" class="navsplash">Turn</a><a href="/" class="navsplashN">N</a><a href="/" class="navsplash2">Burn</a>
                    </div>
                    <div class="third-width">
                    </div>
                    <div id= "signs"class="third-width justify-right">
                        <a href="/signUp" class="links-top">Sign Up</a>
                        <a href="/signIn" class="links-top">Sign In</a>
                    </div>
                </nav>
            </c:otherwise>  
        </c:choose>   
        <main class="flex-col">
            <div class="center space7">
                <div class="intro">Turn</div>
                <div id ="N">N</div>
                <div class="intro">Burn</div>
                <div>&nbsp;</div>
                <div class="intro">New Vehicle Invetory</div>
            </div>
            <div class="flex-col center">
                    <h1 class="center">Filter By Make</h1>
                    <div class="flex-row filter">
                        <c:forEach items="${filterList}" var="filter">
                            <c:choose>
                                    <c:when test = "${activeFilter == 'Reset'}">
                                    </c:when>
                        
                                    <c:when test = "${activeFilter == 'Make'}">
                                    <a class="button-2" href="/vehicleByMakeNew/${filter}">${filter}</a>
                                    </c:when>
                            </c:choose>
                        </c:forEach> 
                        <a class="button-3" href="/newListing">RESET</a>
                    </div>
            </div>
            <div id="vehicles" class="center flex-row">
                <c:forEach var="allVehicles" items="${allVehicles}">
                    <c:choose>
                        <c:when test="${allVehicles.getSold() != true}">
                            <div id="vehicle-box"class="flex-col">
                                <c:choose>
                                    <c:when test="${over120 == true}"> 
                                        <div id= "title-box" class="flex-row space2">
                                            <div class="title">${allVehicles.getYear()}</div>
                                            <div class="title">${allVehicles.getMake()}</div>
                                            <div class="title">${allVehicles.getModel()}</div>
                                            <div class="justify-right full-width"><div class="dollar">$</div><div class="price-120">${allVehicles.getPrice()}</div></div>
                                        </div>
                                        <div class="flex-col vehicle-info">
                                            <div id= "title-box" class="flex-row space2">
                                                <div class="discount"><div class="explenation">!!</div>&nbsp;Tire Burner Special, Hurry Now for 10% Off&nbsp;<div class="explenation">!!</div></div>
                                                <div id= "reduced-price" class="justify-right full-width"><div class="dollar">$</div><div class="price">${reducePrice}</div></div>
                                            </div>
                                        </div>
                                    </c:when>
                                    <c:otherwise>
                                        <div id= "title-box" class="flex-row space2">
                                            <div class="title">${allVehicles.getYear()}</div>
                                            <div class="title">${allVehicles.getMake()}</div>
                                            <div class="title">${allVehicles.getModel()}</div>
                                            <div class="justify-right full-width"><div class="dollar">$</div><div class="price">${allVehicles.getPrice()} </div></div>
                                        </div>
                                    </c:otherwise>
                                </c:choose>
                                <div class="flex-col vehicle-info">
                                    <div>Engine:  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${allVehicles.getEngine()}</div>
                                    <div>Drivetrain: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${allVehicles.getDriveTrain()}</div>
                                    <div>Transmission: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${allVehicles.getTransmission()}</div>
                                    <div>Type:  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${allVehicles.getType()}</div>
                                    <div>Doors:  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${allVehicles.getDoor()} Door</div>
                                    <div>Exterior Color:   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${allVehicles.getExteriorColor()}</div>
                                    <div id= "title-box" class="flex-row">
                                    <div class="add-width">Interior Color:  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${allVehicles.getInteriorColor()}</div>
                                    <div class="justify-right full-width"><button onclick="window.location.href='/details/${allVehicles.getId()}'"class="button-1" role="button">Details</button></div>  
                                </div>  
                                </div>
                                <img src="${allVehicles.getPic()}" />
                            </div>
                        </c:when>    
                    </c:choose>
                </c:forEach>
            </div>
            <c:choose>
                <c:when test="${loggedInUser != null}"> 
                    <div id="link-container"class="center bottom">
                        <div><a href="/" class="flex-row links">Home</a></div>
                        <div><a href="/usedListing" class="flex-row links">Used Listings</a></div>
                        <div><a href="/profile" class="flex-row links">Sign Out</a></div>
                    </div>
                </c:when>
                <c:otherwise>
                    <div id="link-container"class="center bottom">
                        <div><a href="/" class="flex-row links">Home</a></div>
                        <div><a href="/usedListing" class="flex-row links">Used Listings</a></div>
                        <div><a href="/signIn" class="flex-row links">Sign In</a></div>
                        <div><a href="/signUp" class="flex-row links">Sign Up</a></div>
                    </div> 
                </c:otherwise>
            </c:choose>
        </main>
    </body>
</html>