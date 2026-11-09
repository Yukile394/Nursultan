package minecraft;

public record class01926(class06143 sprite) implements class04417<class07134> {
   public class01926(class06143 sprite) {
      this.sprite = sprite;
   }

   public class04406 method_3090(
      class07134 var1, class03448 var2, double var3, double var5, double var7, double var9, double var11, double var13, class06069 var15
   ) {
      class01901 class01901 = new class01901(var2, var3, var5, var7, var9, var11, var13, this.sprite);
      class01901.method_74308(1.0F);
      class01901.method_34753(var9, var11, var13);
      class01901.method_3077(var15.y(4) + 6);
      return class01901;
   }

   public class06143 N() {
      return this.sprite;
   }
}
