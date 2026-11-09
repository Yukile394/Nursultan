package minecraft;

import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class class08766 extends class08672<class08778> {
   private boolean y;
   @Nullable
   private Object L;

   public boolean L() {
      return this.y;
   }

   public class08766(class01422 var1) {
      super(var1);
   }

   public void i() {
      this.L = null;
   }

   public void u() {
      this.y = false;
   }

   @Override
   protected String y() {
      return "oversized_item";
   }

   @Override
   protected float N(int var1, int var2) {
      return var1 / 2.0F;
   }

   @Override
   public Class<class08778> N() {
      return class08778.class;
   }

   protected void N(class08778 var1, class01421 var2) {
      var2.y(1.0F, -1.0F, -1.0F);
      class08650 class08650 = var1.y();
      class03255 class03255 = class08650.M();
      Objects.requireNonNull(class03255);
      float f = (class03255.u() + class03255.i()) / 2.0F;
      float f1 = (class03255.y() + class03255.L()) / 2.0F;
      float f2 = class08650.u() + 8.0F;
      float f3 = class08650.i() + 8.0F;
      var2.N((f2 - f) / 16.0F, (f1 - f3) / 16.0F, 0.0F);
      class08763 class08763 = class08650.L();
      if (!class08763.R()) {
         ((class03386)class06202.Nq().i_5).v().N(class01540.field_60026);
      } else {
         ((class03386)class06202.Nq().i_5).v().N(class01540.field_60027);
      }

      class08133 class08133 = ((class03386)class06202.Nq().i_5).L();
      class04790 class04790 = class08133.L();
      class08763.N(var2, class04790, 15728880, class01384.u, 0);
      class08133.N();
      this.L = class08763.Z();
   }

   public void N(class08778 var1, class08651 var2) {
      super.N(var1, var2);
      this.y = true;
   }

   public boolean N(class08778 var1) {
      class08763 class08763 = var1.y().L();
      return !class08763.u() && class08763.Z().equals(this.L);
   }
}
