package com.codegus.codegus.services.assistance;

import com.codegus.codegus.mappers.AssistanceMapper;
import com.codegus.codegus.models.apply.Assistance;
import com.codegus.codegus.dtos.assistance.AssistanceDto;
import com.codegus.codegus.dtos.assistance.AssistanceItem;
import com.codegus.codegus.dtos.assistance.AssistanceRequest;
import com.codegus.codegus.repositories.apply.AssistanceRepository;
import com.codegus.codegus.services.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AssistanceServiceImpl extends
        BaseServiceImpl<Assistance, UUID, AssistanceItem, AssistanceDto, AssistanceRequest, AssistanceRepository, AssistanceMapper>
        implements AssistanceService{

        // Implementar métodos propios de AssistanceService

}
