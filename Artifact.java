package JavaRushTests;

public class Artifact {
    Artifact(int number){
        System.out.println("Object " + number);
    }
    Artifact(int number, String epoque){
        System.out.println("Object " + number + " " + "from" + " " + epoque);
    }
    Artifact(int number, String epoque, int century){
        System.out.println("Object " + number + " " + "from" + " " + epoque + " " + "was made in the" + " " + century + "th"  + " " + "century");
    }
        public static void main(String[] args) {
        Artifact artifact=new Artifact(2341);
        Artifact artifact1=new Artifact(34256, "early Aztec culture");
        Artifact artifact2=new Artifact(238, "late Maya culture", 8);
        }

}
