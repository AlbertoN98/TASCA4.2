public class Main {
    public static void main(String[] args) {

    }
    public static String covid(float bodyTemperature, boolean difficultyBreathing, boolean diabetes, boolean cancer, boolean isPregnant,
                               boolean isOver60yearsold, boolean hepatic,
                               boolean kidneyDisease, boolean respiratoryDisease, String provincia) {
        if (bodyTemperature >= 38 && (difficultyBreathing || diabetes || cancer || isPregnant || isOver60yearsold ||
                hepatic || kidneyDisease || respiratoryDisease)) {

            return "/diagnostico/" + provincia;
        } else if (bodyTemperature >= 38) {
            return "/cuarentena/";
        } else {
            return "/diagnostico_bueno/";
        }
    }
}
