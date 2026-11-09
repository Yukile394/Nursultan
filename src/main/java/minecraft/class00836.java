package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record class00836(class00819<Integer> bounds, class00819<Long> boundsSqr) implements class00850<Integer> {
   public static final class00836 L = new class00836(class00819.i());
   public static final Codec<class00836> u = class00819.N(Codec.INT).validate(class00819::y).xmap(class00836::new, class00836::N);
   public static final class02362<ByteBuf, class00836> i = class00819.N(class02389.M).N_10(class00836::new, class00836::N);

   public static class00836 L(int var0) {
      return new class00836(class00819.L(var0));
   }

   private class00836(class00819<Integer> var1) {
      this((class00819<Integer>)var1, var1.N_18(var0 -> class04995.y(var0.longValue())));
   }

   public class00836(class00819<Integer> bounds, class00819<Long> boundsSqr) {
      this.bounds = bounds;
      this.boundsSqr = boundsSqr;
   }

   public class00819<Long> i() {
      return this.boundsSqr;
   }

   public boolean u(int var1) {
      return this.bounds.R().isPresent() && this.bounds.R().get() > var1 ? false : this.bounds.M().isEmpty() || this.bounds.M().get() >= var1;
   }

   public static class00836 y(int var0) {
      return new class00836(class00819.y(var0));
   }

   public static class00836 N(StringReader var0) throws CommandSyntaxException {
      int ix = var0.getCursor();
      class00819 class00819 = class00819.N(var0, Integer::parseInt, CommandSyntaxException.BUILT_IN_EXCEPTIONS::readerInvalidInt);
      if (class00819.L()) {
         var0.setCursor(ix);
         throw y.createWithContext(var0);
      } else {
         return new class00836(class00819);
      }
   }

   public static class00836 N(int var0, int var1) {
      return new class00836(class00819.N(var0, var1));
   }

   @Override
   public class00819<Integer> N() {
      return this.bounds;
   }

   public boolean N(long var1) {
      return this.boundsSqr.R().isPresent() && this.boundsSqr.R().get() > var1 ? false : this.boundsSqr.M().isEmpty() || this.boundsSqr.M().get() >= var1;
   }

   public static class00836 N(int var0) {
      return new class00836(class00819.N(var0));
   }
}
