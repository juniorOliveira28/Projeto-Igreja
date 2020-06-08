package Controle;

import dao.DAOGenerico;
import java.util.ArrayList;
import java.util.List;
import modelo.Pessoa;

public class PessoaMB {

    private Pessoa pessoa;
    private List listaPessoas;
    private DAOGenerico<Pessoa> daoPessoa;

    public PessoaMB() {
        pessoa = new Pessoa();
        listaPessoas = new ArrayList<Pessoa>();
        daoPessoa = new DAOGenerico<Pessoa>(Pessoa.class);
//        preencherListaPessoas();
    }
    
//    public void preencherListaPessoas(){
//        listaPessoas = daoPessoa.buscarTodos();
//    }
    
    public void salvar(){
        if(pessoa.getId() == null){
            daoPessoa.salvar(pessoa);
        }else{
            daoPessoa.alterar(pessoa);
        }
        pessoa = new Pessoa();
//        preencherListaPessoas();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List getListaPessoas() {
        return listaPessoas;
    }

    public void setListaPessoas(List listaPessoas) {
        this.listaPessoas = listaPessoas;
    }
    
    
}
