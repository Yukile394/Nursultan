package minecraft;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Predicate;

public record class01968(List<class01937> entries) {
   private static final char L = '|';
   private static final Joiner u = Joiner.on('|');
   private static final Splitter i = Splitter.on('|');
   private static final Codec<String> R = Codec.either(Codec.INT, Codec.BOOL)
      .flatComapMap(var0 -> (String)var0.map(String::valueOf, String::valueOf), var0 -> DataResult.error(() -> "This codec can't be used for encoding"));
   public static final Codec<class01968> N = Codec.withAlternative(Codec.STRING, R).comapFlatMap(class01968::N, class01968::toString);

   public class01968(List<class01937> entries) {
      if (entries.isEmpty()) {
         throw new IllegalArgumentException("Empty value for property");
      } else {
         this.entries = entries;
      }
   }

   @Override
   public String toString() {
      return u.join(this.entries);
   }

   public static DataResult<class01968> N(String var0) {
      List list = i.splitToStream(var0).map(class01937::N).toList();
      if (list.isEmpty()) {
         return DataResult.error(() -> "Empty value for property");
      } else {
         Iterator iterator = list.iterator();

         while (iterator.hasNext()) {
            if (((class01937)iterator.next()).N().isEmpty()) {
               return DataResult.error(() -> "Empty term in value '" + var0 + "'");
            }
         }

         return DataResult.success(new class01968(list));
      }
   }

   public List<class01937> N() {
      return this.entries;
   }

   private <T extends Comparable<T>> Predicate<T> N(Object var1, class08092<T> var2, class01937 var3) {
      Comparable comparable = this.N(var1, var2, var3.N());
      return var3.y() ? var1x -> !var1x.equals(comparable) : var1x -> var1x.equals(comparable);
   }

   private <T extends Comparable<T>> T N(Object var1, class08092<T> var2, String var3) {
      Optional optional = var2.y(var3);
      if (optional.isEmpty()) {
         throw new RuntimeException(String.format(Locale.ROOT, "Unknown value '%s' for property '%s' on '%s' in '%s'", var3, var2, var1, this));
      } else {
         return (T)optional.get();
      }
   }

   public <O, S extends class00522<O, S>, T extends Comparable<T>> Predicate<S> N(O var1, class08092<T> var2) {
      Predicate predicate = class07536.y(Lists.transform(this.entries, var3x -> this.N(var1, var2, var3x)));
      ArrayList arraylist = new ArrayList(var2.N());
      int ix = arraylist.size();
      arraylist.removeIf(predicate.negate());
      int j = arraylist.size();
      if (j == 0) {
         class01942.y.warn("Condition {} for property {} on {} is always false", new Object[]{this, var2.R(), var1});
         return var0 -> false;
      } else {
         int k = ix - j;
         if (k == 0) {
            class01942.y.warn("Condition {} for property {} on {} is always true", new Object[]{this, var2.R(), var1});
            return var0 -> true;
         } else {
            boolean flag;
            ArrayList arraylist1;
            if (j <= k) {
               flag = false;
               arraylist1 = arraylist;
            } else {
               flag = true;
               ArrayList arraylist2 = new ArrayList(var2.N());
               arraylist2.removeIf(predicate);
               arraylist1 = arraylist2;
            }

            if (arraylist1.size() == 1) {
               Comparable comparable = (Comparable)arraylist1.getFirst();
               return var3x -> {
                  Comparable comparable1 = var3x.L(var2);
                  return comparable.equals(comparable1) ^ flag;
               };
            } else {
               return var3x -> {
                  Comparable comparablex = var3x.L(var2);
                  return arraylist1.contains(comparablex) ^ flag;
               };
            }
         }
      }
   }
}
