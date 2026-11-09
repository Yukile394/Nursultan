package minecraft;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class02290 implements class04188 {
   public static final class04159 N = new class04159("synchronize_registries");
   private final List<class02298> y;
   private final class02003<class02969> L;
   private static final Logger u = LoggerFactory.getLogger("SynchronizeRegistriesTaskMixin");

   public class02290(List<class02298> var1, class02003<class02969> var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   public void N(List var1, Consumer var2, CallbackInfo var3) {
      if (new HashSet<>(this.y).containsAll(var1)) {
         this.N(var2, Set.copyOf(var1));
         var3.cancel();
      }
   }

   public void N(Consumer var1, Set var2, CallbackInfo var3) {
      u.debug("Synchronizing registries with common known packs: {}", var2);
   }

   private void N(Consumer var1, CallbackInfo var2) {
      if (this.y.size() > ModResourcePackCreator.MAX_KNOWN_PACKS) {
         u.warn("Too many knownPacks: Found {}; max {}", this.y.size(), ModResourcePackCreator.MAX_KNOWN_PACKS);
         var1.accept(new class02817(this.y.subList(0, ModResourcePackCreator.MAX_KNOWN_PACKS)));
         var2.cancel();
      }
   }

   private void N(Consumer<class00381<?>> var1, Set<class02298> var2) {
      this.N(var1, var2, null);
      class02001.N(this.L.N().N(class07713.N), this.L.L(class02969.field_39972), var2, (var1x, var2x) -> var1.accept(new class01654(var1x, var2x)));
      var1.accept(new class08076(class03525.N(this.L)));
   }

   public void N(List<class02298> var1, Consumer<class00381<?>> var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         if (var1.equals(this.y)) {
            this.N(var2, Set.copyOf(this.y));
         } else {
            this.N(var2, Set.of());
         }
      }
   }

   @Override
   public class04159 method_52375() {
      return N;
   }

   @Override
   public void method_52376(Consumer<class00381<?>> var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         var1.accept(new class02817(this.y));
      }
   }
}
