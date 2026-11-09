package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.registry.sync.DynamicRegistriesImpl;
import net.fabricmc.fabric.mixin.registry.sync.client.ClientRegistriesDynamicRegistriesAccessor;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
public class class02879 {
   @Nullable
   private class02892 N;
   @Nullable
   private class02864 y;

   public class02879() {
      super();
   }

   private List N(Operation var1, class02857 var2, ClientRegistriesDynamicRegistriesAccessor var3, boolean var4) {
      Map<class05946<? extends class00751<?>>, List<class02017>> map = var3.getDynamicRegistries();
      ArrayList arraylist = new ArrayList((Collection)var1.call(new Object[0]));
      arraylist.removeIf(var1x -> DynamicRegistriesImpl.SKIP_EMPTY_SYNC_REGISTRIES.contains(var1x.N()) && !map.containsKey(var1x.N()));
      return arraylist;
   }

   private static void N(class07080 var0, Map<class05946<? extends class00751<?>>, class02982> var1, List<class00720<?>> var2) {
      class07074 class07074 = var0.N("Received Elements and Tags");
      class07074.N(
         "Dynamic Registries",
         () -> var1.entrySet()
            .stream()
            .sorted(Comparator.comparing(var0xx -> ((class05946)var0xx.getKey()).N()))
            .map(
               var0xx -> String.format(
                  Locale.ROOT,
                  "\n\t\t%s: elements=%d tags=%d",
                  ((class05946)var0xx.getKey()).N(),
                  ((class02982)var0xx.getValue()).N().size(),
                  ((class02982)var0xx.getValue()).y().y()
               )
            )
            .collect(Collectors.joining())
      );
      class07074.N(
         "Static Registries",
         () -> var2.stream()
            .sorted(Comparator.comparing(var0xx -> var0xx.N().N()))
            .map(var0xx -> String.format(Locale.ROOT, "\n\t\t%s: tags=%d", var0xx.N().N(), var0xx.y()))
            .collect(Collectors.joining())
      );
   }

   private class01042 N(class02857 var1, class02892 var2, boolean var3) {
      class02003<class03785> class02003 = class03785.N();
      class01022 class01022x = class02003.y(class03785.field_40491);
      HashMap hashmap = new HashMap();
      var2.N.forEach((var1x, var2x) -> hashmap.put(var1x, new class02982((List<class02017>)var2x, class03516.N)));
      ArrayList arraylist = new ArrayList();
      if (this.y != null) {
         this.y.N((var4x, var5x) -> {
            if (!var5x.N()) {
               if (class02001.N((class05946<? extends class00751<?>>)var4x)) {
                  hashmap.compute(var4x, (var1xx, var2xx) -> {
                     List list = var2xx != null ? var2xx.N() : List.of();
                     return new class02982(list, var5x);
                  });
               } else if (!var3) {
                  arraylist.add(N(class01022x, (class05946<? extends class00751<?>>)var4x, var5x));
               }
            }
         });
      }

      List<class01921<?>> list = class01214.N(class01022x, arraylist);

      class01022 class01022x;
      try {
         class01022x = class03078.N(hashmap, var1, list, this.N(var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 0, "[]");
            return class03078.L;
         }, var1, var2, var3)).method_40316();
      } catch (Exception exception) {
         class07080 class07080 = class07080.N(exception, "Network Registry Load");
         N(class07080, hashmap, arraylist);
         throw new class07878(class07080);
      }

      class01022 class01022xx = class02003.N(class03785.field_40491, class01022x).N();
      arraylist.forEach(class00720::u);
      return class01022xx;
   }

   private static <T> class00720<T> N(class01022 var0, class05946<? extends class00751<? extends T>> var1, class03516 var2) {
      class00751 class00751 = var0.L(var1);
      return class00751.N(var2.N(class00751));
   }

   public void N(Map<class05946<? extends class00751<?>>, class03516> var1) {
      if (this.y == null) {
         this.y = new class02864();
      }

      var1.forEach(this.y::N);
   }

   public void N(class05946<? extends class00751<?>> var1, List<class02017> var2) {
      if (this.N == null) {
         this.N = new class02892();
      }

      this.N.N(var1, var2);
   }

   public class01022 N(class02857 var1, class01022 var2, boolean var3) {
      Object object;
      if (this.N != null) {
         object = this.N(var1, this.N, var3);
      } else {
         if (this.y != null) {
            this.N(this.y, var2, !var3);
         }

         object = var2;
      }

      return ((class01042)object).method_40316();
   }

   private void N(class02864 var1, class01022 var2, boolean var3) {
      var1.N((var2x, var3x) -> {
         if (var3 || class02001.N((class05946<? extends class00751<?>>)var2x)) {
            N(var2, (class05946<? extends class00751<?>>)var2x, var3x).u();
         }
      });
   }
}
