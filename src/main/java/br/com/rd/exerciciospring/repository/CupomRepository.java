package br.com.rd.exerciciospring.repository;

import br.com.rd.exerciciospring.model.Cupom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface CupomRepository extends JpaRepository<Cupom,Long> {

    List<Cupom> findByCupom (Long idCupom);
    List<Cupom> findByCliente (Long idCliente);
    List<Cupom> findByData (String dtVenda);
    List<Cupom> findByVlVenda (BigDecimal vlVenda);
}
