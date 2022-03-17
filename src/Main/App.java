package Main;

import model.*;

/*
Alunos:
Henrycke Bozza Schenberk
Mikael da Silva
Thomas Rempel
Leonardo Augusto de Jesus Luize
Enzo Falvo
 */

public class App {
    public static void main(String[] args) {
        // 4a. Zerar o contador
        Counter counter = new Counter(3);
        counter.zeroCounter();

        // 4b. Incrementar o contador;
        counter.counterIncrement();
        counter.zeroCounter();

        // 4c. Retornar o valor do contador
        System.out.println("Valor do contador: " + counter.returnCounterValue());

        // 5a. Construtor que inicialize o código ISO, o nome e a dimensão do país;
        Country countryBrazil = new Brazil("Brazil", "BRA", 8516000L);

        // 5b. Getters e setters
        System.out.println("Iso: " + countryBrazil.getIso());
        counter.counterIncrement();
        System.out.println("Nome do país: " + countryBrazil.getCountryName());
        counter.counterIncrement();
        System.out.println("Dimensão: " + countryBrazil.getDimension());
        counter.counterIncrement();
        System.out.println("População: " + countryBrazil.getPopulation());
        counter.counterIncrement();
        System.out.println("Países vizinhos: " + countryBrazil.getBorderCountries());
        counter.counterIncrement();

        // 5c. Verifica se dois objetos representam o mesmo país
        System.out.println(countryBrazil.checkIfCountriesAreTheSame(new Brazil()));
        counter.counterIncrement();

        // 5d. Verifica se o país que foi passado como parâmetro é vizinho do país que fez a chamada do método
        System.out.println(countryBrazil.checkIfCountriesAreNeighbors(new Ecuador()));
        counter.counterIncrement();

        // 5e. Um método que retorne à densidade populacional do país
        System.out.println(countryBrazil.getPopulationDensity());
        counter.counterIncrement();

        // 5f. Um  método  que  receba  um  país  como  parâmetro  e  retorne  a  lista  de  vizinhos  comuns  aos  dois países
        System.out.println(countryBrazil.commonNeighboringCountries(new Argentina()));
        counter.counterIncrement();


        // 6a. Construtor que inicialize o nome do continente;
        Continent continentAmerica = new Continent("América");
        counter.counterIncrement();

        // 6b. Um método que permita adicionar países aos continentes;
        Country countryArgentina = new Brazil("Argentina", "AR", 2780000L);
        counter.counterIncrement();
        continentAmerica.addCountry(countryBrazil);
        counter.counterIncrement();
        continentAmerica.addCountry(countryArgentina);
        counter.counterIncrement();

        // 6c. Um método que retorne a dimensão total do continente;
        System.out.println("Dimensão do continente: " + continentAmerica.getContinentDimensions());
        counter.counterIncrement();

        // 6d. Um método que retorne à população total do continente;
        System.out.println("População total do continente: " + continentAmerica.getContinentPopulation());
        counter.counterIncrement();

        // 6e. Um método que retorne à densidade populacional do continente;
        System.out.println("Densidade populacional do continente: " + continentAmerica.getContinentDensityPopulation());
        counter.counterIncrement();

        // 6f. Um método que retorne o país com maior população no continente;
        System.out.println("País com a maior população no continente: " + continentAmerica.getHighestCountryPopulation());
        counter.counterIncrement();

        // 6g. Um método que retorne o país com menor população no continente;
        System.out.println("País com a menor população no continente: " + continentAmerica.getLowestCountryPopulation());
        counter.counterIncrement();

        // 6h. Um método que retorne o país de maior dimensão territorial no continente;
        System.out.println("País com a maior dimensão territorial no continente: " + continentAmerica.getHighestCountryDimension());
        counter.counterIncrement();

        // 6i. Um método que retorne o país de menor dimensão territorial no continente;
        System.out.println("País com a menor dimensão territorial no continente: " + continentAmerica.getLowestCountryDimension());
        counter.counterIncrement();

        // 6j. Um método que retorne a razão territorial do maior país em relação ao menor país.
        System.out.println("Razão territorial do maior país para o menor: " + continentAmerica.getContinentTerritorialReason());
        counter.counterIncrement();

        System.out.println("Valor final do contador: " + counter.returnCounterValue());
        counter.counterIncrement();
    }
}
