package util;

import fabrica.Fabrica;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Pessoa;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class RelatorioMembros extends JDialog {

    public RelatorioMembros(List id, String caminho) {
        super(new JFrame(), "Carteirinha de Membros");
//        sql parametro jasper
//        SELECT * FROM pessoa WHERE $X{IN, id, lista}
//        parametro lista
//        new java.util.ArrayList()
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
//            viewer.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
//            viewer.setVisible(true);
            getContentPane().add(viewer.getContentPane());
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao gerar pdf: " + e, "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
    }
}
