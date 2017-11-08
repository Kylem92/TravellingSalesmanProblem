package com.kyle.tsp;

public class App {

    public static void main(String[] args) {

        for(int i=0;i<10;i++){
            City city = new City();
            Repository.addCity(city);
        }

        SimulatedAnnealing annealing = new SimulatedAnnealing();
        annealing.simulation();

        System.out.print("Final approx solution's distance is: " + annealing.getBest().getDistance()+"\n");
        System.out.println("Tour: "+annealing.getBest());
    }
}
