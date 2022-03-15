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
    }
}
