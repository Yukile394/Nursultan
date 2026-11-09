package minecraft;

public class class04075 extends class05848 {
   private static final class06069 N = class06069.u();
   private final class06143 y;
   private float L = 1.0F;

   public class04075(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class06143 var14) {
      super(var1, var2, var4, var6, 0.5 - N.U(), var10, 0.5 - N.U(), var14.method_74304());
      this.field_28786 = 0.96F;
      this.field_3844 = -0.1F;
      this.field_28787 = true;
      this.y = var14;
      this.field_3869 *= 0.2F;
      if (var8 == 0.0 && var12 == 0.0) {
         this.field_3852 *= 0.1F;
         this.field_3850 *= 0.1F;
      }

      this.field_17867 *= 0.75F;
      this.field_3847 = (int)(8.0 / (this.field_3840.z() * 0.8 + 0.2));
      this.field_3862 = false;
      this.method_74306(var14);
      if (this.N()) {
         this.method_74308(0.0F);
      }
   }

   private boolean N() {
      class06202 class06202 = class06202.Nq();
      class04453 class04453 = (class04453)class06202.T_4;
      return class04453 != null
         && class04453.method_33571().L(this.field_3874, this.field_3854, this.field_3871) <= 9.0
         && ((class05630)class06202.i_7).NS().N()
         && class04453.method_31550();
   }

   @Override
   public class05846 method_74255() {
      return class05846.u;
   }

   @Override
   public void method_3070() {
      super.method_3070();
      this.method_74306(this.y);
      if (this.N()) {
         this.field_62636 = 0.0F;
      } else {
         this.field_62636 = class04995.B(0.05F, this.field_62636, this.L);
      }
   }

   @Override
   public void method_74308(float var1) {
      super.method_74308(var1);
      this.L = var1;
   }
}
