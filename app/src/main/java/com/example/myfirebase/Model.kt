package com.example.myfirebase

class Model {
    var Name:String? = ""
    var Email:String? = ""

    constructor()

    constructor(username: String?, email: String?) {
        this.Name = username
        this.Email = email
    }
}