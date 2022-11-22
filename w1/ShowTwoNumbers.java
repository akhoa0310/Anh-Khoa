import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You have just entered: ";
        strNum1 = JOptionPane.showInputDialog(null,
                "please Input the first number:", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";
        strNum2 = JOptionPane.showInputDialog(null,
                "please Input the second number:", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;
        JOptionPane.showMessageDialog(null,
                strNotification, "show two numbers", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

}