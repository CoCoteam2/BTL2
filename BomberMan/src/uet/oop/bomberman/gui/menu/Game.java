package uet.oop.bomberman.gui.menu;

import uet.oop.bomberman.gui.Frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Game extends JMenu{
    public Frame frame;

    public Game(Frame frame) {
        super("Game");
        this.frame = frame;

        /*
         * New Game
         */
        JMenuItem newgame = new JMenuItem("End Game");
        newgame.setMnemonic(KeyEvent.VK_E);
        newgame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.endGame();
            }
        });
        add(newgame);

        JMenuItem pause = new JMenuItem("Pause");
        pause.setMnemonic(KeyEvent.VK_P);
        pause.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.pause();
            }
        });
        add(pause);
    }
}
