Community Donation Platform
A robust Java-based Community Donation Platform built with Maven, SQLite database, and designed to run on Apache Tomcat server. The system provides different functionalities for administrators, donars and donation recievers to manage donations resources effectively.

🚀 Features
Admin Features
Manage donars (Add/Remove/Update)
Manage fund raisers (Add/Remove/Update)
View all fund time limit and their status
Generate reports
User Features
Feeding the right donation interest to the donars

🛠️ Technical Stack
Java: Core programming language
Maven: Dependency management and build tool
SQLite: Database management
Apache Tomcat: Application server
Eclipse IDE: Development environment
📋 Database Schema
Tables
Users

user_id (PRIMARY KEY)
username (UNIQUE)
password
phone
address

donation_id (PRIMARY KEY)
user_id
donation type
donation amount
description(optional)


🔧 Setup Instructions
Prerequisites

Java JDK 17 or higher
Maven 3.x
Eclipse IDE
Apache Tomcat 9.x or higher
Database Setup

-- Database is automatically initialized on first run
-- Default admin credentials:
-- Username: admin
-- Password: admin123
Project Setup

# Clone the repository
git clone [repository-url]

# Navigate to project directory
cd library-management

# Build the project
mvn clean install

# Deploy to Tomcat
# Copy the generated WAR file to Tomcat's webapps directory
🏗️ Project Structure
library-management/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── user/
│       │           ├── dao/
│       │           │   ├── Dao.java
│       │           │   └── UserDAO.java
│       │           ├── model/
│       │           │   ├── model.java
│       │           │   └── User.java
│       │           └── util/
│       │               └── DatabaseConnection.java
│       └── resources/
├── pom.xml
└── README.md
💻 Usage
Admin Login

Register new account
Login with credentials
🔐 Security Features
Password encryption for user accounts
Session management
Role-based access control
Input validation and sanitization
🤝 Contributing
Fork the repository
Create your feature branch (git checkout -b feature/AmazingFeature)
Commit your changes (git commit -m 'Add some AmazingFeature')
Push to the branch (git push origin feature/AmazingFeature)
Open a Pull Request
📝 License
This project is licensed under the MIT License - see the LICENSE file for details.

Your Name - Initial work
🙏 Acknowledgments
Thanks to all contributors who have helped with the project
Special thanks to the open-source community for providing excellent tools and libraries
📞 Support
For support and queries, please open an issue in the repository or contact the maintainers.

⭐️ If you found this project helpful, please give it a star!
