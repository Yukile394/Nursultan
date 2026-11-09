package minecraft;

import it.unimi.dsi.fastutil.shorts.ShortIterator;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.function.BiConsumer;

public class class07261 implements class00381<class07280> {
   public static final class02362<class00667, class07261> N = class00381.N(class07261::N, class07261::new);
   private static final int y = 12;
   private final class01296 L;
   private final short[] u;
   private final class00500[] i;

   public class07261(class01296 var1, ShortSet var2, class00554 var3) {
      super();
      this.L = var1;
      int ix = var2.size();
      this.u = new short[ix];
      this.i = new class00500[ix];
      int j = 0;

      for (ShortIterator shortiterator = var2.iterator(); shortiterator.hasNext(); j++) {
         short short1 = (Short)shortiterator.next();
         this.u[j] = short1;
         this.i[j] = var3.N(class01296.N(short1), class01296.y(short1), class01296.L(short1));
      }
   }

   private class07261(class00667 var1) {
      super();
      this.L = class01296.R.decode(var1);
      int ix = var1.E();
      this.u = new short[ix];
      this.i = new class00500[ix];

      for (int j = 0; j < ix; j++) {
         long k = var1.W();
         this.u[j] = (short)(k & 4095L);
         this.i[j] = class00891.U.N((int)(k >>> 12));
      }
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   private void N(class00667 var1) {
      class01296.R.encode(var1, this.L);
      var1.L(this.u.length);

      for (int ix = 0; ix < this.u.length; ix++) {
         var1.N((long)class00891.W(this.i[ix]) << 12 | this.u[ix]);
      }
   }

   public void N(BiConsumer<class07209, class00500> var1) {
      class07218 class07218 = new class07218();

      for (int ix = 0; ix < this.u.length; ix++) {
         short short1 = this.u[ix];
         class07218.N(this.L.u(short1), this.L.i(short1), this.L.R(short1));
         var1.accept(class07218, this.i[ix]);
      }
   }

   @Override
   public class02897<class07261> method_65080() {
      return class04248.NG;
   }
}
