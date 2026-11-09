package minecraft;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import org.jspecify.annotations.Nullable;

public class class05480 extends class06318<class05472> {
   private final class05470 N;
   private final List<class05472> y = Lists.newArrayList();
   @Nullable
   private String L;

   public void L() {
      this.y.forEach(var1 -> var1.N(this.field_22740.R()));
   }

   public class05480(class05470 var1, class06202 var2, int var3, int var4, int var5, int var6) {
      super(var2, var3, var4, var5, var6);
      this.N = var1;
   }

   private void i() {
      if (this.L != null) {
         this.y.removeIf(var1 -> !var1.N().toLowerCase(Locale.ROOT).contains(this.L));
         this.method_25314(this.y);
      }
   }

   private void u() {
      this.y.sort(Comparator.<class05472, Integer>comparing(var1 -> {
         if (this.field_22740.y(var1.y())) {
            return 0;
         } else if (this.field_22740.R().N(var1.y())) {
            return 1;
         } else if (var1.y().version() == 2) {
            return 4;
         } else {
            return var1.i() ? 2 : 3;
         }
      }).thenComparing(var0 -> {
         if (!var0.N().isBlank()) {
            int i = var0.N().codePointAt(0);
            if (i == 95 || i >= 97 && i <= 122 || i >= 65 && i <= 90 || i >= 48 && i <= 57) {
               return 0;
            }
         }

         return 1;
      }).thenComparing(class05472::N, String::compareToIgnoreCase));
   }

   public boolean y() {
      return this.y.isEmpty();
   }

   public void N(UUID var1) {
      for (class05472 class05472 : this.y) {
         if (class05472.y().equals(var1)) {
            class05472.N(true);
            return;
         }
      }
   }

   public void N(class03458 var1, class05451 var2) {
      UUID uuid = var1.N().id();

      for (class05472 class05472x : this.y) {
         if (class05472x.y().equals(uuid)) {
            class05472x.N(false);
            return;
         }
      }

      if ((var2 == class05451.field_26890 || this.field_22740.yv().L(uuid))
         && (Strings.isNullOrEmpty(this.L) || var1.N().name().toLowerCase(Locale.ROOT).contains(this.L))) {
         boolean flag = var1.u();
         class05472 class05472x = new class05472(this.field_22740, this.N, var1.N().id(), var1.N().name(), var1::M, flag);
         this.method_25321(class05472x);
         this.y.add(class05472x);
      }
   }

   public void N(Collection<UUID> var1, double var2, boolean var4) {
      HashMap hashmap = new HashMap();
      this.N(var1, hashmap);
      if (var4) {
         this.N(hashmap);
      }

      this.N(hashmap, var4);
      this.N(hashmap.values(), var2);
   }

   private static Map<UUID, GameProfile> N(class03407 var0) {
      Object2ObjectLinkedOpenHashMap object2objectlinkedopenhashmap = new Object2ObjectLinkedOpenHashMap();

      for (int i = var0.y(); i >= var0.N(); i--) {
         if (var0.y(i) instanceof class03412 class03412 && class03412.M().Z()) {
            object2objectlinkedopenhashmap.put(class03412.u(), class03412.R());
         }
      }

      return object2objectlinkedopenhashmap;
   }

   private void N(Collection<UUID> var1, Map<UUID, class05472> var2) {
      class01683 class01683 = (class01683)((class04453)this.field_22740.T_4).y_0;

      for (UUID uuid : var1) {
         class03458 class03458 = class01683.N(uuid);
         if (class03458 != null) {
            class05472 class05472 = this.N(uuid, class03458);
            var2.put(uuid, class05472);
         }
      }
   }

   private void N(Map<UUID, class05472> var1, boolean var2) {
      N(this.field_22740.R().y()).forEach((var3, var4) -> {
         class05472 class05472;
         if (var2) {
            class05472 = var1.computeIfAbsent(var3, var2xx -> {
               class05472 class05472x = new class05472(this.field_22740, this.N, var4.id(), var4.name(), this.field_22740.yP().N(var4, true), true);
               class05472x.N(true);
               return class05472x;
            });
         } else {
            class05472 = (class05472)var1.get(var3);
            if (class05472 == null) {
               return;
            }
         }

         class05472.y(true);
      });
   }

   private class05472 N(UUID var1, class03458 var2) {
      return new class05472(this.field_22740, this.N, var1, var2.N().name(), var2::M, var2.u());
   }

   private void N(Map<UUID, class05472> var1) {
      for (Entry entry : ((class01683)((class04453)this.field_22740.T_4).y_0).U().entrySet()) {
         var1.computeIfAbsent((UUID)entry.getKey(), var2 -> {
            class05472 class05472 = this.N((UUID)var2, (class03458)entry.getValue());
            class05472.N(true);
            return class05472;
         });
      }
   }

   private void N(Collection<class05472> var1, double var2) {
      this.y.clear();
      this.y.addAll(var1);
      this.u();
      this.i();
      this.method_25314(this.y);
      this.method_44382(var2);
   }

   public void N(String var1) {
      this.L = var1;
   }

   @Override
   protected void method_49603(class01054 var1) {
      var1.L(this.method_46426(), this.method_46427() + 4, this.method_55442(), this.method_55443());
   }

   @Override
   protected void method_57715(class01054 var1) {
   }

   @Override
   protected void method_57713(class01054 var1) {
   }
}
