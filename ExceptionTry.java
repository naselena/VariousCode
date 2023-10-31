package JavaRushTests;

public class ExceptionTry {
    public static void main(String[] args) {
        try {
            dangerousMethod();
        } catch (Exception e) {
           // throw new RuntimeException(e);
            e.printStackTrace();
        }
    }

    static void dangerousMethod() throws Exception {
            throw new Exception("Mu-ha-ha!");

        }
    }
