<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Profile Page</title>
        <link rel="stylesheet" href="/CSS/profile.css">
    </head>

    <body class="flex-col">
        <main class="flex-col">
            <div class="empty-top">Empty Space Top</div>
            <div class="center space2">
                <div class="intro">${loggedInUser.getUsername()}'s</div>
                <div>&nbsp;</div>
                <div class="intro">Turn</div>
                <div id ="N">N</div>
                <div class="intro">Burn</div>
                <div>&nbsp;</div>
                <div class="intro">Account</div>
            </div>
            <div class="center space1">
                <div class="intro">Are You Sure You Want To Sign Out?</div>
            </div>
            <div class="center space2">
                <form:form modelAttribute="loggedInUser" action="profile" method="post">
                    <form:button type="submit" class="button-66 center">
                        Sign Out
                    </form:button>
                </form:form>
            </div>
            <div class="center space1">
                    <div class="intro">Cancel And Return To Home Page</div>
            </div>
                <div class="center"><button onclick="window.location.href='/'" class="button-66 center">Cancel</button></div>
        </main>
    </body>
    
</html>