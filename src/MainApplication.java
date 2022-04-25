import polimorfismo.Service;

public class MainApplication {
    public static void main(String[] args){
        Service service = new Service();
        System.out.println("Abrindo o polimorfismo...\n");
        service.processamento();
    }
}
