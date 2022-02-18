package plant;

// Ex 2.5 Pg 64
public class PlantRun {
    public static void main(String[] args) {
        Plant plant = new Plant();
        // call some methods from the plant object
        plant.setName("Maize");
        plant.setLeaves(15);
        plant.setRoot("hairy");
        plant.setBranch("none");
        plant.setStem("thick");
        plant.setColor("green");

        System.out.println(plant.toString());
    }
}
