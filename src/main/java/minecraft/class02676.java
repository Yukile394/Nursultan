package minecraft;

import Nursultan.class09825;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import net.fabricmc.fabric.api.item.v1.FabricComponentMapBuilder;
import org.jspecify.annotations.Nullable;

public class class02676 implements FabricComponentMapBuilder {
   private final Reference2ObjectMap<class02477<?>, Object> N = new Reference2ObjectArrayMap();

   public Object getOrCreate(class02477 var1, Supplier var2) {
      if (!this.N.containsKey(var1)) {
         Object object = var2.get();
         Objects.requireNonNull(object, "Cannot insert null values to component map builder");
         this.N(var1, object);
      }

      return this.N.get(var1);
   }

   class02676() {
      super();
   }

   public boolean contains(class02477 var1) {
      return this.N.containsKey(var1);
   }

   <T> void y(class02477<T> var1, @Nullable Object var2) {
      if (var2 != null) {
         this.N.put(var1, var2);
      } else {
         this.N.remove(var1);
      }
   }

   public class02695 N() {
      return N(this.N);
   }

   public <T> class02676 N(class02477<T> var1, @Nullable T var2) {
      this.y(var1, var2);
      return this;
   }

   public static class02695 N(Map<class02477<?>, Object> var0) {
      if (var0.isEmpty()) {
         return class02695.N;
      } else {
         return var0.size() < 8 ? new class09825(new Reference2ObjectArrayMap(var0)) : new class09825(new Reference2ObjectOpenHashMap(var0));
      }
   }

   public class02676 N(class02695 var1) {
      for (class02480<?> class02480 : var1) {
         this.N.put(class02480.N(), class02480.y());
      }

      return this;
   }

   public List getOrEmpty(class02477 var1) {
      ArrayList arraylist = new ArrayList((Collection)this.getOrCreate(var1, Collections::emptyList));
      this.N(var1, arraylist);
      return arraylist;
   }
}
