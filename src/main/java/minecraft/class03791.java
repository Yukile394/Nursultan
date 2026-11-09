package minecraft;

import Nursultan.class09553;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntRBTreeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class class03791 {
   final int N;
   private final List<class02033> y = new ArrayList<>();

   public class03791(int var1) {
      super();
      this.N = var1;
   }

   public boolean y(class03926 var1) {
      boolean flag = false;
      Iterator<class02033> iterator = this.y.iterator();

      while (iterator.hasNext()) {
         class02033 class02033 = iterator.next();
         if (class02033.N(var1)) {
            flag = true;
            if (class02033.N()) {
               iterator.remove();
            }
         }
      }

      return flag;
   }

   public boolean N() {
      return !this.y.isEmpty();
   }

   public void N(class03926 var1) {
      this.y.add(new class02033(this, var1));
   }

   public void N(class03407 var1, IntCollection var2, class09553 var3) {
      IntRBTreeSet intrbtreeset = new IntRBTreeSet(var2);

      for (int i = intrbtreeset.lastInt(); i >= var1.N() && (this.N() || !intrbtreeset.isEmpty()); i--) {
         if (var1.y(i) instanceof class03412 class03412) {
            boolean flag = this.y(class03412.M());
            if (intrbtreeset.remove(i)) {
               this.N(class03412.M());
               var3.accept(i, class03412);
            } else if (flag) {
               var3.accept(i, class03412);
            }
         }
      }
   }
}
