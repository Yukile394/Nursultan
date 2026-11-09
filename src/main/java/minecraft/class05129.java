package minecraft;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class class05129 implements Runnable {
   protected static final int N = 25;
   private static final Logger y = LogUtils.getLogger();
   private boolean L = false;

   public void L() {
   }

   public class05129() {
      super();
   }

   public void i() {
      this.L = true;
   }

   public void u() {
   }

   public boolean y() {
      return this.L;
   }

   protected void N(class00392 var1) {
      this.i();
      class06202 class06202 = class06202.Nq();
      class06202.execute(() -> class06202.N(new class04702(var1, new class05685(new class04705()))));
   }

   protected void N(Exception var1) {
      if (var1 instanceof class05097 class05097) {
         this.N(class05097.N.y());
      } else {
         this.N(class00392.y(var1.getMessage()));
      }
   }

   protected void N(class05097 var1) {
      this.N(var1.N.y());
   }

   public abstract class00392 N();

   public static void N(class05096 var0) {
      class06202 class06202 = class06202.Nq();
      class06202.execute(() -> class06202.N(var0));
   }

   protected static void N(long var0) {
      try {
         Thread.sleep(var0 * 1000L);
      } catch (InterruptedException interruptedexception) {
         Thread.currentThread().interrupt();
         y.error("", interruptedexception);
      }
   }
}
