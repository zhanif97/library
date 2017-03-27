package com.zhanif

class BookReview {

String book
Date datePublished
Student student
String review

String toString(){
return book}
    static constraints = {
book nullable:false, blank:false
datePublished nullable:false, blank:false
student nullable:false, blank:false
review nullable:false, blank:false
    }
}
