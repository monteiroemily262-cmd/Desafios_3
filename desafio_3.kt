fun main() {
    buscaPredio@ for (andar in 1..5) {
        for (sala in 1..4) {
            println("Verificando Andar $andar, Sala $sala")
            
            // Verifica o alvo exato
            if (andar == 3 && sala == 2) {
                println("Alvo Encontrado")
                break@buscaPredio // Aborta totalmente a operação em ambos os laços
            }
        }
    }
}
