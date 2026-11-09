package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public record class00872(double left, double up, double forwards) implements class00874 {
   public static final char N = '^';

   @Override
   public boolean L() {
      return true;
   }

   public class00872(double left, double up, double forwards) {
      this.left = left;
      this.up = up;
      this.forwards = forwards;
   }

   public double i() {
      return this.up;
   }

   public double u() {
      return this.left;
   }

   @Override
   public class07109 y(class07701 var1) {
      return class07109.N;
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   public class06889 N(class07701 var1) {
      class06889 class06889 = var1.m().N(var1);
      return class06889.N(var1.E(), new class06889(this.left, this.up, this.forwards)).y(class06889.M, class06889.B, class06889.Z);
   }

   @Override
   public boolean N() {
      return true;
   }

   public static class00872 N(StringReader var0) throws CommandSyntaxException {
      int i = var0.getCursor();
      double d0 = N(var0, i);
      if (var0.canRead() && var0.peek() == ' ') {
         var0.skip();
         double d1 = N(var0, i);
         if (var0.canRead() && var0.peek() == ' ') {
            var0.skip();
            double d2 = N(var0, i);
            return new class00872(d0, d1, d2);
         } else {
            var0.setCursor(i);
            throw class00881.N.createWithContext(var0);
         }
      } else {
         var0.setCursor(i);
         throw class00881.N.createWithContext(var0);
      }
   }

   private static double N(StringReader var0, int var1) throws CommandSyntaxException {
      if (!var0.canRead()) {
         throw class00883.N.createWithContext(var0);
      } else if (var0.peek() != '^') {
         var0.setCursor(var1);
         throw class00881.y.createWithContext(var0);
      } else {
         var0.skip();
         return var0.canRead() && var0.peek() != ' ' ? var0.readDouble() : 0.0;
      }
   }

   public double R() {
      return this.forwards;
   }
}
