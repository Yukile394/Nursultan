package minecraft;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.JComponent;
import javax.swing.Timer;

public class class04784 extends JComponent {
   private static final DecimalFormat N = new DecimalFormat("########0.000", DecimalFormatSymbols.getInstance(Locale.ROOT));
   private final int[] y = new int[256];
   private int L;
   private final String[] u = new String[11];
   private final class02796 i;
   private final Timer R;

   public class04784(class02796 var1) {
      super();
      this.i = var1;
      this.setPreferredSize(new Dimension(456, 246));
      this.setMinimumSize(new Dimension(456, 246));
      this.setMaximumSize(new Dimension(456, 246));
      this.R = new Timer(500, var1x -> this.y());
      this.R.start();
      this.setBackground(Color.BLACK);
   }

   private void y() {
      long ix = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
      this.u[0] = "Memory use: " + ix / 1024L / 1024L + " mb (" + Runtime.getRuntime().freeMemory() * 100L / Runtime.getRuntime().maxMemory() + "% free)";
      this.u[1] = "Avg tick: " + N.format((double)this.i.ym() / class01517.y) + " ms";
      this.y[this.L++ & 0xFF] = (int)(ix * 100L / Runtime.getRuntime().maxMemory());
      this.repaint();
   }

   public void N() {
      this.R.stop();
   }

   @Override
   public void paint(Graphics var1) {
      var1.setColor(new Color(16777215));
      var1.fillRect(0, 0, 456, 246);

      for (int ix = 0; ix < 256; ix++) {
         int j = this.y[ix + this.L & 0xFF];
         var1.setColor(new Color(j + 28 << 16));
         var1.fillRect(ix, 100 - j, 1, j);
      }

      var1.setColor(Color.BLACK);

      for (int k = 0; k < this.u.length; k++) {
         String s = this.u[k];
         if (s != null) {
            var1.drawString(s, 32, 116 + k * 16);
         }
      }
   }
}
