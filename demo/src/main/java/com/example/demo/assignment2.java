package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.TransferHandler;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.awt.*;
import javax.swing.*;

@SpringBootApplication
public class assignment2 extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public assignment2() {

        initUI();
    }

    private void initUI() {
        /* Duck Instances*/

        Duck mellard = new MellardDuck();
        Duck rubber = new RubberDuck();
        Duck redhead = new RedheadDuck();

        /* Image ICONS */

        ImageIcon icon1=new ImageIcon();
        ImageIcon icon2 = new ImageIcon();
        ImageIcon icon3 = new ImageIcon();
        ImageIcon icon4 = new ImageIcon();

        /* Buttons for Duck Behaviors */

        JButton behav0 = new JButton("Display Default");
        JButton behav1 = new JButton();
        JButton behav2 = new JButton();
        JButton behav3 = new JButton();
        JButton behav4 = new JButton();
        JButton behav5 = new JButton();
        JButton behav6 = new JButton();
        JButton behav7 = new JButton();

        /* Displaying Icons of ducks mentioned in duck.txt file */

		try {
            File myObj = new File("src/main/java/com/example/demo/duck.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              if(data.equalsIgnoreCase("mallard")==true)
               icon3 = new ImageIcon("src/main/java/com/example/demo/mallard_duck.png");
              if(data.equalsIgnoreCase("rubber")==true)
               icon1 = new ImageIcon("src/main/java/com/example/demo/rubber_duck.png");
              if(data.equalsIgnoreCase("redhead")==true)
               icon2 = new ImageIcon("src/main/java/com/example/demo/redhead_duck.png");
               if(data.equalsIgnoreCase("grid")==true)
               icon4 = new ImageIcon("src/main/java/com/example/demo/grid.png");
                

            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

          /* Reading behaviors mentioned in behavior.txt */

          try {
            File myObj1 = new File("src/main/java/com/example/demo/behavior.txt");
            Scanner myReader1 = new Scanner(myObj1);
            while (myReader1.hasNextLine()) {
              String data1 = myReader1.nextLine();
              if(data1.equalsIgnoreCase("flyWithWings")==true)
              {
               behav1 = new JButton("flyWithWings");
         
              }
            
               if(data1.equalsIgnoreCase("flyNoWay")==true)
               {
               behav2 = new JButton("flyNoWay");
             
               }
            
               if(data1.equalsIgnoreCase("flyRocketPowered")==true)
               {
               behav3 = new JButton("flyRocketPowered");
    
               }
        
               if(data1.equalsIgnoreCase("Quack")==true)
               {
               behav4 = new JButton("Quack");
        
               }
        
               if(data1.equalsIgnoreCase("Mute")==true)
               {
               behav5 = new JButton("Mute");
              
               }
               
               if(data1.equalsIgnoreCase("Squeak")==true)
               {
               behav6 = new JButton("Squeak");
              
               }
            
               if(data1.equalsIgnoreCase("QuackwithRythm")==true)
               {
               behav7 = new JButton("QuackwithRythm");
            
               }
              
                

            }
            myReader1.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

        /* Labels for images icons */

        JLabel label1 = new JLabel(icon1, JLabel.CENTER);
        JLabel label2 = new JLabel(icon2, JLabel.CENTER);
        JLabel label3 = new JLabel(icon3, JLabel.CENTER);
        JLabel label4 = new JLabel(icon4, JLabel.CENTER);  

        /* Adding Mouse Listener for Drag and Drop Functionality */

        MouseAdapter listener = new DragMouseAdapter();
        label1.addMouseListener(listener);
        label2.addMouseListener(listener);
        label3.addMouseListener(listener);
        label4.addMouseListener(listener);
        Frame frame = new JFrame();
        /* Buttons for creating 2x2 Grid */

        JButton b1 = new JButton();
        JButton b2 = new JButton();
        JButton b3 = new JButton();
        JButton b4 = new JButton();
        b1.setFocusable(false);
        b2.setFocusable(false);
        b3.setFocusable(false);
        b4.setFocusable(false);
        behav0.setFocusable(false);
        behav1.setFocusable(false);
        behav2.setFocusable(false);
        behav3.setFocusable(false);
        behav4.setFocusable(false);
        behav5.setFocusable(false);
        behav6.setFocusable(false);
        behav7.setFocusable(false);

        /* Display Default properties of duck when Display Default button is clicked */

        behav0.addActionListener(new ActionListener(){
            int count=0;
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                b1.addActionListener(new ActionListener() {
                    
                    public void actionPerformed(ActionEvent arg0) {
                        String msg;
                        if(count==0)
                        {
                        msg=mellard.display() +". " + mellard.swim() + ". "+ mellard.PerformFly()+". " + mellard.PerformQuack();
                       // if(count==0)
                        JOptionPane.showMessageDialog (frame.getComponent(0), msg);
                        }
                        count=1;
        
                    }
                });
                b2.addActionListener(new ActionListener() {
                    
                   
                    public void actionPerformed(ActionEvent arg0) {
                        String msg;
                        if(count==0)
                        {
                        msg=redhead.display() +". " + redhead.swim() + ". "+ redhead.PerformFly()+". " + redhead.PerformQuack();
                       // if(count==0)
                        JOptionPane.showMessageDialog (frame.getComponent(0), msg);
                        }
                        count=1;
        
                    }
                });
                b3.addActionListener(new ActionListener() {
                    
                    public void actionPerformed(ActionEvent arg0) {
                        String msg;
                        if(count==0)
                        {
                        msg=rubber.display() +". " + rubber.swim() + ". "+ rubber.PerformFly()+". " + rubber.PerformQuack();
                        //if(count==0)
                        JOptionPane.showMessageDialog (frame.getComponent(0), msg);
                        }
                        count=1;
        
                    }
                });
            count=0;
            }
            
        });
        
        /* Add FlywithWings Behavior in ducks dynamically */

        behav1.addActionListener(new ActionListener() {
            int count1=0;
            @Override
            public void actionPerformed(ActionEvent e) {
                b1.addActionListener(new ActionListener() {
                    
                    public void actionPerformed(ActionEvent arg0) {
                        String msg;
                        if (count1==0)
                        {
                        mellard.setFlyBehavior(new FlywithWings());
                        msg=mellard.display() +". " + mellard.swim() + ". "+ mellard.PerformFly()+". " + mellard.PerformQuack();
                        
                        JOptionPane.showMessageDialog (frame.getComponent(0), msg);
                        }
                        count1=1;
        
                    }
                });
                b2.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent arg0) {
                        String msg;
                        if(count1==0)
                        {
                        redhead.setFlyBehavior(new FlywithWings());
                        msg=redhead.display() +". " + redhead.swim() + ". "+ redhead.PerformFly()+". " + redhead.PerformQuack();
                        
                        JOptionPane.showMessageDialog (frame.getComponent(0), msg);
                        }
                        count1=1;
        
                    }
                });

                b3.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent arg0) {
                        
                        String msg;
                        if(count1==0)
                        {
                        rubber.setFlyBehavior(new FlywithWings());
                        msg=rubber.display() +". " + rubber.swim() + ". "+ rubber.PerformFly()+". " + rubber.PerformQuack();
                        
                        JOptionPane.showMessageDialog (frame.getComponent(0), msg);
                        }
                        count1=1;
        
                    }
                });
                count1=0;
            }

        });

        /* Add FlyNoWay Behavior in ducks dynamically */

        behav2.addActionListener(new ActionListener() {
            int count2=0;
            @Override
            public void actionPerformed(ActionEvent e) {
                b1.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent arg0) {
                        
                        String msg;
                        if(count2==0)
                        {
                        mellard.setFlyBehavior(new FlyNoWay());
                        msg=mellard.display() +". " + mellard.swim() + ". "+ mellard.PerformFly()+". " + mellard.PerformQuack();
                        
                        JOptionPane.showMessageDialog (frame.getComponent(0), msg);
                        }
                        count2=1;
        
                    }
                });
                b2.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent arg0) {
                 
                        String msg;
                        if(count2==0)
                        {
                        redhead.setFlyBehavior(new FlyNoWay());
                        msg=redhead.display() +". " + redhead.swim() + ". "+ redhead.PerformFly()+". " + redhead.PerformQuack();
                        
                        JOptionPane.showMessageDialog (frame.getComponent(0), msg);
                        }
                        count2=1;
        
                    }
                });

                b3.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent arg0) {
                      
                        String msg;
                        if(count2==0)
                        {
                        rubber.setFlyBehavior(new FlyNoWay());
                        msg=rubber.display() +". " + rubber.swim() + ". "+ rubber.PerformFly()+". " + rubber.PerformQuack();
                        
                        JOptionPane.showMessageDialog (frame.getComponent(0), msg);
                        }
                        count2=1;
        
                    }
                });
                count2=0;
            }

        });

        /* Add FlyWithRocketPowered Behavior in ducks dynamically */

        behav3.addActionListener(new ActionListener() {
            int count3=0;
            @Override
            public void actionPerformed(ActionEvent e) {
                b1.addActionListener(new ActionListener() {
                    
                    public void actionPerformed(ActionEvent arg0) {
                        
                        String msg;
                        if(count3==0)
                        {
                        mellard.setFlyBehavior(new FlyRocketPowered());
                        msg=mellard.display() +". " + mellard.swim() + ". "+ mellard.PerformFly()+". " + mellard.PerformQuack();
                        
                        JOptionPane.showMessageDialog (frame.getComponent(0), msg);
                        }
                        
                        count3=1;
                    }
                });
                b2.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent arg0) {
                        String msg;
                        if(count3==0)
                        {
                        redhead.setFlyBehavior(new FlyRocketPowered());
                        msg=redhead.display() +". " + redhead.swim() + ". "+ redhead.PerformFly()+". " + redhead.PerformQuack();
                        
                        JOptionPane.showMessageDialog (frame.getComponent(0), msg);
                        }
                        count3=1;
                    }
                });

                b3.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent arg0) {
                        String msg;
                        if(count3==0)
                        {
                        rubber.setFlyBehavior(new FlyRocketPowered());
                        msg=rubber.display() +". " + rubber.swim() + ". "+ rubber.PerformFly()+". " + rubber.PerformQuack();
                        
                        JOptionPane.showMessageDialog (frame.getComponent(0), msg);
                        }
                        count3=1;
                    }
                });
                
                count3=0;
            }
            

        });
        /* Add Quack Behavior in ducks dynamically */
        behav4.addActionListener(new ActionListener() {
            int count4=0;
            @Override
            public void actionPerformed(ActionEvent e) {
                b1.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent arg0) {
                        String msg;
                        mellard.setQuackBehavior(new Quack());
                        if(count4==0)
                        {
                        msg=mellard.display() +". " + mellard.swim() + ". "+ mellard.PerformFly()+". " + mellard.PerformQuack();
                        
                        JOptionPane.showMessageDialog (frame.getComponent(0), msg);
                        }
                        count4=1;
        
                    }
                });
                b2.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent arg0) {
                        String msg;
                        if(count4==0)
                        {
                        redhead.setQuackBehavior(new Quack());
                        msg=redhead.display() +". " + redhead.swim() + ". "+ redhead.PerformFly()+". " + redhead.PerformQuack();
                        
                        JOptionPane.showMessageDialog (frame.getComponent(0), msg);
                        }
                        count4=1;
        
                    }
                });

                b3.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent arg0) {
                        String msg;
                        if(count4==0)
                        {
                        rubber.setQuackBehavior(new Quack());
                        msg=rubber.display() +". " + rubber.swim() + ". "+ rubber.PerformFly()+". " + rubber.PerformQuack();
                        
                        JOptionPane.showMessageDialog (frame.getComponent(0), msg);
                        }
                        count4=1;
        
                    }
                });
                count4=0;
            }

        });

        /* Add Mute Behavior in ducks dynamically */

        behav5.addActionListener(new ActionListener() {
            int count5=0;
            @Override
            public void actionPerformed(ActionEvent e) {
                b1.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent arg0) {
                        String msg;
                        if(count5==0)
                        {
                        mellard.setQuackBehavior(new MuteQuack());
                        msg=mellard.display() +". " + mellard.swim() + ". "+ mellard.PerformFly()+". " + mellard.PerformQuack();
                        
                        JOptionPane.showMessageDialog (frame.getComponent(0), msg);
                        }
                        count5=1;
        
                    }
                });
                b2.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent arg0) {
                        String msg;
                        if(count5==0)
                        {
                        redhead.setQuackBehavior(new MuteQuack());
                        msg=redhead.display() +". " + redhead.swim() + ". "+ redhead.PerformFly()+". " + redhead.PerformQuack();
                        
                        JOptionPane.showMessageDialog (frame.getComponent(0), msg);
                        }
                        count5=1;
        
                    }
                });

                b3.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent arg0) {
                        String msg;
                        if(count5==0)
                        {
                        rubber.setQuackBehavior(new MuteQuack());
                        msg=rubber.display() +". " + rubber.swim() + ". "+ rubber.PerformFly()+". " + rubber.PerformQuack();
                        
                        JOptionPane.showMessageDialog (frame.getComponent(0), msg);
                        }
                        count5=1;
        
                    }
                });
                count5=0;
            }

        });
        /* Add Squeak Behavior in ducks dynamically */
        behav6.addActionListener(new ActionListener() {
            int count6=0;
            @Override
            public void actionPerformed(ActionEvent e) {
                b1.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent arg0) {
                        String msg;
                        if(count6==0)
                        {
                        mellard.setQuackBehavior(new Squeak());
                        msg=mellard.display() +". " + mellard.swim() + ". "+ mellard.PerformFly()+". " + mellard.PerformQuack();
                        
                        JOptionPane.showMessageDialog (frame.getComponent(0), msg);
                        }
                        count6=1;
        
                    }
                });
                b2.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent arg0) {
                        String msg;
                        if(count6==0)
                        {
                        redhead.setQuackBehavior(new Squeak());
                        msg=redhead.display() +". " + redhead.swim() + ". "+ redhead.PerformFly()+". " + redhead.PerformQuack();
                        JOptionPane.showMessageDialog (frame.getComponent(0), msg);
                        }
                        count6=1;
        
                    }
                });

                b3.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent arg0) {
                        String msg;
                        if(count6==0)
                        {
                        rubber.setQuackBehavior(new Squeak());
                        msg=rubber.display() +". " + rubber.swim() + ". "+ rubber.PerformFly()+". " + rubber.PerformQuack();
                        
                        JOptionPane.showMessageDialog (frame.getComponent(0), msg);
                        }
                        count6=1;
        
                    }
                });
                count6=0;
            }

        });

        /* Add QuackWithRythm Behavior in ducks dynamically */

        behav7.addActionListener(new ActionListener() {
            int count7=0;
            @Override
            public void actionPerformed(ActionEvent e) {
                b1.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent arg0) {
                        String msg;
                        if(count7==0)
                        {
                        mellard.setQuackBehavior(new QuackwithRythm());
                        msg=mellard.display() +". " + mellard.swim() + ". "+ mellard.PerformFly()+". " + mellard.PerformQuack();
                        JOptionPane.showMessageDialog (frame.getComponent(0), msg);
                        }
                        count7=1;
        
                    }
                });
                b2.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent arg0) {
                        String msg;
                        if(count7==0)
                        {
                        redhead.setQuackBehavior(new QuackwithRythm());
                        msg=redhead.display() +". " + redhead.swim() + ". "+ redhead.PerformFly()+". " + redhead.PerformQuack();
                        JOptionPane.showMessageDialog (frame.getComponent(0), msg);
                        }
                        count7=1;
        
                    }
                });

                b3.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent arg0) {
                        String msg;
                        if(count7==0)
                        {
                        rubber.setQuackBehavior(new QuackwithRythm());
                        msg=rubber.display() +". " + rubber.swim() + ". "+ rubber.PerformFly()+". " + rubber.PerformQuack();
                        JOptionPane.showMessageDialog (frame.getComponent(0), msg);
                        }
                        count7=1;
        
                    }
                });
            count7=0;
            }

        });        
        /* Drag and Drop Transfer Handler */
        label1.setTransferHandler(new TransferHandler("icon"));
        label2.setTransferHandler(new TransferHandler("icon"));
        label3.setTransferHandler(new TransferHandler("icon"));
        label4.setTransferHandler(new TransferHandler("icon"));
        b1.setTransferHandler(new TransferHandler("icon"));
        b2.setTransferHandler(new TransferHandler("icon"));
        b3.setTransferHandler(new TransferHandler("icon"));
        b4.setTransferHandler(new TransferHandler("icon"));

        /* creating GUI layout*/

        createPannedLayout(label1, label2, label3,label4, b1,b2,b3,b4,behav1,behav2,behav3,behav4,behav5,behav6,behav7,behav0);

        setTitle("Assignment 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private class DragMouseAdapter extends MouseAdapter {

        public void mousePressed(MouseEvent e) {

            JComponent c = (JComponent) e.getSource();
            TransferHandler handler = c.getTransferHandler();
            handler.exportAsDrag(c, e, TransferHandler.COPY);
        }
    }

    private void createPannedLayout(JComponent... arg) 
    {
        JLabel canvasLabel = new JLabel();
		JPanel canvasPanel = new JPanel();
		canvasPanel.add(canvasLabel);
        canvasPanel.setBackground(Color.white);
        canvasPanel.setPreferredSize(new Dimension (400, 700));


        
        JLabel paletteLabel = new JLabel();
		JPanel palettePanel = new JPanel();
		palettePanel.add(paletteLabel);
        palettePanel.setBackground(Color.white);
        // palettePanel.setSize(400, 500);
        palettePanel.setLayout(new BoxLayout(palettePanel, BoxLayout.Y_AXIS));

        JLabel behaviorsLabel = new JLabel();
		JPanel behaviorsPanel = new JPanel();
		behaviorsPanel.add(behaviorsLabel);
        behaviorsPanel.setBackground(Color.white);
        behaviorsPanel.setPreferredSize(new Dimension (100, 700));
        behaviorsPanel.setLayout(new BoxLayout(behaviorsPanel, BoxLayout.Y_AXIS));

        canvasPanel.add(arg[4]);
        canvasPanel.add(arg[5]);
        canvasPanel.add(arg[6]);
        canvasPanel.add(arg[7]);

        palettePanel.add(arg[0]);
        palettePanel.add(arg[1]);
        palettePanel.add(arg[2]);
        palettePanel.add(arg[3]);
        
        behaviorsPanel.add(arg[8]);
        behaviorsPanel.add(arg[9]);
        behaviorsPanel.add(arg[10]);
        behaviorsPanel.add(arg[11]);
        behaviorsPanel.add(arg[12]);
        behaviorsPanel.add(arg[13]);
        behaviorsPanel.add(arg[14]);
        behaviorsPanel.add(arg[15]);

        JSplitPane sp1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, palettePanel, canvasPanel);
        sp1.setOneTouchExpandable(true);

        JSplitPane sp2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, sp1, behaviorsPanel);
        sp2.setOneTouchExpandable(true);

        Container pane = getContentPane();

        pane.add(sp2);
    }

    
    public static void main(String[] args) {

        SpringApplicationBuilder builder  = new SpringApplicationBuilder(assignment2.class);
        builder.headless(false);
        ConfigurableApplicationContext ctx = builder.run(args);

        EventQueue.invokeLater(() -> {

            JFrame ex = ctx.getBean(assignment2.class);
			ex.setVisible(true);
        });
    }
}