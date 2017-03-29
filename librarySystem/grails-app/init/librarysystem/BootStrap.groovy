package com.zhanif //name of the package

class BootStrap {   

    def init = { servletContext ->
/*
//defines course with a name, followed by new course which tells grails what kind of domain it should belong in.
def bsccook = new Course(
title: 'Bsc Hon In Cooking', //defines the title of the course
code: 0753, //defines the unique code of the course
leader: 'Jamie Oliver', //defines the leader of the course
department: 'JOLTD', //defines the location of the course
description: 'Learn with Jamie Oliver', //defines the description and info of the course
studyMode:'full-time' //defines the duration of the course
).save() //saves changes to the course

def bscsport = new Course(
title: 'Bsc Hon In Sport',
code: 5442,
leader: 'Alan Shearer',
department: 'Ewood Park-Blackburn',
description: 'Learn sport with All time Premier League Scorer',
studyMode:'part-time'
).save()

//defines student with a name, followed by new student which tells grails what kind of domain it should belong in.
def jon = new Student(
name: 'Jonathon West', //name of student
email:'west@gmail.com', //student's email address
username: 'jwest99', //students username
password: 'password', //password for student
studentID: 4431554, //students unique identifier
course: bscsport //course that the student is on
).save() //saves changes to the student

def tim = new Student(
name: 'Tim Mcdonald',
email:'tmac@gmail.com',
username: 'tmcdonald4',
password: 'password',
studentID: 4832056,
course: bsccook
).save()

def billy = new Student(
name: 'Billy Gould',
email:'bgould@gmail.com',
username: 'gould33',
password: 'password',
studentID: 4832426,
course: 'Bsc Hon In Cooking'
).save()

def jake = new Student(
name: 'Jake Gould',
email:'jgould@gmail.com',
username: 'gould37',
password: 'password',
studentID: 4832420,
course: 'Bsc Hon In Sport'
).save()

//defines name of the book followed by the new book function which tells grails which domain it is in
def BFG = new Book(
title:'BFG', //title of book
subject:'Children', //category type of book
author: 'Roald Dahl', //author of book
isbn: 2214444, //books unique identifier
dateBorrowed: new Date('11/03/2017'), //date the book was borrowed
returnDate: new Date('21/03/2017'), //date the book needs to be returned
student: jon, //student that has rented the book. Also recognises Jon as it has been defined above
overdue:false //overdue or not
).save() //saves changes

def George = new Book(
title:'Georges Marvellous Medicine',
subject:'Children',
author: 'Roald Dahl',
isbn: 5433254,
dateBorrowed: new Date('18/03/2017'),
returnDate: new Date('30/03/2017'),
student: tim,
overdue:false
).save()

def motd = new Book(
title:'Match Of The Day Annual 2016/17',
subject:'Sport',
author: 'Guy Mowbary And John Motson',
isbn: 4724521,
dateBorrowed: new Date('21/01/2017'),
returnDate: new Date('30/01/2017'),
student: tim,
overdue:true
).save()

def siralex = new Book(
title:'Sir Alex Ferguson: My Autobiography',
subject:'Autobiography',
author: 'Sir Alex Ferguson',
isbn: 1654830,
dateBorrowed: new Date('01/01/2017'),
returnDate: new Date('30/01/2017'),
student: jon,
overdue:true
).save()

//defines the function book review with a name followed by a new book review
def revbilly = new BookReview(
book:'Match Of The Day Annual 2016/17', //name of book
datePublished: new Date('18/07/2016'), //date of when the book was published
student: tim, //student that has rented the book. Also recognises Tim as it has been defined above
review: 'Awful, in the Premier League section why is there no description about the mighty Aston Villa?. Missed out a big team there so Im guessing that the author is a Birmingham fan! Not Happy' //review of the book
).save() //saves the review on grails

def revjake = new BookReview(
book:'Sir Alex Ferguson: My Autobiography',
datePublished: new Date('24/10/2013'),
student: jon,
review: 'Top Quality, grew up with the likes of Giggs, Cantona and Scholes etc. Speaks highly of all the ex players.'
).save()

//defines the library name followed by new library
def manor = new Library(
building: 'Manor Library', //name of library
address: '64 Oxford Road, Sheffield, S2 1QH', //address of library
openingHours: 'Monday to Friday 8am-5pm, Sat 9am-5pm, Sun Closed', //opening hours of library
location: 'South Yorkshire', //county
studySpaces: 95 //number of spaces available to study
).save() //saves record on grails

def meersbrook = new Library(
building: 'Meersbrook Library',
address: '42 Argyle Road, Sheffield, S8 1QH',
openingHours: 'Monday to Saturday 9am-6pm, Sun Closed',
location: 'South Yorkshire',
studySpaces: 110
).save()

//defines the librarian by name so that grails knows
def landlord = new Librarian(
name: 'Stuart The Landlord Mitchell', //name of librarian
email: 'landlord@libraries.com', //email address of librarian
office: 'Office 213', //office number of librarian
username: 'landlord22', //username of librarian
password: 'password', //password of librarian
telephone: 01142214444, //telephone line of librarian
library: manor //where the librarian works
).save() //saves record

def neville = new Librarian(
name: 'Alan Neville',
email: 'aneville@libraries.com',
office: 'Office 200',
username: 'nev1',
password: 'password',
telephone: 01142214325,
library: meersbrook
).save()

//below makes link by defining the name above, and stating where a certain attribute should be. In the first case, the book BFG should be added to (using addTo function) the library (defined above) followed by the name of the library in brackets
BFG.addToLibraries(manor) 
motd.addToLibraries(meersbrook)
siralex.addToLibraries(manor)
George.addToLibraries(meersbrook)*/


    }
    def destroy = {
    }
}
