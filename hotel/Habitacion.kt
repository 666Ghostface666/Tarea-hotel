class Habitacion(val numero: Int,
                 var precioNoche : Double,
                 private var iscancelled :Boolean,
                 
                 var ocupada: Boolean = false) {

    fun reservar() {
        if (ocupada) {
            ocupada = true
            println("habitaciones $numero reservada con exito")
        } else {
            println("la habitacion $numero esta ocupada ")
        }


    }


    fun desocupar() {
        if (ocupada) {
            ocupada = false
            println("Habitación $numero desocupada.")
        } else {
            println("La habitación $numero ya está desocupada.")
        }
    }

    fun obtenerEstado(): String {
        return if (ocupada) {

            "La habitación $numero está ocupada."
        } else {
            "La habitación $numero está desocupada."
        }
    }
}
