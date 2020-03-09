public class ScoreTest {
    public static void main(String[] args) {
        Score Score1 = new Score("同学1", 80, 80, 80, 80);

        Score Score2 = new Score("同学2", 80, 80, 80, 81);

        Score Score3 = new Score("同学3", 80, 80, 80, 82);

        Score Score4 = new Score("同学4", 86, 80, 80, 89);

        Score Score5 = new Score("同学5", 60, 60, 60, 84);

        Score averageScoreMax = maxAverageScore(
                                    maxAverageScore(maxAverageScore(maxAverageScore(Score1, Score2), Score3), Score4), Score5);
        System.out.println("平均分最高的同学的所有信息：" + averageScoreMax.toString());
        Score scienceSynthesisMax = maxScienceSynthesis(
                                        maxScienceSynthesis(maxScienceSynthesis(maxScienceSynthesis(Score1, Score2), Score3), Score4), Score5);
        System.out.println("理科综合分最高的同学的名字：" + scienceSynthesisMax.getStudentName());
    }

    public static Score maxScienceSynthesis(Score ScoreA, Score ScoreB) {
        if (ScoreA.getScienceSynthesis() >= ScoreB.getScienceSynthesis()) {
            return ScoreA;
        } else {
            return ScoreB;
        }
    }
    public static Score maxAverageScore(Score ScoreA, Score ScoreB) {
        if (ScoreA.sumScore() >= ScoreB.sumScore()) {
            return ScoreA;
        } else {
            return ScoreB;
        }
    }
}