package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Objects;
import java.util.function.Function;
import net.fabricmc.fabric.impl.gamerule.rpc.FabricGameRuleType;
import net.fabricmc.fabric.impl.gamerule.rpc.FabricTypedRule;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class class07423<T> implements FabricTypedRule {
   private class06839<T> gameRule;
   private T value;
   public static final Codec<class07423<?>> N = class04206.Nm.T().dispatch("key", class07423::N, class07423::L);
   public static final Codec<class07423<?>> y = class04206.Nm.T().dispatch("key", class07423::N, class07423::N);
   @Nullable
   private FabricGameRuleType i = null;

   private static MapCodec L(class06839 var0) {
      return RecordCodecBuilder.mapCodec(
         var1 -> var1.group(
               class05033.N(FabricGameRuleType::values).fieldOf("type").forGetter(var0xx -> var0xx.N().fabric_getType()),
               var0.B().fieldOf("value").forGetter(class07423::y)
            )
            .apply(var1, (var1x, var2) -> N(var0, var1x, var2))
      );
   }

   public class07423(class06839<T> var1, T var2) {
      super();
      this.gameRule = var1;
      this.value = (T)var2;
      this.N(var1, var2, null);
   }

   @Override
   public final boolean equals(Object var1) {
      return this == var1
         ? true
         : var1 instanceof class07423 && Objects.equals(this.gameRule, ((class07423)var1).gameRule) && Objects.equals(this.value, ((class07423)var1).value);
   }

   @Override
   public final String toString() {
      return "class07423[gameRule=" + Objects.toString(this.gameRule) + ", value=" + Objects.toString(this.value) + "]";
   }

   @Override
   public final int hashCode() {
      return (0 * 31 + Objects.hashCode(this.gameRule)) * 31 + Objects.hashCode(this.value);
   }

   private static <T> MapCodec<? extends class07423<T>> y(class06839<T> var0) {
      return N(
         RecordCodecBuilder.mapCodec(
            var1 -> var1.group(
                  class05033.N(class07411::values).fieldOf("type").forGetter(var0xx -> var0xx.gameRule.R()), var0.B().fieldOf("value").forGetter(class07423::y)
               )
               .apply(var1, (var1x, var2) -> N(var0, var1x, var2))
         ),
         var0
      );
   }

   public T y() {
      return this.value;
   }

   private void N(class06839 var1, Object var2, CallbackInfo var3) {
      FabricGameRuleType fabricgameruletype = var1.fabric_getType();
      if (fabricgameruletype != null) {
         this.setFabricType(fabricgameruletype);
      }
   }

   private static MapCodec N(MapCodec var0, class06839 var1) {
      return Codec.mapEither(L(var1), var0)
         .xmap(
            var0x -> (class07423)var0x.map(Function.identity(), Function.identity()),
            var0x -> var0x.getFabricType() == null ? Either.right(var0x) : Either.left(var0x)
         );
   }

   private static class07423 N(class06839 var0, FabricGameRuleType var1, Object var2) {
      FabricGameRuleType fabricgameruletype = var0.fabric_getType();
      if (fabricgameruletype != var1) {
         throw new class07400("Stated type \"" + var1 + "\" mismatches with actual type \"" + fabricgameruletype + "\" of gamerule \"" + var0.N() + "\"");
      } else {
         return new class07423<>(var0, var2);
      }
   }

   private static <T> MapCodec<? extends class07423<T>> N(class06839<T> var0) {
      return var0.B().fieldOf("value").xmap(var1 -> new class07423<>(var0, var1), class07423::y);
   }

   public class06839<T> N() {
      return this.gameRule;
   }

   private static <T> class07423<T> N(class06839<T> var0, class07411 var1, T var2) {
      if (var0.R() != var1) {
         throw new class07400("Stated type \"" + var1 + "\" mismatches with actual type \"" + var0.R() + "\" of gamerule \"" + var0.N() + "\"");
      } else {
         return new class07423<>(var0, (T)var2);
      }
   }

   public void setFabricType(FabricGameRuleType var1) {
      this.i = Objects.requireNonNull(var1);
   }

   @Nullable
   public FabricGameRuleType getFabricType() {
      return this.i;
   }
}
