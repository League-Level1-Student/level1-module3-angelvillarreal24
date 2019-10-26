package _04_magic_box;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MagicBox extends JPanel implements Runnable, MouseListener {

    /*
     * We are going to hide secrets within the magic box.
     * When the user clicks on a secret place, stuff will happen.
     *
     * 1. Make the frame respond to mouse clicks.
     *
     * 2. When the mouse is clicked, use the Media Palace (read the code in the magic_box package) to play sounds,
     *    show images or speak.
     *
     * 3. Choose 3 different locations on the background image.You can either use the mouse position,
     *    or the color of the image, then decide what action the Media Palace should take in each case.
     *     backgroundImage.getRGB(e.getX(), e.getY()) will give you the color of the current pixel.
     */

    BufferedImage backgroundImage;
    MediaPalace bruh = new MediaPalace();


    @Override
    public void run() {
        try {
            loadBackgroundImage();
            createUI();


        } catch (Exception w) {
            System.err.println(w.getMessage());
        }
    }

    private void createUI() {
        JFrame frame = new JFrame("The Magic Box contains many secrets...");
        frame.add(this);
        setPreferredSize(new Dimension(backgroundImage.getWidth(), backgroundImage.getHeight()));
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.addMouseListener(this);
    }

    private void loadBackgroundImage() throws Exception {
        String imageFile = "src/_04_magic_box/magic-box.jpg";
        try {
            backgroundImage = ImageIO.read(new File(imageFile));
        } catch (IOException e) {
            throw new Exception("Could not load image: " + imageFile);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(backgroundImage, 0, 0, null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.print(getMousePosition().x + ", ");
        System.out.println(getMousePosition().y);

        if (e.getX() >= 40 && e.getX() <= 105 && e.getY() >= 40 && e.getY() <= 105) {
            bruh.speak("Click on the Black Character");
        }
        if (e.getX() >= 183 && e.getY() >= 499 && e.getY() <= 549 && e.getX() <= 216) {
            bruh.speak("Click on the White Character");
        }
        if (e.getX() >= 166 && e.getY() >= 819 && e.getY() <= 872 && e.getX() <= 203) {
            bruh.speak("Somebody once told me the world is gonna roll me\n" +
                    "I ain't the sharpest tool in the shed\n" +
                    "She was looking kind of dumb with her finger and her thumb\n" +
                    "In the shape of an \"L\" on her forehead\n" +
                    "Well the years start coming and they don't stop coming\n" +
                    "Fed to the rules and I hit the ground running\n" +
                    "Didn't make sense not to live for fun\n" +
                    "Your brain gets smart but your head gets dumb\n" +
                    "So much to do, so much to see\n" +
                    "So what's wrong with taking the back streets?\n" +
                    "You'll never know if you don't go\n" +
                    "You'll never shine if you don't glow\n" +
                    "Hey now, you're an all-star, get your game on, go play\n" +
                    "Hey now, you're a rock star, get the show on, get paid\n" +
                    "And all that glitters is gold\n" +
                    "Only shooting stars break the mold");
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

}


