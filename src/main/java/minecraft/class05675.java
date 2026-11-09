package minecraft;

import java.util.Optional;

public class class05675 implements class05663 {
   private final class06584 N;
   private final int y;
   private final int L;
   private final int u;
   private final float i;
   private final Optional<class05946<class02530>> R;

   public class05675(class06581 var1, int var2, int var3, int var4, int var5, float var6) {
      this(new class06584(var1), var2, var3, var4, var5, var6);
   }

   public class05675(class06581 var1, int var2, int var3, int var4, int var5, float var6, class05946<class02530> var7) {
      this(new class06584(var1), var2, var3, var4, var5, var6, Optional.of(var7));
   }

   public class05675(class06584 var1, int var2, int var3, int var4, int var5, float var6) {
      this(var1, var2, var3, var4, var5, var6, Optional.empty());
   }

   public class05675(class06584 var1, int var2, int var3, int var4, int var5, float var6, Optional<class05946<class02530>> var7) {
      super();
      this.N = var1;
      this.y = var2;
      this.N.i(var3);
      this.L = var4;
      this.u = var5;
      this.i = var6;
      this.R = var7;
   }

   public class05675(class00891 var1, int var2, int var3, int var4, int var5) {
      this(new class06584(var1), var2, var3, var4, var5);
   }

   public class05675(class06581 var1, int var2, int var3, int var4) {
      this(new class06584(var1), var2, var3, 12, var4);
   }

   public class05675(class06581 var1, int var2, int var3, int var4, int var5) {
      this(new class06584(var1), var2, var3, var4, var5);
   }

   public class05675(class06584 var1, int var2, int var3, int var4, int var5) {
      this(var1, var2, var3, var4, var5, 0.05F);
   }

   @Override
   public class07324 N(class04782 var1, class07049 var2, class06069 var3) {
      class06584 class06584 = this.N.t();
      this.R.ifPresent(var4x -> class07323.N(class06584, var1.method_30349(), (class05946<class02530>)var4x, var1.method_8404(var2.method_24515()), var3));
      return new class07324(new class02680(class06570.Ty, this.y), class06584, this.L, this.u, this.i);
   }
}
