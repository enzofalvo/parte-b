package Main;

import model.*;

public class App {
    public static void main(String[] args) {
        // 5a. Construtor que inicialize o código ISO, o nome e a dimensão do país;
        Country countryBrazil = new Brazil("Brazil", "BRA", 8516000L);

        // 5b. Getters e setters
        System.out.println(countryBrazil.getIso());
        System.out.println(countryBrazil.getCountryName());
        System.out.println(countryBrazil.getDimension());
        System.out.println(countryBrazil.getPopulation());
        System.out.println(countryBrazil.getBorderCountries());

        // 5c. Verifica se dois objetos representam o mesmo país
        System.out.println(countryBrazil.checkIfCountriesAreTheSame(new Brazil()));

        // 5d. Verifica se o país que foi passado como parâmetro é vizinho do país que fez a chamada do método
        System.out.println(countryBrazil.checkIfCountriesAreNeighbors(new Ecuador()));

        // 5e. Um método que retorne à densidade populacional do país
        System.out.println(countryBrazil.getPopulationDensity());

        // 5f. Um  método  que  receba  um  país  como  parâmetro  e  retorne  a  lista  de  vizinhos  comuns  aos  dois países
        System.out.println(countryBrazil.commonNeighboringCountries(new Argentina()));


        // 6a. Construtor que inicialize o nome do continente;
        Continent continentAmerica = new Continent("América");

        // 6b. Um método que permita adicionar países aos continentes;
        Country countryArgentina = new Brazil("Argentina", "AR", 2780000L);
        continentAmerica.addCountry(countryBrazil);
        continentAmerica.addCountry(countryArgentina);

        // 6c. Um método que retorne a dimensão total do continente;
        System.out.println(continentAmerica.getContinentDimensions());

        // 6d. Um método que retorne à população total do continente;
        System.out.println(continentAmerica.getContinentPopulation());

        // 6e. Um método que retorne à densidade populacional do continente;
        System.out.println(continentAmerica.getContinentDensityPopulation());

        // 6f. Um método que retorne o país com maior população no continente;
        System.out.println(continentAmerica.getHighestCountryPopulation());

        // 6g. Um método que retorne o país com menor população no continente;
        System.out.println(continentAmerica.getLowestCountryPopulation());

        // 6h. Um método que retorne o país de maior dimensão territorial no continente;
        System.out.println(continentAmerica.getHighestCountryDimension());

        // 6i. Um método que retorne o país de menor dimensão territorial no continente;
        System.out.println(continentAmerica.getLowestCountryDimension());

        // 6j. Um método que retorne a razão territorial do maior país em relação ao menor país.
        System.out.println(continentAmerica.getContinentTerritorialReason());
    }
}
