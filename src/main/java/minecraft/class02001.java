package minecraft;

import com.mojang.serialization.DynamicOps;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.fabricmc.fabric.impl.registry.sync.DynamicRegistriesImpl;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class02001 {
   public static Set<class05946<? extends class00751<?>>> N = class03078.L.stream().map(class02965::N).collect(Collectors.toUnmodifiableSet());

   public class02001() {
      super();
   }

   public static Stream<class01012<?>> y(class02003<class02969> var0) {
      Stream<class01012<?>> stream = var0.N(class02969.field_39971).method_40311();
      return Stream.concat(N(var0), stream);
   }

   private static void N(class01012 var0, CallbackInfoReturnable var1) {
      if (DynamicRegistriesImpl.SKIP_EMPTY_SYNC_REGISTRIES.contains(var0.N()) && var0.y().L() == 0) {
         var1.setReturnValue(false);
      }
   }

   private static void N(Set var0, class02965 var1, DynamicOps var2, BiConsumer var3, class00751 var4, CallbackInfo var5) {
      if (DynamicRegistriesImpl.SKIP_EMPTY_SYNC_REGISTRIES.contains(var4.i()) && var4.L() == 0) {
         var5.cancel();
      }
   }

   public static void N(
      DynamicOps<class07709> var0, class01042 var1, Set<class02298> var2, BiConsumer<class05946<? extends class00751<?>>, List<class02017>> var3
   ) {
      class03078.L.forEach(var4 -> N(var0, (class02965<?>)var4, var1, var2, var3));
   }

   private static <T> void N(
      DynamicOps<class07709> var0,
      class02965<T> var1,
      class01042 var2,
      Set<class02298> var3,
      BiConsumer<class05946<? extends class00751<?>>, List<class02017>> var4
   ) {
      var2.method_46759(var1.N())
         .ifPresent(
            var4x -> {
               CallbackInfo callbackinfo = new CallbackInfo("", true);
               N(var3, var1, var0, var4, var4x, callbackinfo);
               if (!callbackinfo.isCancelled()) {
                  ArrayList arraylist = new ArrayList(var4x.L());
                  var4x.z()
                     .forEach(
                        var5x -> {
                           Optional optional;
                           if (var4x.i(var5x.B()).flatMap(class02819::N).filter(var3::contains).isPresent()) {
                              optional = Optional.empty();
                           } else {
                              optional = Optional.of(
                                 (class07709)var1.y()
                                    .encodeStart(var0, var5x.N())
                                    .getOrThrow(var1xxx -> new IllegalArgumentException("Failed to serialize " + var5x.B() + ": " + var1xxx))
                              );
                           }

                           arraylist.add(new class02017(var5x.B().N(), optional));
                        }
                     );
                  var4.accept(var4x.i(), arraylist);
               }
            }
         );
   }

   private static Stream<class01012<?>> N(class01042 var0) {
      return var0.method_40311().filter(var0x -> {
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
         N(var0x, callbackinforeturnable);
         return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueZ() : N(var0x.N());
      });
   }

   public static Stream<class01012<?>> N(class02003<class02969> var0) {
      return N(var0.L(class02969.field_39972));
   }

   public static boolean N(class05946<? extends class00751<?>> var0) {
      return N.contains(var0);
   }
}
