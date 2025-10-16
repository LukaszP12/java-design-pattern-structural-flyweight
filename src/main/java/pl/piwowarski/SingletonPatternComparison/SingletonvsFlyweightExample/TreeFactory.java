package pl.piwowarski.SingletonPatternComparison.SingletonvsFlyweightExample;

// ---------------------------
// FLYWEIGHT PATTERN
// ---------------------------

import java.util.HashMap;
import java.util.Map;

class TreeFactory {
    private static final Map<String, TreeModel> treeModels = new HashMap<>();

    public static TreeModel getTreeModel(String type) {
        treeModels.putIfAbsent(type, createTreeModel(type));
        return treeModels.get(type);
    }

    private static TreeModel createTreeModel(String type) {
        switch (type) {
            case "Oak":
                return new ConcreteTreeModel("OakTexture.png", "OakMesh.obj");
            case "Pine":
                return new ConcreteTreeModel("PineTexture.png", "PineMesh.obj");
            default:
                return new ConcreteTreeModel("DefaultTexture.png", "DefaultMesh.obj");
        }
    }

    public static int getModelCount() {
        return treeModels.size();
    }
}
