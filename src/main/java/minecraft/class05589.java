package minecraft;

import Nursultan.class10525;
import Nursultan.class10528;
import com.google.common.collect.Lists;
import com.mojang.logging.LogQueues;
import com.mojang.logging.LogUtils;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import org.slf4j.Logger;

public class class05589 extends JComponent {
   private static final Font y = new Font("Monospaced", 0, 12);
   private static final Logger L = LogUtils.getLogger();
   private static final String u = "Minecraft server";
   private static final String i = "Minecraft server - shutting down!";
   private final class05623 R;
   private Thread M;
   private final Collection<Runnable> B = Lists.newArrayList();
   public final AtomicBoolean N = new AtomicBoolean();

   public void L() {
      this.B.forEach(Runnable::run);
   }

   private class05589(class05623 var1) {
      super();
      this.R = var1;
      this.setPreferredSize(new Dimension(854, 480));
      this.setLayout(new BorderLayout());

      try {
         this.add(this.R(), "Center");
         this.add(this.u(), "West");
      } catch (Exception exception) {
         L.error("Couldn't build server GUI", exception);
      }
   }

   private JComponent i() {
      class04788 class04788 = new class04788(this.R);
      JScrollPane jscrollpane = new JScrollPane(class04788, 22, 30);
      jscrollpane.setBorder(new TitledBorder(new EtchedBorder(), "Players"));
      return jscrollpane;
   }

   private JComponent u() {
      JPanel jpanel = new JPanel(new BorderLayout());
      class04784 class04784 = new class04784(this.R);
      this.B.add(class04784::N);
      jpanel.add(class04784, "North");
      jpanel.add(this.i(), "Center");
      jpanel.setBorder(new TitledBorder(new EtchedBorder(), "Stats"));
      return jpanel;
   }

   public void y() {
      if (!this.N.getAndSet(true)) {
         this.L();
      }
   }

   public void N(Runnable var1) {
      this.B.add(var1);
   }

   public static class05589 N(class05623 var0) {
      try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      } catch (Exception exception) {
      }

      JFrame jframe = new JFrame("Minecraft server");
      class05589 class05589 = new class05589(var0);
      jframe.setDefaultCloseOperation(2);
      jframe.add(class05589);
      jframe.pack();
      jframe.setLocationRelativeTo(null);
      jframe.setVisible(true);
      jframe.addWindowListener(new class10525(class05589, jframe, var0));
      class05589.N(jframe::dispose);
      class05589.N();
      return class05589;
   }

   public void N(JTextArea var1, JScrollPane var2, String var3) {
      if (!SwingUtilities.isEventDispatchThread()) {
         SwingUtilities.invokeLater(() -> this.N(var1, var2, var3));
      } else {
         Document document = var1.getDocument();
         JScrollBar jscrollbar = var2.getVerticalScrollBar();
         boolean flag = false;
         if (var2.getViewport().getView() == var1) {
            flag = jscrollbar.getValue() + jscrollbar.getSize().getHeight() + y.getSize() * 4 > jscrollbar.getMaximum();
         }

         try {
            document.insertString(document.getLength(), var3, null);
         } catch (BadLocationException badlocationexception) {
         }

         if (flag) {
            jscrollbar.setValue(Integer.MAX_VALUE);
         }
      }
   }

   public void N() {
      this.M.start();
   }

   private JComponent R() {
      JPanel jpanel = new JPanel(new BorderLayout());
      JTextArea jtextarea = new JTextArea();
      JScrollPane jscrollpane = new JScrollPane(jtextarea, 22, 30);
      jtextarea.setEditable(false);
      jtextarea.setFont(y);
      JTextField jtextfield = new JTextField();
      jtextfield.addActionListener(var2x -> {
         String s = jtextfield.getText().trim();
         if (!s.isEmpty()) {
            this.R.N(s, this.R.yu());
         }

         jtextfield.setText("");
      });
      jtextarea.addFocusListener(new class10528(this));
      jpanel.add(jscrollpane, "Center");
      jpanel.add(jtextfield, "South");
      jpanel.setBorder(new TitledBorder(new EtchedBorder(), "Log and chat"));
      this.M = new Thread(() -> {
         String s;
         while ((s = LogQueues.getNextLogEvent("ServerGuiConsole")) != null) {
            this.N(jtextarea, jscrollpane, s);
         }
      });
      this.M.setUncaughtExceptionHandler(new class07980(L));
      this.M.setDaemon(true);
      return jpanel;
   }
}
