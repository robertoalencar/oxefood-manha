package br.com.ifpe.oxefoodmanha.util.entity;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
@EqualsAndHashCode(of = { "id" })
public class EntidadeNegocio implements Serializable {

    private static final long serialVersionUID = -4783471489763332403L;

    private Long id;

    private Boolean habilitado;

}
