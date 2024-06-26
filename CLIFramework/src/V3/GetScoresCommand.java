package CLIFramework.src.V3;

public class GetScoresCommand implements Command {
    StudentScores studentScores = StudentScores.getInstance();

    @Override
    public void execute(){
        int [] scores = studentScores.getScores();
        for (int i = 0; i < scores.length; i++) {
            scores[i] = Input.getInt("scores[" + i + "]> ");
        }
    }
}
