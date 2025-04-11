# Petstore User API Testleri

Bu proje, [Swagger Petstore API](https://petstore.swagger.io/) üzerinde kullanıcı işlemlerinin (`Create`, `Read`, `Update`, `Delete`) `Rest Assured` kütüphanesi kullanılarak test edilmesini amaçlamaktadır.

## İçerik

Projede aşağıdaki testler bulunmaktadır:

- **UserCreate**: Yeni bir kullanıcı oluşturur.
- **GetUserInfo**: Belirli bir kullanıcıyı sorgular.
- **UserUpdate**: Var olan bir kullanıcıyı günceller.
- **UserDelete**: Var olan bir kullanıcıyı siler.

Tüm isteklerde `Content-Type: application/json` ve `Accept: application/json` başlıkları kullanılmaktadır.

## Kullanılan Teknolojiler

- Java
- Rest Assured
- JUnit
- Maven

## Kurulum

1. Depoyu klonlayın:

   ```bash
   git clone https://github.com/busezmz/APITestRestAssured.git
   ```

2. Proje dizinine geçin:

   ```bash
   cd APITestRestAssured
   ```

3. Bağımlılıkları yükleyin (`pom.xml` kullanıyorsanız):

   ```xml
   <dependencies>
     <dependency>
       <groupId>io.rest-assured</groupId>
       <artifactId>rest-assured</artifactId>
       <version>5.3.0</version>
       <scope>test</scope>
     </dependency>
     <dependency>
       <groupId>junit</groupId>
       <artifactId>junit</artifactId>
       <version>4.13.2</version>
       <scope>test</scope>
     </dependency>
   </dependencies>
   ```

4. Testleri çalıştırın:

   ```bash
   mvn test
   ```

   veya IDE üzerinden ilgili test metodlarını çalıştırabilirsiniz.

## Dikkat Edilmesi Gerekenler

- `UserCreate()` metodunda `id` değeri hatalı yazılmıştır: `"id": 2sdgsj3` → doğru formatta bir sayı olmalıdır, örneğin `"id": 12345`.
- `UserUpdate()` testinde güncellenen `username` ile URL'de kullanılan `username` aynı olmalıdır.
- Aynı kullanıcı adıyla (`username`) tekrar kullanıcı oluşturulursa hata alınabilir. Rastgele kullanıcı adı üretmek önerilir.
  
## API Endpointleri

| Metod | Endpoint | Açıklama |
|------|----------|----------|
| POST | `/v2/user` | Yeni kullanıcı oluşturur |
| GET | `/v2/user/{username}` | Belirli bir kullanıcıyı getirir |
| PUT | `/v2/user/{username}` | Kullanıcı bilgilerini günceller |
| DELETE | `/v2/user/{username}` | Kullanıcıyı siler |

## İletişim

Herhangi bir soru veya katkı için:

- 📧 Email: busezmz@outlook.com
- 🌐 GitHub: [busezmz](https://github.com/busezmz)
