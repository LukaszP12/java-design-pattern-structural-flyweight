package pl.piwowarski.SingletonPatternComparison.SingletonExample;

public class PatternComparisonDemo {
    public static void main(String[] args) {
        System.out.println("=== SINGLETON EXAMPLE ===");
        GameSettings settings1 = GameSettings.getInstance();
        GameSettings settings2 = GameSettings.getInstance();

        settings1.setDifficulty("Hard");
        System.out.println("Settings 1 Difficulty: " + settings1.getDifficulty());
        System.out.println("Settings 2 Difficulty: " + settings2.getDifficulty());
        System.out.println("Same instance? " + (settings1 == settings2));
        System.out.println();

        System.out.println("=== FLYWEIGHT EXAMPLE ===");
        TreeModel oak1 = TreeFactory.getTreeModel("Oak");
        TreeModel oak2 = TreeFactory.getTreeModel("Oak");
        TreeModel pine1 = TreeFactory.getTreeModel("Pine");

        oak1.display(10, 20);
        oak2.display(15, 25);
        pine1.display(30, 40);

        System.out.println("Unique Tree Models Created: " + TreeFactory.getModelCount());
        System.out.println("oak1 == oak2 ? " + (oak1 == oak2));
    }
}
