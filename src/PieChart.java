import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

import javafx.scene.paint.Color;

public class PieChart extends JFrame{

    public PieChart(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Chart");
        setSize(950, 700);
        setLocationRelativeTo(null);

        createChart();

        setVisible(true);
    }

    public void createChart(){
        DefaultPieDataset grafico = new DefaultPieDataset();
        grafico.setValue("Boys", 42);
        grafico.setValue("Girls", 92);

        JFreeChart create = ChartFactory.createPieChart3D("Students", grafico, true, true, false);
        ChartPanel painel = new ChartPanel(create);
        add(painel);


    }

    public static void main(String[] args) {
        
        new PieChart();
    }
}