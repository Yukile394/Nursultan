package minecraft;

import java.util.Optional;

final class class08738 implements class08733 {
   private final class04782 y;
   private final class06889 L;
   private final class07109 u;

   class08738(class08758 var1, class04782 var2, class06889 var3, class07109 var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   public class04770 N(class00642 var1, class03713 var2) {
      class07321 class07321 = new class07321(class07209.method_49638(this.L));
      this.y.method_72270(class07321, 3);
      class04770 class04770x = new class04770(this.N.u, this.y, var2.N(), var2.L());

      class04770 class04770x;
      try (class04495 class04495 = new class04495(class04770x.method_71370(), class08758.N)) {
         Optional optional = this.N.u.Nm().L(this.N.i).map(var2x -> class08308.N(class04495, this.N.u.yt(), var2x));
         optional.ifPresent(class04770x::method_5651);
         class04770x.method_60949(this.L, this.u.z, this.u.U);
         this.N.u.Nm().N(var1, class04770x, var2);
         optional.ifPresent(var1x -> {
            class04770x.method_64131(var1x);
            class04770x.method_64125(var1x);
         });
         class04770x = class04770x;
      }

      return class04770x;
   }

   public void N() {
      this.y.method_14178().y(class01624.M, new class07321(class07209.method_49638(this.L)), 3);
   }
}
