# App Banca de Consola (POO en Java)

## Overview
This is a console-based banking application developed in Java using Maven. It simulates basic checking account operations and demonstrates Object-Oriented Programming principles.

**Last Updated:** November 7, 2025

## Project Type
Console Application (TUI - Text User Interface)

## Current State
The project has been successfully set up in the Replit environment and is fully functional. The console application runs and prompts users for their information to create a bank account and perform transactions.

## Technical Stack
- **Language:** Java 19 (OpenJDK with GraalVM)
- **Build Tool:** Maven
- **Main Class:** `com.mycompany.appcuentacorriente.AppCuentaCorriente`

## Project Architecture

### Classes
1. **Usuario** - Models user personal data (name, last name, RUT)
2. **CuentaCorriente** - Manages account balance, operations (credit, debit), and transaction history
3. **Movimiento** - Records transaction details (type, amount, date/time)
4. **AppCuentaCorriente** - Main application class with console interface

### Key Features
- Age validation (18+ required)
- Name/surname validation (letters only)
- Overdraft protection (cannot withdraw more than balance)
- Transaction history (last 10 movements)
- Date/time tracking using Java Date/Time API

## Build Configuration
The project uses Maven with the following key configurations:
- Java version: 19 (updated from 21 to match available JDK)
- Maven compiler plugin: 3.11.0
- Exec Maven plugin: 3.1.0 for running the application

## Running the Application
The application runs automatically via the "Run Banking App" workflow using the command:
```bash
mvn exec:java
```

The console will prompt for:
1. Birth date (DD/MM/YYYY format)
2. User's first name
3. User's last name
4. RUT (ID number, digits only)
5. Initial account balance

Then displays a menu with options to:
1. Credit to account
2. Debit from account
3. Show balance and transactions
4. Show user data
5. Exit

## Files Modified During Setup
- **pom.xml** - Updated Java version from 21 to 19 and added proper build configuration with compiler and exec plugins

## Recent Changes
- November 7, 2025: Initial setup in Replit environment
  - Installed Java/Maven toolchain
  - Updated pom.xml to use Java 19 (matching available JDK)
  - Added build plugins configuration
  - Configured workflow for console application
  - Verified application runs successfully
