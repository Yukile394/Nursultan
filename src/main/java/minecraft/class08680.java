package minecraft;

public class class08680 extends class08672<class08663> {
   private final class08097 y;

   public class08680(class01422 var1, class08097 var2) {
      super(var1);
      this.y = var2;
   }

   @Override
   protected String y() {
      return "sign";
   }

   protected void N(class08663 var1, class01421 var2) {
      ((class03386)class06202.Nq().i_5).v().N(class01540.field_60026);
      var2.N(0.0F, -0.75F, 0.0F);
      class05913 class05913 = class05911.N(var1.L());
      class06260 class06260 = var1.y();
      class01391 class01391 = class05913.N(this.y, this.N, class06260::method_23500);
      class06260.method_60879(var2, class01391, 15728880, class01384.u);
   }

   @Override
   public Class<class08663> N() {
      return class08663.class;
   }
}
