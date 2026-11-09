package minecraft;

public class class01213 extends class01216 {
   @Override
   public String L(class06069 var1) {
      return "1x2_se" + (var1.y(1) + 1);
   }

   public class01213() {
      super();
   }

   @Override
   public String i(class06069 var1) {
      return "2x2_s1";
   }

   @Override
   public String u(class06069 var1) {
      return "2x2_b" + (var1.y(5) + 1);
   }

   @Override
   public String y(class06069 var1, boolean var2) {
      return var2 ? "1x2_d_stairs" : "1x2_d" + (var1.y(5) + 1);
   }

   @Override
   public String y(class06069 var1) {
      return "1x1_as" + (var1.y(4) + 1);
   }

   @Override
   public String N(class06069 var1, boolean var2) {
      return var2 ? "1x2_c_stairs" : "1x2_c" + (var1.y(4) + 1);
   }

   @Override
   public String N(class06069 var1) {
      return "1x1_b" + (var1.y(5) + 1);
   }
}
