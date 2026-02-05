public class CounterLimit {
    public static class Counter{
        private int count;

        public Counter(){
            this.count = 0;
        }

        public void increment(){
            if(count < 100){
                count ++;
            } else {
                System.out.println("Count cannot exceed 100");
            }
        }

        public void decrement(){
            if(count > 0){
                count --;
            } else {
                System.out.println("Count cannot go below 0");
            }
        }

        public void reset(){
            count = 0;
            System.out.println("Counter has been reset");
        }

        public int getCount(){
            return count;
        }
        public static void main(String[] args) {
            Counter counter = new Counter();

            for (int i = 0; i < 103; i++){
                counter.increment();
            }
            System.out.println(counter.getCount());

            counter.reset();
            System.out.println(counter.getCount());
        }
    }
    
}
