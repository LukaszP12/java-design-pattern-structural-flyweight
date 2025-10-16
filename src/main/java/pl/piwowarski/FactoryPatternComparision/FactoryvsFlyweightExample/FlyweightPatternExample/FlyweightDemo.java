package pl.piwowarski.FactoryPatternComparision.FactoryvsFlyweightExample.FlyweightPatternExample;

public class FlyweightDemo {
    public static void main(String[] args) {
        System.out.println("\n=== FLYWEIGHT PATTERN ===");

        TreeModel oak1 = TreeModelFactory.getTreeModel("Oak");
        TreeModel oak2 = TreeModelFactory.getTreeModel("Oak");
        TreeModel pine = TreeModelFactory.getTreeModel("Pine");

        oak1.render(10,20);
        oak2.render(30,40);
        pine.render(50,60);

        System.out.println("Unique Tree Models Created: " + TreeModelFactory.getModelCount());
        System.out.println("oak1 == oak2 ? " + (oak1 == oak2));
    }
}
