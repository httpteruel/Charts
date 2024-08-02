import java.awt.BasicStroke;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class LineChart extends JFrame{
    public LineChart(){
        XYDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        chartPanel.setBackground(Color.white);
        add(chartPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    private JFreeChart createChart(XYDataset dataset) {
        JFreeChart chart = ChartFactory.createXYLineChart("", "Ano", "Percentual", dataset, PlotOrientation.VERTICAL, true, true, false);
        
        XYPlot plot = chart.getXYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.red);
        renderer.setSeriesStroke(0, new BasicStroke(2.0f));

        plot.setRenderer(renderer);
        plot.setBackgroundPaint(Color.white);

        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.black);
        
        plot.setDomainMinorGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.BLACK);

        chart.getLegend().setFrame(BlockBorder.NONE);


        return chart;
    }
    private XYDataset createDataset(){
        XYSeries cycle1 = new XYSeries("Brasil");

        cycle1.add(2013, 7.3);
        cycle1.add(2014, 6.5);
        cycle1.add(2015, 6.9);
        cycle1.add(2016, 9.6);
        cycle1.add(2017, 12.7);
        cycle1.add(2018, 12.3);
        cycle1.add(2019, 12.2);
        cycle1.add(2020, 11.4);
        cycle1.add(2021, 14.5);
        cycle1.add(2022, 11.2);
        cycle1.add(2023, 8.4);
        cycle1.add(2024, 7.6);

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(cycle1);

        return dataset;

    }

    public static void main(String[] args) {
        LineChart lineChart = new LineChart();
        lineChart.setVisible(true); 
    }
}

