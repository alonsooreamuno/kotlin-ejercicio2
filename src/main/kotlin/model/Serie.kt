package model

class Serie:Entregable {
     var titulo: String
     var numeroTemporada:Int
     var entregado: Boolean
     var genero:String
     var creador:String

    constructor() {
        this.titulo = ""
        this.numeroTemporada = 3
        this.entregado = false
        this.genero = ""
        this.creador = ""
    }
    constructor(titulo_:String, creador_:String) {
        this.titulo = titulo_
        this.numeroTemporada = 3
        this.entregado = false
        this.genero = ""
        this.creador = creador_
    }
    constructor(titulo_:String, numeroTemporada_:Int,genero_:String, creador_:String) {
        this.titulo = titulo_
        this.numeroTemporada = numeroTemporada_
        this.entregado = false
        this.genero = genero_
        this.creador = creador_
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