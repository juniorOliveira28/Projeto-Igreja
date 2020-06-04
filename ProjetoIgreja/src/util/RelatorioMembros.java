package util;

import fabrica.Fabrica;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class RelatorioMembros extends JDialog {

    public RelatorioMembros(Long id) {
        super(new JFrame(), "Carteirinha de Membros");
        setSize(1000, 700);
        setLocationRelativeTo(null);
        try {
            Connection con = Fabrica.getFabrica().getConnection();
            String caminho = "/relatorios/carteirinhaMembros.jasper";
            HashMap filtro = new HashMap();
            filtro.put("idM", id);
            JasperPrint jp = new JasperPrint();
            InputStream input = getClass().getResourceAsStream(caminho);
            jp = JasperFillManager.fillReport(input, filtro, con);
            JasperViewer viewer = new JasperViewer(jp);
//            viewer.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
//            viewer.setVisible(true);
            getContentPane().add(viewer.getContentPane());
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao gerar pdf: " + e, "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
    }
}