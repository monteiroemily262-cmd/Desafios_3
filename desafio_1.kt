fun main() {
    for (i in 1..50) {
        // Ignora (pula) se for múltiplo de 3 ou de 5
        if (i % 3 == 0 || i % 5 == 0) {
            continue
        }
        
        // Executado apenas se o continue não for atingido
        println("Número válido: $i")
    }
}
