package minecraft;

import Nursultan.class10412;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class class03367 extends class03328 {
   public static final MapCodec<class03367> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.either(class05074.N, class05074.u).fieldOf("value").forGetter(var0x -> var0x.E)).and(y(var0)).apply(var0, class03367::new)
   );
   public static final class04489 u = new class03331();
   private final Either<class05946<class05074>, class05074> E;

   private class03367(Either<class05946<class05074>, class05074> var1, int var2, int var3, List<class05957> var4, List<class08122> var5) {
      super(var2, var3, var4, var5);
      this.E = var1;
   }

   @Override
   public void N(class05561 var1) {
      Optional optional = this.E.left();
      if (optional.isPresent()) {
         class05946 class05946 = (class05946)optional.get();
         if (!var1.y()) {
            var1.N(new class05566(class05946));
            return;
         }

         if (var1.N(class05946)) {
            var1.N(new class05537(class05946));
            return;
         }
      }

      super.N(var1);
      this.E
         .ifLeft(
            var1x -> var1.N()
               .u(var1x)
               .ifPresentOrElse(var2x -> ((class05074)var2x.N()).N(var1.N(new class10412(var1x), var1x)), () -> var1.N(new class05576(var1x)))
         )
         .ifRight(var1x -> var1x.N(var1.N(u)));
   }

   @Override
   public class05950 N() {
      return class03942.u;
   }

   public static class03366<?> N(class05946<class05074> var0) {
      return N((var1, var2, var3, var4) -> new class03367(Either.left(var0), var1, var2, var3, var4));
   }

   public static class03366<?> N(class05074 var0) {
      return N((var1, var2, var3, var4) -> new class03367(Either.right(var0), var1, var2, var3, var4));
   }

   @Override
   public void N(Consumer<class06584> var1, class05908 var2) {
      ((class05074)this.E.map(var1x -> var2.N().u(var1x).map(class03556::N).orElse(class05074.R), var0 -> var0)).N(var2, var1);
   }
}
