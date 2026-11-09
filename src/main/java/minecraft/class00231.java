package minecraft;

import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class00231 extends class05096 {
   private static final class00392 N = class00392.L("test_instance_block.test_id");
   private static final class00392 y = class00392.L("test_instance_block.size");
   private static final class00392 L = class00392.L("test_instance_block.entities");
   private static final class00392 u = class00392.L("test_instance_block.rotation");
   private static final int i = 8;
   private static final int R = 316;
   private final class08610 M;
   @Nullable
   private class04927 B;
   @Nullable
   private class04927 Z;
   @Nullable
   private class04927 z;
   @Nullable
   private class04927 U;
   @Nullable
   private class04161 E;
   @Nullable
   private class05362 W;
   @Nullable
   private class05362 m;
   @Nullable
   private class06366<Boolean> P;
   @Nullable
   private class06366<class06993> s;

   private void L() {
      this.method_25419();
   }

   public class00231(class08610 var1) {
      super(var1.w().i().M());
      this.M = var1;
   }

   private void y() {
      this.N(class08616.field_55922);
      this.method_25419();
   }

   private static float y(int var0) {
      return (float)(316 - (var0 - 1) * 8) / var0;
   }

   private static class00392 N(class06993 var0) {
      return class00392.y(switch (var0) {
         case field_11467 -> "0";
         case field_11463 -> "90";
         case field_11464 -> "180";
         case field_11465 -> "270";
      });
   }

   private void N(boolean var1) {
      if (!this.N(var1 ? class08616.field_55920 : class08616.field_55921)) {
         this.E.method_25355(class00392.L("test_instance.description.invalid_id").N(class06541.field_1061));
      }

      this.N();
   }

   private void N(class00753 var1) {
      this.Z.method_1852(Integer.toString(var1.method_10263()));
      this.z.method_1852(Integer.toString(var1.method_10264()));
      this.U.method_1852(Integer.toString(var1.method_10260()));
   }

   private static int N(int var0) {
      return (int)y(var0);
   }

   private int N(int var1, int var2) {
      int ix = this.field_22789 / 2 - 158;
      float f = y(var2);
      return (int)(ix + var1 * (8.0F + f));
   }

   private static int N(String var0) {
      try {
         return class04995.N(Integer.parseInt(var0), 1, 48);
      } catch (NumberFormatException numberformatexception) {
         return 1;
      }
   }

   private void N() {
      boolean flag = this.s.y() == class06993.field_11467 && class01894.L(this.B.method_1882()) != null;
      this.W.field_22763 = flag;
      if (this.m != null) {
         this.m.field_22763 = flag;
      }
   }

   public void N(class00392 var1, Optional<class00753> var2) {
      class05216 class05216 = class00392.i();
      this.M.E().ifPresent(var1x -> class05216.y(class00392.N("test_instance.description.failed", class00392.i().N(class06541.field_1061).y(var1x))).i("\n\n"));
      class05216.y(var1);
      this.E.method_25355(class05216);
      var2.ifPresent(this::N);
   }

   private boolean N(class08616 var1) {
      Optional optional = Optional.ofNullable(class01894.L(this.B.method_1882()));
      Optional optional1 = optional.map(var0 -> class05946.N(class04227.yt, var0));
      class00753 class00753 = new class00753(N(this.Z.method_1882()), N(this.z.method_1882()), N(this.U.method_1882()));
      boolean flag = !this.P.y();
      this.field_22787.NE().N(new class08628(this.M.d(), var1, optional1, class00753, this.s.y(), flag));
      return optional.isPresent();
   }

   @Override
   public void method_25426() {
      int ix = this.field_22789 / 2 - 158;
      boolean flag = class07529.ND;
      int j = flag ? 3 : 2;
      int k = N(j);
      this.B = new class04927(this.field_22793, ix, 40, 316, 20, class00392.L("test_instance_block.test_id"));
      this.B.method_1880(128);
      Optional<class05946<class00201>> optional = this.M.M();
      if (optional.isPresent()) {
         this.B.method_1852(optional.get().N().toString());
      }

      this.B.method_1863(var1x -> this.N(false));
      this.method_37063(this.B);
      this.E = new class04161(ix, 70, 316, 8 * 9, class00392.y(""), this.field_22793);
      this.method_37063(this.E);
      class00753 class00753 = this.M.z();
      int l = 0;
      this.Z = new class04927(this.field_22793, this.N(l++, 5), 160, N(5), 20, class00392.L("structure_block.size.x"));
      this.Z.method_1880(15);
      this.method_37063(this.Z);
      this.z = new class04927(this.field_22793, this.N(l++, 5), 160, N(5), 20, class00392.L("structure_block.size.y"));
      this.z.method_1880(15);
      this.method_37063(this.z);
      this.U = new class04927(this.field_22793, this.N(l++, 5), 160, N(5), 20, class00392.L("structure_block.size.z"));
      this.U.method_1880(15);
      this.method_37063(this.U);
      this.N(class00753);
      this.s = this.method_37063(
         class06366.<class06993>N(class00231::N, this.M.U()).N(class06993.values()).N().N(this.N(l++, 5), 160, N(5), 20, u, (var1x, var2x) -> this.N())
      );
      this.P = this.method_37063(class06366.N(!this.M.Z()).N().N(this.N(l++, 5), 160, N(5), 20, L));
      l = 0;
      this.method_37063(class05362.method_46430(class00392.L("test_instance.action.reset"), var1x -> {
         this.N(class08616.field_55923);
         this.field_22787.N(null);
      }).N(this.N(l++, j), 185, k, 20).N());
      this.W = this.method_37063(class05362.method_46430(class00392.L("test_instance.action.save"), var1x -> {
         this.N(class08616.field_55924);
         this.field_22787.N(null);
      }).N(this.N(l++, j), 185, k, 20).N());
      if (flag) {
         this.m = this.method_37063(class05362.method_46430(class00392.y("Export Structure"), var1x -> {
            this.N(class08616.field_55925);
            this.field_22787.N(null);
         }).N(this.N(l++, j), 185, k, 20).N());
      }

      this.method_37063(class05362.method_46430(class00392.L("test_instance.action.run"), var1x -> {
         this.N(class08616.field_55926);
         this.field_22787.N(null);
      }).N(this.N(0, 3), 210, N(3), 20).N());
      this.method_37063(class05362.method_46430(class05220.u, var1x -> this.y()).N(this.N(1, 3), 210, N(3), 20).N());
      this.method_37063(class05362.method_46430(class05220.i, var1x -> this.L()).N(this.N(2, 3), 210, N(3), 20).N());
      this.N(true);
   }

   @Override
   public boolean method_73150() {
      return true;
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      int ix = this.field_22789 / 2 - 158;
      var1.N(this.field_22793, this.field_22785, this.field_22789 / 2, 10, -1);
      var1.y(this.field_22793, N, ix, 30, -6250336);
      var1.y(this.field_22793, y, ix, 150, -6250336);
      var1.y(this.field_22793, u, this.s.method_46426(), 150, -6250336);
      var1.y(this.field_22793, L, this.P.method_46426(), 150, -6250336);
   }
}
