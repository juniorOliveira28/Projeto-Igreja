package util;

import fabrica.Fabrica;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class RelatorioMembros extends JDialog {

    public RelatorioMembros(List id, String caminho) {
        super(new JFrame(), "Carteirinha de Membros");
//        sql parametro jasper
//        SELECT * FROM pessoa WHERE $X{IN, id, lista}
//        parametro lista
//        new java.util.ArrayList()
        setModal(true);
        setSize(1200, 750);
        setLocationRelativeTo(null);
        try {
            Connection con = Fabrica.getFabrica().getConnection();
            Map<String, Object> parametros = new HashMap<>();
            parametros.put("listaId", id);
            System.out.println("Id rel: " + parametros);
            InputStream input = getClass().getResourceAsStream(caminho);
            JasperPrint jp = JasperFillManager.fillReport(input, parametros, con);
            JasperViewer viewer = new JasperViewer(jp, false);
            getContentPane().add(viewer.getContentPane());
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao gerar pdf: " + e, "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
    }
}
