package org.example;

import javax.swing.*;
import java.awt.*;

public class ColorChooser extends JPanel {
    private Color initialColor = Color.WHITE;
    private Color chosenColor;

    public ColorChooser() {
        chosenColor = JColorChooser.showDialog(null, "Select a color", initialColor);

    }

    public Color getSelectedColor() {
        return chosenColor;
    }


}