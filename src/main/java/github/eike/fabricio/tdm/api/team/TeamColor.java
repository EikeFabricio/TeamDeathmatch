package github.eike.fabricio.tdm.api.team;

public class TeamColor {

    private String colorValue, colorName;

    public TeamColor(String colorValue, String colorName) {
        this.colorValue = colorValue;
        this.colorName = colorName;
    }

    public String getColorValue() {
        return colorValue;
    }

    public void setColorValue(String colorValue) {
        this.colorValue = colorValue;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
}
