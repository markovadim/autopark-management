## 🚗Autopark Management

#### 💻RESTful web-service on java (Spring Boot). Car registration system.  
![image](https://github.com/markovadim/cryptocurrency-watcher/assets/86801437/4bfcf2c1-d997-409c-8ac9-24dcf5966de1)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white) 
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![Lombok](https://img.shields.io/badge/lombok-%237E4798.svg?style=for-the-badge)
![Mapstruct](https://img.shields.io/badge/Mapsctruct-99FFFF.svg?style=for-the-badge)
![Liquibase](https://img.shields.io/badge/Liquibase-CC3333.svg?style=for-the-badge)
____
### ✅Spring boot starters:
- spring-boot-starter-web
- spring-boot-starter-data-jpa
___
### ✅Build project with gradle wrapper:
    ./gradlew clean build
___
### ✅Docker image base java application can use from dockerhub:  
    docker pull 200605030904/autopark:0.1
### ✅Run application with docker compose (from root directory):
    docker compose up
___
### ✅API
### 👦Owners
|Method| Endpoint | Description |
|----| ------ | ------ |
|GET|/api/v1/owners | Show all owners from database |
|GET| /api/v1/owners/{id} | Search owner by id |
|GET | /api/v1/owners/{id}/cars | Show all owner cars by id |
|POST| /api/v1/owners | Create owner|
|PATCH| /api/v1/owners/{id} |Update owner by id |
|DELETE| /api/v1/owners/{id} | Delete owner by id |

### 🚘Cars
|Method| Endpoint | Description |
|----| ------ | ------ |
|GET|/api/v1/cars | Show all cars from database |
|GET| /api/v1/cars/{id} | Search car by id |
|POST| /api/v1/cars | Create car|
|PATCH| /api/v1/cars/{id} |Update car by id |
|DELETE| /api/v1/cars/{id} | Delete car by id |

### ✅File result of requests by Postman
    aotopark_1.0.postman_collection