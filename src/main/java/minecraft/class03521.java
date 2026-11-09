package minecraft;

import Nursultan.class10213;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03521<E> implements Codec<class03543<E>> {
   private final class05946<? extends class00751<E>> N;
   private final Codec<class03556<E>> y;
   private final Codec<List<class03556<E>>> L;
   private final Codec<Either<class03530<E>, List<class03556<E>>>> u;

   private class03521(class05946<? extends class00751<E>> var1, Codec<class03556<E>> var2, boolean var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = N(var2, var3);
      this.u = Codec.either(class03530.y(var1), this.L);
   }

   public <T> DataResult<Pair<class03543<E>, T>> decode(DynamicOps<T> var1, T var2) {
      if (var1 instanceof class03519) {
         Optional optional = ((class03519)var1).y(this.N);
         if (optional.isPresent()) {
            class02055 class02055 = (class02055)optional.get();
            return this.u
               .decode(var1, var2)
               .flatMap(
                  var1x -> ((DataResult)((Either)var1x.getFirst()).map(var1xx -> N(class02055, var1xx), var0x -> DataResult.success(class03543.N(var0x))))
                     .map(var1xx -> Pair.of(var1xx, var1x.getSecond()))
               );
         }
      }

      return this.N(var1, (T)var2);
   }

   private <T> DataResult<T> y(class03543<E> var1, DynamicOps<T> var2, T var3) {
      return this.L.encode(var1.N().toList(), var2, var3);
   }

   private static void N(class02055 var0, class03530 var1, CallbackInfoReturnable var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21) && ((DataResult)var2.getReturnValue()).isError()) {
         var2.setReturnValue(DataResult.success(class03543.R()));
      }
   }

   public <T> DataResult<T> encode(class03543<E> var1, DynamicOps<T> var2, T var3) {
      if (var2 instanceof class03519) {
         Optional optional = ((class03519)var2).N(this.N);
         if (optional.isPresent()) {
            if (!var1.N((class02042<T>)optional.get())) {
               return DataResult.error(() -> "HolderSet " + var1 + " is not valid in current registry set");
            }

            return this.u.encode(var1.u().mapRight(List::copyOf), var2, var3);
         }
      }

      return this.y(var1, var2, (T)var3);
   }

   private static <E> DataResult<class03543<E>> N(class02055<E> var0, class03530<E> var1) {
      DataResult dataresult;
      DataResult dataresult1 = dataresult = var0.N(var1)
         .<DataResult>map(DataResult::success)
         .orElseGet(() -> DataResult.error(() -> "Missing tag: '" + var1.y() + "' in '" + var1.N().N() + "'"));
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, dataresult);
      N(var0, var1, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (DataResult)callbackinforeturnable.getReturnValue() : dataresult1;
   }

   public static <E> Codec<class03543<E>> N(class05946<? extends class00751<E>> var0, Codec<class03556<E>> var1, boolean var2) {
      return new class03521<>(var0, var1, var2);
   }

   private static <E> Codec<List<class03556<E>>> N(Codec<class03556<E>> var0, boolean var1) {
      Codec codec = var0.listOf().validate(class06338.y(class03556::R));
      return var1 ? codec : class06338.L(var0, codec);
   }

   private <T> DataResult<Pair<class03543<E>, T>> N(DynamicOps<T> var1, T var2) {
      return this.y.listOf().decode(var1, var2).flatMap(var0 -> {
         ArrayList arraylist = new ArrayList();

         for (class03556 class03556 : (List)var0.getFirst()) {
            if (!(class03556 instanceof class10213 class10213)) {
               return DataResult.error(() -> "Can't decode element " + class03556 + " without registry");
            }

            arraylist.add(class10213);
         }

         return DataResult.success(new Pair(class03543.N(arraylist), var0.getSecond()));
      });
   }
}
