package uet.oop.bomberman.gui.menu;

import uet.oop.bomberman.gui.Frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class HighScore extends JMenu {
    public Frame frame;

    public HighScore(Frame _frame) {
        super("HighScore");
        frame = _frame;
        JMenuItem scores = new JMenuItem("Top Scores");
        scores.setMnemonic(KeyEvent.VK_T);
        scores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        add(scores);
    }
}
