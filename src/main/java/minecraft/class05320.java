package minecraft;

import com.google.common.collect.Multimap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05320 {
   private final Map<class03556<class07468>, class07469> N = new Object2ObjectOpenHashMap();
   private Set<class07469> y = new ObjectOpenHashSet();
   private Set<class07469> L = new ObjectOpenHashSet();
   private final class05308 u;

   public void L(class05320 var1) {
      var1.N.values().forEach(var1x -> {
         class07469 class07469 = this.N(var1x.N());
         if (class07469 != null) {
            class07469.N(var1x.u());
         }
      });
   }

   public double L(class03556<class07468> var1) {
      class07469 class07469 = this.N.get(var1);
      return class07469 != null ? class07469.M() : this.u.N(var1);
   }

   public Collection<class07469> L() {
      return this.N.values().stream().filter(var0 -> var0.N().N().y()).collect(Collectors.toList());
   }

   public class05320(class05308 var1) {
      super();
      this.u = var1;
      this.N(var1, null);
   }

   public boolean i(class03556<class07468> var1) {
      if (!this.u.L(var1)) {
         return false;
      } else {
         class07469 class07469 = this.N.get(var1);
         if (class07469 != null) {
            class07469.N(this.u.y(var1));
         }

         return true;
      }
   }

   public double u(class03556<class07468> var1) {
      class07469 class07469 = this.N.get(var1);
      return class07469 != null ? class07469.y() : this.u.y(var1);
   }

   public List<class07433> u() {
      ArrayList arraylist = new ArrayList(this.N.values().size());

      for (class07469 class07469 : this.N.values()) {
         arraylist.add(class07469.B());
      }

      return arraylist;
   }

   public void y(Multimap<class03556<class07468>, class07471> var1) {
      var1.asMap().forEach((var1x, var2) -> {
         class07469 class07469 = this.N.get(var1x);
         if (class07469 != null) {
            var2.forEach(var1xx -> class07469.L(var1xx.N()));
         }
      });
   }

   public void y(class05320 var1) {
      var1.N.values().forEach(var1x -> {
         class07469 class07469 = this.N(var1x.N());
         if (class07469 != null) {
            class07469.N(var1x.y());
         }
      });
   }

   public boolean y(class03556<class07468> var1) {
      return this.N.get(var1) != null || this.u.L(var1);
   }

   public double y(class03556<class07468> var1, class01894 var2) {
      class07469 class07469 = this.N.get(var1);
      return class07469 != null ? class07469.N(var2).y() : this.u.N(var1, var2);
   }

   public Set<class07469> y() {
      return this.L;
   }

   public Set<class07469> N() {
      return this.y;
   }

   private void N(class07469 var1) {
      this.L.add(var1);
      if (var1.N().N().y()) {
         this.y.add(var1);
      }
   }

   private void N(class05308 var1, CallbackInfo var2) {
      this.L = new ReferenceOpenHashSet(0);
      this.y = new ReferenceOpenHashSet(0);
   }

   public boolean N(class03556<class07468> var1, class01894 var2) {
      class07469 class07469 = this.N.get(var1);
      return class07469 != null ? class07469.N(var2) != null : this.u.y(var1, var2);
   }

   public void N(Multimap<class03556<class07468>, class07471> var1) {
      var1.forEach((var1x, var2) -> {
         class07469 class07469 = this.N(var1x);
         if (class07469 != null) {
            class07469.L(var2.N());
            class07469.y(var2);
         }
      });
   }

   public void N(List<class07433> var1) {
      for (class07433 class07433 : var1) {
         class07469 class07469 = this.N(class07433.N());
         if (class07469 != null) {
            class07469.N(class07433);
         }
      }
   }

   @Nullable
   public class07469 N(class03556<class07468> var1) {
      return this.N.computeIfAbsent(var1, var1x -> this.u.N(this::N, (class03556<class07468>)var1x));
   }

   public void N(class05320 var1) {
      var1.N.values().forEach(var1x -> {
         class07469 class07469 = this.N(var1x.N());
         if (class07469 != null) {
            class07469.N(var1x);
         }
      });
   }
}
