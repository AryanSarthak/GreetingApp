# 📘 Greeting REST API (Spring MVC)

A **Spring REST API** project built using **Spring MVC (Non-Spring Boot)** for managing greeting messages.
This project demonstrates **Controller → Service → Repository layered architecture** using in-memory storage.

---

## 🚀 Features

* ✅ Basic Hello World REST Endpoint
* ✅ Greeting using Service Layer
* ✅ Greeting using Query Parameters (firstName, lastName)
* ✅ Save Greeting Message
* ✅ Get Greeting By ID
* ✅ Get All Greetings
* ✅ Update Greeting Message
* ✅ Delete Greeting Message
* ✅ In-Memory Storage using HashMap
* ✅ Spring MVC XML Configuration

---

## 🛠️ Tech Stack

* **Java 8**
* **Spring Framework 6 (Spring MVC)**
* **Maven**
* **Jackson (JSON Processing)**
* **Servlet API**
* **WAR Deployment (Tomcat / Any Servlet Container)**

---

## ⚙️ Setup & Installation

### 1️⃣ Clone Repository

```bash
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
```

---

### 2️⃣ Build Project

```bash
mvn clean install
```

---

### 3️⃣ Deploy WAR File

Deploy generated WAR file inside Tomcat:

```
target/hello-rest-app.war
```

Copy to:

```
tomcat/webapps/
```

Start Tomcat server.

---

## 📡 API Endpoints

| Method | Endpoint                              | Description            |
| ------ | ------------------------------------- | ---------------------- |
| GET    | /greeting                             | Hello World            |
| GET    | /greeting/service                     | Greeting using service |
| GET    | /greeting/user?firstName=A&lastName=B | Greeting using name    |
| POST   | /greeting?message=Hello               | Save greeting          |
| GET    | /greeting/{id}                        | Get greeting by ID     |
| GET    | /greeting/all                         | Get all greetings      |
| PUT    | /greeting/{id}?message=Hi             | Update greeting        |
| DELETE | /greeting/{id}                        | Delete greeting        |

---

## 🧪 Example Usage

### Create Greeting

```
POST /greeting?message=Hello Spring
```

### Response

```json
{
  "id": 1,
  "message": "Hello Spring"
}
```

---

## 🧠 Architecture Flow

```
Client Request
     ↓
Controller Layer
     ↓
Service Layer
     ↓
Repository Layer (HashMap Storage)
```

---

## 📌 Future Improvements

* 🔐 Add Spring Security
* 💾 Add Database (MySQL / PostgreSQL)
* 📄 Add Swagger Documentation
* 🧪 Add Unit Testing
* ☁️ Docker Deployment

---

## 👨‍💻 Author

**Aryan Sarthak**

---

## ⭐ Contributing

Pull requests are welcome. For major changes, please open an issue first.

---

## 📜 License

This project is licensed under the MIT License.
