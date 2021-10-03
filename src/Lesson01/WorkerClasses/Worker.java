package Lesson01.WorkerClasses;

    public class Worker {

        private String name;
        private boolean toSwim;
        private boolean fear_of_firefire;

        public Worker(String name, boolean toSwim, boolean fear_of_firefire) {
            this.name = name;
            this.toSwim = toSwim;
            this.fear_of_firefire = fear_of_firefire;
        }

        public String getName() {
            return name;
        }
        public boolean getSwim(){
            return toSwim;
        }
        public boolean getFearOfFire(){
            return fear_of_firefire;
        }

    }
