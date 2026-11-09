package minecraft;

import org.joml.Quaternionf;

public class class02423 extends class02721 {
   private static final String G = "cape";
   private final class01686 l = this.Z.y("cape");

   public class02423(class01686 var1) {
      super(var1, false);
   }

   @Override
   public void method_2819(class08468 var1) {
      super.method_2819(var1);
      this.l
         .N(
            new Quaternionf()
               .rotateY((float) -Math.PI)
               .rotateX((6.0F + var1.a / 2.0F + var1.y) * (float) (Math.PI / 180.0))
               .rotateZ(var1.p / 2.0F * (float) (Math.PI / 180.0))
               .rotateY((180.0F - var1.p / 2.0F) * (float) (Math.PI / 180.0))
         );
   }

   public static class04806 N() {
      class04792 class04792 = class02721.N(class04834.N, false);
      class04792.N()
         .N()
         .y("body")
         .N(
            "cape",
            class04822.L().N(0, 0).N(-5.0F, 0.0F, -1.0F, 10.0F, 16.0F, 1.0F, class04834.N, 1.0F, 0.5F),
            class04838.N(0.0F, 0.0F, 2.0F, 0.0F, (float) Math.PI, 0.0F)
         );
      return class04806.N(class04792, 64, 64);
   }
}
