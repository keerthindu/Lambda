package InterfaceConcept;



import java.util.function.Supplier;

public class SupplierInterface
{
    public static void main(String args[]){

        //takes no argument and return a result
        getText( ()-> "Indu");
        getText( ()-> "priya");
        getText( ()-> "keerthi");
        getText( ()-> "Reetu");

    }

    public static void getText(Supplier<String> name){
        System.out.println(name.get());

    }
}
