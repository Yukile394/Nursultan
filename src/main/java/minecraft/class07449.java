package minecraft;

public abstract class class07449 extends class07473 {
   protected class07079 u;
   protected class07209 i = class07209.field_10980;
   protected boolean R;
   private boolean N;
   private float y;
   private float L;

   @Override
   public void L() {
      this.N = false;
      this.y = (float)(this.i.method_10263() + 0.5 - this.u.method_23317());
      this.L = (float)(this.i.method_10260() + 0.5 - this.u.method_23321());
   }

   protected boolean M() {
      if (!this.R) {
         return false;
      } else {
         class00500 class00500 = this.u.method_73183().method_8320(this.i);
         if (!(class00500.i() instanceof class07196)) {
            this.R = false;
            return false;
         } else {
            return class00500.L(class07196.i);
         }
      }
   }

   public class07449(class07079 var1) {
      super();
      this.u = var1;
      if (!class05459.N(var1)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   @Override
   public boolean B() {
      return true;
   }

   @Override
   public void i() {
      float f = (float)(this.i.method_10263() + 0.5 - this.u.method_23317());
      float f1 = (float)(this.i.method_10260() + 0.5 - this.u.method_23321());
      if (this.y * f + this.L * f1 < 0.0F) {
         this.N = true;
      }
   }

   @Override
   public boolean y() {
      return !this.N;
   }

   protected void N(boolean var1) {
      if (this.R) {
         class00500 class00500 = this.u.method_73183().method_8320(this.i);
         if (class00500.i() instanceof class07196) {
            ((class07196)class00500.i()).N(this.u, this.u.method_73183(), class00500, this.i, var1);
         }
      }
   }

   @Override
   public boolean N() {
      if (!class05459.N(this.u)) {
         return false;
      } else if (!this.u.field_5976) {
         return false;
      } else {
         class00143 class00143 = this.u.f().Z();
         if (class00143 != null && !class00143.L()) {
            for (int ix = 0; ix < Math.min(class00143.R() + 2, class00143.i()); ix++) {
               class01763 class01763 = class00143.N(ix);
               this.i = new class07209(class01763.N, class01763.y + 1, class01763.L);
               if (!(this.u.method_5649(this.i.method_10263(), this.u.method_23318(), this.i.method_10260()) > 2.25)) {
                  this.R = class07196.N(this.u.method_73183(), this.i);
                  if (this.R) {
                     return true;
                  }
               }
            }

            this.i = this.u.method_24515().method_10084();
            this.R = class07196.N(this.u.method_73183(), this.i);
            return this.R;
         } else {
            return false;
         }
      }
   }
}
