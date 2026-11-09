package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class class05227 extends class05096 {
   private static final Logger N = LogUtils.getLogger();
   private static final class00392 y = class00392.L("selectWorld.enterName").N(class06541.field_1080);
   private static final class00392 L = class00392.L("selectWorld.edit.resetIcon");
   private static final class00392 u = class00392.L("selectWorld.edit.openFolder");
   private static final class00392 i = class00392.L("selectWorld.edit.backup");
   private static final class00392 R = class00392.L("selectWorld.edit.backupFolder");
   private static final class00392 M = class00392.L("selectWorld.edit.optimize");
   private static final class00392 B = class00392.L("optimizeWorld.confirm.title");
   private static final class00392 Z = class00392.L("optimizeWorld.confirm.description");
   private static final class00392 z = class00392.L("optimizeWorld.confirm.proceed");
   private static final class00392 U = class00392.L("selectWorld.edit.save");
   private static final int E = 200;
   private static final int W = 4;
   private static final int m = 98;
   private final class01885 P = class01885.u().N(5);
   private final BooleanConsumer s;
   private final class04785 T;
   private final class04927 b;

   private class05227(class06202 var1, class04785 var2, String var3, BooleanConsumer var4) {
      super(class00392.L("selectWorld.edit.title"));
      this.s = var4;
      this.T = var2;
      class01590 class01590 = (class01590)var1.i_3;
      this.P.N(new class02057(200, 20));
      this.P.N(new class02071(y, class01590));
      this.b = this.P.N(new class04927(class01590, 200, 20, y));
      this.b.method_1852(var3);
      class01885 class01885 = class01885.i().N(4);
      class05362 class05362 = class01885.N(class05362.method_46430(U, var1x -> this.N(this.b.method_1882())).N(98).N());
      class01885.N(class05362.method_46430(class05220.i, var1x -> this.method_25419()).N(98).N());
      this.b.method_1863(var1x -> class05362.field_22763 = !class05018.B(var1x));
      this.P.N(class05362.method_46430(L, var1x -> {
         var2.z().ifPresent(var0x -> FileUtils.deleteQuietly(var0x.toFile()));
         var1x.field_22763 = false;
      }).N(200).N()).field_22763 = var2.z().filter(var0 -> Files.isRegularFile(var0)).isPresent();
      this.P.N(class05362.method_46430(u, var1x -> class07536.m().N(var2.N(class05071.E))).N(200).N());
      this.P.N(class05362.method_46430(i, var2x -> {
         boolean flag = N(var2);
         this.s.accept(!flag);
      }).N(200).N());
      this.P.N(class05362.method_46430(R, var1x -> {
         Path path = var1.NL().u();

         try {
            class06290.L(path);
         } catch (IOException ioexception) {
            throw new RuntimeException(ioexception);
         }

         class07536.m().N(path);
      }).N(200).N());
      this.P.N(class05362.method_46430(M, var3x -> var1.N(new class01292(() -> var1.N(this), (var3xx, var4x) -> {
         if (var3xx) {
            N(var2);
         }

         var1.N(class05210.N(var1, this.s, var1.Nh(), var2, var4x));
      }, B, Z, z, true))).N(200).N());
      this.P.N(new class02057(200, 20));
      this.P.N(class01885);
      this.P.method_48206(var1x -> {
         class06478 class06478 = this.method_37063(var1x);
      });
   }

   public static class05227 N(class06202 var0, class04785 var1, BooleanConsumer var2) throws IOException {
      class06434 class06434 = var1.N(var1.B());
      return new class05227(var0, var1, class06434.y(), var2);
   }

   private void N(String var1) {
      try {
         this.T.N(var1);
      } catch (class03142 | class03103 | IOException ioexception) {
         N.error("Failed to access world '{}'", this.T.R(), ioexception);
         class06132.N(this.field_22787, this.T.R());
      }

      this.s.accept(true);
   }

   public static boolean N(class04785 var0) {
      long ix = 0L;
      IOException ioexception = null;

      try {
         ix = var0.E();
      } catch (IOException ioexception1) {
         ioexception = ioexception1;
      }

      if (ioexception != null) {
         class05216 class05216x = class00392.L("selectWorld.edit.backupFailed");
         class05216 class05216x = class00392.y(ioexception.getMessage());
         class06202.Nq().m().N(new class06132(class06095.y, class05216x, class05216x));
         return false;
      } else {
         class05216 class05216xxx = class00392.N("selectWorld.edit.backupCreated", var0.R());
         class05216 class05216x = class00392.N("selectWorld.edit.backupSize", class04995.L(ix / 1048576.0));
         class06202.Nq().m().N(new class06132(class06095.y, class05216xxx, class05216x));
         return true;
      }
   }

   @Override
   public void method_25426() {
      this.method_48640();
   }

   @Override
   protected void method_56131() {
      this.method_48265(this.b);
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (this.b.method_25370() && var1.u()) {
         this.N(this.b.method_1882());
         this.method_25419();
         return true;
      } else {
         return super.method_25404(var1);
      }
   }

   @Override
   public void method_48640() {
      this.P.N();
      class02077.N(this.P, this.method_48202());
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      var1.N(this.field_22793, this.field_22785, this.field_22789 / 2, 15, -1);
   }

   @Override
   public void method_25419() {
      this.s.accept(false);
   }
}
