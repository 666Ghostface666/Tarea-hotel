fun main() {
    val habitacion1 = Habitacion(101)
    println(habitacion1.obtenerEstado())

    habitacion1.reservar()
    println(habitacion1.obtenerEstado())

    habitacion1.desocupar()
    println(habitacion1.obtenerEstado())

    habitacion1.reservar()
    println(habitacion1.obtenerEstado())

    val cliente1 = cliente(1,"jose carlos","juan@gmail.com",100.00)
    println(cliente1.obtenerInformacion())

    cliente1.realizarcompra(500.0)
    cliente1.depositar(200.0)
    println(cliente1.obtenerInformacion())

    
}


