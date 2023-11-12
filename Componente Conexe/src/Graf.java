import javax.swing.*;



public class Graf {

    private static void initializare()
    {
        JFrame j = new JFrame("Algoritmica grafurilor");

        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        j.add(new MyPanel());

        j.setSize(600,600);

        j.setVisible(true);

    }

    public static  void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                initializare();
            }
        });
    }
}
