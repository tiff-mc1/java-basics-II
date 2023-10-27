import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var weather = new ArrayList<Weather>();

        var sunny = new Sunny();
        var cloudy = new Cloudy();
        var rain = new Rain();

        weather.add(sunny);
        weather.add(cloudy);
        weather.add(rain);

        for (Weather w : weather) {
            System.out.println(w.forecast());
        }
    }
}
