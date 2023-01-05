# TurnNBurn
Welcome to TurnNBurn, the best vehicle Dealership you have ever seen. 
Best inventory you have ever seen I should say... well if you have the same taste in cars as I do because this project was really 
just an opportunity for me to nerd out on all my dream car restoration builds. Enjoy!

## Details
This is my first ever Full Stack Java Project. In this project I was tasked to create a Dealership website with certain functionality (Assignment details listed below).
This Project Utilizes Mysql Database, Springboot, Maven, JSP, JSTL, HTML, and CSS. If you decide to connect this to a MySql database and really check this to its full potential,
all the SQL Statements have ben listed bellow to add some users and vehicles to give the site a more practical look without having to take the time to create multiple vehicles and
users yourself. Also a couple test cases for the add vehicle functionality within the Admin role. !!Warning!! Potential employers be wary, there is no turning back after this level of background searching and verification... for a junior level Dev postion you will be impressed and you will feel the overwhelming urge to have me on your team. Humbly and respectfully ofcourse ;) !! Warning !! In all seriousness whoever you are thank you for taking the time to view my code and application and I hope you enjoy!

## Assignment
Car Sales system is an application that computerizes the conventional car sale procedure which we are aware of. This is a Java/Spring JSP based application. This helps in managing data related to buyers and sellers of the cars. Business reports can also be generated and viewed.

This program should handle a new and used vehicles inventory with minimum 10 cars. Every detail of a vehicle like manufacturer name, date of purchase, mileage ( in case of used vehicles), price, make/model, car description picture/s of the car etc.

If a user click to view details of a car we should display the car details :eg
name, model, year build, price, description, picture, etc...

If a car is sitting in inventory for more than 120 days, there is be an option to place a bid on the car.
Bidding cars can be sold at a discounted price up to 10% if and only if the dealership's purchase date is over 120 days.

The inventory should have minimum 3 cars with idle days of 120+.
The inventory should have an option to replenish the inventory by adding pictures and details of a car.

The application to have a reporting section which display information about all transactions made, including the person who purchase the car. 
This reporting page should order transaction by date starting with the most recent purchase.
Only Admins should be able to access the reporting section

A user should also be able to search for a type (model) car from the inventory.

The inventory should only have cars available to be sold. If a car has been sold 
the inventory should reflect this behavior. 

Bonus:
Add functionality to add a new car for admins to the inventory including a display photo of the car. 

## SQL For Vehicles
INSERT INTO turnnburn.vehicle
VALUES (1, "10/13/2022", null, 2, "Rearwheel Drive", "6.6L LS2 Stroker V8", "Matte Black", "Black", "Cheverolet", "Nova", "https://i.pinimg.com/originals/db/50/4e/db504ec3c2219000b51534d59f9ec51f.jpg", 24999, 0, "4L60E", "Compact", 1, null, "5FPYK1F79CB484156", 1969, null);

INSERT INTO turnnburn.vehicle
VALUES (2, "10/20/2022", null, 2, "Rearwheel Drive", "6.2L LS3 V8", "Gray", "Black", "Pontiac", "Trans Am", "https://coolmaterial.com/wp-content/uploads/2020/05/1974-Pontiac-Firebird-Restomod-Auction-2.jpg", 32999, 0, "T56 Super Magnum six-speed manual", "Coupe", 1, null, "1C4PJMBS9EW219884", 1974, null);

INSERT INTO turnnburn.vehicle
VALUES (3, "08/01/2022", null, 2, "Rearwheel Drive", "5.0L Coyote V8", "Gray", "Black", "Ford", "Mustang", "https://www.thedrive.com/content/2020/02/classic-recreations-hit-man-mustang-05-1.jpg?quality=85&auto=webp&optimize=high&quality=70&width=1440", 39999, 0, "C4 three-speed automatic", "Coupe", 1, null, "4A3AB36F64E194907", 1969, null);

INSERT INTO turnnburn.vehicle
VALUES (4, "07/15/2022", null, 2, "Rearwheel Drive", "5.3L LS1 V8", "Orange", "Black", "Pontiac", "GTO", "https://autowise.com/wp-content/uploads/2015/03/Screen-Shot-2015-03-04-at-7.40.14-PM-1024x608.png", 49999, 0, "T56 Super Magnum six-speed manual", "Coupe", 1, null, "1HGCP2F6XCA097594", 1969, null);

INSERT INTO turnnburn.vehicle
VALUES (5, "09/24/2022", null, 2, "Rearwheel Drive", "6.0L LQ9 V8", "Black & Yellow", "Black", "Cheverolet", "Camaro", "https://static1.pt-content.com/images/pt/2013/05/Fumblebee-1.jpg", 35999, 0, "T56 Super Magnum six-speed manual", "Coupe", 1, null, "1FBSS3BL8BDB78864", 1968, null);

INSERT INTO turnnburn.vehicle
VALUES (6, "10/3/2022", null, 2, "Rearwheel Drive", "6.2L LS3 V8", "Maroon", "Black", "Cheverolet", "Camaro", "https://forgeline.com/wp-content/uploads/2017/08/customer_vehicle_photo-large_image-12068.jpg", 48999, 0, "T56 Super Magnum six-speed manual", "Coupe", 1, null, "5NHUEH6237Y041516", 1971, null);

INSERT INTO turnnburn.vehicle
VALUES (7, "12/3/2022", null, 2, "Rearwheel Drive", "Preditor 5.2L Supercharged V-8", "Maroon", "Black", "Ford", "Mustang Shelby GT500", "https://cdn.carbuzz.com/gallery-images/2022-ford-mustang-shelby-gt500-carbuzz-532275.jpg", 78999, 0, "7-speed automatic", "Coupe", 0, null, "1FMCU9EG1CKA83955", 2022, null);

INSERT INTO turnnburn.vehicle
VALUES (8, "12/8/2022", null, 4, "Allwheel Drive", "Mopar SRT 6.2L Hellcat V8", "Light Gray", "Tan", "Dodge", "Charger Hellcat", "https://www.dodge.com/content/dam/fca-brands/na/dodge/en_us/2022/charger/gallery/desktop/2022-dodge-charger-gallery-exterior-2.jpg.image.1440.jpg", 77999, 0, "8-speed automatic", "Sedan", 0, null, "5LMJJ2J53EEL98430", 2022, null);

INSERT INTO turnnburn.vehicle
VALUES (9, "12/20/2022", null, 2, "Rearwheel Drive", "Mopar SRT 6.2L Hellcat V8", "Green", "Gray", "Dodge", "Challenger Hellcat", "https://www.autotrader.com/wp-content/uploads/2022/10/2023-dodge-challenger-srt-hellcat-front.jpg", 66999, 0, "8-speed automatic", "Coupe", 0, null, "1GBKC34J1YF446675", 2022, null);

INSERT INTO turnnburn.vehicle
VALUES (10, "08/21/2022", null, 2, "Rearwheel Drive", "Mopar 6.2L HEMI SRT Demon V8", "Matte Black", "Light Brown", "Dodge", "Challenger Demon", "https://cdn.carbuzz.com/gallery-images/1600/475000/800/475854.jpg", 84999, 0, "8-speed automatic", "Coupe", 0, null, "2T2BK1BA6DC196502", 2022, null);

INSERT INTO turnnburn.vehicle
VALUES (11, "01/01/2023", null, 2, "Rearwheel Drive", "6.2 L V8", "Blue", "Black", "Cheverolet", "Camaro ZL1", "https://www.callawaycars.com/wp-content/uploads/2020/10/camaro_pr2A-1.jpg", 63999, 0, "six-speed manual", "Coupe", 0, null, "1G8ZY1270XZ378660", 2022, null);

INSERT INTO turnnburn.vehicle
VALUES (12, "12/20/2022", "2022-12-25", 2, "Rearwheel Drive", "6.2L LS9 Supercharged", "Navy", "Black", "Equus", "Bass 770", "https://images8.alphacoders.com/685/thumb-1920-685895.jpg", 125999, 1, "8-speed automatic", "Coupe", 0, 2, "1FT7W2AT6EEA13282", 2022, 2);

INSERT INTO turnnburn.vehicle
VALUES (13, "08/21/2022", "2023-01-02", 2, "Rearwheel Drive", "7MGTE 3.0L Turbo", "Light Gray", "Black", "Toyota", "Supra", "https://www.motortrend.com/uploads/2022/06/1989-supra-front-quarter-rolling.jpg", 84999, 1, "8-speed automatic", "Coupe", 1, 2, "2HKYF18724H538006", 1990, 2);

INSERT INTO turnnburn.vehicle
VALUES (14, "01/01/2023", "2023-01-02", 2, "Rearwheel Drive", "2JZ 3.0L Twin Turno", "Gold", "Black", "Datsun", "240Z", "https://i.pinimg.com/originals/67/e1/5c/67e15ce9b2a1b5abbf94b490feeb5429.jpg", 63999, 1, "six-speed manual", "Coupe", 1, 3, "JTDBT923681258444", 1969, 3);

SELECT * FROM turnnburn.vehicle;SELECT * FROM turnnburn.vehicle;

## SQL For Users
INSERT INTO turnnburn.user values (1, "MasterChief@gmail.com", "John", 1, "117", "cortona", "192-324-2342", "MasterChief");

INSERT INTO turnnburn.user values (2, "JamesonLocke@gmail.com", "Jameson", 0, "Locke", "1234", "123-324-2342", "Lockey");

INSERT INTO turnnburn.user values (3, "Arbiter4Life@gmail.com", "Arbiter", 0, "192", "elites", "192-324-2342", "Arbiter");

SELECT * FROM turnnburn.user;

## Vehicle Info To Add 
Feel Free to make your own Vehicles! In case you don't though, here are some vehicles to fill the form to test the functionality.

2022 Shelby GT350

vin: KNDJN2A20F7767381
used: false
already sold: false
year: 2022
make: Ford
Model: Mustang Shelby GT350
Door: 2
Type: Coupe
Engine: Shelby 5.2L V8
Transmission: 6 Speed Manual
Drivetrain: Rearwheel Drive
Interior Color: Black
Exterior Color: White (Blue Racing Stripes)
Picture URL: https://images5.alphacoders.com/676/thumb-1920-676791.jpg
Price: 68999
Date Arrived: 01/04/2023

2022 Porsche 911 Turbo S

vin: ZGMDU23LX5D290993
used: false
already sold: false
year: 2022
make: Porsche
Model: 911 Turbo S
Door: 2
Type: Coupe
Engine: Shelby 3.7L Twin-turbocharger
Transmission: 8 Speed Automatic
Drivetrain: Rearwheel Drive
Interior Color: Black
Exterior Color: Navy Blue
Picture URL: https://hips.hearstapps.com/hmg-prod/images/2021-porsche-911-turbo-s-lightweight-108-1642714367.jpg?crop=1.00xw:1.00xh;0,0&resize=1200:*
Price: 194999
Date Arrived: 01/05/2023

1970 Chevelle SS

vin: FGMDU23LX5D290993
used: false
already sold: false
year: 1970
make: Chevrolet
Model: Chevelle SS
Door: 2
Type: Coupe
Engine: 6.0 LS2
Transmission: 6 Speed Manual
Drivetrain: Rearwheel Drive
Interior Color: Black
Exterior Color: Black
Picture URL: https://live.staticflickr.com/7442/8727940041_43fc910640_b.jpg
Price: 52,999
Date Arrived: 01/05/2023
