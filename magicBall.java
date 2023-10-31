package JavaRushTests;

import java.util.Random;

public class magicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        Random r = new Random();
        int i = r.nextInt(8);
        if (i == 0) return CERTAIN;
        if (i == 1) return DEFINITELY;
        if (i == 2) return MOST_LIKELY;
        if (i == 3) return OUTLOOK_GOOD;
        if (i == 4) return ASK_AGAIN_LATER;
        if (i == 5) return TRY_AGAIN;
        if (i == 6) return NO;
        if (i == 7) return VERY_DOUBTFUL;
        else return null;

    }
}
    class Solutions {

        public static void main(String[] args) {
            System.out.println("Заработаю ли я себе на BMW?");
            System.out.println(magicBall.getPrediction());
        }
    }

