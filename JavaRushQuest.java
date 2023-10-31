package JavaRushTests;

public class JavaRushQuest {
    public static void main(String[] args) {
        JavarushQuest[] javarushQuest = JavarushQuest.values();
        for (JavarushQuest quest : javarushQuest) {
            System.out.println(quest.ordinal() + " : " + quest.toString());
        }
//        System.out.println(JavarushQuest.JAVA_SYNTAX.ordinal());
//        System.out.println(JavarushQuest.JAVA_CORE.ordinal());
//        System.out.println(JavarushQuest.JAVA_MULTITHREADING.ordinal());
//        System.out.println(JavarushQuest.JAVA_COLLECTIONS.ordinal());
//        System.out.println(JavarushQuest.CS_50.ordinal());
//        System.out.println(JavarushQuest.ANDROID.ordinal());
//        System.out.println(JavarushQuest.GAMES.ordinal());
    }


    public enum JavarushQuest {
        JAVA_SYNTAX,
        JAVA_CORE,
        JAVA_MULTITHREADING,
        JAVA_COLLECTIONS,
        CS_50,
        ANDROID,
        GAMES
    }
}