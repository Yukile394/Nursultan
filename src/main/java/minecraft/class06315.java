package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class06315 extends class05765<class07079> {
   private static final int N = 100;
   private static final int y = 3;
   private static final int L = 6;
   private static final int u = 5;
   private final float i;
   @Nullable
   private class07209 R;
   private int Z;
   private int z;
   private int U;

   protected boolean L(class04782 var1, class07079 var2, long var3) {
      return var2.method_6109() && this.R != null && this.N(var1, this.R) && !this.i(var1, var2) && !this.R(var1, var2);
   }

   private boolean L(class04782 var1, class07079 var2) {
      class07209 class07209x = var2.method_24515();
      class07209 class07209x = class07209x.method_10074();
      return this.N(var1, class07209x) || this.N(var1, class07209x);
   }

   public class06315(float var1) {
      super(ImmutableMap.of(class05378.l, class05367.field_18456, class05378.m, class05367.field_18457));
      this.i = var1;
   }

   private boolean i(class04782 var1, class07079 var2) {
      return !this.L(var1, var2) && this.Z <= 0;
   }

   private boolean u(class04782 var1, class07079 var2) {
      return this.N(var1, var2.method_24515());
   }

   protected void u(class04782 var1, class07079 var2, long var3) {
      if (!this.L(var1, var2)) {
         this.Z--;
      } else if (this.U > 0) {
         this.U--;
      } else {
         if (this.u(var1, var2)) {
            var2.A().y();
            this.z--;
            this.U = 5;
         }
      }
   }

   protected void y(class04782 var1, class07079 var2, long var3) {
      super.y(var1, var2, var3);
      this.R = null;
      this.Z = 0;
      this.z = 0;
      this.U = 0;
   }

   private boolean y(class04782 var1, class07079 var2) {
      return this.L(var1, var2) || this.N(var2).isPresent();
   }

   protected boolean N(class04782 var1, class07079 var2) {
      return var2.method_6109() && this.y(var1, var2);
   }

   protected void N(class04782 var1, class07079 var2, long var3) {
      super.u(var1, var2, var3);
      this.N(var2).ifPresent(var3x -> {
         this.R = var3x;
         this.Z = 100;
         this.z = 3 + var1.field_9229.y(4);
         this.U = 0;
         this.N(var2, var3x);
      });
   }

   private void N(class07079 var1, class07209 var2) {
      var1.method_18868().N(class05378.m, new class05352(var2, this.i, 0));
   }

   @Override
   protected boolean N(long var1) {
      return false;
   }

   private boolean N(class04782 var1, class07209 var2) {
      return var1.method_8320(var2).N(class01210.F);
   }

   private Optional<class07209> N(class07079 var1) {
      return var1.method_18868().L(class05378.l);
   }

   private boolean R(class04782 var1, class07079 var2) {
      return this.L(var1, var2) && this.z <= 0;
   }
}
