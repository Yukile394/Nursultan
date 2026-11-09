package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import net.fabricmc.fabric.impl.recipe.sync.RecipeSyncImpl;
import net.fabricmc.fabric.impl.recipe.sync.SyncedSerializerAwarePreparedRecipe;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00237 implements SyncedSerializerAwarePreparedRecipe {
   public static final class00237 N = new class00237(ImmutableMultimap.of(), Map.of());
   private final Multimap<class05838<?>, class03729<?>> y;
   private final Map<class05946<class06521<?>>, class03729<?>> L;
   private Map u;

   private class00237(Multimap<class05838<?>, class03729<?>> var1, Map<class05946<class06521<?>>, class03729<?>> var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   private static void N(Iterable var0, CallbackInfoReturnable var1, LocalRef var2) {
      IdentityHashMap identityhashmap = new IdentityHashMap();

      for (class06514<?> class06514 : RecipeSyncImpl.getSyncedSerializers()) {
         identityhashmap.put(class06514, new ArrayList());
      }

      var2.set(identityhashmap);
   }

   private static void N(Iterable var0, CallbackInfoReturnable var1, class03729 var2, LocalRef var3) {
      List list = (List)((IdentityHashMap)var3.get()).get(var2.y().method_8119());
      if (list != null) {
         list.add(var2);
      }
   }

   private static class00237 N(class00237 var0, LocalRef var1) {
      var0.u = (Map)var1.get();
      return var0;
   }

   public static class00237 N(Iterable<class03729<?>> var0) {
      LocalRefImpl localrefimpl = new LocalRefImpl();
      localrefimpl.init(null);
      N(var0, null, localrefimpl);
      Builder builder = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder builder1 = ImmutableMap.builder();

      for (class03729 class03729 : var0) {
         builder.put(class03729.y().u(), class03729);
         class05946 class05946 = class03729.N();
         N(var0, null, class03729, localrefimpl);
         builder1.put(class05946, class03729);
      }

      return N(new class00237(builder.build(), builder1.build()), localrefimpl);
   }

   public <I extends class02950, T extends class06521<I>> Collection<class03729<T>> N(class05838<T> var1) {
      return this.y.get(var1);
   }

   public Collection<class03729<?>> N() {
      return this.L.values();
   }

   @Nullable
   public class03729<?> N(class05946<class06521<?>> var1) {
      return this.L.get(var1);
   }

   public <I extends class02950, T extends class06521<I>> Stream<class03729<T>> N(class05838<T> var1, I var2, class07299 var3) {
      return var2.y() ? Stream.empty() : this.N(var1).stream().filter(var2x -> var2x.y().method_8115((I)var2, var3));
   }

   @Nullable
   public List fabric_getRecipesBySyncedSerializer(class06514 var1) {
      return (List)this.u.get(var1);
   }
}
