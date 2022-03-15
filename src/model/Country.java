package model;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private List<Country> borderCountries = new ArrayList<>();
    private String countryName;
    private String iso;
    private Long population;
    private Long dimension;

    public Country() {
    }

    public Country(String countryName, String iso, Long dimension) {
        this.countryName = countryName;
        this.iso = iso;
        this.dimension = dimension;
    }

    public List<Country> commonNeighboringCountries(Country country) {
        List<Country> countriesCommon = new ArrayList<>();
        initializeBorderCountries();
        country.initializeBorderCountries();

        getBorderCountries().forEach(country1 -> {
            country.getBorderCountries().forEach(country2 -> {
                if(country1.getIso() == country2.getIso()) {
                    countriesCommon.add(country1);
                }
            });
        });
        return countriesCommon;
    }

    public void initializeBorderCountries(){};

    public boolean checkIfCountriesAreNeighbors(Country country) {
        for (Country borderCountry : getBorderCountries()) {
            if(borderCountry.getIso() == country.getIso()) {
                return true;
            }
        }
        return false;
    }

    public boolean checkIfCountriesAreTheSame(Country country1) {
        if(getIso() == country1.getIso()) {
            return true;
        }
        return false;
    }

    public long getPopulationDensity() {
        return getPopulation() / getDimension();
    }

    public List<Country> getBorderCountries() {
        return borderCountries;
    }

    public void setBorderCountries(List<Country> borderCountries) {
        this.borderCountries = borderCountries;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Long getDimension() {
        return dimension;
    }

    public void setDimension(Long dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return getCountryName();
    }
}
