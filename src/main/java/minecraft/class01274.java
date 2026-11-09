package minecraft;

import Nursultan.class09458;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;

public class class01274 extends class05096 {
   private static final int N = 20;
   private static final int y = 5;
   private static final int L = 20;
   private final class00392 u;
   private final List<class00392> i;
   private final ImmutableList<class09458> R;
   private class05482 M = class05482.N;
   private int B;
   private int Z;

   protected class01274(class00392 var1, List<class00392> var2, ImmutableList<class09458> var3) {
      super(var1);
      this.i = var2;
      this.u = class05220.N(var1, class00390.N(var2, class05220.N));
      this.R = var3;
   }

   @Override
   public void method_25426() {
      UnmodifiableIterator<class09458> unmodifiableiterator = this.R.iterator();

      while (unmodifiableiterator.hasNext()) {
         class09458 class09458x = (class09458)unmodifiableiterator.next();
         this.Z = Math.max(this.Z, 20 + this.field_22793.N(class09458x.N) + 20);
      }

      int l = 5 + this.Z + 5;
      int i1 = l * this.R.size();
      this.M = class05482.N(this.field_22793, i1, this.i.toArray(new class00392[0]));
      int ix = this.M.N() * 9;
      this.B = (int)(this.field_22790 / 2.0 - ix / 2.0);
      int j = this.B + ix + 18;
      int k = (int)(this.field_22789 / 2.0 - i1 / 2.0);

      for (UnmodifiableIterator<class09458> unmodifiableiterator1 = this.R.iterator(); unmodifiableiterator1.hasNext(); k += l) {
         class09458 class09458 = (class09458)unmodifiableiterator1.next();
         this.method_37063(class05362.method_46430(class09458.N, class09458.y).N(k, j, this.Z, 20).N());
      }
   }

   @Override
   public boolean method_25422() {
      return false;
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      class00580 class00580 = var1.B();
      var1.N(this.field_22793, this.field_22785, this.field_22789 / 2, this.B - 18, -1);
      this.M.N(class00937.field_62010, this.field_22789 / 2, this.B, 9, class00580);
   }

   @Override
   public class00392 method_25435() {
      return this.u;
   }
}
