import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

import javafx.scene.paint.Color;

public class Chart extends JFrame{

    public Chart(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Chart");
        setSize(950, 700);
        setLocationRelativeTo(null);

        createChart();

        setVisible(true);
    }

    public void createChart(){
        DefaultPieDataset grafico = new DefaultPieDataset();
        grafico.setValue("Boys", 127);
        grafico.setValue("Girls", 209);

        JFreeChart create = ChartFactory.createPieChart("Students", grafico, false, false, true);
        ChartPanel painel = new ChartPanel(create);
        add(painel);


    }

    public static void main(String[] args) {
        
        new Chart();
    }
}