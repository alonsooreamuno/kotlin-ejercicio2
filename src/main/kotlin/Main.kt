import model.VideoJuego
import model.Serie

fun main(args: Array<String>) {

    var videoJuegos = arrayOf<VideoJuego>()
    var series = arrayOf<Serie>()

    val serie1:Serie = Serie( "Suits",10,"Drama","CM")
    val serie2:Serie = Serie()
    val serie3:Serie = Serie( "Dr House","CM")
    val serie4:Serie = Serie( "Vikings",6,"Accion","Netflix")
    val serie5:Serie = Serie( "Sillicon Valley",5,"Comedia","HBO")

    val juego1:VideoJuego = VideoJuego( "Fifa",10,"Drama","CM")
    val juego2:VideoJuego = VideoJuego()
    val juego3:VideoJuego = VideoJuego( "MMA","CM")
    val juego4:VideoJuego = VideoJuego( "COD",6,"Accion","Netflix")
    val juego5:VideoJuego = VideoJuego( "Simpsons 2",5,"Comedia","HBO")

    juego1.entregar()
    juego2.devolver()
    juego3.entregar()

    serie1.entregar()
    serie4.devolver()
    serie5.entregar()
    serie3.entregar()


    videoJuegos = videoJuegos.plus(juego1)
    videoJuegos = videoJuegos.plus(juego2)
    videoJuegos = videoJuegos.plus(juego3)
    videoJuegos = videoJuegos.plus(juego4)
    videoJuegos = videoJuegos.plus(juego5)

    series = series.plus(serie1)
    series = series.plus(serie2)
    series = series.plus(serie3)
    series = series.plus(serie4)
    series = series.plus(serie5)

    var numSeriesEntregadas:Int = 0
    var numJuegosEntregados:Int = 0

    println("Series entregadas:")
    for(item in series){
        if(item.isEntregado())  {
            numSeriesEntregadas++
            println(" -> "+ item.titulo)
        }
    }
    println("Cantidad: "+ numSeriesEntregadas)

    println("------------------------------")

    println("Juegos entregados:")
    for(item in videoJuegos){
        if(item.isEntregado())  {
            numJuegosEntregados++
            println(" -> "+ item.titulo)
        }
    }
    println("Cantidad: "+ numJuegosEntregados)

}