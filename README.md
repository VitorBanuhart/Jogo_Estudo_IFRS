# Jogo_Estudo_IFRS

Atividade: 
Crie e poste um código que simule uma luta entre dois personagens (usuário e PC).
      Eles devem ter ao menos as variáveis vida e ataque.
      A batalha ocorre em turnos hora um ataca hora o outro.
      A cada turno deve ser dada a opção ao usuário entre atacar ou repousar.
     Se escolher a opção de repousar deve aumentar a vida.
      Você pode escolher como calcular o dano.
      A batalha continua até que os pontos de vida de um deles chegue a zero (ou negativo).
      Adicionalmente, pode ser perguntado se deseja lutar novamente.

Logica de ataque/defesa utilizada:
  O jogador(heroi), irá escolher um numero entre 1 e 2, ao mesmo tempo, com o auxilio da biblioteca java.util.Random, é gerado um numero aleatorio nesse mesmo intervalo de numeros, caso haja um match entre o numero escolhido pelo heroi e o numero aleatorio, o jogador poderá escolher entre atacar ou defender.
  Caso escolha atacar, seu oponente(vilão), irá receber inicialmente um dano de -1 de vida, e o heroi terá seus pontos de ataque acrescido +1 a cada ataque realizado com sucesso, em caso escolher defender, os pontos de vida do héroi será acrescido em +1.
  Caso o numero escolhido pelo jogador não combinar com o numero aleatorio, o vilão terá uma chance de atacar, e irá gerar um novo numero aleatorio no intervalo de 1 a 2, caso esse numero seja igual ao primeiro numero aleatorio gerado, o ataque será concretizado e seguira a mesma logica de dano do héroi, caso não, irá voltar ao menu de jogo para o jogador escolher novamente um numero.

  *Não foi criado um loop para que o jogador possa escolher jogar novamente. 
  *O execercio foi idealizado para ser realizado com Python, mas por preferencia minha realizei em Java
