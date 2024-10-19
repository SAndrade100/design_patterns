package observerPattern;

public class ObserverPatterEx {
    public static void main(String[] args) {
        System.out.println("*** Observer Pattern Demo ***\n");

        Observer o1 = new Observer();
        Observer o2 = new Observer();
        Subject s1 = new Subject();

        s1.register(o1);
        s1.register(o2);

        System.out.println("Set flag = 5");

        s1.setFlag(5);

        System.out.println("Set flag = 10");

        s1.setFlag(10);
        s1.unregister(o1);

        System.out.println("Set flag = 20");
        // Não há informe da alteração de estado já que o objeto foi retirado da lista de registros
        s1.setFlag(20);
    }
}
