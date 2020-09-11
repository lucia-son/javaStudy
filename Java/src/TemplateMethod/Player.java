package TemplateMethod;

public class Player {
    private PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) { //change "setlevel" to "upgradelevel"
        this.level = level;
        level.showLevelMessage();
    }
    public void play(int count) {
            level.go(count);
        }
    }