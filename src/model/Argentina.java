package model;

public class Argentina extends Country {
    public Argentina(String countryName, String iso, Long dimension) {
        super(countryName, iso, dimension);
        setPopulation(45195774L);
    }

    public Argentina() {
        setCountryName("Argentina");
        setIso("ARG");
        setDimension(2780000L);
    }

    @Override
    public void initializeBorderCountries() {
        getBorderCountries().add(new Brazil());
        getBorderCountries().add(new Paraguay());
        getBorderCountries().add(new Uruguay());
    }
}