package util;

import fabrica.Fabrica;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class RelatorioMembrosVerso extends JDialog {

    public RelatorioMembrosVerso() {
        super(new JFrame(), "Carteirinha de Membros", true);
        setSize(1000, 700);
        setLocationRelativeTo(null);
        try {
//            Connection con = Fabrica.getFabrica().getConnection();
            String caminho = "/relatorios/relatorioVerso1.jasper";
            InputStream input = getClass().getResourceAsStream(caminho);
            JasperPrint jp = JasperFillManager.fillReport(input, null, new JREmptyDataSource());
            JasperViewer viewer = new JasperViewer(jp);
            getContentPane().add(viewer.getContentPane());

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao gerar pdf: " + e, "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
    }
}
