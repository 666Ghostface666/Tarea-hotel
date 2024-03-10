import java.time.LocalDate

class reservas(
    val id: Int,
    val fechadeinicio: LocalDate,
    val fechafin: LocalDate,
    val habitacion: Habitacion,
    val cliente: cliente
) {
    fun obtenerInformacion(): String {
        return "Reserva #$id - cliente : ${cliente.nombre},habitacion: ${habitacion.numero},fecha de inicio: $fechadeinicio, fecha de fin :$fechafin "
    }

    fun validarFechaInicial(): String {
        if (fechafin.isBefore(fechadeinicio)) {
            return "La fecha de inicio tiene que ser antes que la de fin"
        } else {
            return "Las fechas estan correctas"
        }
    }
}