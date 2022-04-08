

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;


public class Quizclass {
    public static JFrame MainFrame;
    public static JPanel MainPanel;

    //Labels
    public static JLabel Title_Slide1;
    public static JLabel Title2_Slide1;
    public static JLabel Title3_Slide1;
    public static JLabel Question_Slide2;
    public static JLabel Question_Slide3;
    public static JLabel Question_Slide4;
    public static JLabel Question_Slide5;
    public static JLabel Question_Slide6;
    public static JLabel Question_Slide7;
    public static JLabel Question_Slide8;
    public static JLabel Question_Slide9;
    public static JLabel Question_Slide10;


    //Buttons
    public static JButton Start_Button;
    public static JButton Red_Button;
    public static JButton Green_Button;
    public static JButton End_Button;


    //submit buttons
    public static JButton Submit_Button1;
    public static JButton Submit_Button2;
    public static JButton Submit_Button3;
    public static JButton Submit_Button4;
    public static JButton Submit_Button5;
    public static JButton Submit_Button6;
    public static JButton Submit_Button7;
    public static JButton Submit_Button8;


    //Separator
    public static JSeparator Sep_Slide2;

    //TextField
    public static JTextField Answer_Slide3;

    //ComboBox
    public static JComboBox Answer_Slide4;

    //RadioButton
    public static JRadioButton Answer_Slide5;
    public static JRadioButton Answer2_Slide5;
    //CheckBox
    public static JCheckBox Answer_Slide6;
    public static JCheckBox Answer2_Slide6;
    public static JCheckBox Answer3_Slide6;
    public static JCheckBox Answer4_Slide6;

    //Arrays
    public static String[] Slide4_Options = {"Pizza", "Noodle", "Calzone", "Sushi"};
    public static String[] Slide3_Options = {"Lucas", "lucas"};

    //misc
    public static boolean a;
    public static boolean b;
    public static boolean cc;
    public static boolean dd;
    public static String NAME;
    public static Object POGG;

    public static void main(String[] args) {
        GUI();
    }

    public static void GUI() {//this is where i make all of my swing stuff and just set them to visible false

        // makes Frame thats used throughout
        MainFrame = new JFrame("Quiz");
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainFrame.setSize(800, 500);

        // makes panel used throughout
        MainPanel = new JPanel();
        MainPanel.setBackground(Color.LIGHT_GRAY);
        MainFrame.add(MainPanel);
        MainPanel.setLayout(null);

        //These items stay until score tab
        End_Button = new JButton("END");
        End_Button.setBounds(25, 425, 75, 20);
        End_Button.setVisible(false);
        End_Button.addActionListener((ActionEvent a) -> MainFrame.dispose());
        MainPanel.add(End_Button);
        //Title Slide

        //Labels
        Title_Slide1 = new JLabel("QUIZ");
        Title_Slide1.setFont(new Font("Serif", Font.BOLD, 150));
        Title_Slide1.setBounds(25, 100, 400, 200);
        Title_Slide1.setVisible(false);
        MainPanel.add(Title_Slide1);

        Title2_Slide1 = new JLabel("Connor's");
        Title2_Slide1.setFont(new Font("Comic Sans", Font.BOLD, 70));
        Title2_Slide1.setBounds(10, 10, 400, 200);
        Title2_Slide1.setVisible(false);
        MainPanel.add(Title2_Slide1);

        //adds button to title page
        Start_Button = new JButton("Start");
        Start_Button.setBounds(150, 350, 500, 30);
        Start_Button.setVisible(false);
        MainPanel.add(Start_Button);

        //all of this adds picture
        BufferedImage img1 = null;
        try {
            img1 = ImageIO.read(new File("src/Connor1.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image dimg = img1.getScaledInstance(250, 200, 100);

        //Creating image icons
        ImageIcon image1 = new ImageIcon(dimg);

        //Adds picture as a label
        Title3_Slide1 = new JLabel(image1);
        Title3_Slide1.setBounds(450, 100, 250, 200);
        Title3_Slide1.setVisible(false);
        MainPanel.add(Title3_Slide1);

        //Slide 2

        Question_Slide2 = new JLabel("What is Connors Favorite Color?");
        Question_Slide2.setFont(new Font("Serif", Font.BOLD, 45));
        Question_Slide2.setBounds(25, 10, 700, 100);
        Question_Slide2.setVisible(false);
        MainPanel.add(Question_Slide2);

        Sep_Slide2 = new JSeparator();
        Sep_Slide2.setBounds(10, 100, 700, 10);
        Sep_Slide2.setForeground(Color.black);
        MainPanel.add(Sep_Slide2);
        Sep_Slide2.setVisible(false);

        Red_Button = new JButton("Red");
        Red_Button.setBounds(100, 150, 200, 200);
        Red_Button.setVisible(false);
        Red_Button.setFont(new Font("Serif", Font.PLAIN, 50));
        Red_Button.setBackground(Color.RED);
        MainPanel.add(Red_Button);

        Green_Button = new JButton("Green");
        Green_Button.setBounds(500, 150, 200, 200);
        Green_Button.setVisible(false);
        Green_Button.setFont(new Font("Serif", Font.PLAIN, 50));
        Green_Button.setBackground(Color.GREEN);
        MainPanel.add(Green_Button);

        //Slide 3
        Question_Slide3 = new JLabel("What Is Connors Last Name?");
        Question_Slide3.setFont(new Font("Serif", Font.BOLD, 45));
        Question_Slide3.setBounds(25, 10, 700, 100);
        Question_Slide3.setVisible(false);
        MainPanel.add(Question_Slide3);

        Answer_Slide3 = new JTextField();
        Answer_Slide3.setBounds(100, 150, 500, 200);
        Answer_Slide3.setFont(new Font("Serif", Font.BOLD, 100));
        Answer_Slide3.setVisible(false);
        MainPanel.add(Answer_Slide3);

        Submit_Button1 = new JButton("Sumbit");
        Submit_Button1.setBounds(125, 425, 75, 20);
        Submit_Button1.setVisible(false);
        MainPanel.add(Submit_Button1);

        //Slide 4
        Answer_Slide4 = new JComboBox<Object>(Slide4_Options);
        Answer_Slide4.setBounds(100, 150, 500, 200);
        Answer_Slide4.setFont(new Font("Serif", Font.BOLD, 100));
        Answer_Slide4.setVisible(false);
        MainPanel.add(Answer_Slide4);

        Question_Slide4 = new JLabel("What is Connors Favourite Food?");
        Question_Slide4.setFont(new Font("Serif", Font.BOLD, 45));
        Question_Slide4.setBounds(25, 10, 700, 100);
        Question_Slide4.setVisible(false);
        MainPanel.add(Question_Slide4);

        Submit_Button2 = new JButton("Sumbit");
        Submit_Button2.setBounds(125, 425, 75, 20);
        Submit_Button2.setVisible(false);
        MainPanel.add(Submit_Button2);

        //Slide 5
        Question_Slide5 = new JLabel("How many dogs does Connor Own?");
        Question_Slide5.setFont(new Font("Serif", Font.BOLD, 45));
        Question_Slide5.setBounds(25, 10, 700, 100);
        Question_Slide5.setVisible(false);
        MainPanel.add(Question_Slide5);

        Submit_Button3 = new JButton("Sumbit");
        Submit_Button3.setBounds(125, 425, 75, 20);
        Submit_Button3.setVisible(false);
        MainPanel.add(Submit_Button3);

        ButtonGroup btn_grp = new ButtonGroup();

        Answer_Slide5 = new JRadioButton("6");
        Answer_Slide5.setBounds(500, 150, 200, 200);
        MainPanel.add(Answer_Slide5);
        btn_grp.add(Answer_Slide5);
        Answer_Slide5.setVisible(false);

        Answer2_Slide5 = new JRadioButton("2");
        Answer2_Slide5.setBounds(100, 150, 200, 200);
        MainPanel.add(Answer2_Slide5);
        btn_grp.add(Answer2_Slide5);
        Answer2_Slide5.setVisible(false);
        Answer2_Slide5.addActionListener((ActionEvent t) -> dd = true); // Jer note: I simplified several of these action events, this just uses fewer lines to do the same thing and can always be used for single-operation if statements


        //Slide 6
        Question_Slide6 = new JLabel("What are Connors 2 Favourite Games?");
        Question_Slide6.setFont(new Font("Serif", Font.BOLD, 45));
        Question_Slide6.setBounds(25, 10, 700, 100);
        Question_Slide6.setVisible(false);
        MainPanel.add(Question_Slide6);

        Answer_Slide6 = new JCheckBox("Genshin Impact");
        Answer_Slide6.setBounds(100, 150, 200, 50);
        Answer_Slide6.setVisible(false);
        MainPanel.add(Answer_Slide6);

        Answer2_Slide6 = new JCheckBox("GeoGuesser");
        Answer2_Slide6.setBounds(500, 150, 200, 50);
        Answer2_Slide6.setVisible(false);
        MainPanel.add(Answer2_Slide6);
        Answer2_Slide6.addActionListener((ActionEvent z) -> b = true);
        Answer3_Slide6 = new JCheckBox("City Skylines");
        Answer3_Slide6.setBounds(500, 250, 200, 50);
        Answer3_Slide6.setVisible(false);
        MainPanel.add(Answer3_Slide6);
        Answer3_Slide6.addActionListener((ActionEvent x) -> a = true);

        Answer4_Slide6 = new JCheckBox("Fortnite");
        Answer4_Slide6.setBounds(100, 250, 200, 50);
        Answer4_Slide6.setVisible(false);
        MainPanel.add(Answer4_Slide6);


        Submit_Button4 = new JButton("Sumbit");
        Submit_Button4.setBounds(125, 425, 75, 20);
        Submit_Button4.setVisible(false);
        MainPanel.add(Submit_Button4);
        //Slide 7
        Question_Slide7 = new JLabel("If Connor had to choose 2, what ones would he pick?");
        Question_Slide7.setFont(new Font("Serif", Font.BOLD, 25));
        Question_Slide7.setBounds(25, 10, 700, 100);
        Question_Slide7.setVisible(false);
        MainPanel.add(Question_Slide7);

        Submit_Button5 = new JButton("Sumbit");
        Submit_Button5.setBounds(125, 425, 75, 20);
        Submit_Button5.setVisible(false);
        MainPanel.add(Submit_Button5);
        //Slide 8
        Question_Slide8 = new JLabel("Which Animals does Connor Own");
        Question_Slide8.setFont(new Font("Serif", Font.BOLD, 45));
        Question_Slide8.setBounds(25, 10, 700, 100);
        Question_Slide8.setVisible(false);
        MainPanel.add(Question_Slide8);

        Submit_Button6 = new JButton("Sumbit");
        Submit_Button6.setBounds(125, 425, 75, 20);
        Submit_Button6.setVisible(false);
        MainPanel.add(Submit_Button6);
        //Slide 9
        Question_Slide9 = new JLabel("What are Connors Pronouns?");
        Question_Slide9.setFont(new Font("Serif", Font.BOLD, 45));
        Question_Slide9.setBounds(25, 10, 700, 100);
        Question_Slide9.setVisible(false);
        MainPanel.add(Question_Slide9);

        Submit_Button7 = new JButton("Sumbit");
        Submit_Button7.setBounds(125, 425, 75, 20);
        Submit_Button7.setVisible(false);
        MainPanel.add(Submit_Button7);


        SLIDE_ONE();
    }

    public static void SLIDE_ONE() {

        MainFrame.setVisible(true);
        MainPanel.setVisible(true);
        Title_Slide1.setVisible(true);
        Title2_Slide1.setVisible(true);
        Title3_Slide1.setVisible(true);
        Start_Button.setVisible(true);

        Start_Button.addActionListener((ActionEvent a) -> {
            SLIDE_TWO();
            //disable last slide
            Title_Slide1.setVisible(false);
            Title2_Slide1.setVisible(false);
            Start_Button.setVisible(false);
            Title3_Slide1.setVisible(false);
        });
    }

    public static void SLIDE_TWO() { //Buttons


        //enable this slide
        End_Button.setVisible(true);
        Question_Slide2.setVisible(true);
        Sep_Slide2.setVisible(true);

        Red_Button.setVisible(true);
        Red_Button.addActionListener((ActionEvent b) -> {
            Question_Slide2.setVisible(false);
            Sep_Slide2.setVisible(false);
            Red_Button.setVisible(false);
            Green_Button.setVisible(false);
            SLIDE_THREE();

        });

        Green_Button.setVisible(true);
        Green_Button.addActionListener((ActionEvent c) -> {
            Question_Slide2.setVisible(false);
            Sep_Slide2.setVisible(false);
            Red_Button.setVisible(false);
            Green_Button.setVisible(false);
            SLIDE_THREE();
            cc = true;
        });

    }

    public static void SLIDE_THREE() { //Text

        //enable this slide
        Question_Slide3.setVisible(true);
        Answer_Slide3.setVisible(true);
        Submit_Button1.setVisible(true);

        Submit_Button1.addActionListener((ActionEvent d) -> {
            Question_Slide3.setVisible(false);
            Answer_Slide3.setVisible(false);
            Submit_Button1.setVisible(false);
            End_Button.setVisible(false);
            NAME = Answer_Slide3.getText();
            SLIDE_FOUR();
        });
    }

    public static void SLIDE_FOUR() {//ComboBox
        //Enable this slide
        Question_Slide4.setVisible(true);
        Answer_Slide4.setVisible(true);
        Submit_Button2.setVisible(true);
        End_Button.setVisible(true);

        Submit_Button2.addActionListener((ActionEvent e) -> {
            Question_Slide4.setVisible(false);
            Submit_Button2.setVisible(false);
            POGG = Answer_Slide4.getSelectedItem();
            Answer_Slide4.setVisible(false);
            SLIDE_FIVE();
        });
    }

    public static void SLIDE_FIVE() {//Check


        Submit_Button3.setVisible(true);
        Question_Slide5.setVisible(true);
        Answer_Slide5.setVisible(true);
        Answer2_Slide5.setVisible(true);


        Submit_Button3.addActionListener((ActionEvent f) -> {
            Question_Slide5.setVisible(false);
            Submit_Button3.setVisible(false);
            Answer_Slide5.setVisible(false);
            Answer2_Slide5.setVisible(false);


            SLIDE_SIX();
        });
    }

    public static void SLIDE_SIX() { //Radio
        Question_Slide6.setVisible(true);
        Answer_Slide6.setVisible(true);
        Answer2_Slide6.setVisible(true);
        Answer3_Slide6.setVisible(true);
        Answer4_Slide6.setVisible(true);


        Submit_Button4.setVisible(true);

        Submit_Button4.addActionListener((ActionEvent g) -> {
            Question_Slide6.setVisible(false);
            Answer_Slide6.setVisible(false);
            Answer2_Slide6.setVisible(false);
            Submit_Button4.setVisible(false);
            Answer3_Slide6.setVisible(false);
            Answer4_Slide6.setVisible(false);

            SLIDE_SEVEN();
        });


    }

    public static void SLIDE_SEVEN() {
        //logic

        //Q1
        if (cc) { // Jer note: You don't need to compare booleans, just putting the name of the var is essentially saying if [VAR] is true
            System.out.println("Question 1 is Correct");
        } else {
            System.out.println("Question 1 is Wrong");
        }
        //Q2
        if (Objects.equals(NAME, "Lucas")) {
            System.out.println("Question 2 is Correct");
        }//Not Working
        else {
            System.out.println(NAME);
        }
        //Q3
        if (POGG == "Pizza") {
            System.out.println("Question 3 is Correct");
        } else {
            System.out.println("Question 3 is Wrong");
        }

        //Q4
        if (dd) { // Jer note: see above
            System.out.println("Question 4 is Correct");
        } else {
            System.out.println("Question 4 is wrong");
        }

        //Q5
        if (b && a) { // Jer note: see above
            System.out.println("Question 5 is Correct");
        } else {
            System.out.println("Question 5 is Wrong");
        }

    }
}