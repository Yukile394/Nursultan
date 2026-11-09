package minecraft;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class class05688<T> implements class04325<T>, class04327<T> {
   private final List<class04306<T>> N = Lists.newArrayList();
   private final Set<class04306<?>> y = new ObjectOpenCustomHashSet(class04306.N);

   public class05688() {
      super();
   }

   public List<class04306<T>> y() {
      return List.copyOf(this.N);
   }

   public static <T> class05688<T> N(List<class04306<T>> var0) {
      class05688 class05688 = new class05688();
      var0.forEach(class05688::N);
      return class05688;
   }

   @Override
   public List<class04306<T>> N(long var1) {
      return this.N;
   }

   @Override
   public int N() {
      return this.N.size();
   }

   @Override
   public boolean N(class07209 var1, T var2) {
      return this.y.contains(class04306.N(var2, var1));
   }

   private void N(class04306<T> var1) {
      if (this.y.add(var1)) {
         this.N.add(var1);
      }
   }

   @Override
   public void N(class04309<T> var1) {
      class04306 class04306 = new class04306<>(var1.N(), var1.y(), 0, var1.u());
      this.N(class04306);
   }
}
