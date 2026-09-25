# 🚗 Sistema de Gestão de Veículos (Java)

Sistema desenvolvido em Java para gerenciar diferentes tipos de veículos, aplicando os pilares da **Orientação a Objetos (OO)**, boas práticas de programação, encapsulamento rigoroso e tratamento de exceções.

---

## 🛠️ Tecnologias e Conceitos Utilizados

* **Linguagem:** Java
* **Conceitos de OO:** 
  * Herança e Polimorfismo
  * Classes Abstratas (`Veiculo`)
  * Interfaces Múltiplas (`Eletrico`, `Conectavel`, `Rastreavel`, `Destino`)
  * Encapsulamento com validações (`getters`, `setters` e `IllegalArgumentException`)
  * Sobrecarga de Métodos (ex: método `acelerar`)
  * Atributos estáticos (`static`) para contagem de registros

---

## 📂 Estrutura do Projeto

O projeto está organizado no pacote `com.daniel.gestaoveiculos`:

```text
com.daniel.gestaoveiculos/
│
├── Main.java                # Classe principal com execuções e lógica de menu/validação
├── Veiculo.java             # Superclasse abstrata base
├── Moto.java                # Subclasse de Veículo
├── Carro.java               # Subclasse de Veículo
├── CarroEletrico.java       # Subclasse de Carro (Implementa interfaces de tecnologia)
├── Caminhao.java            # Subclasse de Veículo (Implementa regras de destino e carga)
│
└── Interfaces/
    ├── Eletrico.java        # Contrato para veículos elétricos
    ├── Conectavel.java      # Contrato para conexão à internet
    ├── Rastreavel.java      # Contrato para obtenção de localização
    └── Destino.java         # Contrato para regras de rota de carga
---

## 🚀 Funcionalidades Principais

1. **Gestão de Frota:** Cadastro dinâmico e controle de diferentes tipos de veículos (Motos, Carros, Carros Elétricos e Caminhões).
2. **Validações de Negócio:** Proteção contra dados inválidos (como anos retroativos inválidos, nível de bateria negativo, portas insuficientes ou limites de peso de carga excedidos no caminhão).
3. **Contador Automático:** Utilização de atributos estáticos para rastrear o total de veículos cadastrados no sistema.
4. **Regras de Destino por Carga:** O caminhão calcula automaticamente o seu destino com base no peso da carga transportada.
5. **Polimorfismo Avançado:** Uso de `instanceof` com *Pattern Matching* para acessar comportamentos específicos de subclasses a partir de uma lista genérica de veículos.

---

## 🏃‍♂️ Como Executar o Projeto

1. Certifique-se de ter o **Java JDK** instalado na sua máquina (versão 16 ou superior recomendada para suporte ao *pattern matching*).
2. Baixe os arquivos para a sua IDE favorita (Eclipse, IntelliJ IDEA, VS Code).
3. Compile e execute a classe `Main.java`.

---

## 👨‍💻 Autor

Desenvolvido por **Daniel**.

```

```
