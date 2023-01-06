package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Transport> {

    private final Queue<T> queue = new LinkedList<>();

    public void addTransport(T transprot) {
        if (transprot.getClass() != Bus.class) {
            queue.offer(transprot);
            System.out.println("Транспорт " + transprot.getBrand() + " добавлен в очередь на техническое обслуживание");
        } else {
            System.out.println("Автобусы не нуждаются в техническом обслуживании перед заездом");
        }
    }

    public void carryOutVehicleMaintenance() {
        T transport = queue.poll();
        if (transport != null) {
            System.out.println("Проведено техническое обслуживание " + transport.getBrand());
        } else {
            System.out.println("В очереди на техническое обслуживание никого нет");
        }
    }
}
