package com.example.accessingdatamongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccessingDataMongodbApplication implements CommandLineRunner {

  @Autowired
  private CustomerRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(AccessingDataMongodbApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    repository.deleteAll();

    // save a couple of customers
    repository.save(new Customer("Ufra", "Neshi"));
    repository.save(new Customer("Ufra2", "Neshi2"));

    // fetch all customers
    System.out.println("Customers found with findAll():");
    System.out.println("-------------------------------");
    for (Customer customer : repository.findAll()) {
      System.out.println(customer);
    }
    System.out.println();

    // fetch an individual customer
    System.out.println("Customer found with findByFirstName('Ufra'):");
    System.out.println("--------------------------------");
    System.out.println(repository.findByFirstName("Ufra"));

    System.out.println("Customers found with findByLastName('Neshi2'):");
    System.out.println("--------------------------------");
    for (Customer customer : repository.findByLastName("Neshi2")) {
      System.out.println(customer);
    }

  }

}