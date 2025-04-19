# Sistema de Controle de Carro em Java

Este projeto é um simulador de controle de carro desenvolvido em **Java**, permitindo realizar ações como ligar e desligar, acelerar, reduzir velocidade, trocar marchas e virar o carro  

## Funcionalidades
- Ligar e desligar o carro  
- Acelerar (até 120 km/h)  
- Reduzir velocidade (mínimo 0 km/h)  
- Trocar marcha (de 0 a 6, seguindo as regras de velocidade)  
- Virar para esquerda/direita (somente entre 1 km/h e 40 km/h)  
- Verificar velocidade atual  
- Verificar marcha atual

## Estrutura do Projeto
- **`Carro.java`** → Gerencia estado do carro, velocidade e marcha 
- **`OperacoesCarro.java`** → Controla as funções do carro, como acelerar e virar 
- **`Main.java`** → Interface interativa para o usuário

## Regras de funcionamento
- O carro começa desligado, em ponto morto e com velocidade 0 km/h  
- O carro **não pode executar ações enquanto estiver desligado  
- Acelerar aumenta 1 km/h** na velocidade até o máximo de 120 km/h
- Reduzir velocidade diminui 1 km/h** até o mínimo de 0 km/h  
- Troca de marcha deve ser sequencial** (não pode pular marchas)  
- Cada marcha tem uma faixa de velocidade permitida, conforme abaixo:  

    | Marcha  | Velocidade permitida |
    |---------|----------------------|
    | **0** (Ponto Morto) | **0 km/h** |
    | **1ª marcha** | **0 km/h - 20 km/h** |
    | **2ª marcha** | **21 km/h - 40 km/h** |
    | **3ª marcha** | **41 km/h - 60 km/h** |
    | **4ª marcha** | **61 km/h - 80 km/h** |
    | **5ª marcha** | **81 km/h - 100 km/h** |
    | **6ª marcha** | **101 km/h - 120 km/h** |

- O carro só pode virar para esquerda/direita entre 1 km/h e 40 km/h  
- Só é possível desligar o carro se ele estiver parado e em ponto morto  

## Contribuições
Se quiser sugerir melhorias ou adicionar novas funcionalidades, sinta-se à vontade para abrir uma issue ou enviar um pull request :)
