fun main() {
    val senhaCorreta = "admin123"
    var tentativasIncorretas = 0

    while (true) {
        // Simulação da entrada do usuário (altere o valor para testar)
        val tentativaUsuario = "senhaErrada" 
        
        tentativasIncorretas++

        if (tentativaUsuario == senhaCorreta) {
            println("Acesso permitido!")
            break
        }

        // Verifica se excedeu o limite de 3 tentativas
        if (tentativasIncorretas >= 3) {
            println("Sistema Bloqueado por Segurança")
            break
        }

        println("Senha incorreta. Tentativa $tentativasIncorretas de 3.")
    }
}
