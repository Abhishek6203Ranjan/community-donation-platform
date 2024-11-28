COMMUNITY DONATION PLATFORM 

A robust Java-based Library Management System built with Maven, SQLite database, and designed to run on Apache Tomcat server. The system provides different functionalities for administrators and regular users to manage library resources effectively. 

🚀 Features 

Admin Features 

Manage donors (Add/Remove/Update) 

Manage fund raisers (Add/Remove/Update)   

View all fund and their status 

Track all doners and their donation history 

Generate reports 

User Features 

Feeding the right donation interest to the donors 

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

 

 

Donation 

donation_id (PRIMARY KEY) 

 user_id  

donation type  

donation amount description(optional) 

 

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
cd community-donation-platform 
 
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
│       │       └── library/ 
│       │           ├── dao/ 
│       │           │   ├── UseDao.java 
│       │           │    
│       │           ├── model/ 
│       │           │   | 
│       │           │   └── User.java 
│       │           └── util/ 
│       │               └── DatabaseConnection.java 
│       └── resources/ 
├── pom.xml 
└── README.md 
 

💻 Usage 

Admin Login 

Use default admin credentials to access admin panel 

Manage Donation, Donors, and view system reports 

User Operations 

Register new account 

Login with credentials 

View Donation history 

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

👥 Authors 

Your Name - Initial work 

🙏 Acknowledgments 

Thanks to all contributors who have helped with the project 

Special thanks to the open-source community for providing excellent tools and libraries 

📞 Support 

For support and queries, please open an issue in the repository or contact the maintainers. 

 

⭐️ If you found this project helpful, please give it a star! 

 
