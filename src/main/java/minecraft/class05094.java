package minecraft;

import com.mojang.logging.LogUtils;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05094 extends class05407 {
   static final Logger N = LogUtils.getLogger();
   private static final class00392 E = class00392.L("mco.configure.world.backup");
   static final class00392 y = class00392.L("mco.backup.button.restore");
   static final class00392 L = class00392.L("mco.backup.changes.tooltip");
   private static final class00392 W = class00392.L("mco.backup.nobackups");
   private static final class00392 m = class00392.L("mco.backup.button.download");
   private static final String P = "uploaded";
   private static final int s = 8;
   public static final DateTimeFormatter u = class07536.N(FormatStyle.SHORT);
   final class05092 i;
   List<class04948> R = Collections.emptyList();
   class05120 M;
   final class03686 B = new class03686(this);
   private final int T;
   @Nullable
   class05362 Z;
   final class04981 z;
   boolean U = false;

   public class05094(class05092 var1, class04981 var2, int var3) {
      super(E);
      this.i = var1;
      this.z = var2;
      this.T = var3;
   }

   private void y() {
      this.field_22787
         .N(
            class02252.N(
               this,
               class00392.L("mco.configure.world.restore.download.question.line1"),
               var1 -> this.field_22787
                  .N(
                     new class04708(
                        this.i.Z(),
                        new class04696(this.z.y, this.T, Objects.requireNonNullElse(this.z.u, "") + " (" + this.z.z.get(this.z.T).y.N(this.z.T) + ")", this)
                     )
                  )
            )
         );
   }

   private void N() {
      new class05090(this, "Realms-fetch-backups").start();
   }

   @Override
   public void method_25426() {
      this.B.N(E, this.field_22793);
      this.M = this.B.L(new class05120(this));
      class01885 class01885 = this.B.y(class01885.i().N(8));
      this.Z = class01885.N(class05362.method_46430(m, var1x -> this.y()).N());
      this.Z.field_22763 = false;
      class01885.N(class05362.method_46430(class05220.U, var1x -> this.method_25419()).N());
      this.B.method_48206(var1x -> {
         class06478 class06478 = this.method_37063(var1x);
      });
      this.method_48640();
      this.N();
   }

   @Override
   public void method_48640() {
      this.B.N();
      if (this.M != null) {
         this.M.method_57712(this.field_22789, this.B);
      }
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      if (this.U && this.M != null) {
         var1.y(this.field_22793, W, this.field_22789 / 2 - this.field_22793.N(W) / 2, this.M.method_46427() + this.M.method_25364() / 2 - 4, -1);
      }
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.i);
   }
}
