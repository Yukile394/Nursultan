package minecraft;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;

class class01745<T extends class01711<T>> {
   @Nullable
   private List<class01716<T>> N = new ArrayList<>();
   @Nullable
   private List<class01887<T>> y;
   private final List<String> L = new ArrayList<>();

   class01745() {
      super();
   }

   private IntList N(List<String> var1) {
      IntArrayList intarraylist = new IntArrayList(var1.size());

      for (String s : var1) {
         intarraylist.add(this.N(s));
      }

      return intarraylist;
   }

   public void N(String var1, int var2, T var3) {
      class01737 class01737;
      try {
         class01737 = class01737.N(var1);
      } catch (Exception exception) {
         throw new IllegalArgumentException("Can't parse function line " + var2 + ": '" + var1 + "'", exception);
      }

      if (this.N != null) {
         this.y = new ArrayList<>(this.N.size() + 1);

         for (class01716 class01716 : this.N) {
            this.y.add(new class01870<>(class01716));
         }

         this.N = null;
      }

      this.y.add(new class01862<>(class01737, this.N(class01737.y()), (T)var3));
   }

   public class07684<T> N(class01894 var1) {
      return (class07684<T>)(this.y != null ? new class01859<>(var1, this.y, this.L) : new class01728<>(var1, this.N));
   }

   private int N(String var1) {
      int i = this.L.indexOf(var1);
      if (i == -1) {
         i = this.L.size();
         this.L.add(var1);
      }

      return i;
   }

   public void N(class01716<T> var1) {
      if (this.y != null) {
         this.y.add(new class01870<>(var1));
      } else {
         this.N.add(var1);
      }
   }
}
