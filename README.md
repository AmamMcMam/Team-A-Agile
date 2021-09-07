# Team-A-Agile

## Table of Contents
- [Setup Instructions](#setup-instructions)
    - [Backend Setup](#backend-setup)
        - [Java SDK](#java-sdk)
        - [Intellij](#intellij)
        - [Configuration Setup](#configuration-setup)
    - [Access Backend Endpoints](#access-backend-endpoints)
    - [Frontend Setup](#frontend-setup)
        - [Microsoft Visual Studio](#microsoft-visual-studio)
- [Testing Instructions](#testing-instructions)
    - [Unit Tests](#unit-tests)
    - [Cucumber Tests](#cucumber-tests)
    - [Run Linting Check](#run-linting-check)

## Team A Agile Project
[![CircleCI](https://circleci.com/gh/AmamMcMam/Team-A-Agile/tree/main.svg?style=svg)](https://circleci.com/gh/AmamMcMam/Team-A-Agile/tree/main)
[![codecov](https://codecov.io/gh/AmamMcMam/Team-A-Agile/branch/main/graph/badge.svg?token=574D2USDKR)](https://codecov.io/gh/AmamMcMam/Team-A-Agile)

## Setup Instructions

### Backend Setup

####  **Java SDK**
This project requires Java JDK version 16:
- [JDK 16 Download](https://www.oracle.com/java/technologies/javase-jdk16-downloads.html)


####  **Intellij**
For the backend we recommend you install Intellij Community Edition if you don't already have it. Here is a link to the download page:

- [Intellij Download](https://www.jetbrains.com/idea/download/#section=mac)

You will then need to open the JavaWebService file which is in:

 Team-A-Agile/backend

#### **Configuration Setup**

1. You will need to create a file called "config.properties" in the resource folder to hold your database credentials. The resource folder is located in:

```
backend
└───JavaWebService
│   └───src
│   |   └───main
│   │    │   └───resources
│   │    │   │   config.properties
```

2. Put the following inside config.properties file:

```
driver: <path to database driver>
username: <database username>
password: <database password>
url: <database url>
```
Run the following command to install all maven dependencies:

```
mvn clean install
```

3. Update the program arguments. If using IntelliJ, press the 'Edit Configurations' button:
![reference](images/setup1.png)

In the 'program arguments' field add the following:

```server config.yml```

---

### Access Backend Endpoints

With the backend running you should be able to view various requests to the database server by going to:

http://localhost:8080/api

Please check the API documentation to find more specific endpoints:
http://localhost:8080/swagger


---

### Frontend Setup

####  **Microsoft Visual Studio**

For the frontend we recommend you use Microsoft Visual Studio Code.

- [Microsoft Visual Studio Code download](https://code.visualstudio.com/?wt.mc_id=vscom_downloads)

1. In the root of the frontend folder create an environment file (.env).
```
frontend
└───src
│   │ .env
```

3. Include the following inside the .env file:
```
API_URL=http://localhost:<PORT>/api
```

4. Run the following command in terminal to install necessary packages:
```
npm install
```

Run the following command to start the web-application:
```
npm start
``` 

Once both the frontend and the backend are running you can view the frontend.

To view the frontend, follow this link: http://localhost:6555/

---

## Testing Instructions

### Unit Tests

The unit tests for the backend are located in the test folder:

```
backend
└───JavaWebService
│   └───src
│   │   └───test
│   │   │   └───java
│   │   │   │   │ BandsControllerTest.java
│   │   │   │   │ CapabilityControllerTest.java
│   │   │   │   │ JobRolesControllerTest.java

```


If you want to run all of the Unit tests, type in the terminal:
```
mvn test
```
---

### Cucumber Tests

You will need chromedriver installed:

- [Download](https://chromedriver.chromium.org/downloads)

The Selenium tests can be found in the integration folder.

```
integration
└───src
│   └───test
│   │   └───java
│   │   │   └───integration
│   │   │   │   │ *StepDefinitions.java
│   │   │   │   │ RunCucumberTest.java
│   │   │   └───pages
│   │   │   │   │ PageObject.java
│   │   │   │   │ *Page.java
│   │   └───resources
│   │   │   └───integration
│   │   │   │   │ *.feature


```

In order to run a test, you will first have to make sure both the backend API and the frontend are running.

### Run Linting Check
To run lint for the backend:
```
mvn checkstyle:checkstyle 
```

To run lint for the frontend:
```
npm run lint
```
