package pl.piwowarski.SingletonPatternComparison.SingletonExample;

// ---------------------------
// SINGLETON PATTERN
// ---------------------------

class GameSettings {
    private static GameSettings instance;
    private String difficulty;
    private int volume;

    public GameSettings() {
        this.difficulty = "Normal";
        this.volume = 70;
        System.out.println("GameSettings initialized.");
    }

    public static synchronized GameSettings getInstance(){
        if (instance == null){
            instance = new GameSettings();
        }
        return instance;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
