package minecraft;

import java.util.EnumSet;
import java.util.Iterator;
import org.jspecify.annotations.Nullable;

public class class07989 extends class07953 {
   private static final class01328 N = class01328.N().u().i();
   private static final int y = 10;
   private boolean L;
   private int u;
   private final Class<?>[] Z;
   @Nullable
   private Class<?>[] z;

   @Override
   public void L() {
      this.i.y(this.i.method_6065());
      this.M = this.i.T();
      this.u = this.i.method_6117();
      this.B = 300;
      if (this.L) {
         this.M();
      }

      super.L();
   }

   protected void M() {
      double d0 = this.Z();
      class00734 class00734 = class00734.N(this.i.method_73189()).L(d0, 10.0, d0);
      Iterator<class07079> iterator = (Iterator<class07079>)this.i.method_73183().N(this.i.getClass(), class00734, class07042.R).iterator();

      while (true) {
         class07079 class07079;
         while (true) {
            if (!iterator.hasNext()) {
               return;
            }

            class07079 = iterator.next();
            if (this.i != class07079
               && class07079.T() == null
               && (!(this.i instanceof class07453) || ((class07453)this.i).L_() == ((class07453)class07079).L_())
               && !class07079.method_5722(this.i.method_6065())) {
               if (this.z == null) {
                  break;
               }

               boolean flag = false;

               for (Class<?> oclass : this.z) {
                  if (class07079.getClass() == oclass) {
                     flag = true;
                     break;
                  }
               }

               if (!flag) {
                  break;
               }
            }
         }

         this.N(class07079, this.i.method_6065());
      }
   }

   public class07989(class07475 var1, Class<?>... var2) {
      super(var1, true);
      this.Z = var2;
      this.N_71(EnumSet.of(class07430.field_18408));
   }

   public class07989 N(Class<?>... var1) {
      this.L = true;
      this.z = var1;
      return this;
   }

   protected void N(class07079 var1, class07438 var2) {
      var1.y(var2);
   }

   @Override
   public boolean N() {
      int i = this.i.method_6117();
      class07438 class07438 = this.i.method_6065();
      if (i != this.u && class07438 != null) {
         if (class07438.method_5864() == class07078.Ly && N(this.i).method_64395().N(class07305.NR)) {
            return false;
         } else {
            Class<?>[] oclass = this.Z;
            int j = oclass.length;

            for (int k = 0; k < j; k++) {
               if (oclass[k].isAssignableFrom(class07438.getClass())) {
                  return false;
               }
            }

            return this.N(class07438, N);
         }
      } else {
         return false;
      }
   }
}
