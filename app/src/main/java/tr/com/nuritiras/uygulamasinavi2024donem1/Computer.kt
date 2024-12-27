package tr.com.nuritiras.uygulamasinavi2024donem1

class Computer(var cpu: String, var ram: Int, var price: Double ) {

    fun calculateKdv() {
        price *= 1.2
    }
}