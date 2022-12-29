package br.com.ifpe.oxefoodmanha.modelo.empresa;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifpe.oxefoodmanha.modelo.acesso.UsuarioService;
import br.com.ifpe.oxefoodmanha.util.entity.GenericService;

@Service
public class EmpresaService extends GenericService {
    
    @Autowired
    private EmpresaRepository repository;
    
    @Autowired
    private UsuarioService usuarioService;
    
    @Transactional
    public Empresa save(Empresa empresa) {
	
	usuarioService.save(empresa.getUsuario());

	super.preencherCamposAuditoria(empresa);
	return repository.save(empresa);
    }

}
