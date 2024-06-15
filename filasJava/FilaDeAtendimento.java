package filasJava;

import java.util.Random;

public class FilaDeAtendimento {




    public static void main(String[] args) {
        int n = 5;
        var random = new Random();
        int cliente = random.nextInt(101);
        Queue queue = new Queue(cliente);
        System.out.println("Chegou o cliente: " + cliente);
        // simula as chegadas dos clientes
        for(int i = 2; i <= n; i++){
            cliente = random.nextInt(101);
            System.out.println("Chegou o cliente: " + cliente);
            queue.enqueue(cliente);

        }
        // atendimentos dos clientes
        var node = queue.dequeue();
        while (node != null){
            System.out.println("Atendido o cliente" + node.getValue());
            node = queue.dequeue();
        }
        
    }
}
