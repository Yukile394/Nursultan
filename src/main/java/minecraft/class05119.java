package minecraft;

import org.jspecify.annotations.Nullable;

public class class05119 {
   final String N;
   final String y;
   final class04949 L;
   final long u;
   @Nullable
   final String i;
   public final boolean R;
   public final boolean M;
   public final class05110 B;
   public final boolean Z;
   public final boolean z;

   public class05119(class04981 var1, int var2) {
      super();
      this.M = var2 == 4;
      if (this.M) {
         this.N = class05099.i.getString();
         this.u = var1.j;
         this.i = var1.v;
         this.R = var1.j == -1;
         this.y = "";
         this.L = class04949.field_46697;
         this.Z = false;
         this.z = var1.z();
      } else {
         class00072 class00072 = var1.z.get(var2);
         this.N = class00072.y.N(var2);
         this.u = class00072.y.M;
         this.i = class00072.y.B;
         this.R = class00072.y.Z;
         this.y = class00072.y.i;
         this.L = class00072.y.R;
         this.Z = class00072.y();
         this.z = var1.T == var2 && !var1.z();
      }

      this.B = class05099.N(this.z, this.R, var1.U);
   }
}
