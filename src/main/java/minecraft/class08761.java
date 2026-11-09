package minecraft;

public class class08761 implements class08773 {
   private static final int N = 10;
   private static final int y = class04995.Z(7);
   private final boolean L;
   private int u;
   private int i;
   private int R;
   private float M;
   private volatile float B;

   private void L() {
      if (this.u == 0) {
         this.B = 0.0F;
      } else {
         float f = this.i + this.M * this.R;
         this.B = f / this.u;
      }
   }

   public class08761(boolean var1) {
      super();
      this.L = var1;
   }

   private void y() {
      this.i = this.i + this.R;
      this.R = 0;
      this.L();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean y(class08753 var1) {
      return switch (var1) {
         case field_61107 -> true;
         case field_61108 -> this.L;
         default -> false;
      };
   }

   public float N() {
      return this.B;
   }

   @Override
   public void N(class05946<class07299> var1, class07321 var2) {
   }

   @Override
   public void N(class08753 var1, int var2, int var3) {
      if (this.y(var1)) {
         this.M = var3 == 0 ? 0.0F : (float)var2 / var3;
         this.L();
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void N(class08753 var1, int var2) {
      if (this.y(var1)) {
         switch (var1) {
            case field_61107:
               int ix = this.L ? y : 0;
               this.u = 10 + var2 + ix;
               this.N(10);
               this.y();
               this.N(var2);
               break;
            case field_61108:
               this.N(y);
         }
      }
   }

   private void N(int var1) {
      this.R = var1;
      this.M = 0.0F;
      this.L();
   }

   @Override
   public void N(class08753 var1) {
      if (this.y(var1)) {
         this.y();
      }
   }
}
