package JavaRushTests;

    public class Earth {
        private final int area;
        Earth(int area){
            this.area=area;
        }
                //509600000;
        public static void main(String[] args) {
            Earth earth=new Earth(509600000);
            NorthAmerica northamerica=new NorthAmerica(24709000);
            SouthAmerica southamerica=new SouthAmerica(17840000);
            Eurasia eurasia=new Eurasia(55000000);
            Australia australia=new Australia(7659861);
            Antarctica antarctica=new Antarctica(0);
        }
    }
    class Antarctica {
        private final int area;
        Antarctica(int area){

            this.area=area;
        }
    }
    class SouthAmerica {
        private final int area;
        SouthAmerica(int area){

            this.area=area;
        }
    }
    class NorthAmerica {
        private final int area;
        NorthAmerica(int area){
            this.area=area;
        }
    }
    class Eurasia {
        private final int area;
        Eurasia(int area){
            this.area=area;
        }
    }
    class Australia {
        private final int area;
        Australia(int area){
            this.area=area;
        }
    }

