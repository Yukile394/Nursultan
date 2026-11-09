package minecraft;

import Nursultan.class10973;
import Nursultan.class11938;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03748 {
   public static final Codec<class00392> N = Codec.recursive("Component", class03748::N);
   public static final class02362<class04247, class00392> y = class02389.u(N);
   public static final class02362<class04247, Optional<class00392>> L = y.N_33(class02389::N);
   public static final class02362<class04247, class00392> u = class02389.L(N);
   public static final class02362<class04247, Optional<class00392>> i = u.N_33(class02389::N);
   public static final class02362<ByteBuf, class00392> R = class02389.N(N);

   private static class00392 L(class00392 var0) {
      class10973 class10973 = new class10973(var0);
      class11938.L().L(class10973);
      return class10973.N();
   }

   public class03748() {
      super();
   }

   private static class05216 N(List<class00392> var0) {
      class05216 class05216 = ((class00392)var0.get(0)).L();

      for (int ix = 1; ix < var0.size(); ix++) {
         class05216.y((class00392)var0.get(ix));
      }

      return class05216;
   }

   private static void N(Codec var0, CallbackInfoReturnable var1) {
      Codec codec = ((Codec)var1.getReturnValue()).flatXmap(var0x -> DataResult.success(L(var0x)), DataResult::success);
      var1.setReturnValue(codec);
   }

   public static Codec<class00392> N(int var0) {
      return new class01721(var0);
   }

   public static Codec<class00392> N(Codec<class00392> var0) {
      class06333 class06333 = new class06333();
      N(class06333);
      Codec codec = RecordCodecBuilder.create(
         var2 -> var2.group(
               var0x.forGetter(class00392::method_10851),
               class06338.y(var0.listOf()).optionalFieldOf("extra", List.of()).forGetter(class00392::method_10855),
               class00411.N.forGetter(class00392::method_10866)
            )
            .apply(var2, class05216::new)
      );
      Codec codec1;
      Codec codec2 = codec1 = Codec.either(Codec.either(Codec.STRING, class06338.y(var0.listOf())), codec)
         .xmap(var0x -> (class00392)var0x.map(var0xx -> (class00392)var0xx.map(class00392::y, class03748::N), var0xx -> var0xx), var0x -> {
            String s = var0x.N();
            return s != null ? Either.left(Either.left(s)) : Either.right(var0x);
         });
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, codec1);
      N(var0, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (Codec)callbackinforeturnable.getReturnValue() : codec2;
   }

   private static void N(class06333<String, MapCodec<? extends class04439>> var0) {
      var0.N("text", class01751.y);
      var0.N("translatable", class00388.y);
      var0.N("keybind", class00413.N);
      var0.N("score", class00421.y);
      var0.N("selector", class00414.N);
      var0.N("nbt", class00418.N);
      var0.N("object", class00923.N);
   }

   public static <T> MapCodec<T> N(class06333<String, MapCodec<? extends T>> var0, Function<T, MapCodec<? extends T>> var1, String var2) {
      class01754 class01754 = new class01754(var0.N(), var1);
      MapCodec mapcodec = var0.N(Codec.STRING).dispatchMap(var2, var1, var0x -> var0x);
      return class06338.N(new class01719<>(var2, mapcodec, class01754), mapcodec);
   }
}
