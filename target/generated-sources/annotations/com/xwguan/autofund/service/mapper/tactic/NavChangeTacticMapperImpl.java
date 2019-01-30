package com.xwguan.autofund.service.mapper.tactic;

import com.xwguan.autofund.dto.plan.tactic.NavChangeTacticDto;
import com.xwguan.autofund.entity.plan.rule.Rule;
import com.xwguan.autofund.entity.plan.scheme.activatedTactic.ActivatedNavChangeTactic;
import com.xwguan.autofund.entity.plan.tactic.NavChangeTactic;
import com.xwguan.autofund.enums.TacticTypeEnum;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-01-30T10:49:10+0800",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 1.1.0.v20150122-0735, environment: Java 1.8.0_151 (Oracle Corporation)"
)
@Component
public class NavChangeTacticMapperImpl implements NavChangeTacticMapper {

    @Override
    public NavChangeTactic toTactic(NavChangeTacticDto tacticDto) {
        if ( tacticDto == null ) {
            return null;
        }

        NavChangeTactic navChangeTactic = new NavChangeTactic();

        navChangeTactic.setActivated( tacticDto.getActivated() );
        navChangeTactic.setId( tacticDto.getId() );
        navChangeTactic.setPeriodCondition( tacticDto.getPeriodCondition() );
        navChangeTactic.setPlanId( tacticDto.getPlanId() );
        List<Rule> list = tacticDto.getRuleList();
        if ( list != null ) {
            navChangeTactic.setRuleList( new ArrayList<Rule>( list ) );
        }
        else {
            navChangeTactic.setRuleList( null );
        }
        navChangeTactic.setInTradeDays( tacticDto.getInTradeDays() );

        return navChangeTactic;
    }

    @Override
    public NavChangeTacticDto toTacticDto(NavChangeTactic tactic, TacticTypeEnum tacticType) {
        if ( tactic == null && tacticType == null ) {
            return null;
        }

        NavChangeTacticDto navChangeTacticDto = new NavChangeTacticDto();

        if ( tactic != null ) {
            navChangeTacticDto.setActivated( tactic.getActivated() );
            navChangeTacticDto.setId( tactic.getId() );
            navChangeTacticDto.setPeriodCondition( tactic.getPeriodCondition() );
            navChangeTacticDto.setPlanId( tactic.getPlanId() );
            List<Rule> list = tactic.getRuleList();
            if ( list != null ) {
                navChangeTacticDto.setRuleList( new ArrayList<Rule>( list ) );
            }
            else {
                navChangeTacticDto.setRuleList( null );
            }
            navChangeTacticDto.setInTradeDays( tactic.getInTradeDays() );
        }
        if ( tacticType != null ) {
            navChangeTacticDto.setName( tacticType.getTacticName() );
            navChangeTacticDto.setPlanTactic( tacticType.isPlanTactic() );
            navChangeTacticDto.setTypeCode( tacticType.getTypeCode() );
        }

        return navChangeTacticDto;
    }

    @Override
    public ActivatedNavChangeTactic toActivatedNavChangeTactic(NavChangeTactic tactic, Rule rule, Double startValue, Double endValue, Double changePct) {
        if ( tactic == null && rule == null && startValue == null && endValue == null && changePct == null ) {
            return null;
        }

        ActivatedNavChangeTactic activatedNavChangeTactic = new ActivatedNavChangeTactic();

        if ( tactic != null ) {
            activatedNavChangeTactic.setPeriodCondition( tactic.getPeriodCondition() );
            activatedNavChangeTactic.setInTradeDays( tactic.getInTradeDays() );
        }
        if ( rule != null ) {
            activatedNavChangeTactic.setOperation( rule.getOperation() );
            activatedNavChangeTactic.setRangeCondition( rule.getRangeCondition() );
        }
        if ( startValue != null ) {
            activatedNavChangeTactic.setStartValue( startValue );
        }
        if ( endValue != null ) {
            activatedNavChangeTactic.setEndValue( endValue );
        }
        if ( changePct != null ) {
            activatedNavChangeTactic.setChangePct( changePct );
        }

        return activatedNavChangeTactic;
    }
}
