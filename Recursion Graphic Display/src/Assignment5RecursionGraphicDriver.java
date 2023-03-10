//This program produces a GUI for the squares puzzle problem.   The user puts
//in the iteration and it produces a graph and calls/displays the formula, loop, and
//recursive solutions.

import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Assignment5RecursionGraphicDriver extends JFrame //implements ActionListener
{
    public Assignment5RecursionGraphicDriver()
    {
        setTitle("CSC205AB Assignment5Recursion Display");
        setSize(430, 400);
        setLocation(50,50);
        Container contentPane = getContentPane();

        final JTextField iterationText = new JTextField(5);

        JButton jbtGraph = new JButton("Graph");

        final JPanel  panel  = new JPanel();
        final JPanel  inputPanel = new JPanel(new GridLayout(2,5));
        Label iterationLabel = new Label("Iteration",Label.CENTER);
        inputPanel.add(iterationLabel,0);
        Label formulaLabel = new Label("Formula result",Label.CENTER);
        inputPanel.add(formulaLabel,1);
        Label loopLabel = new Label("Loop result",Label.CENTER);
        inputPanel.add(loopLabel,2);
        Label recursionLabel = new Label("Recursion result",Label.CENTER);
        inputPanel.add(recursionLabel,3);
        inputPanel.add(iterationText,4);

        final Label formulaResultLabel = new Label("",Label.CENTER);
        inputPanel.add(formulaResultLabel,5);
        final Label loopResultLabel = new Label("",Label.CENTER);
        inputPanel.add(loopResultLabel,6);
        final Label recursionResultLabel = new Label("",Label.CENTER);
        inputPanel.add(recursionResultLabel,7);


        contentPane.add(inputPanel, BorderLayout.SOUTH);
        contentPane.add(panel,  BorderLayout.CENTER);
        contentPane.add(jbtGraph, BorderLayout.NORTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        jbtGraph.addActionListener(new ActionListener()
                                   {
        public void actionPerformed(ActionEvent event)
        {
            //set up the Graphics
            Graphics g = panel.getGraphics();
            g.setColor(Color.BLUE);
            g.clearRect(0,0,panel.getWidth(), panel.getHeight());

            //find various dimensions for the panel
            int n=Integer.parseInt(iterationText.getText());
            int maxrows = 2*n + 1;
            int middlex = panel.getWidth()/2;
            int middley = panel.getHeight()/2;
            int smallerDimension = Math.min(panel.getHeight(), panel.getWidth());
            int squaresize = Math.min(60, smallerDimension/maxrows);
            int ystart = middley - (maxrows*squaresize)/2 - squaresize;
            int xstart = middlex - squaresize/2 + squaresize;


            int numinrow = -1;   //to start

            for (int row=1; row<=maxrows; row++)
            {
                if (row<=(maxrows+1)/2)		//up to and including middle (longest) row
                    {
                        numinrow += 2;			//each row has 2 more squares than prev. row
                        ystart += squaresize;
                        xstart -= squaresize;
                        for (int j=0; j<numinrow; j++)   //draw each square in the row
                            {
                                g.drawRect(xstart+j*squaresize, ystart, squaresize, squaresize);
                            }

                    }
                else						//lower half
                {
                    numinrow -= 2;			//each row has 2 less than prev. row
                    ystart += squaresize;
                    xstart += squaresize;
                    for (int j=0; j<numinrow; j++)	//draw each square in the row
                        {
                            g.drawRect(xstart+j*squaresize, ystart, squaresize, squaresize);
                        }
                }
            }

            //call the puzzle methods to get results; display them
            formulaResultLabel.setText("" + Assignment5Recursion.puzzleFormula(n));
            loopResultLabel.setText("" + Assignment5Recursion.puzzleLoop(n));
            recursionResultLabel.setText("" + Assignment5Recursion.puzzleRecurse(n));
            }
        }
        );
    }

    public static void main(String[] args)
    {
        //create a new instance
        Assignment5RecursionGraphicDriver myDriver = new Assignment5RecursionGraphicDriver();
        myDriver.setVisible(true);

    }
}