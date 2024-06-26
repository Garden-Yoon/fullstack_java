package CLIFramework.src.V4;

public class PrintScoreCommand implements Command {
    StudentScores studentScores = StudentScores.getInstance();

    @Override
    public void execute() {
        int [] scores = studentScores.getScores();

        for (int i = 0; i < scores.length; i++) {
            System.out.println("score[" + i + "]" + scores[i]);
        }
    }
}
