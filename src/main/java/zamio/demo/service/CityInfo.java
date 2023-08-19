package zamio.demo.service;

public class CityInfo {
    private final String name;
    private final String cityId;

    public CityInfo (String name, String cityId) {
        this.name = name;
        this.cityId = cityId;
    }


    public String getName() {
        return name;
    }

    public String getCityId() {
        return cityId;
    }
}
