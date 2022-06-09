package com.codegus.codegus.mappers.phone;

import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.apply.phones.TravelAgencyPhone;
import com.codegus.codegus.dtos.phone.PhoneDto;
import com.codegus.codegus.dtos.phone.PhoneItem;
import com.codegus.codegus.dtos.phone.PhoneRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring")
public interface TravelAgencyPhoneMapper extends BaseMapper<TravelAgencyPhone, PhoneItem, PhoneDto, PhoneRequest> {

    @Override
    @Mappings({
            @Mapping(source = "foreignKey", target = "travelAgency.id")
    })
    TravelAgencyPhone requestToEntity(PhoneRequest request);

    @Override
    @Mappings({
            @Mapping(source = "travelAgency.id", target = "foreignKey")
    })
    PhoneDto entityToDto(TravelAgencyPhone entity);

}
