import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class ColumnChart extends JFrame{

    public ColumnChart(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Column Chart");
        setSize(950, 700);
        setLocationRelativeTo(null);
        createChart();
        setVisible(true);
    }

    public void createChart(){
        DefaultCategoryDataset column = new DefaultCategoryDataset();
        column.setValue(1412000000, "China", "");
        column.setValue(125100000, "Japan", "");
        column.setValue(51630000, "South Korea", "");

        JFreeChart chart = ChartFactory.createBarChart3D("A", "B", "C", column, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel panel = new ChartPanel(chart);
        add(panel);
    }
    public static void main(String[] args) {
        new ColumnChart();
    }
}
