package com.example.myfirebase

class ModelProduct {
    var Name:String? = ""
    var Mrp:String? = ""
    var Mfg:String? = ""
    var Exp:String? = ""
    var Taxes:String? = ""

    constructor()

    constructor(name: String?, Mrp: String?,Mfg:String?,Exp:String?,Taxes:String?) {
        this.Name = name
        this.Mrp = Mrp
        this.Mfg = Mfg
        this.Exp = Exp
        this.Taxes = Taxes
    }


}