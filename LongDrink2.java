package JavaRushTests;

public class LongDrink2 {
    public static final String OUTPUT_FORMAT = "Метод %s вызван из строки %d класса %s в файле %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
//   Thread current=Thread.currentThread();
//   StackTraceElement[] methods= current.getStackTrace();
   for(StackTraceElement info: stackTrace){
       System.out.printf(OUTPUT_FORMAT, info.getMethodName(), info.getLineNumber(), info.getClassName(), info.getFileName());
   }
    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
