package com.company;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Collections {

    private static Map<Long, Clients> clientsMap = new ConcurrentHashMap<>();
    private static Deque<Clients> clientsDeque = new ConcurrentLinkedDeque<>();

    public static void main(String[] args) {

        addClients(new Clients(0, "Maks"));
        addClients(new Clients(1,"Egor"));
        addClients(new Clients(2,"Ivan"));
        remove(new Clients(1, "Egor"));
        System.out.println(last100());
        System.out.println(findAll());
        System.out.println(findById(1));

    }
    private static List<Clients> findAll()
    {
        return new ArrayList<>(clientsMap.values());
    }

    private static List<Clients> last100(){
        return new ArrayList<>(clientsDeque);
    }

    private static Optional<Clients> findById(long id){
        return Optional.ofNullable(clientsMap.get(id));
    }

    private static void addClients(Clients clients){
        clientsMap.put(clients.getId(), clients );
        if (clientsDeque.size() == 100)
        {
            clientsDeque.removeLast();
        }
        else {
            clientsDeque.addFirst(clients);
        }
    }

    public static void remove(Clients clients)
    {
        clientsMap.remove(clients.getId());
        clientsDeque.remove(clients);
    }
}
class Clients{

    private long id;
    private String name;

    public Clients(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

}
