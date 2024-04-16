import javax.swing.*;  
import javax.swing.border.*;  
import java.awt.*;  

public class LayoutDemo {
    public static void createAndShowGUI(){
        JFrame frame = new JFrame("Layout Demo");
        
        JPanel top = new JPanel();
        top.setPreferredSize(new Dimension(600, 150));
        top.setBackground(Color.white);
        frame.getContentPane().add(top, BorderLayout.NORTH);
        
        JPanel msgPanel = new JPanel();
        msgPanel.setPreferredSize(new Dimension(600, 80));
        msgPanel.setBackground(Color.white);
  

        JTextField message = new JTextField();
        message.setPreferredSize(new Dimension(300, 20));
        JLabel mLabel = new JLabel("message");
        
        msgPanel.add(mLabel, BorderLayout.NORTH);
        msgPanel.add(message, BorderLayout.SOUTH);
        
        JPanel keyPanel = new JPanel();
        keyPanel.setPreferredSize(new Dimension(600, 80));
        keyPanel.setBackground(Color.white);

        JTextField key = new JTextField();
        key.setPreferredSize(new Dimension(300, 20));
        JLabel kLabel = new JLabel("key");
        
        keyPanel.add(kLabel, BorderLayout.NORTH);
        keyPanel.add(key, BorderLayout.SOUTH);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(600, 40));
        buttonPanel.setBackground(Color.white);
        JButton b1 = new JButton("encrypt");
        buttonPanel.add(b1, BorderLayout.CENTER);
        
        top.add(msgPanel, BorderLayout.NORTH);
        top.add(keyPanel, BorderLayout.CENTER);
        top.add(buttonPanel, BorderLayout.SOUTH);
        frame.getContentPane().add(top, BorderLayout.NORTH);

        JPanel center = new JPanel();
        center.setPreferredSize(new Dimension(600, 400));
        frame.getContentPane().add(center, BorderLayout.CENTER);
        
        
        
        /*
        // top fields
        JPanel top = new JPanel();
        top.setPreferredSize(new Dimension(600, 30));
        top.setBackground(Color.gray);
        frame.getContentPane().add(top, BorderLayout.NORTH);
                
        JTextField message = new JTextField();
        message.setPreferredSize(new Dimension(400, 20));
        top.add(message, BorderLayout.CENTER);
        
        // middle fields
        JPanel center = new JPanel();
        center.setPreferredSize(new Dimension(600, 500));
        center.setBackground(Color.gray);
        frame.getContentPane().add(center, BorderLayout.CENTER);
          
        JTextField key = new JTextField();
        key.setPreferredSize(new Dimension(400, 20));
        center.add(key, BorderLayout.CENTER);

        // bottom fields
        JPanel bottom = new JPanel();
        bottom.setPreferredSize(new Dimension(600,50));
        bottom.setBackground(Color.blue);
        frame.getContentPane().add(bottom, BorderLayout.SOUTH);
        
        JButton b1 = new JButton("encrypt");
        bottom.add(b1);*/
        
        // Show the Frame
        frame.setSize(600,600);
        frame.pack();
        frame.setVisible(true);
    }
    // your code
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}
