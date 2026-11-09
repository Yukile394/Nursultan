package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public final class class06826 {
   public static final Codec<class06826> N = Codec.dispatchedMap(class04206.Nm.T(), class06839::B).xmap(class06826::N, class06826::u);
   private final Reference2ObjectMap<class06839<?>, Object> y;

   public int L() {
      return this.y.size();
   }

   @Nullable
   public <T> T L(class06839<T> var1) {
      return (T)this.y.remove(var1);
   }

   public class06826(Reference2ObjectMap<class06839<?>, Object> var1) {
      super();
      this.y = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 != null && var1.getClass() == this.getClass()) {
         class06826 class06826 = (class06826)var1;
         return Objects.equals(this.y, class06826.y);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.y.toString();
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.y);
   }

   private Reference2ObjectMap<class06839<?>, Object> u() {
      return this.y;
   }

   public class06826 y(class06826 var1) {
      class06826 class06826 = N(this);
      class06826.N(var1, var0 -> true);
      return class06826;
   }

   @Nullable
   public <T> T y(class06839<T> var1) {
      return (T)this.y.get(var1);
   }

   public Set<class06839<?>> y() {
      return this.y.keySet();
   }

   public boolean N(class06839<?> var1) {
      return this.y.containsKey(var1);
   }

   public static class06826 N(Stream<class06839<?>> var0) {
      Reference2ObjectOpenHashMap reference2objectopenhashmap = new Reference2ObjectOpenHashMap();
      var0.forEach(var1x -> reference2objectopenhashmap.put(var1x, var1x.Z()));
      return new class06826(reference2objectopenhashmap);
   }

   public static class06826 N(class06826 var0) {
      return new class06826(new Reference2ObjectOpenHashMap(var0.y));
   }

   private static class06826 N(Map<class06839<?>, Object> var0) {
      return new class06826(new Reference2ObjectOpenHashMap(var0));
   }

   public static class06826 N() {
      return new class06826(new Reference2ObjectOpenHashMap());
   }

   public void N(class06826 var1, Predicate<class06839<?>> var2) {
      for (class06839<?> class06839 : var1.y()) {
         if (var2.test(class06839)) {
            N(var1, class06839, this);
         }
      }
   }

   private static <T> void N(class06826 var0, class06839<T> var1, class06826 var2) {
      var2.N(var1, Objects.requireNonNull(var0.y(var1)));
   }

   public <T> void N(class06839<T> var1, T var2) {
      this.y.put(var1, var2);
   }
}
