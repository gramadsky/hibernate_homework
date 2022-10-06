package com.gramadsky;

import com.gramadsky.model.entity.*;
import com.gramadsky.model.repository.*;
import com.gramadsky.model.repository.impl.*;

import java.sql.*;
import java.util.List;

public class Airport {

    public static void main(String[] args) throws SQLException {

        UserRepository userRepository = new UserRepositoryImpl();

//        Role role = new Role();
//        role.setName("client");
//
//        User user = new User();
//        user.setName("Bob");
//        user.setSurname("Truck");
//        user.setRole(role);
//        userRepository.saveOrUpdate(user);

//        List<User> users = userRepository.findAll();
//        System.out.println(users);
//
//        User user = new User();
//        user.setId(1137);
//        userRepository.delete(user);

//        User user = new User();
//        user.setId(1136);
//        user.setName("Petya");
//        user.setSurname("Aist");
//        user.setRole(role);
//        userRepository.saveOrUpdate(user);

        CityRepository cityRepository = new CityRepositoryImpl();
//        List<City> cities = cityRepository.findAll();
//        System.out.println(cities);

        AirCompanyRepository airCompanyRepository = new AirCompanyRepositoryImpl();
//
//        AirCompany airCompany = airCompanyRepository.findById(2);
//        System.out.println(airCompany);
//
//        List<AirCompany> airCompanys = airCompanyRepository.findAll();
//        System.out.println(airCompanys);

//        AirCompany airCompany = new AirCompany();
//        airCompany.setId(6);
//        airCompanyRepository.delete(airCompany);

//        AirCompany airCompany = new AirCompany();
//        airCompany.setIdAirCompany(4);
//        airCompany.setAirCompanyName("Emirates");
//        airCompanyRepository.saveOrUpdate(airCompany);

        AirplaneRepository airplaneRepository = new AirplaneRepositoryImpl();

//        Airplane airplane = airplaneRepository.findById(2);
//        System.out.println(airplane);

//        List<Airplane> airplanes = airplaneRepository.findAll();
//        System.out.println(airplanes);

//        AirCompany airCompany = AirCompany.builder()
//                .name("airways")
//                .build();
//
//        Airplane airplane = Airplane.builder()
//                .model("BB")
//                .airCompany(airCompany)
//                .build();
//
//        airplaneRepository.saveOrUpdate(airplane);

        TicketRepository ticketRepository = new TicketRepositoryImpl();
//        List<Ticket> tickets = ticketRepository.findAll();
//        System.out.println(tickets);

        RouteRepository routeRepository = new RouteRepositoryImpl();
//        Route route = routeRepository.findById(100);
//        List<Ticket> tickets = route.getTickets();
//        System.out.println(tickets);

        CountryRepository countryRepository = new CountryRepositoryImpl();
//        Country country = countryRepository.findById(1);
//        List<City> cities = country.getCities();
//        System.out.println(cities);

        System.out.println("Hello");
    }
}
