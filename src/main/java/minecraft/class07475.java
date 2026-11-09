package minecraft;

public abstract class class07475 extends class07079 {
   protected static final float c = 0.0F;

   protected double NY() {
      return 1.0;
   }

   public class07475(class07078<? extends class07475> var1, class07299 var2) {
      super(var1, var2);
   }

   public float u(class07209 var1) {
      return this.N(var1, this.method_73183());
   }

   @Override
   public boolean N(class07284 var1, class06113 var2) {
      return this.N(this.method_24515(), var1) >= 0.0F;
   }

   public float N(class07209 var1, class05487 var2) {
      return 0.0F;
   }

   @Override
   public void a_(class07049 var1) {
      this.N(var1.method_24515(), (int)this.q_() - 1);
      super.a_(var1);
   }

   @Override
   public void b_(class07049 var1) {
      super.b_(var1);
      if (this.k_() && !this.Nk()) {
         this.e.y(class07430.field_18405);
         float f = 2.0F;
         float f1 = this.method_5739(var1);
         class06889 class06889 = new class06889(
               var1.method_23317() - this.method_23317(), var1.method_23318() - this.method_23318(), var1.method_23321() - this.method_23321()
            )
            .u()
            .L((double)Math.max(f1 - 2.0F, 0.0F));
         this.f().N(this.method_23317() + class06889.M, this.method_23318() + class06889.B, this.method_23321() + class06889.Z, this.NY());
      }
   }

   public boolean Nk() {
      if (super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.N(class05378.NN)) {
         return super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.L(class05378.NN).isPresent();
      } else {
         for (class05764 class05764 : this.e.y()) {
            if (class05764.M() && class05764.U() instanceof class07993) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean Nw() {
      return !this.f().U();
   }

   protected boolean k_() {
      return true;
   }
}
