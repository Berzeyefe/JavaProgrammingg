package week18.poly_demo;

public class Father {
    public abstract static class Parent {
        public abstract void raiseKid();  // no implementation

        public abstract void playWithKid();

        public abstract void feedKid();
    }


    public interface Worker {
        public abstract void work(String job);  // public abstract

        double getPaid();
    }


    public class Father1 extends Parent implements Worker {

        @Override
        public void raiseKid() {
            System.out.println("Raising Kids, helping moms");
        }

        @Override
        public void playWithKid() {
            System.out.println("Playing with Kids occasionally");
        }

        @Override
        public void feedKid() {
            System.out.println("Providing food and supplies to home");
        }

        @Override
        public void work(String job) {
            System.out.println("Working as " + job);
        }

        @Override
        public double getPaid() {
            return 100000.0;
        }
    }
}

