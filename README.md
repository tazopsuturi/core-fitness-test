# Test Automation Project

## 📌 Project Overview ##

This is a Test Automation Framework built using: Java, Selenium (Aquality), Cucumber, and TestNG.  
The project automates testing for the https://corefitness.vercel.app/en-US/login functionality, ensuring that all features  
of the website work as expected and maintain high quality.  


---


## 🛠️ Tech Stack ##

#### - Programming Language: Java

#### - Test Framework: TestNG

#### - Automation Tool: Selenium with Aquality Framework

#### - BDD Framework: Cucumber

#### - Build Tool: Maven

#### - Version Control: Git  


## 📁 Project Structure ##


```bash

├── src
│   ├── test
│   │   ├── java
│   │   │   ├── features/        # Cucumber Feature Files
│   │   │   ├── hooks/           # Browser setup and teardown
│   │   │   ├── models/          # Data models
│   │   │   ├── pages/           # Page Objects
│   │   │   ├── runners/         # TestNG Runner
│   │   │   ├── stepdefinitions/ # Cucumber Step Definitions
│   │   │   ├── utils/           # Utility classes
│   │   ├── resources
│   │   │   ├── environment/     # Environment configurations
 
```


## 🚀 Getting Started ##

### 🔧 Setting Up `config.json`


***Ensure you have the following installed on your system:***


- Java (JDK 11 or later)

- Maven (for dependency management)

- IntelliJ IDEA (or any preferred IDE)

- Git (for version control)

- ChromeDriver (for running Selenium tests)

---

### 🔐 Configuration & Data Handling

***This project also includes a **`ConfigReader`** class that reads test data from a `config.json` file.  
However, **the `config.json` file is not included in the repository** for security reasons,  
as it contains sensitive data such as user credentials and environment settings.***

### ⚠️ Note:

Users who wish to run the tests, create a `config.json` file inside the `resources` directory with the necessary test data. Below is an example structure:

```json
{
  "user": {
    "email": "your-email@example.com",
    "password": "your-password"
  },
  "url": "https://corefitness.vercel.app/en-US/login"
}

```

## 👥 Contributors

Special thanks to [@Iamyouandwhatiseeisme](https://github.com/Iamyouandwhatiseeisme) for contributions to this project!

---
## 🌱 Future Enhancements ##

- **Expand Automation Flow**:  
  Add more tests to automate other features of the website, such as adding products to the cart or navigating between different pages.  

- **Error Handling**:  
  Improve error handling by adding assertions and better logging to track the execution flow.  


## 📣 Feedback and Contributions ##

Feel free to open issues or submit pull requests for bug fixes, improvements, or new features. Contributions are welcome!  
