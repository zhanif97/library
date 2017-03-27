package com.zhanif

class Student {

String name
String email
String username
String password
int studentID
Course course

String toString(){
return name}
    static constraints = {
name blank:false, nullable:false
email blank:false, nullable:false, email: true
username blank:false, nullable:false, unique:true
password blank:false, nullable:false, password:true
studentID blank:false, nullable:false
course blank:false, nullable:false
    }
}
