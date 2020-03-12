package br.com.rd.exerciciospring.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CupomDTO {

    private Long idCupom;
    private Long idCliente;
    private String dtVenda;
    private BigDecimal vlVenda;

}
