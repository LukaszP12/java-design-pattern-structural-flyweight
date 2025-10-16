package pl.piwowarski.FactoryPatternComparision.FactoryvsFlyweightExample.FactoryPatternExample;

class TreeFactory {
    public static Tree createTree(String type){
        switch (type){
            case "Oak": return new OakTree();
            case "Pine": return new PineTree();
            default: throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}
