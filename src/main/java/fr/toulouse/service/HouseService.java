package fr.toulouse.service;

import fr.toulouse.entity.House;

import java.util.List;

public interface HouseService {

    List<House> getAllHouses();

    House getHouseById(Integer houseId);

    List<House> getHouseByOwner(Integer ownerId);

    boolean addHouse(House house);

    boolean modifyHouse(House house);

    boolean deleteHouse(Integer houseId);

}
