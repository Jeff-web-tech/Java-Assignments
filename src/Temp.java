public class Temp {
    public static class Temperature{
        private double celsius;

        public Temperature(double celsius){
            this.celsius = celsius;
        }

        public void setCelsius(double temp){
            this.celsius = temp;
        }

        public double getCelsius(){
            return celsius;
        }

        public double getFahrenheit(){
            return (celsius * 9/5) + 32;
        }

        public double getKelvin(){
            return celsius + 273.15;
        }
    }
    public static void main(String[] args) {
        Temperature t1 = new Temperature(45);
        System.out.println("Celsius: " + t1.getCelsius());
        System.out.println("Farenheit: " + t1.getFahrenheit());
        System.out.println("Kelvin: " + t1.getKelvin());

        t1.setCelsius(60);
        System.out.println("\nNew Updates");
        System.out.println("Celsius: " + t1.getCelsius());
        System.out.println("Farenheit: " + t1.getFahrenheit());
        System.out.println("Kelvin: " + t1.getKelvin());

    }
    
}
