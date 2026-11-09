package minecraft;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntMaps;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2IntMap;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import net.fabricmc.fabric.impl.registry.sync.RemovableIdList;
import org.jspecify.annotations.Nullable;

public class class00742<T> implements class00750<T>, RemovableIdList {
   private int y;
   private final Reference2IntMap<T> L;
   private final List<T> u;

   @Override
   public int L() {
      return this.L.size();
   }

   public boolean L(int var1) {
      return this.N(var1) != null;
   }

   public class00742() {
      this(512);
   }

   public class00742(int var1) {
      super();
      this.u = Lists.newArrayListWithExpectedSize(var1);
      this.L = new Reference2IntOpenHashMap(var1);
      this.L.defaultReturnValue(-1);
   }

   @Override
   public Iterator<T> iterator() {
      return Iterators.filter(this.u.iterator(), Objects::nonNull);
   }

   private void u(Object var1) {
      int i = this.L.removeInt(var1);
      this.u.set(i, null);

      while (this.y > 1 && this.u.get(this.y - 1) == null) {
         this.y--;
      }
   }

   public void y(T var1) {
      this.N((T)var1, this.y);
   }

   @Override
   public int N(T var1) {
      return this.L.getInt(var1);
   }

   @Nullable
   @Override
   public final T N(int var1) {
      return var1 >= 0 && var1 < this.u.size() ? this.u.get(var1) : null;
   }

   public void N(T var1, int var2) {
      this.L.put(var1, var2);

      while (this.u.size() <= var2) {
         this.u.add(null);
      }

      this.u.set(var2, (T)var1);
      if (this.y <= var2) {
         this.y = var2 + 1;
      }
   }

   public void fabric_remapId(int var1, int var2) {
      this.fabric_remapIds(Int2IntMaps.singleton(var1, var2));
   }

   public void fabric_clear() {
      this.y = 0;
      this.L.clear();
      this.u.clear();
   }

   public void fabric_remove(Object var1) {
      if (this.L.containsKey(var1)) {
         this.u(var1);
      }
   }

   public void fabric_removeId(int var1) {
      ArrayList arraylist = new ArrayList();
      ObjectIterator objectiterator = this.L.keySet().iterator();

      while (objectiterator.hasNext()) {
         Object object = objectiterator.next();
         int i = this.L.getInt(object);
         if (var1 == i) {
            arraylist.add(object);
         }
      }

      arraylist.forEach(this::u);
   }

   public void fabric_remapIds(Int2IntMap var1) {
      this.L.replaceAll((var1x, var2x) -> var1.get(var2x));
      this.y = 0;
      ArrayList arraylist = new ArrayList<>(this.u);
      this.u.clear();

      for (int i = 0; i < arraylist.size(); i++) {
         Object object = arraylist.get(i);
         if (object != null) {
            int j = var1.getOrDefault(i, i);

            while (this.u.size() <= j) {
               this.u.add(null);
            }

            this.u.set(j, (T)object);
            if (this.y <= j) {
               this.y = j + 1;
            }
         }
      }
   }
}
