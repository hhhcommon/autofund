package com.xwguan.autofund.service.mapper.tactic;

import com.xwguan.autofund.dto.plan.tactic.GainLossTacticDto;
import com.xwguan.autofund.entity.account.AssetHistory;
import com.xwguan.autofund.entity.plan.rule.Rule;
import com.xwguan.autofund.entity.plan.scheme.activatedTactic.ActivatedGainLossTactic;
import com.xwguan.autofund.entity.plan.tactic.GainLossTactic;
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
public class GainLossTacticMapperImpl implements GainLossTacticMapper {

    @Override
    public GainLossTactic toTactic(GainLossTacticDto tacticDto) {
        if ( tacticDto == null ) {
            return null;
        }

        GainLossTactic gainLossTactic = new GainLossTactic();

        gainLossTactic.setActivated( tacticDto.getActivated() );
        gainLossTactic.setId( tacticDto.getId() );
        gainLossTactic.setPeriodCondition( tacticDto.getPeriodCondition() );
        gainLossTactic.setPlanId( tacticDto.getPlanId() );
        List<Rule> list = tacticDto.getRuleList();
        if ( list != null ) {
            gainLossTactic.setRuleList( new ArrayList<Rule>( list ) );
        }
        else {
            gainLossTactic.setRuleList( null );
        }

        return gainLossTactic;
    }

    @Override
    public GainLossTacticDto toTacticDto(GainLossTactic tactic, TacticTypeEnum tacticType) {
        if ( tactic == null && tacticType == null ) {
            return null;
        }

        GainLossTacticDto gainLossTacticDto = new GainLossTacticDto();

        if ( tactic != null ) {
            gainLossTacticDto.setActivated( tactic.getActivated() );
            gainLossTacticDto.setId( tactic.getId() );
            gainLossTacticDto.setPeriodCondition( tactic.getPeriodCondition() );
            gainLossTacticDto.setPlanId( tactic.getPlanId() );
            List<Rule> list = tactic.getRuleList();
            if ( list != null ) {
                gainLossTacticDto.setRuleList( new ArrayList<Rule>( list ) );
            }
            else {
                gainLossTacticDto.setRuleList( null );
            }
        }
        if ( tacticType != null ) {
            gainLossTacticDto.setName( tacticType.getTacticName() );
            gainLossTacticDto.setPlanTactic( tacticType.isPlanTactic() );
            gainLossTacticDto.setTypeCode( tacticType.getTypeCode() );
        }

        return gainLossTacticDto;
    }

    @Override
    public ActivatedGainLossTactic toActivatedGainLossTactic(GainLossTactic gainLossTactic, Rule rule, AssetHistory assetHistory) {
        if ( gainLossTactic == null && rule == null && assetHistory == null ) {
            return null;
        }

        ActivatedGainLossTactic activatedGainLossTactic = new ActivatedGainLossTactic();

        if ( gainLossTactic != null ) {
            activatedGainLossTactic.setPeriodCondition( gainLossTactic.getPeriodCondition() );
        }
        if ( rule != null ) {
            activatedGainLossTactic.setOperation( rule.getOperation() );
            activatedGainLossTactic.setRangeCondition( rule.getRangeCondition() );
        }
        if ( assetHistory != null ) {
            activatedGainLossTactic.setPosIncomeRatePct( assetHistory.getPosIncomeRatePct() );
        }

        return activatedGainLossTactic;
    }
}
