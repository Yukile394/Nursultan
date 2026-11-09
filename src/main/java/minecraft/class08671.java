package minecraft;

public class class08671 extends class08672<class08649> {
   public class08671(class01422 var1) {
      super(var1);
   }

   @Override
   protected String y() {
      return "book model";
   }

   @Override
   protected float N(int var1, int var2) {
      return 17 * var2;
   }

   protected void N(class08649 var1, class01421 var2) {
      ((class03386)class06202.Nq().i_5).v().N(class01540.field_60028);
      var2.N(class02058.u.N(180.0F));
      var2.N(class02058.y.N(25.0F));
      float f = var1.u();
      var2.N((1.0F - f) * 0.2F, (1.0F - f) * 0.1F, (1.0F - f) * 0.25F);
      var2.N(class02058.u.N(-(1.0F - f) * 90.0F - 90.0F));
      var2.N(class02058.y.N(180.0F));
      float f1 = var1.z();
      float f2 = class04995.N(class04995.M(f1 + 0.25F) * 1.6F - 0.3F, 0.0F, 1.0F);
      float f3 = class04995.N(class04995.M(f1 + 0.75F) * 1.6F - 0.3F, 0.0F, 1.0F);
      class01127 class01127 = var1.y();
      class01127.method_2819(new class01138(0.0F, f2, f3, f));
      class01894 class01894 = var1.L();
      class01391 class01391 = this.N.method_73477(class01127.method_23500(class01894));
      class01127.method_60879(var2, class01391, 15728880, class01384.u);
   }

   @Override
   public Class<class08649> N() {
      return class08649.class;
   }
}
