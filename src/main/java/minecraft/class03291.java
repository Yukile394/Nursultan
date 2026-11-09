package minecraft;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class03291 implements class03860 {
   private final List<class04890> N = Lists.newArrayList();

   public boolean L() {
      return this.N.isEmpty();
   }

   public class03291() {
      super();
   }

   public class05163 u() {
      return class04890.N(this.N.stream());
   }

   public void y() {
      this.N.clear();
   }

   public class03300 N() {
      return new class03300(this.N);
   }

   public void N(class06069 var1, int var2, int var3) {
      class05163 class05163 = this.u();
      int i = var3 - var2 + 1 - class05163.i();
      int j;
      if (i > 1) {
         j = var2 + var1.y(i);
      } else {
         j = var2;
      }

      int k = j - class05163.Z();
      this.N(k);
   }

   @Override
   public void N(class04890 var1) {
      this.N.add(var1);
   }

   @Nullable
   @Override
   public class04890 N(class05163 var1) {
      return class04890.N(this.N, var1);
   }

   @Deprecated
   public int N(int var1, int var2, class06069 var3, int var4) {
      int i = var1 - var4;
      class05163 class05163 = this.u();
      int j = class05163.i() + var2 + 1;
      if (j < i) {
         j += var3.y(i - j);
      }

      int k = j - class05163.E();
      this.N(k);
      return k;
   }

   @Deprecated
   public void N(int var1) {
      Iterator<class04890> iterator = this.N.iterator();

      while (iterator.hasNext()) {
         iterator.next().N(0, var1, 0);
      }
   }
}
