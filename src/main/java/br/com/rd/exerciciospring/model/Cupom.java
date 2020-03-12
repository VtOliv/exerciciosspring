package br.com.rd.exerciciospring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_cupom")
public class Cupom {
    @Id
    @Column( name = "id_cupom")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCupom;

    @Column(name = "id_cliente")
    private Long idCliente;

    @Column(name = "dt_venda")
    private String dtVenda;

    @Column(name = "vl_venda")
    private BigDecimal vlVenda;
}
