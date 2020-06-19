package util;

import java.io.InputStream;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class RelatorioCartaRecomendacao extends JDialog {

    public RelatorioCartaRecomendacao() {
        super(new JFrame(), "Carta de Mudança", true);
        setSize(1200, 750);
        setLocationRelativeTo(null);
        try {
            String caminho = "/relatorios/cartaRecomendacao.jasper";
            InputStream input = getClass().getResourceAsStream(caminho);
            JasperPrint jp = JasperFillManager.fillReport(input, null, new JREmptyDataSource());
            JasperViewer viewer = new JasperViewer(jp);
            viewer.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            getContentPane().add(viewer.getContentPane());

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao gerar pdf: " + e, "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
    }
}
