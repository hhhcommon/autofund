package com.xwguan.autofund.service.mapper.plan;

import com.xwguan.autofund.dto.plan.PlanInfoDto;
import com.xwguan.autofund.entity.plan.Plan;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-01-30T10:49:11+0800",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 1.1.0.v20150122-0735, environment: Java 1.8.0_151 (Oracle Corporation)"
)
@Component
@Primary
public class PlanMapperImpl extends PlanMapperDecorator implements PlanMapper {

    @Autowired
    @Qualifier("delegate")
    private PlanMapper delegate;

    @Override
    public Plan toPlan(PlanInfoDto planInfoDto)  {
        return delegate.toPlan( planInfoDto );
    }

    @Override
    public PlanInfoDto toPlanInfoDto(Plan plan)  {
        return delegate.toPlanInfoDto( plan );
    }

    @Override
    public void updatePlan(Plan plan, PlanInfoDto planInfoDto)  {
        delegate.updatePlan( plan, planInfoDto );
    }
}
