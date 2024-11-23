-- Create the database
CREATE DATABASE DonationSite;

-- Use the database
USE DonationSite;

-- Create the 'users' table
CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    name VARCHAR(100) NOT NULL,
    phone VARCHAR(15),
    address TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Create the 'donations' table
CREATE TABLE donations (
    donation_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    donation_type ENUM('Food', 'Money', 'Stationery', 'Gadgets') NOT NULL,
    donation_amount DECIMAL(10, 2) DEFAULT NULL, -- For monetary donations
    donation_description TEXT, -- For non-monetary donations
    donated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE
);
