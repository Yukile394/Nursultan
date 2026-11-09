package minecraft;

public class class01486 extends class02450<class08447> {
   private void L(class08447 var1) {
      if (var1.NJ == class07070.field_6182) {
         this.U.i = -1.8F;
      } else {
         this.z.i = -1.8F;
      }
   }

   public class01486(class01686 var1) {
      super(var1);
   }

   protected void y(class08447 var1) {
      float f = var1.NX;
      if (f > 0.0F && var1.p == class01484.field_25165) {
         class05402.N(this.z, this.U, var1.NJ, f, var1.P);
      } else {
         super.y(var1);
      }
   }

   @Override
   public void N(boolean var1) {
      super.N(var1);
      this.m.U = var1;
      this.P.U = var1;
      this.s.U = var1;
      this.T.U = var1;
      this.b.U = var1;
   }

   public void method_2819(class08447 var1) {
      super.method_2819(var1);
      float f = (float) (Math.PI / 6);
      float f1 = var1.NX;
      class01484 class01484 = var1.p;
      if (class01484 == class01484.field_25166) {
         float f2 = var1.P / 60.0F;
         this.j.M = (float) (Math.PI / 6) + (float) (Math.PI / 180.0) * class04995.m(f2 * 30.0F) * 10.0F;
         this.v.M = (float) (-Math.PI / 6) - (float) (Math.PI / 180.0) * class04995.P(f2 * 30.0F) * 10.0F;
         this.M.y = this.M.y + class04995.m(f2 * 10.0F);
         this.M.L = this.M.L + (class04995.m(f2 * 40.0F) + 0.4F);
         this.z.M = (float) (Math.PI / 180.0) * (70.0F + class04995.P(f2 * 40.0F) * 10.0F);
         this.U.M = this.z.M * -1.0F;
         this.z.L = this.z.L + (class04995.m(f2 * 40.0F) * 0.5F - 0.5F);
         this.U.L = this.U.L + (class04995.m(f2 * 40.0F) * 0.5F + 0.5F);
         this.Z.L = this.Z.L + class04995.m(f2 * 40.0F) * 0.35F;
      } else if (class01484 == class01484.field_25165 && f1 == 0.0F) {
         this.L(var1);
      } else if (class01484 == class01484.field_22383) {
         class05402.N(this.z, this.U, this.M, var1.NJ == class07070.field_6183);
      } else if (class01484 == class01484.field_22384) {
         class05402.N(this.z, this.U, var1.a, var1.R, var1.NJ == class07070.field_6183);
      } else if (class01484 == class01484.field_22385) {
         this.M.i = 0.5F;
         this.M.R = 0.0F;
         if (var1.NJ == class07070.field_6182) {
            this.z.R = -0.5F;
            this.z.i = -0.9F;
         } else {
            this.U.R = 0.5F;
            this.U.i = -0.9F;
         }
      }
   }
}
