package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import org.jspecify.annotations.Nullable;

class class04611 extends class06318<class04614> {
   private static final int M = 18;
   private static final int B = 22;
   private static final int Z = 1;
   private static final int z = 0;
   private static final int U = -1;
   private static final int E = 1;
   protected final List<class04922<class00891>> N;
   protected final List<class04922<class06581>> y;
   protected final Comparator<class04590> L;
   @Nullable
   protected class04922<?> u;
   protected int i;

   public class04611(class04610 var1, class06202 var2) {
      super(var2, var1.field_22789, var1.M.u(), 33, 22);
      this.R = var1;
      this.L = new class04592(this);
      this.N = Lists.newArrayList();
      this.N.add(class01235.N);
      this.y = Lists.newArrayList(new class04922[]{class01235.u, class01235.y, class01235.L, class01235.i, class01235.R});
      Set set = Sets.newIdentityHashSet();

      for (class06581 class06581x : class04206.B) {
         boolean flag = false;

         for (class04922 class04922x : this.y) {
            if (class04922x.N(class06581x) && var1.B.N(class04922x.y(class06581x)) > 0) {
               flag = true;
            }
         }

         if (flag) {
            set.add(class06581x);
         }
      }

      for (class00891 class00891 : class04206.i) {
         boolean flag1 = false;

         for (class04922 class04922x : this.N) {
            if (class04922x.N(class00891) && var1.B.N(class04922x.y(class00891)) > 0) {
               flag1 = true;
            }
         }

         if (flag1) {
            set.add(class00891.B());
         }
      }

      set.remove(class06570.N);
      if (!set.isEmpty()) {
         this.method_25321(new class04628(this));

         for (class06581 class06581 : set) {
            this.method_25321(new class04590(this, class06581));
         }
      }
   }

   class04922<?> y(int var1) {
      return var1 < this.N.size() ? this.N.get(var1) : this.y.get(var1 - this.N.size());
   }

   protected void y(class04922<?> var1) {
      if (var1 != this.u) {
         this.u = var1;
         this.i = -1;
      } else if (this.i == -1) {
         this.i = 1;
      } else {
         this.u = null;
         this.i = 0;
      }

      this.N(this.L);
   }

   private List<class04590> y() {
      ArrayList arraylist = new ArrayList();
      this.method_25396().forEach(var1x -> {
         if (var1x instanceof class04590 class04590) {
            arraylist.add(class04590);
         }
      });
      return arraylist;
   }

   protected void N(Comparator<class04590> var1) {
      List<class04590> list = this.y();
      list.sort(var1);
      this.method_73374(this.method_25396().getFirst());

      for (class04590 class04590 : list) {
         this.method_25321(class04590);
      }
   }

   int N(int var1) {
      return 75 + 40 * var1;
   }

   int N(class04922<?> var1) {
      int ix = this.N.indexOf(var1);
      if (ix >= 0) {
         return ix;
      } else {
         int j = this.y.indexOf(var1);
         return j >= 0 ? j + this.N.size() : -1;
      }
   }

   @Override
   public int method_25322() {
      return 280;
   }

   @Override
   protected void method_57715(class01054 var1) {
   }

   @Override
   protected void method_57713(class01054 var1) {
   }
}
