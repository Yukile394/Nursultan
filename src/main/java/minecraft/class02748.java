package minecraft;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class class02748 implements class02725 {
   final int N;
   final String y;
   final List<class02751<?>> L;
   final BitSet u;
   final BitSet i;
   Runnable R;
   final List<class02746<?>> M;
   final BitSet B;
   boolean Z;

   private <T> class02751<T> L(class02751<T> var1) {
      this.L.add(var1);
      this.y(var1);
      return var1.N(this);
   }

   public class02748(class02734 var1, int var2, String var3) {
      super();
      this.z = var1;
      this.L = new ArrayList<>();
      this.u = new BitSet();
      this.i = new BitSet();
      this.R = () -> {};
      this.M = new ArrayList<>();
      this.B = new BitSet();
      this.N = var2;
      this.y = var3;
   }

   @Override
   public String toString() {
      return this.y;
   }

   private <T> void y(class02751<T> var1) {
      this.N(var1);
      if (var1.y != null) {
         this.N(var1.y);
      }

      var1.L.set(this.N);
   }

   @Override
   public <T> class02452<T> N(String var1, class02418<T> var2) {
      class02746 class02746 = this.z.N(var1, var2, this);
      this.u.set(class02746.N);
      return class02746.L;
   }

   @Override
   public void N(Runnable var1) {
      this.R = var1;
   }

   private void N(class02748 var1) {
      this.i.set(var1.N);
   }

   private <T> void N(class02751<T> var1) {
      if (var1.N instanceof class02746 class02746) {
         this.u.set(class02746.N);
      }
   }

   @Override
   public void N() {
      this.Z = true;
   }

   @Override
   public void N(class02725 var1) {
      this.i.set(((class02748)var1).N);
   }
}
