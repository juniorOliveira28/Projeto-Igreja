package Controle;

import dao.DAOGenerico;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Pessoa;

public class PessoaMB {

    private Pessoa pessoa;
    private DAOGenerico<Pessoa> daoPessoa;
    private List<Pessoa> listaPessoas;
    private DefaultTableModel model;
    byte[] img = null;
    Long idMembro;
    String cidade;
    public String caminho;
    Pessoa p;

    public PessoaMB() {
        pessoa = new Pessoa();
        daoPessoa = new DAOGenerico<Pessoa>(Pessoa.class);
        listaPessoas = new ArrayList<Pessoa>();
    }

    public void preencherLista() {
        listaPessoas = daoPessoa.buscarTodos(cidade);
        model.setNumRows(0);
        for (Pessoa pessoa : listaPessoas) {
            Object[] dados = {pessoa.getNome(), pessoa.getCpf(), pessoa.getRg(), pessoa.getCidade()};
            model.addRow(dados);
        }
    }
}
