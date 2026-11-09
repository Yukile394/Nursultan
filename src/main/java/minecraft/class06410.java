package minecraft;

import java.io.PrintWriter;
import org.apache.commons.io.IOUtils;

class class06410 implements class01704, class07703 {
   public static final int N = 1;
   private final PrintWriter L;
   private int u;
   private boolean i;

   private void L() {
      if (this.i) {
         this.L.println();
         this.i = false;
      }
   }

   class06410(PrintWriter var1) {
      super();
      this.L = var1;
   }

   @Override
   public boolean B() {
      return false;
   }

   @Override
   public void close() {
      IOUtils.closeQuietly(this.L);
   }

   private void y(int var1) {
      for (int ix = 0; ix < var1 + 1; ix++) {
         this.L.write("    ");
      }
   }

   private void N(int var1) {
      this.y(var1);
      this.u = var1;
   }

   @Override
   public void N(class00392 var1) {
      this.L();
      this.y(this.u + 1);
      this.L.print("[M] ");
      this.L.println(var1.getString());
   }

   @Override
   public void N(String var1) {
      this.L();
      this.N(this.u + 1);
      this.L.print("[E] ");
      this.L.print(var1);
   }

   @Override
   public void N(int var1, String var2) {
      this.L();
      this.N(var1);
      this.L.print("[C] ");
      this.L.print(var2);
      this.i = true;
   }

   @Override
   public void N(int var1, String var2, int var3) {
      if (this.i) {
         this.L.print(" -> ");
         this.L.println(var3);
         this.i = false;
      } else {
         this.N(var1);
         this.L.print("[R = ");
         this.L.print(var3);
         this.L.print("] ");
         this.L.println(var2);
      }
   }

   @Override
   public void N(int var1, class01894 var2, int var3) {
      this.L();
      this.N(var1);
      this.L.print("[F] ");
      this.L.print(var2);
      this.L.print(" size=");
      this.L.println(var3);
   }

   @Override
   public boolean A_() {
      return true;
   }

   @Override
   public boolean B_() {
      return true;
   }

   @Override
   public boolean G_() {
      return true;
   }
}
