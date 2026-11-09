package minecraft;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class class04270 implements class05516 {
   private static final int L = 5;
   private static final int u = 6;
   private final int i;
   private int R;
   private class00734 M;
   private final class07218 B;
   private final class07209 Z;
   private final boolean z;
   private float U = -1.0F;
   private final Collection<class05513> E = new ArrayList<>();

   public class04270(class07209 var1, int var2, boolean var3) {
      super();
      this.i = var2;
      this.B = var1.method_25503();
      this.M = new class00734(this.B);
      this.Z = var1;
      this.z = var3;
   }

   @Override
   public void N(class04782 var1) {
      if (this.z) {
         this.E.forEach(var1x -> class05514.N(var1x.R().u(), var1));
         this.E.clear();
         this.M = new class00734(this.Z);
         this.B.N(this.Z);
      }
   }

   @Override
   public Optional<class05513> spawnStructure(class05513 var1) {
      class07209 class07209 = new class07209(this.B);
      var1.N(class07209);
      class05513 class05513 = var1.P();
      if (class05513 == null) {
         return Optional.empty();
      } else {
         class05513.N(1);
         class00734 class00734 = var1.R().R();
         this.M = this.M.y(class00734);
         this.B.y((int)class00734.y() + 5, 0, 0);
         if (this.B.method_10263() > this.U) {
            this.U = this.B.method_10263();
         }

         if (++this.R >= this.i) {
            this.R = 0;
            this.B.y(0, 0, (int)this.M.u() + 6);
            this.B.method_20787(this.Z.method_10263());
            this.M = new class00734(this.B);
         }

         this.E.add(var1);
         return Optional.of(var1);
      }
   }
}
