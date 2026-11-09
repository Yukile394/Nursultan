package minecraft;

import Nursultan.class09956;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public abstract class class00522<O, S> {
   public static final String y = "Name";
   public static final String L = "Properties";
   private static final Function<Entry<class08092<?>, Comparable<?>>, String> N = new class00478();
   protected final O u;
   @class09956(
      N = "values",
      y = "field_24738"
   )
   public final Reference2ObjectArrayMap<class08092<?>, Comparable<?>> i;
   private Map<class08092<?>, S[]> M;
   protected final MapCodec<S> R;

   public <T extends Comparable<T>> T L(class08092<T> var1) {
      Comparable comparable = (Comparable)this.i.get(var1);
      if (comparable == null) {
         throw new IllegalArgumentException("Cannot get property " + var1 + " as it does not exist in " + this.u);
      } else {
         return (T)var1.M().cast(comparable);
      }
   }

   public Map<class08092<?>, Comparable<?>> L() {
      return this.i;
   }

   public <T extends Comparable<T>, V extends T> S L(class08092<T> var1, V var2) {
      Comparable comparable = (Comparable)this.i.get(var1);
      return (S)(comparable == null ? this : this.N(var1, var2, comparable));
   }

   public class00522(O var1, Reference2ObjectArrayMap<class08092<?>, Comparable<?>> var2, MapCodec<S> var3) {
      super();
      this.u = (O)var1;
      this.i = var2;
      this.R = var3;
   }

   @Override
   public final boolean equals(Object var1) {
      return super.equals(var1);
   }

   @Override
   public String toString() {
      StringBuilder stringbuilder = new StringBuilder();
      stringbuilder.append(this.u);
      if (!this.L().isEmpty()) {
         stringbuilder.append('[');
         stringbuilder.append(this.L().entrySet().stream().map(N).collect(Collectors.joining(",")));
         stringbuilder.append(']');
      }

      return stringbuilder.toString();
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   @Nullable
   private <T extends Comparable<T>> T i(class08092<T> var1) {
      Comparable comparable = (Comparable)this.i.get(var1);
      return (T)(comparable == null ? null : var1.M().cast(comparable));
   }

   private Map<class08092<?>, Comparable<?>> u(class08092<?> var1, Comparable<?> var2) {
      Reference2ObjectArrayMap reference2objectarraymap = new Reference2ObjectArrayMap(this.i);
      reference2objectarraymap.put(var1, var2);
      return reference2objectarraymap;
   }

   public <T extends Comparable<T>> Optional<T> u(class08092<T> var1) {
      return Optional.ofNullable(this.i(var1));
   }

   public <T extends Comparable<T>, V extends T> S y(class08092<T> var1, V var2) {
      Comparable comparable = (Comparable)this.i.get(var1);
      if (comparable == null) {
         throw new IllegalArgumentException("Cannot set property " + var1 + " as it does not exist in " + this.u);
      } else {
         return this.N(var1, var2, comparable);
      }
   }

   public Collection<class08092<?>> y() {
      return Collections.unmodifiableCollection(this.i.keySet());
   }

   public boolean y(class08092<?> var1) {
      return this.i.containsKey(var1);
   }

   private <T extends Comparable<T>, V extends T> S N(class08092<T> var1, V var2, Comparable<?> var3) {
      if (var3.equals(var2)) {
         return (S)this;
      } else {
         int ix = var1.N((T)var2);
         if (ix < 0) {
            throw new IllegalArgumentException("Cannot set property " + var1 + " to " + var2 + " on " + this.u + ", it is not an allowed value");
         } else {
            return (S)this.M.get(var1)[ix];
         }
      }
   }

   public <T extends Comparable<T>> T N(class08092<T> var1, T var2) {
      return Objects.requireNonNullElse(this.i(var1), (T)var2);
   }

   protected static <T> T N(List<T> var0, T var1) {
      int ix = var0.indexOf(var1) + 1;
      return (T)(ix == var0.size() ? var0.getFirst() : var0.get(ix));
   }

   public void N(Map<Map<class08092<?>, Comparable<?>>, S> var1) {
      if (this.M != null) {
         throw new IllegalStateException();
      } else {
         Reference2ObjectArrayMap reference2objectarraymap = new Reference2ObjectArrayMap(this.i.size());
         ObjectIterator objectiterator = this.i.entrySet().iterator();

         while (objectiterator.hasNext()) {
            class08092 class08092 = (class08092)((Entry)objectiterator.next()).getKey();
            reference2objectarraymap.put(class08092, class08092.N().stream().map(var3x -> var1.get(this.u(class08092, var3x))).toArray());
         }

         this.M = reference2objectarraymap;
      }
   }

   public <T extends Comparable<T>> S N(class08092<T> var1) {
      return this.y(var1, N(var1.N(), this.L(var1)));
   }

   protected static <O, S extends class00522<O, S>> Codec<S> N(Codec<O> var0, Function<O, S> var1) {
      return var0.dispatch(
         "Name",
         var0x -> var0x.u,
         var1x -> {
            class00522 class00522 = (class00522)var1.apply(var1x);
            return class00522.L().isEmpty()
               ? MapCodec.unit(class00522)
               : class00522.R.codec().lenientOptionalFieldOf("Properties").xmap(var1xx -> var1xx.orElse(class00522), Optional::of);
         }
      );
   }
}
