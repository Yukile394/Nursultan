package minecraft;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class class07315 implements class07703, AutoCloseable {
   private final class04782 L;
   private static final DateTimeFormatter u = DateTimeFormatter.ofPattern("HH:mm:ss", Locale.ROOT);
   private boolean i;

   protected class07315(class07327 var1, class04782 var2) {
      super();
      this.N = var1;
      this.L = var2;
   }

   @Override
   public boolean B() {
      return !this.i && this.L.method_64395().N(class07305.M);
   }

   @Override
   public void close() throws Exception {
      this.i = true;
   }

   @Override
   public void N(class00392 var1) {
      if (!this.i) {
         this.N.y = class00392.y("[" + u.format(ZonedDateTime.now()) + "] ").y(var1);
         this.N.N(this.L);
      }
   }

   @Override
   public boolean A_() {
      return !this.i && this.L.method_64395().N(class07305.F);
   }

   @Override
   public boolean B_() {
      return !this.i;
   }
}
