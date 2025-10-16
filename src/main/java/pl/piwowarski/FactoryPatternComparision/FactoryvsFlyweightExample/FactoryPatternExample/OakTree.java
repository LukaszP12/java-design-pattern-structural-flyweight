package pl.piwowarski.FactoryPatternComparision.FactoryvsFlyweightExample.FactoryPatternExample;

class OakTree implements Tree{
    @Override
    public void render(int x, int y) {
        System.out.println("🌳 Oak tree created at (" + x + "," + y + ")");
    }
}
