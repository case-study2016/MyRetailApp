                              # Glory to God #
                              
# Install Spring Tool Suite STS 3.8.1
http://spring.io/tools/sts

https://www.petrikainulainen.net/programming/spring-framework/creating-a-rest-api-with-spring-boot-and-mongodb/

https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-data-mongodb

http://websystique.com/springmvc/spring-mvc-4-restful-web-services-crud-example-resttemplate/

https://www.infoq.com/articles/boot-microservices  # Sample poduct microservice

https://www.infoq.com/articles/microframeworks1-spring-boot  # secure request service


https://spring.io/guides/gs/accessing-data-mongodb/  Mongo DB

https://dzone.com/articles/product-catalog-mongodb-part-2

http://www.slideshare.net/prasoonk/product-catalog-with-mongodb

https://dzone.com/articles/spring-data-mongodb-spring-boot
https://tests4geeks.com/tutorials/spring-data-boot-mongodb-example/

# http://javabeat.net/restful-springboot-mongodb/  # Useful
http://javabeat.net/restful-springboot-mongodb/

https://tests4geeks.com/tutorials/spring-data-boot-mongodb-example/
https://www.petrikainulainen.net/programming/spring-framework/creating-a-rest-api-with-spring-boot-and-mongodb/

https://examples.javacodegeeks.com/enterprise-java/spring/spring-data-mongodb-rest-example/

https://www.javacodegeeks.com/2014/05/rocking-with-mongodb-on-spring-boot.html

https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-data-mongodb

http://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-nosql.html


https://spring.io/blog/2015/07/14/microservices-with-spring

https://www.infoq.com/articles/microframeworks1-spring-boot



https://www.infoq.com/articles/boot-microservices

https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-data-mongodb
https://www.petrikainulainen.net/programming/spring-framework/creating-a-rest-api-with-spring-boot-and-mongodb/


http://swagger.io/swagger-ui/


#TODO
# put code in github
# Create basic spring boot folder structure
# Implement Swagger UI
# create http://localhost:8080/MyRetailApp/products/{id}
# Request http://localhost:8080/MyRetailApp/products/15117729
# Response 
{
  "id": 13860428,
  "name": "The Big Lebowski (Blu-ray) (Widescreen)",
  "current_price": {
    "value": 13.49,
    "currency_code": "USD"
  }
}

# product name should be retrieved from another API HTTP GET 
# API versioning?
# Pagination 
# Security
# Read pricing information from a NoSQL datastore
# Accepts an HTTP PUT request at the same path (/products/{id}).JSON   request body similar to the GET response,updates the product’s price in the data store.
# https://spring.io/guides/gs/accessing-data-mongodb/


# Setting your email address for every repository on your computer

Open Git Bash.

Set your email address with the following command:

git config --global user.email "your_email@example.com"
Confirm that you have set your email address correctly with the following command.

git config --global user.email
your_email@example.com



Set up your local directory
Set up Git on your machine if you haven't already.


mkdir /path/to/your/project
cd /path/to/your/project
git init
git remote add origin https://remyaboben@bitbucket.org/remyaboben/autoserv_v1.git
Create your first file, commit, and push
echo "remyaboben" >> contributors.txt
git add contributors.txt


git commit -m 'Initial commit with contributors'
git push -u origin master

#  MONGO DB
http://javabeat.net/monogodb-installation-windows/

# expose API to multiple store clients

http://docs.spring.io/spring-data/mongodb/docs/1.2.x/reference/html/mongo.repositories.html

https://docs.mongodb.com/manual/reference/method/js-database/

http://www.javaadvent.com/2014/12/creating-a-rest-api-with-spring-boot-and-mongodb.html



# commands for mongo db
https://www.tutorialspoint.com/mongodb/mongodb_environment.htm

db.stats()
use MyRetail
db
use test
show dbs
db.book
show collections
book
db.book
db.book.find()


# http://www.jsonschema2pojo.org/
This is to generate TOs based on json
http://www.java2blog.com/2013/11/gson-example-read-and-write-json.html
http://stackoverflow.com/questions/5490789/json-parsing-using-gson-for-java
https://codedump.io/share/iWszq4CbXa5r/1/creating-a-restful-web-service-with-spring-boot
# error and exception handling for product name API

#installed postman sign in using libin.starr google account

# PCF integration
https://login.run.pivotal.io/login
https://pivotal.io/platform/pcf-tutorials/getting-started-with-pivotal-cloud-foundry-dev/introduction
http://docs.run.pivotal.io/
http://docs.run.pivotal.io/cf-cli/install-go-cli.html#windows
https://console.run.pivotal.io/tools
Hello*****

# mongodb commands
FIRST CMD ADMIN WINDOW
C:\mongodb\bin>mongo.exe
MongoDB shell version: 3.2.9
connecting to: test
> show dbs
MyRetail      0.000GB
PriceInfo     0.000GB
ProductPrice  0.000GB
local         0.000GB
test          0.000GB

SECOND CMD ADMIN WINDOW

C:\mongodb\bin>mongod.exe --dbpath="c:\mongodb\data\db"
 use ProductPrice
 db.productPriceInfo.find().pretty();
 