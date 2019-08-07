/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.model;

import javax.swing.JFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author esic
 */
public class LineChart extends JFrame {

   public LineChart( String applicationTitle , String chartTitle ) {
      super(applicationTitle);
      JFreeChart lineChart = ChartFactory.createLineChart(
         chartTitle,
         "Jours","Poids",
         createDataset(),
         PlotOrientation.VERTICAL,
         true,true,false);
         
      ChartPanel chartPanel = new ChartPanel( lineChart );
      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
      setContentPane( chartPanel );
   }

   private DefaultCategoryDataset createDataset( ) {
      DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
      dataset.addValue( 75 , "poids" , "j1" );
      dataset.addValue( 76 , "poids",  "j2" );
      dataset.addValue( 77 , "poids" , "j3" );
      dataset.addValue( 78 , "poids", "j4" );
      dataset.addValue( 79 , "poids" , "j5" );
      dataset.addValue( 80 , "poids" , "j6" );
      return dataset;
   }
   
   public static void main( String[ ] args ) {
      LineChart chart = new LineChart(
         "Poids Vs Jour" ,
         "Suivi du poids");

      chart.pack( );
      RefineryUtilities.centerFrameOnScreen( chart );
      chart.setVisible( true );
   }
}
