package minecraft;

import Nursultan.class10581;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.fabricmc.fabric.api.recipe.v1.FabricServerRecipeManager;
import net.fabricmc.fabric.api.recipe.v1.sync.SynchronizedRecipes;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys.Server;
import net.fabricmc.fabric.impl.recipe.sync.SynchronizedRecipesImpl;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import net.fabricmc.fabric.mixin.recipe.sync.RecipeManagerAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06482 extends class01291<class00237> implements class00272, FabricServerRecipeManager, FabricResourceReloader, RecipeManagerAccessor {
   private static final Logger N = LogUtils.getLogger();
   private static final Map<class05946<class00263>, class06528> y = Map.of(
      class00263.u,
      var0 -> var0 instanceof class03278 ? ((class03278)var0).B() : Optional.empty(),
      class00263.y,
      var0 -> var0 instanceof class03278 ? Optional.of(((class03278)var0).M()) : Optional.empty(),
      class00263.L,
      var0 -> var0 instanceof class03278 ? ((class03278)var0).R() : Optional.empty(),
      class00263.i,
      y(class05838.y),
      class00263.R,
      y(class05838.L),
      class00263.M,
      y(class05838.u),
      class00263.B,
      y(class05838.i)
   );
   private static final class03069 L = class03069.N(class04227.yV);
   private final class01929 u;
   private class00237 i;
   private Map<class05946<class00263>, class00263> R;
   private class00279<class06156> M;
   private List<class06484> B;
   private Map<class05946<class06521<?>>, List<class06484>> Z;
   private SynchronizedRecipes z = SynchronizedRecipesImpl.EMPTY;
   private class01894 U;

   public class00279<class06156> L() {
      return this.M;
   }

   public class06482(class01929 var1) {
      super();
      this.i = class00237.N;
      this.R = Map.of();
      this.M = class00279.N();
      this.B = List.of();
      this.Z = Map.of();
      this.u = var1;
   }

   public Collection<class03729<?>> u() {
      return this.i.N();
   }

   private static class06528 y(class05838<? extends class06184> var0) {
      return var1 -> var1.u() == var0 && var1 instanceof class06184 ? Optional.of(((class06184)var1).z()) : Optional.empty();
   }

   public Map<class05946<class00263>, class00263> y() {
      return this.R;
   }

   public Optional<class03729<?>> y(class05946<class06521<?>> var1) {
      return Optional.ofNullable(this.i.N(var1));
   }

   static List<class06510> N(class03767 var0, List<class06510> var1) {
      var1.removeIf(var1x -> !N(var0, var1x));
      return var1;
   }

   public void N(class03767 var1) {
      ArrayList arraylist = new ArrayList();
      List list = y.entrySet().stream().map(var0 -> new class06500(var0.getKey(), var0.getValue())).toList();
      this.i.N().forEach(var3x -> {
         class06521 class06521 = var3x.y();
         if (!class06521.method_8118() && class06521.method_61671().L()) {
            N.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", var3x.N().N());
         } else {
            list.forEach(var1xx -> var1xx.accept(class06521));
            if (class06521 instanceof class06156 class06156 && N(var1, class06156.z()) && class06156.R().N(var1)) {
               arraylist.add(new class00252(class06156.z(), new class00239(class06156.R(), Optional.of(var3x))));
            }
         }
      });
      this.R = list.stream().collect(Collectors.toUnmodifiableMap(var0 -> var0.N, var1x -> var1x.N(var1)));
      this.M = new class00279<>(arraylist);
      this.B = N(this.i.N(), var1);
      this.Z = this.B.stream().collect(Collectors.groupingBy(var0 -> var0.y().N(), IdentityHashMap::new, Collectors.toList()));
   }

   protected void N(class00237 var1, class01089 var2, class04643 var3) {
      this.N(var1, var2, var3, null);
      this.i = var1;
      N.info("Loaded {} recipes", var1.N().size());
   }

   protected class00237 y(class01089 var1, class04643 var2) {
      TreeMap treemap = new TreeMap();
      class05703.N(var1, L, this.u.N(JsonOps.INSTANCE), class06521.R, treemap);
      ArrayList arraylist = new ArrayList(treemap.size());
      treemap.forEach((var1x, var2x) -> {
         class05946 class05946 = class05946.N(class04227.yV, var1x);
         class03729 class03729 = new class03729(class05946, var2x);
         arraylist.add(class03729);
      });
      return class00237.N(arraylist);
   }

   private void N(class00237 var1, class01089 var2, class04643 var3, CallbackInfo var4) {
      this.z = new SynchronizedRecipesImpl(var1);
   }

   public <I extends class02950, T extends class06521<I>> Optional<class03729<T>> N(class05838<T> var1, I var2, class07299 var3, @Nullable class03729<T> var4) {
      return var4 != null && var4.y().method_8115(var2, var3) ? Optional.of(var4) : this.N(var1, var2, var3);
   }

   @Nullable
   public class06484 N(class00329 var1) {
      int ix = var1.N();
      return ix >= 0 && ix < this.B.size() ? this.B.get(ix) : null;
   }

   public void N(class05946<class06521<?>> var1, Consumer<class00295> var2) {
      List<class06484> list = this.Z.get(var1);
      if (list != null) {
         list.forEach(var1x -> var2.accept(var1x.N()));
      }
   }

   protected static class03729<?> N(class05946<class06521<?>> var0, JsonObject var1, class01929 var2) {
      class06521<?> class06521 = (class06521<?>)class06521.R.parse(var2.N(JsonOps.INSTANCE), var1).getOrThrow(JsonParseException::new);
      return new class03729<>(var0, class06521);
   }

   @Nullable
   private <T extends class06521<?>> class03729<T> N(class05838<T> var1, class05946<class06521<?>> var2) {
      class03729<?> class03729 = this.i.N(var2);
      return (class03729<T>)(class03729 != null && class03729.y().u().equals(var1) ? class03729 : null);
   }

   public <I extends class02950, T extends class06521<I>> Optional<class03729<T>> N(class05838<T> var1, I var2, class07299 var3) {
      return this.i.<class02950, T>N(var1, var2, var3).findFirst();
   }

   @Override
   public class00263 N(class05946<class00263> var1) {
      return this.R.getOrDefault(var1, class00263.z);
   }

   @Override
   public class00279<class06156> N() {
      return this.M;
   }

   private static boolean N(class03767 var0, class06510 var1) {
      return var1.method_8105().allMatch(var1x -> var1x.N().N(var0));
   }

   public static <I extends class02950, T extends class06521<I>> class06485<I, T> N(class05838<T> var0) {
      return new class10581<>(var0);
   }

   private static List<class06484> N(Iterable<class03729<?>> var0, class03767 var1) {
      ArrayList arraylist = new ArrayList();
      Object2IntOpenHashMap object2intopenhashmap = new Object2IntOpenHashMap();

      for (class03729 class03729 : var0) {
         class06521 class06521 = class03729.y();
         OptionalInt optionalint;
         if (class06521.y().isEmpty()) {
            optionalint = OptionalInt.empty();
         } else {
            optionalint = OptionalInt.of(object2intopenhashmap.computeIfAbsent(class06521.y(), var1x -> object2intopenhashmap.size()));
         }

         Optional<List<class06510>> optional;
         if (class06521.method_8118()) {
            optional = Optional.empty();
         } else {
            optional = Optional.of(class06521.method_61671().y());
         }

         for (class00265 class00265 : class06521.N()) {
            if (class00265.N(var1)) {
               int ix = arraylist.size();
               class00329 class00329 = new class00329(ix);
               class00295 class00295 = new class00295(class00329, class00265, optionalint, class06521.i(), optional);
               arraylist.add(new class06484(class00295, class03729));
            }
         }
      }

      return arraylist;
   }

   public <I extends class02950, T extends class06521<I>> Optional<class03729<T>> N(
      class05838<T> var1, I var2, class07299 var3, @Nullable class05946<class06521<?>> var4
   ) {
      class03729 class03729 = var4 != null ? this.N(var1, var4) : null;
      return this.N(var1, var2, var3, class03729);
   }

   public class01894 fabric$getId() {
      if (this.U == null) {
         if (this instanceof class06482) {
            this.U = Server.RECIPES;
         } else if (this instanceof class04478) {
            this.U = Server.ADVANCEMENTS;
         } else if (this instanceof class05961) {
            this.U = Server.FUNCTIONS;
         } else {
            this.U = class01894.y("private/" + this.getClass().getSimpleName().toLowerCase(Locale.ROOT));
         }
      }

      return this.U;
   }

   public Collection getAllOfType(class05838 var1) {
      return this.i.N(var1);
   }

   public Stream getAllMatches(class05838 var1, class02950 var2, class07299 var3) {
      return this.i.N(var1, var2, var3);
   }

   public SynchronizedRecipes getSynchronizedRecipes() {
      return this.z;
   }
}
