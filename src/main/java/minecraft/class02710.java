package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class class02710 implements class02694 {
   public static final class02710 N = new class02710(new Object2IntOpenHashMap());
   private static final Codec<Integer> i = Codec.intRange(1, 255);
   public static final Codec<class02710> y = Codec.unboundedMap(class07304.L, i).xmap(var0 -> new class02710(new Object2IntOpenHashMap(var0)), var0 -> var0.u);
   public static final class02362<class04247, class02710> L = class02362.N(
      class02389.N(Object2IntOpenHashMap::new, class07304.u, class02389.B), var0 -> var0.u, class02710::new
   );
   final Object2IntOpenHashMap<class03556<class07304>> u;

   public int L() {
      return this.u.size();
   }

   class02710(Object2IntOpenHashMap<class03556<class07304>> var1) {
      super();
      this.u = var1;
      ObjectIterator objectiterator = var1.object2IntEntrySet().iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         int ix = entry.getIntValue();
         if (ix < 0 || ix > 255) {
            throw new IllegalArgumentException("Enchantment " + entry.getKey() + " has invalid level " + ix);
         }
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof class02710 class02710 ? this.u.equals(class02710.u) : false;
      }
   }

   @Override
   public String toString() {
      return "ItemEnchantments{enchantments=" + this.u + "}";
   }

   @Override
   public int hashCode() {
      return this.u.hashCode();
   }

   public boolean u() {
      return this.u.isEmpty();
   }

   public Set<Entry<class03556<class07304>>> y() {
      return Collections.unmodifiableSet(this.u.object2IntEntrySet());
   }

   private static <T> class03543<T> N(@Nullable class01929 var0, class05946<class00751<T>> var1, class03530<T> var2) {
      if (var0 != null) {
         Optional optional = var0.y(var1).N(var2);
         if (optional.isPresent()) {
            return (class03543<T>)optional.get();
         }
      }

      return class03543.N();
   }

   public Set<class03556<class07304>> N() {
      return Collections.unmodifiableSet(this.u.keySet());
   }

   @Override
   public void N(class06591 var1, Consumer<class00392> var2, class06497 var3, class02666 var4) {
      class03543<class07304> class03543 = N(var1.N(), class04227.yR, class02625.N);

      for (class03556 class03556x : class03543) {
         int var9 = this.u.getInt(class03556x);
         if (var9 > 0) {
            var2.accept(class07304.N(class03556x, var9));
         }
      }

      ObjectIterator objectiterator = this.u.object2IntEntrySet().iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         class03556<class07304> class03556x = (class03556<class07304>)entry.getKey();
         if (!class03543.N(class03556x)) {
            var2.accept(class07304.N((class03556<class07304>)entry.getKey(), entry.getIntValue()));
         }
      }
   }

   public int N(class03556<class07304> var1) {
      return this.u.getInt(var1);
   }
}
