# Blood Bank Application
Blood Bank Application developed using Object Oriented Concepts in Java using Apache Netbeans for blood bank organization to efficiently store, manage and access the donor's as well as recipient data.
## Main Features
- Admin Login - Maintain privacy by giving access to admin only.
- A dashboard consisting of buttons that gives following options:
  - Recipient Form - for recipient details
  - Add/Remove - Inside opens a window to add and remove blood bags of respective blood groups
  - Donor Form - for donor details
  - Blood Bank Data - has following buttons:
      - Recipient List - to view and search the recipient's data
      - Donor List - to view and search the donor's data
      - Blood Bags List - to view recieved, donated and available blood bags of respective blood groups
  - Exit- to exit program
## OOP and Other Concepts used in the project:
- Abstraction - The whole program was developed using Swing library for GUI hiding implementation details at backend.
- Encapsulation - Similarly encapsulation is implemented in classes like User,Admin,Donor and Recipient.
- Inheritance - Admin, Donor, Recipient classes are inherited from User class.
- Polymorphism - It can be seen implemented in User,Admin,Donor and Recipient classes mainly in the form of constructor overloading.
- Exception handling - Used throw library and try catch methods to handle exception in Admin form and Exit.
- Information handling - Connected the data with MS Access to give option to save, load and search information.
## Installation
- Download Apache Netbeans:
     Use the link to download Netbeans: https://netbeans.apache.org/front/main/download/nb22/
- Download JDK:
     Use the link to download JDK: https://www.oracle.com/java/technologies/downloads/
## Usage
- Clone the repository
- Add Jar folder
- Save bloodbank.accdb file where the project is saved.
- Open the BloodBankApplication.java and run
- Admin form will appear:
     Name: User
     Password: user123
- Click login and you can access the program.
     
