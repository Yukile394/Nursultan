package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import net.caffeinemc.mods.lithium.common.ai.WeightedListIterable;
import net.caffeinemc.mods.lithium.common.ai.WeightedListIterable.ListIterator;

public class class02150<U> implements Iterable<U>, WeightedListIterable {
   protected final List<class02134<U>> N;
   private final class06069 y = class06069.u();

   public class02150() {
      super();
      this.N = Lists.newArrayList();
   }

   private class02150(List<class02134<U>> var1) {
      super();
      this.N = Lists.newArrayList(var1);
   }

   @Override
   public String toString() {
      return "ShufflingList[" + this.N + "]";
   }

   @Override
   public Iterator iterator() {
      return new ListIterator(this.N.iterator());
   }

   public Stream<U> y() {
      return this.N.stream().map(class02134::N);
   }

   public class02150<U> N() {
      this.N.forEach(var1 -> var1.N(this.y.z()));
      this.N.sort(Comparator.comparingDouble(class02134::L));
      return this;
   }

   public static <U> Codec<class02150<U>> N(Codec<U> var0) {
      return class02134.N(var0).listOf().xmap(class02150::new, var0x -> var0x.N);
   }

   public class02150<U> N(U var1, int var2) {
      this.N.add(new class02134<>((U)var1, var2));
      return this;
   }
}
