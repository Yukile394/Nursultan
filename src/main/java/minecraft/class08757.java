package minecraft;

import java.util.Iterator;
import org.jspecify.annotations.Nullable;

public class class08757 implements class08762 {
   private static final int N = 6000;
   private static final class00392 y = class00392.L("tutorial.find_tree.title");
   private static final class00392 L = class00392.L("tutorial.find_tree.description");
   private final class08764 u;
   @Nullable
   private class06128 i;
   private int R;

   public class08757(class08764 var1) {
      super();
      this.u = var1;
   }

   private static boolean y(class04453 var0) {
      return var0.method_31548().N_60(var0x -> var0x.N(class01226.NM));
   }

   @Override
   public void y() {
      if (this.i != null) {
         this.i.B();
         this.i = null;
      }
   }

   @Override
   public void N(class06584 var1) {
      if (var1.N(class01226.NM)) {
         this.u.N(class08966.field_5655);
      }
   }

   public static boolean N(class04453 var0) {
      Iterator<class03556<class00891>> iterator = class04206.i.u(class01210.NM).iterator();

      while (iterator.hasNext()) {
         class00891 class00891 = iterator.next().N();
         if (var0.O().N(class01235.N.y(class00891)) > 0) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void N(class03448 var1, class07089 var2) {
      if (var2.N() == class07113.field_1332 && var1.method_8320(((class06183)var2).u()).N(class01210.NM)) {
         this.u.N(class08966.field_5649);
      }
   }

   @Override
   public void N() {
      this.R++;
      if (!this.u.R()) {
         this.u.N(class08966.field_5653);
      } else {
         class06202 class06202 = this.u.i();
         if (this.R == 1) {
            class04453 class04453 = (class04453)class06202.T_4;
            if (class04453 != null && (y(class04453) || N(class04453))) {
               this.u.N(class08966.field_5655);
               return;
            }
         }

         if (this.R >= 6000 && this.i == null) {
            this.i = new class06128((class01590)class06202.i_3, class06090.field_2235, y, L, false);
            class06202.m().N(this.i);
         }
      }
   }
}
