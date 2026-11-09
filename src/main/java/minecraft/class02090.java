package minecraft;

import java.time.Duration;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class class02090 {
   private final UUID N = UUID.randomUUID();
   private final class02097 y;
   private final class02099 L;
   private final class02110 u = new class02110();
   private final class02120 i;
   private final class02103 R;

   public void L() {
      this.L.N(this.y);
      this.i.u();
      this.u.N(this.y);
   }

   public class02090(class02097 var1, boolean var2, @Nullable Duration var3, @Nullable String var4) {
      super();
      this.L = new class02099(var4);
      this.i = new class02120();
      this.R = new class02103(var2, var3);
      this.y = var1.N(var1x -> {
         this.L.N(var1x);
         var1x.N(class02117.Z, this.N);
      });
   }

   public void y() {
      if (this.L.N(this.y)) {
         this.R.N(this.y);
         this.i.N();
      }
   }

   public void N() {
      this.i.N(this.y);
   }

   public void N(class07299 var1, class03711 var2) {
      class01894 class01894 = var2.N();
      if (var2.y().M() && "minecraft".equals(class01894.y())) {
         long ix = var1.N();
         this.y.send(class02129.M, var3x -> {
            var3x.N(class02117.O, class01894.toString());
            var3x.N(class02117.g, ix);
         });
      }
   }

   public void N(class07282 var1, boolean var2) {
      this.L.N(var1, var2);
      this.u.N();
      this.y();
   }

   public void N(long var1) {
      this.u.N(var1);
   }

   public void N(String var1) {
      this.L.N(var1);
      this.y();
   }
}
