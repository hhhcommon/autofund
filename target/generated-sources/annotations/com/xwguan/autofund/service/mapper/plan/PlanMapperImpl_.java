package com.xwguan.autofund.service.mapper.plan;

import com.xwguan.autofund.dto.plan.LatestPlanDto;
import com.xwguan.autofund.dto.plan.PlanDto;
import com.xwguan.autofund.dto.plan.PlanInfoDto;
import com.xwguan.autofund.entity.plan.Plan;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-01-30T10:49:11+0800",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 1.1.0.v20150122-0735, environment: Java 1.8.0_151 (Oracle Corporation)"
)
@Component
@Qualifier("delegate")
public class PlanMapperImpl_ implements PlanMapper {

    @Autowired
    private PositionMapper positionMapper;

    @Override
    public LatestPlanDto toLatestPlanDto(Plan plan) {
        if ( plan == null ) {
            return null;
        }

        LatestPlanDto latestPlanDto = new LatestPlanDto();

        latestPlanDto.setLatestPositions( positionMapper.toLatestPositionDtoList( plan.getPositionList() ) );

        return latestPlanDto;
    }

    @Override
    public Plan toPlan(PlanDto planDto) {
        if ( planDto == null ) {
            return null;
        }

        Plan plan = new Plan();

        plan.setPositionList( positionMapper.toPositionList( planDto.getPositions() ) );

        return plan;
    }

    @Override
    public Plan toPlan(PlanInfoDto planInfoDto) {
        if ( planInfoDto == null ) {
            return null;
        }

        Plan plan = new Plan();

        plan.setActivated( planInfoDto.getActivated() );
        plan.setExecutionMode( planInfoDto.getExecutionMode() );
        plan.setId( planInfoDto.getId() );
        plan.setName( planInfoDto.getName() );
        plan.setUserId( planInfoDto.getUserId() );

        return plan;
    }

    @Override
    public PlanDto toPlanDto(Plan plan) {
        if ( plan == null ) {
            return null;
        }

        PlanDto planDto = new PlanDto();

        planDto.setPositions( positionMapper.toPositionDtoList( plan.getPositionList() ) );

        return planDto;
    }

    @Override
    public PlanInfoDto toPlanInfoDto(Plan plan) {
        if ( plan == null ) {
            return null;
        }

        PlanInfoDto planInfoDto = new PlanInfoDto();

        planInfoDto.setActivated( plan.getActivated() );
        planInfoDto.setExecutionMode( plan.getExecutionMode() );
        planInfoDto.setId( plan.getId() );
        planInfoDto.setName( plan.getName() );
        planInfoDto.setUserId( plan.getUserId() );

        return planInfoDto;
    }

    @Override
    public void updatePlan(Plan plan, PlanInfoDto planInfoDto) {
        if ( planInfoDto == null ) {
            return;
        }

        plan.setActivated( planInfoDto.getActivated() );
        plan.setExecutionMode( planInfoDto.getExecutionMode() );
        plan.setId( planInfoDto.getId() );
        plan.setName( planInfoDto.getName() );
        plan.setUserId( planInfoDto.getUserId() );
    }
}
