package br.com.ifpe.oxefoodmanha.modelo.produto;

import br.com.ifpe.oxefoodmanha.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaProduto extends EntidadeAuditavel {

    private static final long serialVersionUID = 7459691861102806812L;

    private String chaveEmpresa;

    private String descricao;

}
