package dao;

import fabrica.Fabrica;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import modelo.Pessoa;

public class DAOGenerico<T> {

    private static EntityManager entityManager;
    private Class<T> classe;

    public DAOGenerico(Class<T> classe) {
        entityManager = Fabrica.getFabrica().getEm();
        this.classe = classe;
    }

    public T salvar(T objeto) {
        try {
            if (!entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().begin();
            }
            entityManager.persist(objeto);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        }
        return objeto;
    }

    public T alterar(T objeto) {
        try {
            if (!entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().begin();
            }
            entityManager.merge(objeto);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        }
        return objeto;
    }

    public boolean excluir(Long id) {
        try {
            entityManager.getTransaction().begin();
            T objeto = entityManager.find(classe, id);
            entityManager.remove(objeto);
            entityManager.getTransaction().commit();
            return true;

        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();

        }
        return false;
    }

    public List<T> buscarTodos(String cidade) {
        Query query = null;
        try {
            if (cidade.equals("JUSSARA - PR")) {
                query = entityManager.createQuery("from " + classe.getSimpleName() + " where cidadeIgreja = 'JUSSARA - PR' and situacao = 'ATIVO' order by nome");
            } else if (cidade.equals("CIANORTE - PR")) {
                query = entityManager.createQuery("from " + classe.getSimpleName() + " where cidadeIgreja = 'CIANORTE - PR' and situacao = 'ATIVO' order by nome");
            } else if (cidade.equals("ATALAIA - PR")) {
                query = entityManager.createQuery("from " + classe.getSimpleName() + " where cidadeIgreja = 'ATALAIA - PR' and situacao = 'ATIVO' order by nome");
            } else if (cidade.equals("PAIÇANDU - PR")) {
                query = entityManager.createQuery("from " + classe.getSimpleName() + " where cidadeIgreja like 'PAI%' and situacao = 'ATIVO' order by nome");
            } else if (cidade.equals("TERRA BOA - PR")) {
                query = entityManager.createQuery("from " + classe.getSimpleName() + " where cidadeIgreja = 'TERRA BOA - PR' and situacao = 'ATIVO' order by nome");
            } else if (cidade.equals("MUNHOZ DE MELO - PR")) {
                query = entityManager.createQuery("from " + classe.getSimpleName() + " where cidadeIgreja = 'MUNHOZ DE MELO - PR' and situacao = 'ATIVO' order by nome");
            }else if(cidade.equals("INATIVO")){
                query = entityManager.createQuery("from " + classe.getSimpleName() + " where situacao = 'INATIVO' order by nome");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return query.getResultList();
    }

    public List<Pessoa> buscarPorNome(String nome, String cidade) {

        Query query = null;
        try {
//            query = entityManager.createQuery("from Pessoa where situacao = 'ATIVO' and nome like '" + nome + "%'");
             if (cidade.equals("JUSSARA - PR")) {
                query = entityManager.createQuery("from " + classe.getSimpleName() + " where cidadeIgreja = 'JUSSARA - PR' and situacao = 'ATIVO' and nome like '" + nome + "%' order by nome");
            } else if (cidade.equals("CIANORTE - PR")) {
                query = entityManager.createQuery("from " + classe.getSimpleName() + " where cidadeIgreja = 'CIANORTE - PR' and situacao = 'ATIVO' and nome like '" + nome + "%' order by nome");
            } else if (cidade.equals("ATALAIA - PR")) {
                query = entityManager.createQuery("from " + classe.getSimpleName() + " where cidadeIgreja = 'ATALAIA - PR' and situacao = 'ATIVO' and nome like '" + nome + "%' order by nome");
            } else if (cidade.equals("PAIÇANDU - PR")) {
                query = entityManager.createQuery("from " + classe.getSimpleName() + " where cidadeIgreja like 'PAI%' and situacao = 'ATIVO' and nome like '" + nome + "%' order by nome");
            } else if (cidade.equals("TERRA BOA - PR")) {
                query = entityManager.createQuery("from " + classe.getSimpleName() + " where cidadeIgreja = 'TERRA BOA - PR' and situacao = 'ATIVO' and nome like '" + nome + "%' order by nome");
            } else if (cidade.equals("MUNHOZ DE MELO - PR")) {
                query = entityManager.createQuery("from " + classe.getSimpleName() + " where cidadeIgreja = 'MUNHOZ DE MELO - PR' and situacao = 'ATIVO' and nome like '" + nome + "%' order by nome");
            }else if(cidade.equals("INATIVO")){
                query = entityManager.createQuery("from " + classe.getSimpleName() + " where situacao = 'INATIVO' and nome like '" + nome + "%' order by nome");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return query.getResultList();
    }
}
