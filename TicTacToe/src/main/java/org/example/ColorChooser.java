package org.example;

import javax.swing.*;
import java.awt.*;

public class ColorChooser extends JPanel {
    Color initialcolor = Color.WHITE;

    Color color = JColorChooser.showDialog(null, "Select a color", initialcolor);

}