package minecraft;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class class06658 implements class00381<class07280> {
   public static final class02362<class00667, class06658> N = class00381.N(class06658::N, class06658::new);
   private final IntList y;

   private class06658(class00667 var1) {
      super();
      this.y = var1.N();
   }

   public class06658(int... var1) {
      super();
      this.y = new IntArrayList(var1);
   }

   public class06658(IntList var1) {
      super();
      this.y = new IntArrayList(var1);
   }

   public IntList N() {
      return this.y;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   private void N(class00667 var1) {
      var1.N(this.y);
   }

   @Override
   public class02897<class06658> method_65080() {
      return class04248.Nj;
   }
}
