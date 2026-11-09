package minecraft;

public abstract class class01720 extends class07049 {
   protected static final class02131<Integer> i = class03289.N(class01720.class, class02154.y);
   protected static final class02131<Integer> R = class03289.N(class01720.class, class02154.y);
   protected static final class02131<Float> M = class03289.N(class01720.class, class02154.u);

   public void L(int var1) {
      this.field_6011.N(R, var1);
   }

   @Override
   public boolean method_5659(class07307 var1) {
      return var1.L() instanceof class07079 && !var1.N().method_64395().N(class07305.I);
   }

   @Override
   protected void method_5693(class04293 var1) {
      var1.N(i, 0);
      var1.N(R, 1);
      var1.N(M, 0.0F);
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      if (this.method_31481()) {
         return true;
      } else if (this.method_64421(var2)) {
         return false;
      } else {
         this.L(-this.l());
         this.y(10);
         this.method_5785();
         this.y(this.t() + var3 * 10.0F);
         this.method_32875(class01194.P, var2.u());
         class07049 class07049 = var2.u();
         boolean flag = class07049 instanceof class08036 && ((class08036)class07049).method_31549().u;
         if ((flag || !(this.t() > 40.0F)) && !this.y(var2)) {
            if (flag) {
               this.method_31472();
            }
         } else {
            this.N(var1, var2);
         }

         return true;
      }
   }

   @Override
   public int method_5806() {
      return 10;
   }

   @Override
   public boolean method_5643(class07072 var1) {
      return true;
   }

   public class01720(class07078<?> var1, class07299 var2) {
      super(var1, var2);
   }

   public int l() {
      return this.field_6011.N(R);
   }

   public float t() {
      return this.field_6011.N(M);
   }

   protected abstract class06581 z();

   public void y(int var1) {
      this.field_6011.N(i, var1);
   }

   protected boolean y(class07072 var1) {
      return false;
   }

   public void y(float var1) {
      this.field_6011.N(M, var1);
   }

   protected void N(class04782 var1, class07072 var2) {
      this.N(var1, this.z());
   }

   public void N(class04782 var1, class06581 var2) {
      this.method_5768(var1);
      if (var1.method_64395().N(class07305.U)) {
         class06584 class06584 = new class06584(var2);
         class06584.N(class02484.B, this.method_5797());
         this.method_5775(var1, class06584);
      }
   }

   public int G() {
      return this.field_6011.N(i);
   }
}
