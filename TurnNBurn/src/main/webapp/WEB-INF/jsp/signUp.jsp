<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Sign Up</title>
        <link rel="stylesheet" href="/CSS/signUp.css">
    </head>
    
    <body class="flex-col">
        <main class="flex-col">
            <div class="empty-top">Empty Space Top</div>
            
            <div class="center space2">
                <div class="intro">Sign Up For</div>
                <div>&nbsp;</div>
                <div class="intro">Turn</div>
                <div id ="N">N</div>
                <div class="intro">Burn</div>
                <form:form modelAttribute="user" action="signUp" method="post">   
                    </div>
                        <div class="center space1"><form:input path="firstName" type="text" placeholder="First Name" /></div>
                        <div class="center space1"><form:input path="lastName" type="text" placeholder="Last Name" /></div>
                        <div class="center space1"><form:input path="phone" type="tel" placeholder="Phone 123-123-4567" pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}" required="true" /></div>
                        <div class="center space1"><form:input path="email" type="email" placeholder="Email Address" /></div>
                        <div class="center space1"><form:input path="username" type="text" placeholder="User Name" /></div>
                        <div class="center space1"><form:input path="password" type="password" placeholder="Password" /></div>
                        <div><form:input type = "hidden" path= "isAdmin" value = "0" /></div>
                        <div class="center"><form:button type="submit" class="button-66 center">Sign Up</form:button></div>
                </form:form>
                <div class="message"><c:if test="${message != null}">${message}</c:if></div>
                
            <div id="link-container"class="center bottom">
                <div><a href="/" class="flex-row links">Home</a></div>
                <div><a href="/signIn" class="flex-row links">Sign In</a></div>
                <div><a href="/usedListing" class="flex-row links">Used Listings</a></div>
                <div><a href="/newListing" class="flex-row links">New Listings</a></div>
            </div>
        </main>
    </body>
</html>