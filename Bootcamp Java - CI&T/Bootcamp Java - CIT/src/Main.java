import java.util.Scanner;

// Boas praticas:
// Classes: Iniciar sempre com letra maiuscula
// Atributos: iniciar sempre com letra minuscula, sem a utilização do ()
// Metodos: iniciar sempre com letra minuscula, com a utilização do ()

/*
CLASSES:
Seria a ideia, onde são definidos as estruturas e os fundamentos de algo antes de existir na memoria. De
modo geral seriam os elementos que compoem os objetos.

ATRIBUTOS:
São os dados ou caracteristicas, ou seja, o estado em que os objetos estarao. Dessa forma, as classes
determinam quais sao os elementos que todos os atributos terao, mas sao os atributos que irao determinar
quais sao os dados ou caracteristicas daquele objeto em especifico. Podendo haver diversos objetos dentro
da mesma classe, so que com atributos diferentes

METODOS:
Sao as funções ou comportamentos. Define o que o objeto consegue fazer ou manipular.
*/

/*
* MODIFICADORES DE VISIBILIDADE
* Indicam o nivel de acesso aos componentes internos de uma classe.
*
* + (PUBLICO)
* Acesso irrestrito e aberto a qualquer utilização
* A classe atual e todas as outras classes terão acesso a ela
*
* - (PRIVADO)
* Acesso privado e somente com liberação pode ser utilizado
* Somente a classe atual poderá acessar
*
* # (PROTEGIDO)
* Acesso limitado a certo grupo ou empresa, mas necessita de liberação para utilização
* Acesso atual e todas as subclasses.
* */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.close();
    }
}