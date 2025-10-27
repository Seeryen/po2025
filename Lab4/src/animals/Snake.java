package animals;

public class Snake extends Animal {

    public Snake(String name) {
        super(name, 0);
    }

    public String getDescription() {
        return "Wąż o imieniu " + this.name + ", ma " + this.legs + " nóg.";
    }
}