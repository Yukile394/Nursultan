package minecraft;

public class class03842 extends class02840<class07557, class08278, class01188<class08278>> {
   private static final class01894 N = class01894.y("textures/entity/zombie/zombie.png");

   public class03842(class04832 var1, float var2) {
      super(var1, new class06168(var1.N(class04802.yB)), 0.5F * var2);
      this.N(new class02758<>(this));
      this.N(new class02562<>(this, class08118.N(class04802.yZ, var1.R(), class06168::new), var1.B()));
   }

   public class08278 method_55269() {
      return new class08278();
   }

   public void method_62354(class07557 var1, class08278 var2, float var3) {
      super.method_62354(var1, var2, var3);
      class04256.N(var1, var2, var3, this.L);
   }

   public class01894 N(class08278 var1) {
      return N;
   }
}
