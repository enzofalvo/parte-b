package model;

import java.util.ArrayList;

public class Continent {

    private String name;
    private ArrayList<Country>  countries = new ArrayList<Country>();

    @Override
    public String toString() {
        return this.name;
    }

    //    a. Construtor que inicialize o nome do continente;
    public Continent(String name){
        this.name = name;
    }

    //    b. Um método que permita adicionar países aos continentes;
    public void addCountry(Country newCountry){
        if(verifyCountryInContinent(newCountry)){
            countries.add(newCountry);
        }
    }

    public boolean verifyCountryInContinent(Country country){
        for(Country i : this.countries){
            if(i.getIso().equals(country.getIso())){
                return false;
            }
        }

        return true;
    }

    //    c. Um método que retorne a dimensão total do continente;
    public int getContinentDimensions(){
        int dimension = 0;

        for(Country country : this.countries){
            dimension += country.getDimension();
        }

        return dimension;
    }

    //    d. Um método que retorne à população total do continente;
    public int getContinentPopulation(){
        int population = 0;

        for(Country country : this.countries){
            population += country.getPopulation();
        }

        return population;
    }

    //    e. Um método que retorne à densidade populacional do continente;
    public long getContinentDensityPopulation(){
        long density = 0;

        for(Country country : this.countries){
            density += country.getPopulationDensity();
        }

        return density;
    }

    //    f. Um método que retorne o país com maior população no continente;
    public Country getHighestCountryPopulation(){
        Country countryHighestPopulation = new Country();

        for(int i = 0; i < this.countries.size(); i++){
            Country country = this.countries.get(i);

            if(i == 0) countryHighestPopulation = country;
            if(country.getPopulation() > countryHighestPopulation.getPopulation()){
                countryHighestPopulation = country;

            }
        }

        return countryHighestPopulation;
    }

    //    g. Um método que retorne o país com menor população no continente;
    public Country getLowestCountryPopulation(){
        Country countryLowestPopulation = new Country();

        for(int i = 0; i < this.countries.size(); i++){
            Country country = this.countries.get(i);

            if(i == 0) countryLowestPopulation = country;

            if(country.getPopulation() < countryLowestPopulation.getPopulation()){
                countryLowestPopulation = country;

            }
        }

        return countryLowestPopulation;
    }

    //    h. Um método que retorne o país de maior dimensão territorial no continente;
    public Country getHighestCountryDimension(){
        Country getHighestCountryDimension = new Country();

        for(int i = 0; i < this.countries.size(); i++){
            Country country = this.countries.get(i);

            if(i == 0) getHighestCountryDimension = country;
            if(country.getDimension() > getHighestCountryDimension.getDimension()){
                getHighestCountryDimension = country;

            }
        }

        return getHighestCountryDimension;
    }

    //    i. Um método que retorne o país de menor dimensão territorial no continente; e
    public Country getLowestCountryDimension(){
        Country getLowestCountryDimension = new Country();

        for(int i = 0; i < this.countries.size(); i++){
            Country country = this.countries.get(i);

            if(i == 0) getLowestCountryDimension = country;

            if(country.getDimension() < getLowestCountryDimension.getDimension()){
                getLowestCountryDimension = country;

            }
        }

        return getLowestCountryDimension;
    }

    //    j. Um método que retorne a razão territorial do maior país em relação ao menor país.
    public float getContinentTerritorialReason(){
        float lowestDimension = this.getLowestCountryDimension().getDimension();
        float highestDimension = this.getHighestCountryDimension().getDimension();

        return (float) (Math.round((highestDimension / lowestDimension)*100.0)/100.0);
    }
}
