<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>


    <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Confirmation</title>
            <link rel="stylesheet" href="/CSS/confirmation.css">
        </head>

        <body class="flex-col">
            <c:choose>
                <c:when test="${loggedInUser != null && loggedInUser.getIsAdmin() == true}">
                    <nav>
                        <div class="third-width">
                            <a href="" class="navsplash">Turn</a><a href="" class="navsplashN">N</a><a href=""
                                class="navsplash2">Burn</a>
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
                            <a href="/profile"
                                class="user-icon">${loggedInUser.getUsername().toUpperCase().charAt(0)}</a>
                        </div>
                    </nav>
                </c:when>
                <c:when test="${loggedInUser != null}">
                    <nav>
                        <div class="third-width">
                            <a href="/" class="navsplash">Turn</a><a href="/" class="navsplashN">N</a><a href="/"
                                class="navsplash2">Burn</a>
                        </div>
                        <div class="third-width">
                        </div>
                        <div class="third-width justify-right">
                            <a href="/profile"
                                class="user-icon">${loggedInUser.getUsername().toUpperCase().charAt(0)}</a>
                        </div>
                    </nav>
                </c:when>
                <c:otherwise>
                    <nav>
                        <div class="third-width">
                            <a href="/" class="navsplash">Turn</a><a href="/" class="navsplashN">N</a><a href="/"
                                class="navsplash2">Burn</a>
                        </div>
                        <div class="third-width">
                        </div>
                        <div id="signs" class="third-width justify-right">
                            <a href="/signUp" class="links-top">Sign Up</a>
                            <a href="/signIn" class="links-top">Sign In</a>
                        </div>
                    </nav>
                </c:otherwise>
            </c:choose>
            <main class="flex-col">
                <div class="center space2">
                </div>
                <div id="vehicle" class="center">
                    <c:choose>
                        <c:when test="${vehicle != null}">
                            <div id="vehicle-box" class="flex-col">
                                <c:choose>
                                    <c:when test="${over120 == true}">
                                        <div id="title-box-conf" class="flex-row space2">
                                            <div class="conf">Your Vehicle Has Successfully Been Added To The Listing
                                            </div>
                                        </div>
                                        <div id="title-box" class="flex-row space2">
                                            <div class="title">${vehicle.getYear()}</div>
                                            <div class="title">${vehicle.getMake()}</div>
                                            <div class="title">${vehicle.getModel()}</div>
                                            <div class="justify-right full-width">
                                                <div class="dollar">$</div>
                                                <div class="price-120">${vehicle.getPrice()}</div>
                                            </div>
                                        </div>
                                        <div class="flex-col vehicle-info">
                                            <div id="title-box" class="flex-row space2">
                                                <div class="discount">
                                                    <div class="explenation">!!</div>&nbsp;Tire Burner Special, Hurry
                                                    Now for 10% Off&nbsp;<div class="explenation">!!</div>
                                                </div>
                                                <div id="reduced-price" class="justify-right full-width">
                                                    <div class="dollar">$</div>
                                                    <div class="price">${reducePrice}</div>
                                                </div>
                                            </div>
                                        </div>
                                    </c:when>
                                    <c:otherwise>
                                        <div id="title-box-conf" class="flex-row space2">
                                            <div class="conf">
                                                <div class="explenation">!!</div>&nbsp;Your Vehicle Has Successfully
                                                Been Created&nbsp;<div class="explenation">!!</div>
                                            </div>
                                        </div>
                                        <div id="title-box" class="flex-row space2">
                                            <div class="title">${vehicle.getYear()}</div>
                                            <div class="title">${vehicle.getMake()}</div>
                                            <div class="title">${vehicle.getModel()}</div>
                                            <div class="justify-right full-width">
                                                <div class="dollar">$</div>
                                                <div class="price">${vehicle.getPrice()} </div>
                                            </div>
                                        </div>
                                    </c:otherwise>
                                </c:choose>
                                <div class="flex-col vehicle-info">
                                    <div>Engine:
                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${vehicle.getEngine()}
                                    </div>
                                    <div>Drivetrain:
                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${vehicle.getDriveTrain()}
                                    </div>
                                    <div>Transmission:
                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${vehicle.getTransmission()}
                                    </div>
                                    <div>Type:
                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${vehicle.getType()}
                                    </div>
                                    <div>Doors:
                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${vehicle.getDoor()}
                                        Door</div>
                                    <div>Exterior Color:
                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${vehicle.getExteriorColor()}
                                    </div>
                                    <div id="title-box" class="flex-row">
                                        <div class="add-width">Interior Color:
                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${vehicle.getInteriorColor()}
                                        </div>
                                     </div>
                                </div>
                                <img src="${vehicle.getPic()}" />
                            </div>
                        </c:when>
                    </c:choose>
                </div>
                <c:choose>
                    <c:when test="${loggedInUser != null}">
                        <div id="link-container" class="center bottom">
                            <div><a href="/" class="flex-row links">Home</a></div>
                            <div><a href="/usedListing" class="flex-row links">Used Listings</a></div>
                            <div><a href="/newListing" class="flex-row links">New Listings</a></div>
                            <div><a href="/profile" class="flex-row links">Sign Out</a></div>
                        </div>
                    </c:when>
                    <c:otherwise>
                        <div id="link-container" class="center bottom">
                            <div><a href="/" class="flex-row links">Home</a></div>
                            <div><a href="/usedListing" class="flex-row links">Used Listings</a></div>
                            <div><a href="/newListing" class="flex-row links">New Listings</a></div>
                            <div><a href="/signIn" class="flex-row links">Sign In</a></div>
                            <div><a href="/signUp" class="flex-row links">Sign Up</a></div>
                        </div>
                    </c:otherwise>
                </c:choose>
            </main>
        </body>

</html>