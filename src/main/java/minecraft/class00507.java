package minecraft;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class class00507<O, S extends class00522<O, S>> {
   static final Pattern N = Pattern.compile("^[a-z0-9_]+$");
   private final O y;
   private final ImmutableSortedMap<String, class08092<?>> L;
   private final ImmutableList<S> u;

   public O L() {
      return this.y;
   }

   protected class00507(Function<O, S> var1, O var2, class06647<O, S> var3, Map<String, class08092<?>> var4) {
      super();
      this.y = (O)var2;
      this.L = ImmutableSortedMap.copyOf(var4);
      Supplier supplier = () -> (class00522)var1.apply(var2);
      MapCodec mapcodec = MapCodec.of(Encoder.empty(), Decoder.unit(supplier));
      UnmodifiableIterator<Entry<String, class08092<?>>> unmodifiableiterator = this.L.entrySet().iterator();

      while (unmodifiableiterator.hasNext()) {
         Entry entry = (Entry)unmodifiableiterator.next();
         mapcodec = N(mapcodec, supplier, (String)entry.getKey(), (class08092)entry.getValue());
      }

      MapCodec mapcodec1 = mapcodec;
      LinkedHashMap linkedhashmap = Maps.newLinkedHashMap();
      ArrayList arraylist = Lists.newArrayList();
      Stream stream = Stream.of(Collections.emptyList());
      UnmodifiableIterator<class08092<?>> unmodifiableiterator1 = this.L.values().iterator();

      while (unmodifiableiterator1.hasNext()) {
         class08092<?> class08092 = (class08092<?>)unmodifiableiterator1.next();
         stream = stream.flatMap(var1x -> class08092.N().stream().map(var2x -> {
            ArrayList arraylist1 = Lists.newArrayList(var1x);
            arraylist1.add(Pair.of(class08092, var2x));
            return arraylist1;
         }));
      }

      stream.forEach(var5x -> {
         Reference2ObjectArrayMap reference2objectarraymap = new Reference2ObjectArrayMap(var5x.size());

         for (Pair pair : var5x) {
            reference2objectarraymap.put((class08092)pair.getFirst(), (Comparable)pair.getSecond());
         }

         class00522 class00522x = (class00522)var3.create(var2, reference2objectarraymap, mapcodec1);
         linkedhashmap.put(reference2objectarraymap, class00522x);
         arraylist.add(class00522x);
      });

      for (class00522 class00522 : arraylist) {
         class00522.N(linkedhashmap);
      }

      this.u = ImmutableList.copyOf(arraylist);
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this)
         .add("block", this.y)
         .add("properties", this.L.values().stream().map(class08092::R).collect(Collectors.toList()))
         .toString();
   }

   public Collection<class08092<?>> u() {
      return this.L.values();
   }

   public S y() {
      return (S)this.u.get(0);
   }

   public ImmutableList<S> N() {
      return this.u;
   }

   @Nullable
   public class08092<?> N(String var1) {
      return (class08092<?>)this.L.get(var1);
   }

   private static <S extends class00522<?, S>, T extends Comparable<T>> MapCodec<S> N(MapCodec<S> var0, Supplier<S> var1, String var2, class08092<T> var3) {
      return Codec.mapPair(var0, var3.i().fieldOf(var2).orElseGet(var0x -> {}, () -> var3.N((class00522<?, ?>)var1.get())))
         .xmap(var1x -> (class00522)((class00522)var1x.getFirst()).y(var3, ((class08084)var1x.getSecond()).y()), var1x -> Pair.of(var1x, var3.N(var1x)));
   }
}
