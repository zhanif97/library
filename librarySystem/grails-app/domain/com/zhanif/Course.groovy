package com.zhanif

class Course {

String title
int code
String leader
String department
String description
String studyMode

String toString(){
return title}
    static constraints = {
title blank:false, nullable:false
code nullable:false, blank:false
leader nullable:false, blank:false
department nullable:false, blank:false
description nullable:false, blank:false
studyMode nullable:false, blank:false
    }
}
