package pl.piwowarski.FactoryPatternComparision.FactoryvsFlyweightExample.FlyweightPatternExample;

// ----- Flyweight Tree Model -----
class TreeModel {
    private final String type;     // intrinsic (shared)
    private final String texture;  // intrinsic (shared)

    public TreeModel(String type, String texture) {
        this.type = type;
        this.texture = texture;
        System.out.println("🪵 Created shared TreeModel for " + type);
    }

    public void render(int x, int y) { // extrinsic (position)
        System.out.println(type + " tree rendered at (" + x + "," + y + ") using " + texture);
    }
}
