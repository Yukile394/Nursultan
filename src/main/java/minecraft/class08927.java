package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public record class08927(class08909 property, class08895 onTrue, class08895 onFalse) implements class08895 {
   public static final MapCodec<class08927> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class08917.y.forGetter(class08927::N),
            class08913.y.fieldOf("on_true").forGetter(class08927::y),
            class08913.y.fieldOf("on_false").forGetter(class08927::L)
         )
         .apply(var0, class08927::new)
   );

   public class08895 L() {
      return this.onFalse;
   }

   public class08927(class08909 property, class08895 onTrue, class08895 onFalse) {
      this.property = property;
      this.onTrue = onTrue;
      this.onFalse = onFalse;
   }

   public class08895 y() {
      return this.onTrue;
   }

   private class08559 N(class08909 var1, @Nullable class00203 var2) {
      if (var2 == null) {
         return var1;
      } else {
         class08546 class08546 = new class08546<>(var2x -> y(var1, var2, var2x));
         return (var2x, var3x, var4, var5, var6) -> ((class08559)(var3x == null ? var1 : (class08559)class08546.N(var3x)))
            .method_65638(var2x, var3x, var4, var5, var6);
      }
   }

   private static <T extends class08909> T y(T var0, class00203 var1, class03448 var2) {
      return (T)var1.N(var0.N().codec(), var0, var2.method_30349()).result().orElse(var0);
   }

   public class08909 N() {
      return this.property;
   }

   @Override
   public void method_62326(class08350 var1) {
      this.onTrue.method_62326(var1);
      this.onFalse.method_62326(var1);
   }

   @Override
   public MapCodec<class08927> method_65585() {
      return N;
   }

   @Override
   public class08910 method_65587(class08905 var1) {
      return new class08939(this.N(this.property, var1.R()), this.onTrue.method_65587(var1), this.onFalse.method_65587(var1));
   }
}
