package com.xwguan.autofund.service.mapper.tactic;

import com.xwguan.autofund.dto.plan.tactic.MATacticDto;
import com.xwguan.autofund.entity.plan.rule.Rule;
import com.xwguan.autofund.entity.plan.scheme.activatedTactic.ActivatedMATactic;
import com.xwguan.autofund.entity.plan.tactic.MATactic;
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
public class MATacticMapperImpl implements MATacticMapper {

    @Override
    public MATactic toTactic(MATacticDto tacticDto) {
        if ( tacticDto == null ) {
            return null;
        }

        MATactic mATactic = new MATactic();

        mATactic.setActivated( tacticDto.getActivated() );
        mATactic.setId( tacticDto.getId() );
        mATactic.setPeriodCondition( tacticDto.getPeriodCondition() );
        mATactic.setPlanId( tacticDto.getPlanId() );
        List<Rule> list = tacticDto.getRuleList();
        if ( list != null ) {
            mATactic.setRuleList( new ArrayList<Rule>( list ) );
        }
        else {
            mATactic.setRuleList( null );
        }
        mATactic.setMa( tacticDto.getMa() );

        return mATactic;
    }

    @Override
    public MATacticDto toTacticDto(MATactic tactic, TacticTypeEnum tacticType) {
        if ( tactic == null && tacticType == null ) {
            return null;
        }

        MATacticDto mATacticDto = new MATacticDto();

        if ( tactic != null ) {
            mATacticDto.setActivated( tactic.getActivated() );
            mATacticDto.setId( tactic.getId() );
            mATacticDto.setPeriodCondition( tactic.getPeriodCondition() );
            mATacticDto.setPlanId( tactic.getPlanId() );
            List<Rule> list = tactic.getRuleList();
            if ( list != null ) {
                mATacticDto.setRuleList( new ArrayList<Rule>( list ) );
            }
            else {
                mATacticDto.setRuleList( null );
            }
            mATacticDto.setMa( tactic.getMa() );
        }
        if ( tacticType != null ) {
            mATacticDto.setName( tacticType.getTacticName() );
            mATacticDto.setPlanTactic( tacticType.isPlanTactic() );
            mATacticDto.setTypeCode( tacticType.getTypeCode() );
        }

        return mATacticDto;
    }

    @Override
    public ActivatedMATactic toActivatedMATactic(MATactic tactic, Rule rule, Double indexValue, Double maValue, Double deviationPct) {
        if ( tactic == null && rule == null && indexValue == null && maValue == null && deviationPct == null ) {
            return null;
        }

        ActivatedMATactic activatedMATactic = new ActivatedMATactic();

        if ( tactic != null ) {
            activatedMATactic.setPeriodCondition( tactic.getPeriodCondition() );
            activatedMATactic.setMa( tactic.getMa() );
        }
        if ( rule != null ) {
            activatedMATactic.setOperation( rule.getOperation() );
            activatedMATactic.setRangeCondition( rule.getRangeCondition() );
        }
        if ( indexValue != null ) {
            activatedMATactic.setIndexValue( indexValue );
        }
        if ( maValue != null ) {
            activatedMATactic.setMaValue( maValue );
        }
        if ( deviationPct != null ) {
            activatedMATactic.setDeviationPct( deviationPct );
        }

        return activatedMATactic;
    }
}
