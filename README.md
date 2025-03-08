# EnumDemo

EnumDemo - это Spring Boot-приложение, демонстрирующее использование перечислений (Enum) в API.


## 🚀 Запуск проекта

1. Клонируйте репозиторий:
   ```sh
   git clone https://github.com/username/EnumDemo.git
   cd EnumDemo
   ```
2. Соберите проект с помощью Maven:
   ```sh
   mvn clean install
   ```
3. Запустите приложение:
   ```sh
   mvn spring-boot:run
   ```

## 🔥 API-эндпоинты

### 📌 Отправка сообщения
- **URL:** `POST /api/v1/message/send`
- **Запрос:**
  ```json
  {
    "platform": "CONSOLE"
  }
  ```
- **Ответ:**
  ```json
  {
    "platform": "CONSOLE"
  }
  ```

### 📌 Пример запроса для другой платформы
- **Запрос:**
  ```json
  {
    "platform": "WEB"
  }
  ```
- **Ответ:**
  ```json
  {
    "platform": "WEB"
  }
  ```

## 🛠️ Зависимости

Проект использует следующие зависимости:
- Spring Boot
- Spring Web
- Lombok
- Jackson (для сериализации JSON)
- Maven

## 📜 Лицензия
Этот проект распространяется под лицензией MIT. Свободно используйте и модифицируйте!
