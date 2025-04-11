#  User API Test Project

Bu proje, [Swagger Petstore](https://petstore.swagger.io/) REST API'sini kullanarak kullanıcı CRUD (Create, Read, Update, Delete) işlemlerini **REST Assured** ve **JUnit** ile test etmektedir.

##  Proje İçeriği

`UserTest.java` dosyasında yer alan test senaryoları şunları kapsamaktadır:

- `UserCreate()` : Yeni bir kullanıcı oluşturur.
- `GetUserInfo()` : Oluşturulan kullanıcının bilgilerini getirir.
- `UserUpdate()` : Kullanıcının bilgilerini günceller.
- `UserDelete()` : Kullanıcıyı siler.

##  Kullanılan Teknolojiler

- Java
- JUnit
- REST Assured
- Maven (ya da başka bir build tool - opsiyonel)
