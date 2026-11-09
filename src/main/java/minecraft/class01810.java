package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

class class01810 {
   public static final class02362<class04247, class01810> N = class02362.N_34(class01810::N, class01810::new);
   public static final class02362<class04247, List<class01810>> y = N.N_33(class02389.N());
   final int L;
   final int u;
   final class00404<?> i;
   @Nullable
   final class07001 R;

   private class01810(int var1, int var2, class00404<?> var3, @Nullable class07001 var4) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
      this.R = var4;
   }

   private class01810(class04247 var1) {
      super();
      this.L = var1.readByte();
      this.u = var1.readShort();
      this.i = class02389.N(class04227.i).decode(var1);
      this.R = var1.P();
   }

   static class01810 N(class00394 var0) {
      class07001 class07001 = var0.N(var0.G().method_30349());
      class07209 class07209 = var0.d();
      int ix = class01296.y(class07209.method_10263()) << 4 | class01296.y(class07209.method_10260());
      return new class01810(ix, class07209.method_10264(), var0.O(), class07001.z() ? null : class07001);
   }

   private void N(class04247 var1) {
      var1.writeByte(this.L);
      var1.writeShort(this.u);
      class02389.N(class04227.i).encode(var1, this.i);
      var1.N(this.R);
   }
}
