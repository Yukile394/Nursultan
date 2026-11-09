package minecraft;

public abstract class class07148 extends class00675 {
   private static final class02131<Byte> N = class03289.N(class07148.class, class02154.N);
   private static final int R = 0;
   protected int y = 0;
   private class07156 M = class07156.field_7377;

   @Override
   public class00703 M() {
      if (this.n()) {
         return class00703.field_7212;
      } else {
         return this.Ng() ? class00703.field_19012 : class00703.field_7207;
      }
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(N, (byte)0);
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (this.method_73183().method_8608() && this.n()) {
         class07156 class07156 = this.t();
         float f = (float)class07156.field_7374[0];
         float f1 = (float)class07156.field_7374[1];
         float f2 = (float)class07156.field_7374[2];
         float f3 = super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 * (float) (Math.PI / 180.0) + class04995.P(this.field_6012 * 0.6662F) * 0.25F;
         float f4 = class04995.P(f3);
         float f5 = class04995.m(f3);
         double d0 = 0.6 * this.method_55693();
         double d1 = 1.8 * this.method_55693();
         this.method_73183()
            .method_8406(
               class02329.N(class07107.t, f, f1, f2), this.method_23317() + f4 * d0, this.method_23318() + d1, this.method_23321() + f5 * d0, 0.0, 0.0, 0.0
            );
         this.method_73183()
            .method_8406(
               class02329.N(class07107.t, f, f1, f2), this.method_23317() - f4 * d0, this.method_23318() + d1, this.method_23321() - f5 * d0, 0.0, 0.0, 0.0
            );
      }
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("SpellTicks", this.y);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.y = var1.N("SpellTicks", 0);
   }

   protected class07148(class07078<? extends class07148> var1, class07299 var2) {
      super(var1, var2);
   }

   public boolean n() {
      return this.method_73183().method_8608() ? this.field_6011.N(N) > 0 : this.y > 0;
   }

   protected abstract class04891 m();

   protected class07156 t() {
      return !this.method_73183().method_8608() ? this.M : class07156.N(this.field_6011.N(N));
   }

   public void N(class07156 var1) {
      this.M = var1;
      this.field_6011.N(N, (byte)var1.field_7375);
   }

   @Override
   protected void N(class04782 var1) {
      super.N(var1);
      if (this.y > 0) {
         this.y--;
      }
   }

   protected int G() {
      return this.y;
   }
}
