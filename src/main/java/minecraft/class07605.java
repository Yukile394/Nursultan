package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.LongSupplier;

public record class07605<Value, Argument>(class00619<Value, Argument> modifier, class07606<Argument> argumentTrack) {
   public class07605(class00619<Value, Argument> modifier, class07606<Argument> argumentTrack) {
      this.modifier = modifier;
      this.argumentTrack = argumentTrack;
   }

   public class07606<Argument> y() {
      return this.argumentTrack;
   }

   public static DataResult<class07605<?, ?>> N(class07605<?, ?> var0, int var1) {
      return class07606.N(var0.y(), var1).map(var1x -> var0);
   }

   public class07576<Value, Argument> N(class00607<Value> var1, Optional<Integer> var2, LongSupplier var3) {
      return new class07576<>(var2, this.modifier, this.argumentTrack, this.modifier.argumentKeyframeLerp(var1), var3);
   }

   private static <Value, Argument> MapCodec<class07605<Value, Argument>> N(class00607<Value> var0, class00619<Value, Argument> var1) {
      return class07606.N(var1.argumentCodec(var0)).xmap(var1x -> new class07605(var1, var1x), class07605::y);
   }

   public static <Value> Codec<class07605<Value, ?>> N(class00607<Value> var0) {
      return var0.N().L().optionalFieldOf("modifier", class00619.N()).dispatch(class07605::N, class07536.y_4(var1 -> N(var0, var1)));
   }

   public class00619<Value, Argument> N() {
      return this.modifier;
   }
}
