//program to demonstrate GridBagLayout and GridBagConstraints
import java.awt.*;

class GridBagLayoutEx extends Frame {
    public static void main(String[] args)
    {
        Frame f = new Frame("Rajasekhar");
        f.setSize(200,400);
        f.setVisible(true);

        GridBagLayout gl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        f.setLayout(gl);

        gbc.gridx = 0;
        gbc.gridy = 0;

        gbc.weightx = 0.5;
        gbc.weighty = 0.3;

        Button b1 = new Button("first");
        gl.setConstraints(b1,gbc);
        f.add(b1);

        gbc.gridx = 0;
        gbc.gridy = 1;

        Button b2 = new Button("Second");
        gl.setConstraints(b2,gbc);
        f.add(b2);

        gbc.gridx = 1;
        gbc.gridy = 0;

        Button b3 = new Button("Third");
        gl.setConstraints(b3,gbc);
        f.add(b3);

        gbc.gridx = 1;
        gbc.gridy = 1;

        Button b4 = new Button("Fourth");
        gl.setConstraints(b4,gbc);
        f.add(b4);
    }
}
