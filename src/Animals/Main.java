package Animals;

public class Main {
    public static void main(String[] args) {

  Animal[] animals = { new Shark(),
                            new Turtle(),
                                    new Eagle()};
        for (Animal z : animals){
            if( z instanceof Shark){
                ((Shark) z).attack();
            }
            else if (z instanceof Turtle){
                ((Turtle) z).swim();
            }
            else if(z instanceof Eagle){
                ((Eagle) z).fly();
            }

            }
        System.out.println();
        for (Animal z1 : animals){
            System.out.println(z1.getClass().getName());


        }



    }
}