package PetShop;

public class Main {

    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("Marta", "marta@gmail.com", "123");
        Cliente cliente2 = new Cliente("José", "jose@gmail.com", "321");

        // Criando pets associados aos clientes
        Pet pet1 = new Pet("Rex", 3, "Cachorro", cliente1);
        Pet pet2 = new Pet("Luna", 2, "Gato", cliente2);

        // Exibindo as informações dos clientes e seus pets
        System.out.println(cliente1.toString());
        System.out.println(pet1.toString());
        System.out.println();

        System.out.println(cliente2.toString());
        System.out.println(pet2.toString());
    }
}
