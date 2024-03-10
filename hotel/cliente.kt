class cliente(
    val id: Int,
    val nombre: String,
    val emiali: String,
    var saldo: Double
) {
    fun realizarcompra(monto: Double) {
        if (monto > 0 && monto <= saldo) {
            println("compra realizada con exito . nuevo saldo $saldo")
        } else {
            println("saldo insuficiente para realizar una compra")
        }

    }

    fun depositar(monto: Double) {

        if (monto > 0) {

            saldo += monto
            println("depsito realizado con exito. Nuevo saldo:$saldo")

        } else {
            println("El monto deposito debe ser mayor a cero.")
        }


    }

    fun obternerinformacion(email: String): String {
        return "ID:$id,Nombre:$nombre,Email:$email,Saldo:$saldo"
    }


}






