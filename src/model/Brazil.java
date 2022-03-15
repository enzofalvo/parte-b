package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Brazil extends Country {
    public Brazil(String countryName, String iso, Long dimension) {
        super(countryName, iso, dimension);
        setPopulation(213317639L);
    }

    public Brazil() {
        setCountryName("Brazil");
        setIso("BRA");
        setDimension(8516000L);
    }

    @Override
    public void initializeBorderCountries() {
        getBorderCountries().add(new Argentina());
        getBorderCountries().add(new Colombia());
        getBorderCountries().add(new Peru());
        getBorderCountries().add(new Paraguay());
        getBorderCountries().add(new Uruguay());
    }
}
