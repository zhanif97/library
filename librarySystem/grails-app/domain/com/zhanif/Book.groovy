package com.zhanif

class Book {

String title
String subject
String author
int isbn
Date dateBorrowed
Date returnDate
Student student
Boolean overdue


static hasMany=[bookreviews:BookReview,	libraries:Library]
static belongsTo = Library

String toString(){
return title}

    static constraints = {
title blank:false, nullable:false
subject nullable:false, blank:false
author nullable:false, blank:false
dateBorrowed nullable:false, blank:false
returnDate nullable:false, blank:false
student nullable:false, blank:false
    }
}
