package plant;

// Ex 2.1 Pg 54
public class Plant {
    private String name;
    private String branch;
    private int leaves;
    private String color;
    private String stem;
    private String root;

    public Plant() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getLeaves() {
        return leaves;
    }

    public void setLeaves(int leaves) {
        this.leaves = leaves;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStem() {
        return stem;
    }

    public void setStem(String stem) {
        this.stem = stem;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public String toString() {
        return "Plant details is as follows: \nbranch = " + branch + ", \ncolor = " + color + ", \nleaves = " + leaves + ", \nname = " + name + ", \nroot = " + root + ", \nstem = " + stem;
    }

}
