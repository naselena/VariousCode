package JavaRushTests;

public class Car3 {
    Engine engine=new Engine();
    class Engine{
        private boolean isRunning;
        public void start(){
         this.isRunning=true;
        }
        public void stop(){
            this.isRunning=false;
        }
    }
}
