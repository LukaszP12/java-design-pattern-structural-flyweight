package pl.piwowarski.FactoryPatternComparision.FactoryvsFlyweightExample.FactoryPatternExample;

// Factory Pattern
public class FactoryDemo {
    public static void main(String[] args) {
        System.out.println("=== FACTORY PATTERN ===");
        Tree t1 = TreeFactory.createTree("Oak");
        Tree t2 = TreeFactory.createTree("Oak");
        Tree t3 = TreeFactory.createTree("Pine");

        t1.render(10, 20);
        t2.render(15, 25);
        t3.render(50,60);

        System.out.println("t1 == t2 ? " + (t1 == t2));
        System.out.println("t1.equals(t2) ? " + (t1.equals(t2)));
    }
}
