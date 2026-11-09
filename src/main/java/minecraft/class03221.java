package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Iterator;
import java.util.List;

public class class03221<T> {
   private final List<Pair<class03229, T>> N;
   private final class03197<T> y;

   public T L(class03231 var1) {
      return this.N(var1, class03235::N);
   }

   public class03221(List<Pair<class03229, T>> var1) {
      super();
      this.N = var1;
      this.y = class03197.N(var1);
   }

   public T y(class03231 var1) {
      Iterator iterator = this.N().iterator();
      Pair pair = (Pair)iterator.next();
      long i = ((class03229)pair.getFirst()).N(var1);
      Object object = pair.getSecond();

      while (iterator.hasNext()) {
         Pair pair1 = (Pair)iterator.next();
         long j = ((class03229)pair1.getFirst()).N(var1);
         if (j < i) {
            i = j;
            object = pair1.getSecond();
         }
      }

      return (T)object;
   }

   protected T N(class03231 var1, class03200<T> var2) {
      return this.y.N(var1, var2);
   }

   public static <T> Codec<class03221<T>> N(MapCodec<T> var0) {
      return class06338.y(
            RecordCodecBuilder.create(
                  var1 -> var1.group(class03229.N.fieldOf("parameters").forGetter(Pair::getFirst), var0.forGetter(Pair::getSecond)).apply(var1, Pair::of)
               )
               .listOf()
         )
         .xmap(class03221::new, class03221::N);
   }

   public T N(class03231 var1) {
      return this.L(var1);
   }

   public List<Pair<class03229, T>> N() {
      return this.N;
   }
}
