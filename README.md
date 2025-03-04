# Associate Software Engineer Coding Assignment

This repository contains my solutions for the Associate Software Engineer coding assignment. The assignment consists of multiple tasks designed to showcase skills in HTML, CSS, Java, and JavaScript.

---

## Table of Contents
- [Assignment Details](#assignment-details)
  - [1. Create a Simple Profile Card](#1-create-a-simple-profile-card)
  - [2. String Manipulation - Anagram Check](#2-string-manipulation---anagram-check)
  - [3. Object-Oriented Programming - Employee Management System](#3-object-oriented-programming---employee-management-system)
  - [4. To-Do List](#4-to-do-list)
  - [5. Image Slider](#5-image-slider)
- [How to Run](#how-to-run)
- [Repository Structure](#repository-structure)
- [Conclusion](#conclusion)

---

## Assignment Details

### 1. Create a Simple Profile Card
- **Description:**  
  Design a responsive profile card using HTML and CSS.
- **Requirements:**
  - A profile picture.
  - Name and designation.
  - A short bio.
  - Social media icons.
  - The card should be centered on the page and adapt well to different screen sizes.
  - Use CSS animations for a hover effect on the card.
- **Files:**  
  `index.html`, `styles.css, script.js`

### 2. String Manipulation - Anagram Check
- **Description:**  
  Write a Java program that takes two strings as input and checks if they are anagrams (i.e., contain the same characters in a different order).
- **Example:**
  - Input: `"listen", "silent"` → Output: `true`
  - Input: `"hello", "world"` → Output: `false`
- **File:**  
  `AnagramCheck.java`

### 3. Object-Oriented Programming - Employee Management System
- **Description:**  
  Create a simple Java class `Employee` with the following attributes:
  - `id` (integer)
  - `name` (string)
  - `salary` (double)
- **Requirements:**
  - Implement a method `displayDetails()` to print employee details.
  - Write a main method to:
    1. Create at least 3 `Employee` objects.
    2. Store them in a list.
    3. Display their details.
- **Files:**  
  `Employee.java`, `EmployeeManagement.java`

### 4. To-Do List
- **Description:**  
  Create a simple to-do list using JavaScript and the DOM.
- **Requirements:**
  - Allow users to add new tasks.
  - Display tasks in a list.
  - Provide a button to remove each task.
- **Files:**  
  `index.html`, `styles.css, script.js`


### 5. Image Slider
- **Description:**  
  Create an image slider using JavaScript.
- **Requirements:**
  - Displays one image at a time.
  - Has "Next" and "Previous" buttons to navigate through images.
  - Uses an array of image URLs to cycle through images.
- **Files:**  
  `index.html`, `styles.css, script.js`


---

## How to Run

### For Web-Based Assignments (Profile Card, To-Do List, Image Slider)
1. Open the corresponding HTML file in your preferred web browser:
   - `index.html` for the Profile Card.
   - `index.html` for the To-Do List.
   - `index.html` for the Image Slider.

### For Java-Based Assignments (Anagram Check, Employee Management System)
1. Open a terminal or command prompt.
2. Compile the Java files using the Java compiler:
   ```bash
   javac AnagramCheck.java
   javac Employee.java EmployeeManagement.java
   ```
3. Run the compiled programs:
    ```bash
   javac AnagramCheck.java
   javac Employee.java EmployeeManagement.java

### Repository Structure
```
├── profile-card.html
├── todo.html
├── slider.html
├── styles.css
├── todo.js
├── slider.js
├── AnagramCheck.java
├── Employee.java
└── EmployeeManagement.java
```
