import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Vehiculo("Ford", "Fiesta", 1000));
        vehiculos.add(new Vehiculo("Ford", "Focus", 1200));
        vehiculos.add(new Vehiculo("Ford", "Explorer", 2500));
        vehiculos.add(new Vehiculo("Fiat", "Uno", 500));
        vehiculos.add(new Vehiculo("Fiat", "Cronos", 1000));
        vehiculos.add(new Vehiculo("Fiat", "Torino", 1250));
        vehiculos.add(new Vehiculo("Chevrolet", "Aveo", 1250));
        vehiculos.add(new Vehiculo("Chevrolet", "Spin", 2500));
        vehiculos.add(new Vehiculo("Toyota", "Corolla", 1200));
        vehiculos.add(new Vehiculo("Toyota", "Fortuner", 3000));
        vehiculos.add(new Vehiculo("Renault", "Logan", 950));

        vehiculos.stream()
                .sorted(Comparator.comparingDouble(Vehiculo::getCosto))
                .forEach(System.out::println);

        System.out.println("-----");

        vehiculos.stream()
                .sorted(
                        Comparator.comparing(Vehiculo::getMarca)
                                .thenComparingDouble(Vehiculo::getCosto)
                )
                .forEach(System.out::println);

        System.out.println("-----");

        List<Vehiculo> vehiculosMenorA1000 = vehiculos.stream()
                .filter(v -> v.getCosto() < 1000)
                .toList();
        vehiculosMenorA1000.forEach(System.out::println);

        System.out.println("-----");

        List<Vehiculo> vehiculosMayorA1000 = vehiculos.stream()
                .filter(v -> v.getCosto() >= 1000)
                .toList();
        vehiculosMayorA1000.forEach(System.out::println);

        System.out.println("-----");

        double promedioPorPrecio = vehiculos.stream()
                .mapToDouble(Vehiculo::getCosto)
                .average()
                .orElse(0.0);
        System.out.println(promedioPorPrecio);
    }
}