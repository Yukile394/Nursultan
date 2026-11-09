package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public record class00883(boolean relative, double value) {
   private static final char i = '~';
   public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("argument.pos.missing.double"));
   public static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("argument.pos.missing.int"));

   public double L() {
      return this.value;
   }

   public class00883(boolean relative, double value) {
      super();
      this.relative = relative;
      this.value = value;
   }

   public static boolean y(StringReader var0) {
      boolean flag;
      if (var0.peek() == '~') {
         flag = true;
         var0.skip();
      } else {
         flag = false;
      }

      return flag;
   }

   public boolean y() {
      return this.relative;
   }

   public static class00883 N(StringReader var0) throws CommandSyntaxException {
      if (var0.canRead() && var0.peek() == '^') {
         throw class00881.y.createWithContext(var0);
      } else if (!var0.canRead()) {
         throw y.createWithContext(var0);
      } else {
         boolean flag = y(var0);
         double d0;
         if (var0.canRead() && var0.peek() != ' ') {
            d0 = flag ? var0.readDouble() : var0.readInt();
         } else {
            d0 = 0.0;
         }

         return new class00883(flag, d0);
      }
   }

   public double N(double var1) {
      return this.relative ? this.value + var1 : this.value;
   }

   public static class00883 N(StringReader var0, boolean var1) throws CommandSyntaxException {
      if (var0.canRead() && var0.peek() == '^') {
         throw class00881.y.createWithContext(var0);
      } else if (!var0.canRead()) {
         throw N.createWithContext(var0);
      } else {
         boolean flag = y(var0);
         int ix = var0.getCursor();
         double d0 = var0.canRead() && var0.peek() != ' ' ? var0.readDouble() : 0.0;
         String s = var0.getString().substring(ix, var0.getCursor());
         if (flag && s.isEmpty()) {
            return new class00883(true, 0.0);
         } else {
            if (!s.contains(".") && !flag && var1) {
               d0 += 0.5;
            }

            return new class00883(flag, d0);
         }
      }
   }

   public boolean N() {
      return this.relative;
   }
}
