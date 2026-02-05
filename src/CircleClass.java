public class CircleClass {
    public static class Circle{
        private double radius;

        public Circle(double radius){
            this.radius = radius;
        }

        public double getRadius(){
            return radius;
        }

        public void setRadius(double r){
            if (r>0){
                this.radius = r;
            }
        }

        public double getArea(){
            return Math.PI * Math.pow(this.radius, 2);
        }

        public double getCircumference(){
            return 2 * Math.PI * this.radius;
        }
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(25);
        System.out.println("Radius: " + c1.getRadius());

        c1.setRadius(-12);
        c1.setRadius(3.57);
        System.out.printf("Area of circle with radius of %.2fcm is %.2fcm^2\n", c1.getRadius(), c1.getArea());
       System.out.printf("Circumference of circle with radius of %.2fcm is %.2fcm^2\n", c1.getRadius(), c1.getCircumference());
    }
    
}
