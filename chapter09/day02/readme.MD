# 🔐 Password Policy Engine (Java)

A simple object-oriented Password Policy Engine implemented in Java.

This system validates a password string against configurable rules and returns a structured validation result.

---

## 📌 Problem Overview

Modern software systems require strong password validation rules.  
This project demonstrates:

- Object-Oriented Design
- Encapsulation
- Separation of Responsibilities
- Clean Validation Logic
- Meaningful Return Objects

The system **does not**:
- Hash passwords
- Store passwords
- Encrypt data
- Use regex
- Connect to databases

It focuses purely on **string validation logic**.

---

## ✅ Validation Rules

The password must satisfy the following rules:

1. Minimum Length (default: 8)
2. Maximum Length (default: 32)
3. At least one uppercase letter (A–Z)
4. At least one lowercase letter (a–z)
5. At least one digit (0–9)
6. At least one special character from: ! @ # $ % ^ & *
7. No whitespace characters


## The program contains:

- `PasswordPolicy` → Stores rule configuration
- `Engine` → Performs validation
- `Result` → Encapsulates validation result
- `main()` → Handles user input and output

---

## 🧠 Class Responsibilities

### 1️⃣ PasswordPolicy
Holds configuration values:
- Minimum length
- Maximum length
- Allowed special characters

---

### 2️⃣ Engine
- Scans password character by character
- Checks all validation rules
- Collects error messages
- Returns a Result object

---

### 3️⃣ Result
Encapsulates:
- `boolean valid`
- `String message`

---