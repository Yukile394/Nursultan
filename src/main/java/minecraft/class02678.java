package minecraft;

import Nursultan.class09821;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public final class class02678 {
   public static final class02678 N = new class02678(Reference2ObjectMaps.emptyMap());
   public static final Codec<class02678> y = Codec.dispatchedMap(class02473.N, class02473::N).xmap(var0 -> {
      if (var0.isEmpty()) {
         return N;
      } else {
         Reference2ObjectArrayMap reference2objectarraymap = new Reference2ObjectArrayMap(var0.size());

         for (java.util.Map.Entry entry : var0.entrySet()) {
            class02473 class02473 = (class02473)entry.getKey();
            if (class02473.L()) {
               reference2objectarraymap.put(class02473.y(), Optional.empty());
            } else {
               reference2objectarraymap.put(class02473.y(), Optional.of(entry.getValue()));
            }
         }

         return new class02678(reference2objectarraymap);
      }
   }, var0 -> {
      Reference2ObjectArrayMap reference2objectarraymap = new Reference2ObjectArrayMap(var0.i.size());
      ObjectIterator<Entry<class02477<?>, Optional<?>>> objectiterator = Reference2ObjectMaps.fastIterable(var0.i).iterator();

      while (objectiterator.hasNext()) {
         java.util.Map.Entry entry = (java.util.Map.Entry)objectiterator.next();
         class02477<?> class02477 = (class02477<?>)entry.getKey();
         if (!class02477.u()) {
            Optional<?> optional = (Optional<?>)entry.getValue();
            if (optional.isPresent()) {
               reference2objectarraymap.put(new class02473(class02477, false), optional.get());
            } else {
               reference2objectarraymap.put(new class02473(class02477, true), class06244.field_17274);
            }
         }
      }

      return reference2objectarraymap;
   });
   public static final class02362<class04247, class02678> L = N(new class02690());
   public static final class02362<class04247, class02678> u = N(new class02718());
   private static final String R = "!";
   public final Reference2ObjectMap<class02477<?>, Optional<?>> i;

   public int L() {
      return this.i.size();
   }

   public class02678(Reference2ObjectMap<class02477<?>, Optional<?>> var1) {
      super();
      this.i = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class02678 class02678 && this.i.equals(class02678.i);
   }

   @Override
   public String toString() {
      return N(this.i);
   }

   @Override
   public int hashCode() {
      return this.i.hashCode();
   }

   public class02508 i() {
      if (this.u()) {
         return class02508.N;
      } else {
         class02676 class02676 = class02695.N();
         Set set = Sets.newIdentityHashSet();
         this.i.forEach((var2x, var3) -> {
            if (var3.isPresent()) {
               class02676.y(var2x, var3.get());
            } else {
               set.add(var2x);
            }
         });
         return new class02508(class02676.N(), set);
      }
   }

   public boolean u() {
      return this.i.isEmpty();
   }

   public Set<java.util.Map.Entry<class02477<?>, Optional<?>>> y() {
      return this.i.entrySet();
   }

   private static class02362<class04247, class02678> N(class02704 var0) {
      return new class09821(var0);
   }

   public class02678 N(Predicate<class02477<?>> var1) {
      if (this.u()) {
         return N;
      } else {
         Reference2ObjectArrayMap reference2objectarraymap = new Reference2ObjectArrayMap(this.i);
         reference2objectarraymap.keySet().removeIf(var1);
         return reference2objectarraymap.isEmpty() ? N : new class02678(reference2objectarraymap);
      }
   }

   @Nullable
   public <T> Optional<? extends T> N(class02477<? extends T> var1) {
      return (Optional<? extends T>)this.i.get(var1);
   }

   public static class02713 N() {
      return new class02713();
   }

   static String N(Reference2ObjectMap<class02477<?>, Optional<?>> var0) {
      StringBuilder stringbuilder = new StringBuilder();
      stringbuilder.append('{');
      boolean flag = true;
      ObjectIterator objectiterator = Reference2ObjectMaps.fastIterable(var0).iterator();

      while (objectiterator.hasNext()) {
         java.util.Map.Entry entry = (java.util.Map.Entry)objectiterator.next();
         if (flag) {
            flag = false;
         } else {
            stringbuilder.append(", ");
         }

         Optional optional = (Optional)entry.getValue();
         if (optional.isPresent()) {
            stringbuilder.append(entry.getKey());
            stringbuilder.append("=>");
            stringbuilder.append(optional.get());
         } else {
            stringbuilder.append("!");
            stringbuilder.append(entry.getKey());
         }
      }

      stringbuilder.append('}');
      return stringbuilder.toString();
   }
}
