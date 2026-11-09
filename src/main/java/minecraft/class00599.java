package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00599<Value, Argument>(Argument argument, class00619<Value, Argument> modifier) {
   public class00599(Argument argument, class00619<Value, Argument> modifier) {
      this.argument = (Argument)argument;
      this.modifier = modifier;
   }

   public class00619<Value, Argument> y() {
      return this.modifier;
   }

   public Value N(Value var1) {
      return this.modifier.apply((Value)var1, this.argument);
   }

   private static <Value, Argument> MapCodec<class00599<Value, Argument>> N(class00607<Value> var0, class00619<Value, Argument> var1) {
      return RecordCodecBuilder.mapCodec(
         var2 -> var2.group(var1.argumentCodec(var0).fieldOf("argument").forGetter(class00599::N)).apply(var2, var1xx -> new class00599<>(var1xx, var1))
      );
   }

   public static <Value> Codec<class00599<Value, ?>> N(class00607<Value> var0) {
      Codec codec = var0.N().L().dispatch("modifier", class00599::y, class07536.y_4(var1x -> N(var0, var1x)));
      return Codec.either(var0.L(), codec)
         .xmap(
            var0x -> (class00599)var0x.map(var0xx -> new class00599<>(var0xx, class00619.N()), var0xx -> var0xx),
            var0x -> var0x.modifier == class00619.N() ? Either.left(var0x.N()) : Either.right(var0x)
         );
   }

   public Argument N() {
      return this.argument;
   }
}
