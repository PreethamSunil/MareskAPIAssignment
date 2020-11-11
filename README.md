# MareskAPIAssignment

# API Test Automation - Coding challenge
API Test Automation - Coding challenge is an API Assignment for Maresk Principal SDET Role.

# Installation
Please run the Maven Clean and Maven Install ( before running the project)
--No Manual installation required

# How to Run 
Option 1: Run as TestNG project
Step 1: Rignt click on the file testng.xml placed in the path testng.xml/com.APIAssignment/testng.xml
Step 2: RunAs -> TestNG Suite
Step 3: Results are avilable in the project path /test-output/index.html

# Info on Tools
Java - Programming Language
Rest Assured - API Automation
TestNG - Framework
Maven - Build Tools
Dependinences are isted in the pom.xml file pom.xml

# Proect Struture
Project: com.API.Assignment 
	src/test/java
		com.APIAssignment.base (Package - Includes the Base classes with initial setup methods)
		com.APIAssignment.testcases (Package - Includes Actual Test Case Implementation)
		com.APIAssignment.utilitycode (Package  - Includes utilities files)
	logs
		logs.log (Logger file)
	test-output
		index.html (HTML Report -- TestNG)
	log4j.properties (Config file for log4j)
	pom.xml (Maven)
	testng.xml (testng)

# Furture Enhancements (Couldn't able to implement due to time constraint)
	Reporting -- Better Report plugin can be used for beautification.
	Implement re-usable methods as a utility

# Developed By
	Preetham Sunil
