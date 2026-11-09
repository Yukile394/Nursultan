package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface class06055 {
   Codec<class06055> N = Codec.xor(class06046.u, Codec.xor(class06048.u, class06063.u)).xmap(class06055::N, class06055::N);
   class06055 y = y(0);
   class06055 L = L(0);

   static class06055 L(int var0) {
      return new class06063(var0);
   }

   static class06055 y() {
      return L;
   }

   static class06055 y(int var0) {
      return new class06048(var0);
   }

   private static Either<class06046, Either<class06048, class06063>> N(class06055 var0) {
      return var0 instanceof class06046
         ? Either.left((class06046)var0)
         : Either.right(var0 instanceof class06048 ? Either.left((class06048)var0) : Either.right((class06063)var0));
   }

   int N(class06057 var1);

   static class06055 N(int var0) {
      return new class06046(var0);
   }

   private static class06055 N(Either<class06046, Either<class06048, class06063>> var0) {
      return (class06055)var0.map(Function.identity(), Either::unwrap);
   }

   static class06055 N() {
      return y;
   }
}
