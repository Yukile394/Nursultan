package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record class00816(class00819<Double> bounds, class00819<Double> boundsSqr) implements class00850<Double> {
   public static final class00816 L = new class00816(class00819.i());
   public static final Codec<class00816> u = class00819.N(Codec.DOUBLE).validate(class00819::y).xmap(class00816::new, class00816::N);
   public static final class02362<ByteBuf, class00816> i = class00819.N(class02389.W).N_10(class00816::new, class00816::N);

   public static class00816 L(double var0) {
      return new class00816(class00819.L(var0));
   }

   private class00816(class00819<Double> var1) {
      this((class00819<Double>)var1, var1.N_18(class04995::E));
   }

   public class00816(class00819<Double> bounds, class00819<Double> boundsSqr) {
      super();
      this.bounds = bounds;
      this.boundsSqr = boundsSqr;
   }

   public class00819<Double> i() {
      return this.boundsSqr;
   }

   public boolean i(double var1) {
      return this.boundsSqr.R().isPresent() && this.boundsSqr.R().get() > var1 ? false : this.boundsSqr.M().isEmpty() || !(this.boundsSqr.M().get() < var1);
   }

   public boolean u(double var1) {
      return this.bounds.R().isPresent() && this.bounds.R().get() > var1 ? false : this.bounds.M().isEmpty() || !(this.bounds.M().get() < var1);
   }

   public static class00816 y(double var0) {
      return new class00816(class00819.y(var0));
   }

   public static class00816 N(StringReader var0) throws CommandSyntaxException {
      int ix = var0.getCursor();
      class00819 class00819 = class00819.N(var0, Double::parseDouble, CommandSyntaxException.BUILT_IN_EXCEPTIONS::readerInvalidDouble);
      if (class00819.L()) {
         var0.setCursor(ix);
         throw y.createWithContext(var0);
      } else {
         return new class00816(class00819);
      }
   }

   public static class00816 N(double var0, double var2) {
      return new class00816(class00819.N(var0, var2));
   }

   @Override
   public class00819<Double> N() {
      return this.bounds;
   }

   public static class00816 N(double var0) {
      return new class00816(class00819.N(var0));
   }
}
