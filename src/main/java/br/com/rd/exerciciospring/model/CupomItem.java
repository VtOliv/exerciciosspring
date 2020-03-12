package br.com.rd.exerciciospring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_cupom_item")
public class CupomItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cupom_item")
    private Long idCupomItem;

    @ManyToOne
    @JoinColumn(name ="id_cupom")
    private Cupom idCupom;

    @OneToOne
    @JoinColumn(name = "id_produto")
    private Produto idProduto;

    @Column(name = "qt_produto")
    private Long qtProduto;

    @Column(name = "vl_produto")
    private BigDecimal vlProduto;


}
