package model

class VideoJuego:Entregable {
     var titulo: String
     var horasEstimadas:Int
     var entregado: Boolean
     var genero:String
     var compania:String

    constructor() {
        this.titulo = ""
        this.horasEstimadas = 10
        this.entregado = false
        this.genero = ""
        this.compania = ""
    }
    constructor(titulo_:String, compania_:String) {
        this.titulo = titulo_
        this.horasEstimadas = 10
        this.entregado = false
        this.genero = ""
        this.compania = compania_
    }
    constructor(titulo_:String, horasEstimadas:Int,genero_:String, compania_:String) {
        this.titulo = titulo_
        this.horasEstimadas = horasEstimadas
        this.entregado = false
        this.genero = genero_
        this.compania = compania_
    }
    override fun entregar() {
        this.entregado = true
    }
    override fun devolver() {
        this.entregado = false
    }
    override fun isEntregado():Boolean {
        return this.entregado
    }
}