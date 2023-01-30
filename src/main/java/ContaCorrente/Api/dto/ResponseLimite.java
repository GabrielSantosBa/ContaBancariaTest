package ContaCorrente.Api.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseLimite {

    private BigDecimal limite;

}
