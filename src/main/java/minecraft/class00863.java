package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public record class00863(class00883 x, class00883 y, class00883 z) implements class00874 {
   public static final class00863 N = N(new class07109(0.0F, 0.0F));

   @Override
   public boolean L() {
      return this.z.N();
   }

   public class00863(class00883 x, class00883 y, class00883 z) {
      super();
      this.x = x;
      this.y = y;
      this.z = z;
   }

   public class00883 i() {
      return this.y;
   }

   public class00883 u() {
      return this.x;
   }

   @Override
   public class07109 y(class07701 var1) {
      class07109 class07109 = var1.E();
      return new class07109((float)this.x.N(class07109.z), (float)this.y.N(class07109.U));
   }

   @Override
   public boolean y() {
      return this.y.N();
   }

   public static class00863 N(double var0, double var2, double var4) {
      return new class00863(new class00883(false, var0), new class00883(false, var2), new class00883(false, var4));
   }

   public static class00863 N(StringReader var0) throws CommandSyntaxException {
      int i = var0.getCursor();
      class00883 class00883xx = class00883.N(var0);
      if (var0.canRead() && var0.peek() == ' ') {
         var0.skip();
         class00883 class00883x = class00883.N(var0);
         if (var0.canRead() && var0.peek() == ' ') {
            var0.skip();
            class00883 class00883xx = class00883.N(var0);
            return new class00863(class00883xx, class00883x, class00883xx);
         } else {
            var0.setCursor(i);
            throw class00881.N.createWithContext(var0);
         }
      } else {
         var0.setCursor(i);
         throw class00881.N.createWithContext(var0);
      }
   }

   public static class00863 N(StringReader var0, boolean var1) throws CommandSyntaxException {
      int i = var0.getCursor();
      class00883 class00883xx = class00883.N(var0, var1);
      if (var0.canRead() && var0.peek() == ' ') {
         var0.skip();
         class00883 class00883x = class00883.N(var0, false);
         if (var0.canRead() && var0.peek() == ' ') {
            var0.skip();
            class00883 class00883xx = class00883.N(var0, var1);
            return new class00863(class00883xx, class00883x, class00883xx);
         } else {
            var0.setCursor(i);
            throw class00881.N.createWithContext(var0);
         }
      } else {
         var0.setCursor(i);
         throw class00881.N.createWithContext(var0);
      }
   }

   @Override
   public class06889 N(class07701 var1) {
      class06889 class06889 = var1.i();
      return new class06889(this.x.N(class06889.M), this.y.N(class06889.B), this.z.N(class06889.Z));
   }

   public static class00863 N(class07109 var0) {
      return new class00863(new class00883(false, var0.z), new class00883(false, var0.U), new class00883(true, 0.0));
   }

   @Override
   public boolean N() {
      return this.x.N();
   }

   public class00883 R() {
      return this.z;
   }
}
