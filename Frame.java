import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Frame extends JFrame implements ActionListener {


    int counter = 0;
    JButton button1 = new JButton("");
    JButton button2 = new JButton("");
    JButton button3 = new JButton("");
    JButton button4 = new JButton("");
    JButton button5 = new JButton("");
    JButton button6 = new JButton("");
    JButton button7 = new JButton("");
    JButton button8 = new JButton("");
    JButton button9 = new JButton("");



    JLabel X1 = new JLabel("X");
    JLabel X2 = new JLabel("X");
    JLabel X3 = new JLabel("X");
    JLabel X4 = new JLabel("X");
    JLabel X5 = new JLabel("X");
    JLabel X6 = new JLabel("X");
    JLabel X7 = new JLabel("X");
    JLabel X8 = new JLabel("X");
    JLabel X9 = new JLabel("X");


    JLabel O1= new JLabel("O");
    JLabel O2= new JLabel("O");
    JLabel O3= new JLabel("O");
    JLabel O4= new JLabel("O");
    JLabel O5= new JLabel("O");
    JLabel O6= new JLabel("O");
    JLabel O7= new JLabel("O");
    JLabel O8= new JLabel("O");
    JLabel O9= new JLabel("O");

    Frame(){
        this.setVisible(true);
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setTitle("Tic Tac Toe");

        //inserting buttons
        button1.setVisible(true);
        button1.setBounds(75,50,100,100);
        button1.addActionListener(this);
        this.add(button1);

        button2.setVisible(true);
        button2.setBounds(250,50,100,100);
        button2.addActionListener(this);
        this.add(button2);

        button3.setVisible(true);
        button3.setBounds(420,50,100,100);
        button3.addActionListener(this);
        this.add(button3);

        button4.setVisible(true);
        button4.setBounds(75,225,100,100);
        button4.addActionListener(this);
        this.add(button4);

        button5.setVisible(true);
        button5.setBounds(250,225,100,100);
        button5.addActionListener(this);
        this.add(button5);

        button6.setVisible(true);
        button6.setBounds(420,225,100,100);
        button6.addActionListener(this);
        this.add(button6);

        button7.setVisible(true);
        button7.setBounds(75,400,100,100);
        button7.addActionListener(this);
        this.add(button7);

        button8.setVisible(true);
        button8.setBounds(250,400,100,100);
        button8.addActionListener(this);
        this.add(button8);

        button9.setVisible(true);
        button9.setBounds(420,400,100,100);
        button9.addActionListener(this);
        this.add(button9);

        this.add(X1);
        this.add(X2);
        this.add(X3);
        this.add(X4);
        this.add(X5);
        this.add(X6);
        this.add(X7);
        this.add(X8);
        this.add(X9);



        this.add(O1);
        this.add(O2);
        this.add(O3);
        this.add(O4);
        this.add(O5);
        this.add(O6);
        this.add(O7);
        this.add(O8);
        this.add(O9);


    }
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        super.paint(g2d);
        g2d.setPaint(Color.GRAY);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawRect(50, 50, 500,500);
        //vertical lines
        g2d.drawLine(200,50,200,545);
        g2d.drawLine(400,50,400,545);
        //horizontal lines
        g2d.drawLine(50,200,545,200);
        g2d.drawLine(50,400,545,400);

    }
    public void actionPerformed(ActionEvent e) {
        //button1
        if (e.getSource() == button1) {
            System.out.println(counter);
            if (counter % 2 == 0) {
                button1.setVisible(false);
                X1.setFont(new Font("Arial", Font.PLAIN, 70));
                X1.setBounds(75, 50, 100, 100);
                X1.setVisible(true);
                counter++;

            } else if (counter % 2 != 0) {
                button1.setVisible(false);
                O1.setFont(new Font("Arial", Font.PLAIN, 70));
                O1.setBounds(75, 50, 100, 100);
                O1.setVisible(true);
                counter++;
            }
            //button2
        } else if (e.getSource() == button2) {
            if (counter % 2 == 0) {
                System.out.println(counter);
                button2.setVisible(false);
                //X.getHorizontalAlignment();
                X2.setFont(new Font("Arial", Font.PLAIN, 70));
                X2.setBounds(250, 50, 100, 100);
                X2.setVisible(true);
                counter++;

            } else if (counter % 2 != 0) {
                button2.setVisible(false);
                O2.setFont(new Font("Arial", Font.PLAIN, 70));
                O2.setBounds(250, 50, 100, 100);
                O2.setVisible(true);
                counter++;
            }
            //button3
        } else if (e.getSource() == button3) {
            System.out.println(counter);
            if (counter % 2 == 0) {
                button3.setVisible(false);
                //X.getHorizontalAlignment();
                X3.setFont(new Font("Arial", Font.PLAIN, 70));
                X3.setBounds(420, 50, 100, 100);
                X3.setVisible(true);
                counter++;

            } else if (counter % 2 != 0) {
                button3.setVisible(false);
                O3.setFont(new Font("Arial", Font.PLAIN, 70));
                O3.setBounds(420, 50, 100, 100);
                O3.setVisible(true);
                counter++;
            }
            //button4
        } else if (e.getSource() == button4) {
            System.out.println(counter);
            if (counter % 2 == 0) {
                button4.setVisible(false);
                //X.getHorizontalAlignment();
                X4.setFont(new Font("Arial", Font.PLAIN, 70));
                X4.setBounds(75, 225, 100, 100);
                X4.setVisible(true);
                counter++;

            } else if (counter % 2 != 0) {
                button4.setVisible(false);
                O4.setFont(new Font("Arial", Font.PLAIN, 70));
                O4.setBounds(75, 225, 100, 100);
                O4.setVisible(true);
                counter++;
            }
            //button5
        }else if (e.getSource() == button5) {
                System.out.println(counter);
                if (counter % 2 == 0) {
                    button5.setVisible(false);
                    //X.getHorizontalAlignment();
                    X5.setFont(new Font("Arial", Font.PLAIN, 70));
                    X5.setBounds(250,225,100,100);
                    X5.setVisible(true);
                    counter++;

                } else if (counter % 2 != 0) {
                    button5.setVisible(false);
                    O5.setFont(new Font("Arial", Font.PLAIN, 70));
                    O5.setBounds(250,225,100,100);
                    O5.setVisible(true);
                    counter++;
                }
         //button6
        }else if (e.getSource() == button6) {
            System.out.println(counter);
            if (counter % 2 == 0) {
                button6.setVisible(false);
                //X.getHorizontalAlignment();
                X6.setFont(new Font("Arial", Font.PLAIN, 70));
                X6.setBounds(420,225,100,100);
                X6.setVisible(true);
                counter++;

            } else if (counter % 2 != 0) {
                button6.setVisible(false);
                O6.setFont(new Font("Arial", Font.PLAIN, 70));
                O6.setBounds(420,225,100,100);
                O6.setVisible(true);
                counter++;
            }
            //button 7
        }else if (e.getSource() == button7) {
            System.out.println(counter);
            if (counter % 2 == 0) {
                button7.setVisible(false);
                //X.getHorizontalAlignment();
                X7.setFont(new Font("Arial", Font.PLAIN, 70));
                X7.setBounds(75,400,100,100);
                X7.setVisible(true);
                counter++;

            } else if (counter % 2 != 0) {
                button7.setVisible(false);
                O7.setFont(new Font("Arial", Font.PLAIN, 70));
                O7.setBounds(75,400,100,100);
                O7.setVisible(true);
                counter++;
            }
            //button8
        }else if (e.getSource() == button8) {
            System.out.println(counter);
            if (counter % 2 == 0) {
                button8.setVisible(false);
                //X.getHorizontalAlignment();
                X8.setFont(new Font("Arial", Font.PLAIN, 70));
                X8.setBounds(250,400,100,100);
                X8.setVisible(true);
                counter++;

            } else if (counter % 2 != 0) {
                button8.setVisible(false);
                O8.setFont(new Font("Arial", Font.PLAIN, 70));
                O8.setBounds(250,400,100,100);
                O8.setVisible(true);
                counter++;
            }
            //button 9
        }else if (e.getSource() == button9) {
            System.out.println(counter);
            if (counter % 2 == 0) {
                button9.setVisible(false);
                //X.getHorizontalAlignment();
                X9.setFont(new Font("Arial", Font.PLAIN, 70));
                X9.setBounds(420,400,100,100);
                X9.setVisible(true);
                counter++;

            } else if (counter % 2 != 0) {
                button8.setVisible(false);
                O9.setFont(new Font("Arial", Font.PLAIN, 70));
                O9.setBounds(420,400,100,100);
                O9.setVisible(true);
                counter++;
            }
            }
        }
    }







