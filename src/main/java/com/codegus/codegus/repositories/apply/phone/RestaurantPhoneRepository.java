package com.codegus.codegus.repositories.apply.phone;

import com.codegus.codegus.models.apply.phones.RestaurantPhone;
import com.codegus.codegus.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RestaurantPhoneRepository extends BaseRepository<RestaurantPhone, UUID> {



}
