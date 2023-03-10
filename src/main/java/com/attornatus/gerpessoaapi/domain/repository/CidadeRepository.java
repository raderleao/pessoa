package com.attornatus.gerpessoaapi.domain.repository;

import com.attornatus.gerpessoaapi.domain.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
