package pl.piwowarski.SingletonPatternComparison.SingletonvsFlyweightExample;

// ---------------------------
// FLYWEIGHT PATTERN
// ---------------------------

class ConcreteTreeModel implements TreeModel {
    private final String texture;
    private final String mesh;

    public ConcreteTreeModel(String texture, String mesh) {
        this.texture = texture;
        this.mesh = mesh;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Drawing tree [" + mesh + ", " + texture + "] at (" + x + ", " + y + ")");
    }
}
