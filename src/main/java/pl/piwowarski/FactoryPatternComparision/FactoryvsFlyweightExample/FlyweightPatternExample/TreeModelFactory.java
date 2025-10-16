package pl.piwowarski.FactoryPatternComparision.FactoryvsFlyweightExample.FlyweightPatternExample;

import java.util.HashMap;
import java.util.Map;

// ----- Flyweight Factory -----
class TreeModelFactory {
    private static final Map<String, TreeModel> cache = new HashMap<>();

    public static TreeModel getTreeModel(String type) {
        if (!cache.containsKey(type)){
            cache.put(type,new TreeModel(type,type + "Texture.png"));
        }
        return cache.get(type);
    }

    public static int getModelCount(){
        return cache.size();
    }
}
