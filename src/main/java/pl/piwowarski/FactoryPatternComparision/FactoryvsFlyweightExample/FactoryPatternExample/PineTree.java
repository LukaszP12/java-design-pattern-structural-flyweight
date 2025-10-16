package pl.piwowarski.FactoryPatternComparision.FactoryvsFlyweightExample.FactoryPatternExample;

class PineTree implements Tree{
    @Override
    public void render(int x, int y) {
        System.out.println("🌲 Pine tree created at (" + x + "," + y + ")");
    }
}
