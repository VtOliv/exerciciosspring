package br.com.rd.exerciciospring.service;

import br.com.rd.exerciciospring.model.Cupom;
import br.com.rd.exerciciospring.model.DTO.CupomDTO;
import br.com.rd.exerciciospring.repository.CupomRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CupomService {

    CupomRepository repository;

    public ResponseEntity salvar(Cupom cupomDTO) {
        if(cupomDTO.getIdCupom() == null || cupomDTO.getDtVenda() == null)
            return ResponseEntity.badRequest().body(new Exception("Cupom invalido ou nao existente"));

        Cupom cupomEntity = new Cupom();
        cupomEntity.setIdCupom(cupomDTO.getIdCupom());
        cupomEntity.setIdCliente(cupomDTO.getIdCliente());
        cupomEntity.setDtVenda(cupomDTO.getDtVenda());
        cupomEntity.setVlVenda(cupomDTO.getVlVenda());

        Cupom retornoRepository = repository.save(cupomEntity);
        CupomDTO retornoDto = new CupomDTO();
        cupomDTO.setIdCupom(cupomEntity.getIdCupom());

        return ResponseEntity.ok().body(retornoDto);
    }

    public ResponseEntity buscar (CupomDTO cupomDTO) {
        if(cupomDTO.getIdCupom() == null || cupomDTO.getDtVenda() == null)
            return ResponseEntity.badRequest().body(new Exception("Cupom invalido ou nao existente"));

        Cupom cupomEntity = new Cupom();
        List<Cupom> notas = new ArrayList<>();
        cupomEntity.setIdCupom(cupomDTO.getIdCupom());
        cupomEntity.setDtVenda(cupomDTO.getDtVenda());

        notas.add(cupomEntity);

        return ResponseEntity.ok().body();
    }

}
