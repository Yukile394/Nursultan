package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class06132 implements class04680 {
   private static final class01894 N = class01894.y("toast/system");
   private static final int i = 200;
   private static final int R = 12;
   private static final int M = 10;
   private final class06095 B;
   private class00392 Z;
   private List<class01028> z;
   private long U;
   private boolean E;
   private final int W;
   private boolean m;
   private class04650 P = class04650.field_2209;

   @Override
   public int L() {
      return this.W;
   }

   public static void L(class06202 var0, String var1) {
      N(var0.m(), class06095.i, class00392.L("pack.copyFailure"), class00392.y(var1));
   }

   public class06132(class06095 var1, class00392 var2, @Nullable class00392 var3) {
      this(
         var1,
         var2,
         N(var3),
         Math.max(160, 30 + Math.max(((class01590)class06202.Nq().i_3).N(var2), var3 == null ? 0 : ((class01590)class06202.Nq().i_3).N(var3)))
      );
   }

   private class06132(class06095 var1, class00392 var2, List<class01028> var3, int var4) {
      super();
      this.B = var1;
      this.Z = var2;
      this.z = var3;
      this.W = var4;
   }

   public void B() {
      this.m = true;
   }

   public class06095 R() {
      return this.B;
   }

   @Override
   public class04650 i() {
      return this.P;
   }

   @Override
   public int u() {
      return 20 + Math.max(this.z.size(), 1) * 12;
   }

   public static void y(class06202 var0, String var1) {
      N(var0.m(), class06095.u, class00392.L("selectWorld.delete_failure"), class00392.y(var1));
   }

   public static void y(class06086 var0, class06095 var1, class00392 var2, @Nullable class00392 var3) {
      class06132 class06132 = var0.N(class06132.class, var1);
      if (class06132 == null) {
         N(var0, var1, var2, var3);
      } else {
         class06132.N(var2, var3);
      }
   }

   public static void y(class06202 var0, class07321 var1) {
      y(var0.m(), class06095.z, class00392.N("chunk.toast.saveFailure", class00392.N(var1)).N(class06541.field_1061), class00392.L("chunk.toast.checkLog"));
   }

   public static void N(class06202 var0, int var1) {
      N(var0.m(), class06095.R, class00392.L("gui.fileDropFailure.title"), class00392.N("gui.fileDropFailure.detail", var1));
   }

   public static class06132 N(class06202 var0, class06095 var1, class00392 var2, class00392 var3) {
      class01590 class01590 = (class01590)var0.i_3;
      List<class01028> list = class01590.L(var3, 200);
      int ix = Math.max(200, list.stream().mapToInt(class01590::N).max().orElse(200));
      return new class06132(var1, var2, list, ix + 30);
   }

   public static void N(class06086 var0, class06095 var1, class00392 var2, @Nullable class00392 var3) {
      var0.N(new class06132(var1, var2, var3));
   }

   public static void N(class06202 var0, class07321 var1) {
      y(var0.m(), class06095.Z, class00392.N("chunk.toast.loadFailure", class00392.N(var1)).N(class06541.field_1061), class00392.L("chunk.toast.checkLog"));
   }

   public static void N(class06202 var0) {
      y(var0.m(), class06095.B, class00392.L("chunk.toast.lowDiskSpace"), class00392.L("chunk.toast.lowDiskSpace.description"));
   }

   @Override
   public void N(class06086 var1, long var2) {
      if (this.E) {
         this.U = var2;
         this.E = false;
      }

      double d0 = this.B.E * var1.R();
      long ix = var2 - this.U;
      this.P = !this.m && ix < d0 ? class04650.field_2210 : class04650.field_2209;
   }

   @Override
   public void N(class01054 var1, class01590 var2, long var3) {
      var1.N(class08394.Na, N, 0, 0, this.L(), this.u());
      if (this.z.isEmpty()) {
         var1.N(var2, this.Z, 18, 12, -256, false);
      } else {
         var1.N(var2, this.Z, 18, 7, -256, false);

         for (int ix = 0; ix < this.z.size(); ix++) {
            var1.N(var2, this.z.get(ix), 18, 18 + ix * 12, -1, false);
         }
      }
   }

   public void N(class00392 var1, @Nullable class00392 var2) {
      this.Z = var1;
      this.z = N(var2);
      this.E = true;
   }

   public static void N(class06202 var0, String var1) {
      N(var0.m(), class06095.u, class00392.L("selectWorld.access_failure"), class00392.y(var1));
   }

   public static void N(class06086 var0, class06095 var1) {
      class06132 class06132 = var0.N(class06132.class, var1);
      if (class06132 != null) {
         class06132.B();
      }
   }

   private static ImmutableList<class01028> N(@Nullable class00392 var0) {
      return var0 == null ? ImmutableList.of() : ImmutableList.of(var0.method_30937());
   }
}
