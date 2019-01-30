package com.xwguan.autofund.service.mapper.stock;

import com.xwguan.autofund.entity.stock.StockData;
import com.xwguan.autofund.manager.impl.NeteaseCsvStockData;
import java.time.format.DateTimeFormatter;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-01-30T10:49:11+0800",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 1.1.0.v20150122-0735, environment: Java 1.8.0_151 (Oracle Corporation)"
)
@Component
public class NeteaseStockMapperImpl implements NeteaseStockMapper {

    @Override
    public StockData toStockData(NeteaseCsvStockData neteaseCsvStockData) {
        if ( neteaseCsvStockData == null ) {
            return null;
        }

        StockData stockData = new StockData();

        stockData.setChg( neteaseCsvStockData.getChg() );
        stockData.setClose( neteaseCsvStockData.getClose() );
        if ( neteaseCsvStockData.getDate() != null ) {
            stockData.setDate( java.time.LocalDate.parse( neteaseCsvStockData.getDate() ) );
        }
        stockData.setHigh( neteaseCsvStockData.getHigh() );
        stockData.setLow( neteaseCsvStockData.getLow() );
        stockData.setMcap( neteaseCsvStockData.getMcap() );
        stockData.setOpen( neteaseCsvStockData.getOpen() );
        stockData.setPchg( neteaseCsvStockData.getPchg() );
        stockData.setPclose( neteaseCsvStockData.getPclose() );
        stockData.setTcap( neteaseCsvStockData.getTcap() );
        stockData.setTurnover( neteaseCsvStockData.getTurnover() );
        stockData.setVaturnover( neteaseCsvStockData.getVaturnover() );
        stockData.setVoturnover( neteaseCsvStockData.getVoturnover() );

        return stockData;
    }
}
