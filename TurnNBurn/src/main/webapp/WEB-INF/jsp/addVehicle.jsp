<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>



    <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Add Vehicle</title>
            <link rel="stylesheet" href="/CSS/addVehicle.css">
        </head>

        <body class="flex-col">
            <main class="flex-col">
                <div class="empty-top">Empty Space Top</div>

                <div class="center space2">
                    <div class="intro">Add Vehicle To Listing</div>
                    <div>&nbsp;</div>
                    <div class="intro">Turn</div>
                    <div id="N">N</div>
                    <div class="intro">Burn</div>
                    <form:form modelAttribute="vehicle" action="addVehicle" method="post">
                </div>
                <div class="center space1">
                    <form:input path="Vin" type="text" placeholder="Vin" pattern="\w{17}" required="true" />
                </div>
                <div class="center space1">
                    <form:input path="Used" type="text" placeholder="Is It Used True/False" />
                </div>
                <div class="center space1">
                    <form:input path="Sold" type="text" placeholder="Already Sold True/False" />
                </div>
                <div class="center space1">
                    <form:input path="Year" type="text" placeholder="Year '1234'" pattern="[0-9]{4}" required="true" />
                </div>
                <div class="center space1">
                    <form:input path="Make" type="text" placeholder="Make" />
                </div>
                <div class="center space1">
                    <form:input path="Model" type="text" placeholder="Model" />
                </div>
                <div class="center space1">
                    <form:input path="Door" type="text" placeholder="Door" pattern="[0-4]{1}" required="true" />
                </div>
                <div class="center space1">
                    <form:input path="Type" type="text" placeholder="Type" />
                </div>
                <div class="center space1">
                    <form:input path="Engine" type="text" placeholder="Engine" />
                </div>
                <div class="center space1">
                    <form:input path="Transmission" type="text" placeholder="Transmission" />
                </div>
                <div class="center space1">
                    <form:input path="DriveTrain" type="text" placeholder="Drivetrain" />
                </div>
                <div class="center space1">
                    <form:input path="InteriorColor" type="text" placeholder="Interior Color" />
                </div>
                <div class="center space1">
                    <form:input path="ExteriorColor" type="text" placeholder="Exterior Color" />
                </div>
                <div class="center space1">
                    <form:input path="Pic" type="text" placeholder="Picture URL" />
                </div>
                <div class="center space1">
                    <form:input path="Price" type="text" placeholder="Price" />
                </div>
                <div class="center space1">
                    <form:input path="DateArrived" type="text" placeholder="DateArrived MM/DD/YYYY" />
                </div>
                <div class="center space1">
                    <form:input path="DateSold" type="text" placeholder="DateSold YYYY/MM/DD" />
                </div>
                <div class="center">
                    <form:button type="submit" class="button-66 center">Submit</form:button>
                </div>
                </form:form>
                <div class="message">
                    <c:if test="${message != null}">${message}</c:if>
                </div>

                <div id="link-container" class="center">
                    <div><a href="/" class="flex-row links bottom">Home</a></div>
                    <div><a href="/signIn" class="flex-row links bottom">Sign In</a></div>
                    <div><a href="/usedListing" class="flex-row links bottom">Used Listings</a></div>
                    <div><a href="/newListing" class="flex-row links bottom">New Listings</a></div>
                </div>
            </main>
        </body>

</html>