package com.zhanif

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Librarian)
class LibrarianSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void emailType(){
    when:"A Librarian has a valid email"
    def neville=new Librarian(email:'aneville@libraries.com')
    then:" The emailType method ensures that email is checked and validated"
    neville.emailType() == 'aneville@libraries.com'

}

}
