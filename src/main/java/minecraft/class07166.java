package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07166 {
   private static final Logger N = LogUtils.getLogger();
   private final Map<class01894, class03734> y = new Object2ObjectOpenHashMap();
   private final Set<class03734> L = new ObjectLinkedOpenHashSet();
   private final Set<class03734> u = new ObjectLinkedOpenHashSet();
   @Nullable
   private class07176 i;

   public Collection<class03734> L() {
      return this.y.values();
   }

   public class07166() {
      super();
   }

   public Iterable<class03734> y() {
      return this.L;
   }

   private boolean y(class03711 var1) {
      Optional<class01894> optional = var1.y().y();
      class03734 class03734x = optional.map(this.y::get).orElse(null);
      if (class03734x == null && optional.isPresent()) {
         return false;
      } else {
         class03734 class03734x = new class03734(var1, class03734x);
         if (class03734x != null) {
            class03734x.y(class03734x);
         }

         this.y.put(var1.N(), class03734x);
         if (class03734x == null) {
            this.L.add(class03734x);
            if (this.i != null) {
               this.i.N(class03734x);
            }
         } else {
            this.u.add(class03734x);
            if (this.i != null) {
               this.i.L(class03734x);
            }
         }

         return true;
      }
   }

   @Nullable
   public class03734 N(class03711 var1) {
      return this.y.get(var1.N());
   }

   @Nullable
   public class03734 N(class01894 var1) {
      return this.y.get(var1);
   }

   public void N(@Nullable class07176 var1) {
      this.i = var1;
      if (var1 != null) {
         for (class03734 class03734x : this.L) {
            var1.N(class03734x);
         }

         for (class03734 class03734 : this.u) {
            var1.L(class03734);
         }
      }
   }

   public void N(Collection<class03711> var1) {
      ArrayList arraylist = new ArrayList(var1);

      while (!arraylist.isEmpty()) {
         if (!arraylist.removeIf(this::y)) {
            N.error("Couldn't load advancements: {}", arraylist);
            break;
         }
      }

      N.info("Loaded {} advancements", this.y.size());
   }

   private void N(class03734 var1) {
      for (class03734 class03734 : var1.i()) {
         this.N(class03734);
      }

      N.info("Forgot about advancement {}", var1.y());
      this.y.remove(var1.y().N());
      if (var1.L() == null) {
         this.L.remove(var1);
         if (this.i != null) {
            this.i.y(var1);
         }
      } else {
         this.u.remove(var1);
         if (this.i != null) {
            this.i.u(var1);
         }
      }
   }

   public void N(Set<class01894> var1) {
      for (class01894 class01894 : var1) {
         class03734 class03734 = this.y.get(class01894);
         if (class03734 == null) {
            N.warn("Told to remove advancement {} but I don't know what that is", class01894);
         } else {
            this.N(class03734);
         }
      }
   }

   public void N() {
      this.y.clear();
      this.L.clear();
      this.u.clear();
      if (this.i != null) {
         this.i.N();
      }
   }
}
