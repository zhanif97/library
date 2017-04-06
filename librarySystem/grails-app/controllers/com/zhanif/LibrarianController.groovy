package com.zhanif

class LibrarianController {

    def scaffold = Librarian
    def login() {
}
    def validate(){
	def user = Librarian.findByUserName(params.username)
	if(user && user.password ==params.password){
	session.user = user
	session.role ='librarian'
	render view:'home'
	}
	else{
	flash.message = "Incorrect Please Try Again"
	render view:'login'
	}
	}
	def logout = {
	session.user = null
	session.role = null
	redirect(uri:'/')
	}

		}
