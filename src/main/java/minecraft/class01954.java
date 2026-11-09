package minecraft;

import Nursultan.class10228;
import java.util.ArrayList;
import java.util.List;
import org.joml.Matrix4f;

public class class01954 extends class01987<class03677, class03681, class08284> {
   private final class01590 N;

   protected class01954(class04832 var1) {
      super(var1);
      this.N = var1.z();
   }

   public void N(class08284 var1, class01421 var2, class01237 var3, int var4, float var5) {
      class03681 class03681 = var1.N;
      byte b0 = class03681.i();
      boolean flag = (b0 & 2) != 0;
      boolean flag1 = (b0 & 4) != 0;
      boolean flag2 = (b0 & 1) != 0;
      class03684 class03684 = class03677.L(b0);
      byte b1 = (byte)class03681.L().method_48889(var5);
      int i;
      if (flag1) {
         float f = ((class05630)class06202.Nq().i_7).N(0.25F);
         i = (int)(f * 255.0F) << 24;
      } else {
         i = class03681.u().method_48889(var5);
      }

      float f2 = 0.0F;
      Matrix4f matrix4f = var2.L().N();
      matrix4f.rotate((float) Math.PI, 0.0F, 1.0F, 0.0F);
      matrix4f.scale(-0.025F, -0.025F, -0.025F);
      class03663 class03663 = var1.B;
      boolean flag3 = true;
      byte b2 = 10;
      int j = class03663.y();
      int k = class03663.N().size() * b2 - 1;
      matrix4f.translate(1.0F - j / 2.0F, -k, 0.0F);
      if (i != 0) {
         var3.N(var2, flag ? class06851.U() : class06851.z(), (var4x, var5x) -> {
            var5x.N(var4x, -1.0F, -1.0F, 0.0F).method_39415(i).method_60803(var4);
            var5x.N(var4x, -1.0F, (float)k, 0.0F).method_39415(i).method_60803(var4);
            var5x.N(var4x, (float)j, (float)k, 0.0F).method_39415(i).method_60803(var4);
            var5x.N(var4x, (float)j, -1.0F, 0.0F).method_39415(i).method_60803(var4);
         });
      }

      class07926 class07926 = var3.N(i != 0 ? 1 : 0);

      for (class10228 class10228 : class03663.N()) {
         float f1 = switch (class03684) {
            case field_42451 -> 0.0F;
            case field_42452 -> j - class10228.y();
            case field_42450 -> j / 2.0F - class10228.y() / 2.0F;
         };
         class07926.N(var2, f1, f2, class10228.N(), flag2, flag ? class01583.field_33994 : class01583.field_33995, var4, b1 << 24 | 16777215, 0, 0);
         f2 += b2;
      }
   }

   private class03663 N(class00392 var1, int var2) {
      List<class01028> list = this.N.L(var1, var2);
      ArrayList arraylist = new ArrayList(list.size());
      int i = 0;

      for (class01028 class01028 : list) {
         int j = this.N.N(class01028);
         i = Math.max(i, j);
         arraylist.add(new class10228(class01028, j));
      }

      return new class03663(arraylist, i);
   }

   public void method_62354(class03677 var1, class08284 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.n();
      var2.B = var1.N(this::N);
   }

   public class08284 method_55269() {
      return new class08284();
   }
}
