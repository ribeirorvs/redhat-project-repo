# Java EE Application with Red Hat Products

## About this repository

This repo is used to learn and training Java EE skill, practice and use Red Hat products like JBoss EAP, JBoss Data Grid, Red Hat Process Automation Manager (BPM), and so on.
The application initially is a ToDo list, but as the project grows the scope of the application can be changed to can use the Red Hat products features.

## The application

How the application can be changed with the project growing, the description of the application will be made according to the version and the features created/changed from the previous version.

### Version 1.0

The initial project consisting of a ToDo list using MVC pattern and without any notification, the user can add, remove or check a task, list all tasks and clean all ToDo list.

- In this version the only technology used is Java EE, because that this version does't have a persistence method (it will be implemented in a new version future).
- In this version the application don't have a GUI, is used only by terminal.

#### Version 1.2

- Included validation on add task

## Project ToDo

- Create the Java EE application
- Deploy the application in a standalone JBoss EAP
- Deploy the application in a domain clustered JBoss EAP
- Include persistence using JPA/Hibernate and MySQL
- Include cache persistence using JBoss Data Grid
- Include RHPAM process manager
