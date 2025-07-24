public class EarthVolume {
    public static void main(String[] args) {
        double r = 6371;
        double volumeKm = (4.0 / 3) * 3.14 * Math.pow(r, 3);
        double volumeM = volumeKm * 1_000_000_000;

        System.out.println(
            "Volume of Earth in km**3: " + volumeKm + "\n" +
            "Volume of Earth in m**3: " + volumeM
        );
    }
}



//OUTPUT ->

// Volume of Earth in km**3: 1.0826577771020533E12
// Volume of Earth in m**3: 1.0826577771020533E21