<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Sign In</title>
        <link rel="stylesheet" href="/CSS/signUp.css">
    </head>
    
    <body class="flex-col">
        <main class="flex-col">
            <div class="empty-top">Empty Space Top</div>
            <div class="center space2">
                <div class="intro">Sign Into Your</div>
                <div>&nbsp;</div>
                <div class="intro">Turn</div>
                <div id ="N">N</div>
                <div class="intro">Burn</div>
                <div>&nbsp;</div>
                <div class="intro">Account</div>
            

            <form:form modelAttribute="user" action="signIn" method="post">
            </div>
                <div class="center space1"><form:input path="username" type="text" placeholder="Username" /></div>
                <div class="center space1"><form:input path="password" type="password" placeholder="Password" /></div>
                <div class="center"><form:button type="submit" class="button-66 center">Sign In</form:button></div>
            </form:form>

            <div id="link-container"class="center bottom">
                <div><a href="/" class="flex-row links">Home</a></div>
                <div><a href="/signUp" class="flex-row links">Sign Up</a></div>
                <div><a href="/usedListing" class="flex-row links">Used Listings</a></div>
                <div><a href="/newListing" class="flex-row links">New Listings</a></div>
            </div>
        </main>
    </body>
</html>